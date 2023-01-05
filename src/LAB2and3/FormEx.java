package LAB2and3;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FormEx extends JFrame{
    public static void main(String[] args){
    	FormEx frame = new FormEx();
        frame.setVisible(true);
        frame.setBounds(500,100,500,800);
        frame.setTitle("Student Records");

    }
    JTextField firstNameField,lastNameField,ageField;
    JRadioButton maleRadioButton,femaleRadioButton;
    JComboBox facultyComboBox,semesterComboBox;
    JTextArea remarksTextArea;
    ButtonGroup group;
    public FormEx() {
        setLayout(new GridLayout(18,0));
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);
        JMenuItem saveMenuItem = new JMenuItem("Save");
        fileMenu.add(saveMenuItem);
        JMenuItem resetMenuItem = new JMenuItem("Reset");
        fileMenu.add(resetMenuItem);
        fileMenu.addSeparator();
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        fileMenu.add(exitMenuItem);
        JLabel title = new JLabel("Students Record");
        Font font = new Font("TimesRoman",Font.BOLD,20);
        title.setFont(font);
        title.setHorizontalAlignment(title.CENTER);
        add(title);
        Font font1 = new Font("TimesRoman",Font.BOLD,16);
        JLabel firstNameLabel = new JLabel("FirstName:");
        firstNameLabel.setFont(font1);
        firstNameField = new JTextField(10);
        JLabel lastNameLabel = new JLabel("LastName:");
        lastNameLabel.setFont(font1);
        lastNameField = new JTextField(10);
        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setFont(font1);
        ageField = new JTextField(10);
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setFont(font1);
        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");
        JLabel facultyLabel = new JLabel("Faculty:");
        facultyLabel.setFont(font1);
        String[] facultyList ={"BSC/CSIT","BBM","BIT","Engineering"};
        facultyComboBox = new JComboBox(facultyList);
        JLabel semesterLabel = new JLabel("Semester:");
        semesterLabel.setFont(font1);
        String[] semesterList ={"1st Sem","2nd Sem","3rd Sem","4th Sem","5th Sem",
                                "6th Sem","7th Sem","8th Sem"};
        semesterComboBox = new JComboBox(semesterList);
        JLabel remarksLabel = new JLabel("Remarks:");
        remarksLabel.setFont(font1);
        remarksTextArea = new JTextArea();
        add(firstNameLabel);
        add(firstNameField);
        add(lastNameLabel);
        add(lastNameField);
        add(ageLabel);
        add(ageField);
        add(genderLabel);
        group = new ButtonGroup();
        add(maleRadioButton);
        add(femaleRadioButton);
        group.add(maleRadioButton);
        group.add(femaleRadioButton);
        add(facultyLabel);
        add(facultyComboBox);
        add(semesterLabel);
        add(semesterComboBox);
        add(remarksLabel);
        add(remarksTextArea);
        saveMenuItem.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent actionEvent){
                String[] text = getFieldValue();
                try{
                    saveFormData(text);
                }
                catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        });
        resetMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                resetMethods();
            }
        });
        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent){
                System.exit(0);
            }
        });

        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void resetMethods(){
        firstNameField.setText("");
        lastNameField.setText("");
        ageField.setText("");
        group.clearSelection();
        facultyComboBox.setSelectedIndex(0);
        semesterComboBox.setSelectedIndex(0);
        remarksTextArea.setText("");
    }

    private String[] getFieldValue() {
        maleRadioButton.setActionCommand("Male");
        femaleRadioButton.setActionCommand("Female");
        String[] text = {
                firstNameField.getText(),
                lastNameField.getText(),
                ageField.getText(),
                group.getSelection().getActionCommand(),
                (String)facultyComboBox.getSelectedItem(),
                (String)semesterComboBox.getSelectedItem(),
                remarksTextArea.getText()
        };
        return text;
    }
    private void saveFormData (String[] text) throws IOException{
        String userDir = System.getProperty("user.home");
        JFileChooser chooser = new JFileChooser(userDir+"/Desktop");

        chooser.setFileFilter(new FileNameExtensionFilter("Text Files (*.txt)", "txt"));
        chooser.setSelectedFile(new File(".txt"));
        int result = chooser.showSaveDialog(this);

        if(result == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            PrintWriter out = null;
            try  {
                out = new PrintWriter(file);
                for (int i=0; i<text.length; i++){
                    out.print(text[i]+"\n");
                }
            }
            finally{
                out.close();
            }
        }
        else
            return;
    }
}