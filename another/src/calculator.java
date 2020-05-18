/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class event extends JFrame {

    String bil = "";
    double bil1, bil2, jumlah = 0;
    int pilih = 0;
    JButton[] button = new JButton[25];
    JTextField hasil;
    JPanel p1, p2;

    public event() {

        Color c = new Color(230, 250, 250);
        for (int i = 0; i <= 9; i++) {
            button[i] = new JButton(String.valueOf(i));
            button[i].setBackground(c);
        }
        button[10] = new JButton("+");
        button[11] = new JButton("-");
        button[12] = new JButton("x");
        button[13] = new JButton("^");
        button[14] = new JButton("%");
        button[15] = new JButton("√");
        button[16] = new JButton("!");
        button[17] = new JButton("CE");
        button[18] = new JButton("C");
        button[19] = new JButton("±");
        button[20] = new JButton("÷");
        button[21] = new JButton("=");
        adding();
        action();
    }

    public void adding() {
        p1 = new JPanel(new GridLayout(6, 4));
        for (int i = 10; i <= 21; i++) {
            if (13 <= i && i <= 21) {
                p1.add(button[i]);
                button[i].setBackground(new Color(250, 250, 250));
            } else {
                button[i].setBackground(new Color(250, 250, 250));
            }
        }
        p1.add(button[7]);
        p1.add(button[8]);
        p1.add(button[9]);
        p1.add(button[12]);
        p1.add(button[4]);
        p1.add(button[5]);
        p1.add(button[6]);
        p1.add(button[11]);
        p1.add(button[1]);
        p1.add(button[2]);
        p1.add(button[3]);
        p1.add(button[10]);
        p1.add(new JButton(" "));
        p1.add(button[0]);
        p1.add(new JButton(" "));
        p1.add(button[21]);
        p2 = new JPanel(new GridLayout(2, 1));
        hasil = new JTextField(30);
        Font font = new Font("SansSerif", Font.PLAIN, 22);
        hasil.setFont(font);
        p2.add(hasil);
        p2.add(p1);
        add(p2);
    }

    public void action() {
        ButtonNumberEvent number = new ButtonNumberEvent();
        ButtonOperatorEvent operator = new ButtonOperatorEvent();
        ButtonCountingEvent count = new ButtonCountingEvent();
        for (int i = 0; i <= 9; i++) {
            button[i].addActionListener(number);
        }
        for (int j = 10; j <= 20; j++) {
            button[j].addActionListener(operator);
        }
        button[21].addActionListener(count);
    }

    class ButtonNumberEvent implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            bil += ae.getActionCommand();
            hasil.setText(bil);
        }
    }

    class ButtonOperatorEvent implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (bil.contains("1") || bil.contains("2") || bil.contains("3") || bil.contains("4") || bil.contains("5") || bil.contains("6")
                    || bil.contains("7") || bil.contains("8") || bil.contains("9") || bil.contains("0") || bil.contains("C")) {

                bil1 = Double.parseDouble(hasil.getText());
                bil = ae.getActionCommand();
                hasil.setText(bil);
                System.out.println(bil1 + " " + bil + " ");

                if (bil.equalsIgnoreCase("+")) {
                    pilih = 1;
                    bil = "";
                } else if (bil.equalsIgnoreCase("-")) {
                    pilih = 2;
                    bil = "";
                } else if (bil.equalsIgnoreCase("÷")) {
                    pilih = 3;
                    bil = "";
                } else if (bil.equalsIgnoreCase("x")) {
                    pilih = 4;
                    bil = "";
                } else if (bil.equalsIgnoreCase("^")) {
                    pilih = 5;
                    bil = "";
                } else if (bil.equalsIgnoreCase("%")) {
                    pilih = 6;
                    bil = "";
                } else if (bil.equalsIgnoreCase("√")) {
                    pilih = 7;
                    bil = "";
                } else if (bil.equalsIgnoreCase("!")) {
                    pilih = 8;
                    System.out.println("fac " + bil1);
                    jumlah = 1;
                    for (int i = 1; i <= bil1; i++) {
                        jumlah *= i;
                    }
                    bil = Double.toString(jumlah);
                    hasil.setText(bil);
                    bil = "";
                } else if (bil.equalsIgnoreCase("C")) {
                    bil = "0";
                    jumlah = 0;
                    bil1 = 0;
                    bil2 = 0;
                    hasil.setText(bil);
                    bil = "";
                } else if (bil.equalsIgnoreCase("CE")) {
                    bil = "0";
                    jumlah = 0;
                    bil1 = 0;
                    bil2 = 0;
                    hasil.setText(bil);
                    bil = "";
                } else if (bil.equalsIgnoreCase("±")) {
                    if (bil1 < 0) {
                        bil = Double.toString(bil1 * -1);
                        hasil.setText(bil);
                    } else if (bil1 > 0) {
                        bil = Double.toString(bil1 * -1);
                        hasil.setText(bil);
                    }
                }
            }
        }
    }

    class ButtonCountingEvent implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            if (bil.contains("1") || bil.contains("2") || bil.contains("3") || bil.contains("4") || bil.contains("5") || bil.contains("6")
                    || bil.contains("7") || bil.contains("8") || bil.contains("9") || bil.contains("0") || bil.contains("!")) {
                switch (pilih) {
                    case 1:
                        bil2 = Double.parseDouble(String.valueOf(hasil.getText()));
                        jumlah = bil1 + bil2;
                        break;
                    case 2:
                        bil2 = Double.parseDouble(String.valueOf(hasil.getText()));
                        jumlah = bil1 - bil2;
                        break;
                    case 3:
                        bil2 = Double.parseDouble(String.valueOf(hasil.getText()));
                        jumlah = bil1 / bil2;
                        break;
                    case 4:
                        bil2 = Double.parseDouble(String.valueOf(hasil.getText()));
                        jumlah = bil1 * bil2;
                        break;
                    case 5:
                        bil2 = Double.parseDouble(String.valueOf(hasil.getText()));
                        jumlah = Math.pow(bil1, bil2);
                        break;
                    case 6:
                        bil2 = Double.parseDouble(String.valueOf(hasil.getText()));
                        jumlah = (bil1 % bil2);
                        break;
                    case 7:
                        bil2 = Double.parseDouble(String.valueOf(hasil.getText()));
                        System.out.println("Sqrt " + bil2);
                        jumlah = Math.sqrt(bil2);
                        break;
                    case 8:
                        break;
                }
                bil = Double.toString(jumlah);
                System.out.println(bil2 + " hasil : " + bil);
                hasil.setText(bil);
            }
        }
    }
}

/**
 *
 * @author Elvansen
 */
public class calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        event frame = new event();
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}

//            } else if (bil.equalsIgnoreCase("Del")) {
//                String temp1="";
//                for(int i=0;i<length-1;i++){
//                        temp1+=temp.charAt(i);
//                }
//                System.out.println(length+" "+temp1);
//                bil=temp1;
//                hasil.setText(temp1);
////                bil1=Double.parseDouble(temp1);

