package LAB2and3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AboutDialogEx extends JFrame{
    public static void main(String[] args) {
    	AboutDialogEx frame = new AboutDialogEx();
        frame.setBounds(500,100,1000,500);
        frame.setVisible(true);
    }
    JDialog dialogBox;
    public AboutDialogEx(){
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu helpMenu = new JMenu("Help");
        menuBar.add(helpMenu);
        JMenuItem aboutDialog = new JMenuItem("About");
        helpMenu.add(aboutDialog);
        JButton closeButton = new JButton("Close");
        aboutDialog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent){
                dialogBox = new JDialog(AboutDialogEx.this,"About App");
                dialogBox.setLayout(new FlowLayout());
                dialogBox.setBounds(750,250,300,130);
                dialogBox.setVisible(true);
                JTextField txt = new JTextField("V 1.0 & copyright 2023");
                txt.setBounds(10, 10, 200, 50);
                dialogBox.add(txt);
                dialogBox.add(closeButton);
                dialogBox.setResizable(false);
            }
        });

        closeButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dialogBox.dispose();
            }
        });
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
