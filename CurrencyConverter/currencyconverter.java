//package CurrencyConverter;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
//import CurrencyConverter.*;

public class currencyconverter extends JFrame implements ActionListener {

    String[] currencies = {"INR", "RUB", "EUR", "CAD", "USD", "AUD"};

    JFrame frame;
    JTextField textField,tField;
    JSpinner spin;
    JButton convertButton;

    Font textFont = new Font("Times New Roman", Font.BOLD, 15);
    Font bFont = new Font("Tahoma", Font.BOLD, 8);

    JComboBox comboBox1,comboBox2;


    currencyconverter() {

        frame = new JFrame("Currency Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 350);
        frame.setLayout(null);

        JLabel label = new JLabel();
        label.setText("Enter Amount: ");
        label.setFont(textFont);
        label.setBounds(10, 15, 110, 30);
        //label.setBackground(Color.LIGHT_GRAY);
        label.setForeground(Color.BLACK);
        //label.setEditable(false);
        frame.add(label);

        //Input comboBox
        JComboBox comboBox_1 = new JComboBox<>(currencies);
        //comboBox_1.setBounds(10, 50, 120, 30);
        comboBox_1.setBounds(250, 15, 140, 30);
        comboBox_1.setSelectedItem(0);
        //comboBox_1.setVisible(true);
        frame.add(comboBox_1);
        comboBox1 = comboBox_1;

        //Input amount
        JSpinner spinner = new JSpinner();
        spinner.setBounds(130, 15, 110, 30);
        spin = spinner;
        frame.add(spinner);

        //frame.add(textField);
        frame.setVisible(true);

    

        JLabel label_1 = new JLabel();
        label_1.setText("Convert Amount to: ");
        label_1.setFont(textFont);
        label_1.setBounds(10, 120, 165, 30);
        //label.setBackground(Color.LIGHT_GRAY);
        label_1.setForeground(Color.BLACK);
        //label_1.setEditable(false);
        frame.add(label_1);

        //Conversion comboBox
        JComboBox comboBox_2 = new JComboBox<>(currencies);
        comboBox_2.setSelectedIndex(1);
        comboBox_2.setBounds(180, 120, 120, 30);
        //comboBox_2.setVisible(true);
        frame.add(comboBox_2);
        comboBox2 = comboBox_2;

        //Converted textfield
        tField = new JTextField();
        tField.setBounds(10, 165, 380, 60);
        tField.setFont(textFont);
        tField.setBackground(Color.LIGHT_GRAY);
        //textField.setColumns(10);
        tField.setEditable(false);
        frame.add(tField);        


        JButton convButton = new JButton("Convert");
        convButton.setBounds(150, 245, 100, 25);
        frame.add(convButton);
        convertButton = convButton;

        convButton.addActionListener(this);

    }
    
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {

                try {
                    currencyconverter c = new currencyconverter();
                    //frame.setVisible(true);
                } catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }

            }
        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        
        int a = comboBox1.getSelectedIndex();
        int b = comboBox2.getSelectedIndex();

        if(a == b)
            tField.setText(String.valueOf(spin.getValue()));
        
        if((JButton)e.getSource() == convertButton) {
            int var;
            var =(int)spin.getValue();

            currency c1 = currency.Identify(a);
            currency c2 = currency.Identify(b);
            double num = var;

            double ans = currency.convert(num, c1, c2);
            String str = String.format("%.2f", ans);
            tField.setText(str);

         }
    }
}