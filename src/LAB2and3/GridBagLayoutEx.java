package LAB2and3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridBagLayoutEx extends JFrame{
    public static void main(String[] args){
    	GridBagLayoutEx app = new GridBagLayoutEx();
        app.setVisible(true);
        app.setLocationRelativeTo(null);
    }
    public GridBagLayoutEx(){
        setLayout(new GridBagLayout());
        GridBagConstraints s = new GridBagConstraints();
        s.gridx =0;
        s.gridy =0;
        add(new JLabel("Principle"));
        JTextField principleTextField = new JTextField(15);
        add(principleTextField);
        s.gridx =0;
        s.gridy =1;
        add(new JLabel("Time"),s);
        JTextField timeTextField = new JTextField(15);
        s.gridx = 1;
        add(timeTextField,s);
        s.gridx =0;
        s.gridy =2;
        add(new JLabel("Rate"),s);
        JTextField rateTextField = new JTextField(15);
        s.gridx=1;
        add(rateTextField,s);
        s.gridx =0;
        s.gridy =3;
        add(new JLabel("Interest"),s);
        JTextField interestTextField = new JTextField(15);
        interestTextField.setEditable(false);
        s.gridx =1;
        add(interestTextField,s);
        s.fill =GridBagConstraints.BOTH;
        s.gridx =1;
        s.gridy =5;
        s.gridwidth= 1;
        JButton calculateInterest = new JButton("Calculate Inrerest");
        add(calculateInterest,s);
        calculateInterest.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                double principle = Double.parseDouble(principleTextField.getText());
                double rate = Double.parseDouble(rateTextField.getText());
                double time = Double.parseDouble(timeTextField.getText());
                double calculateInterest = (principle*rate*time)/100;
                interestTextField.setText(String.valueOf(calculateInterest));
            }
        });
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
