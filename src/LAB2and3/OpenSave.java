package LAB2and3;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.*;
import java.io.*;

public class OpenSave extends JFrame{
    public static void main(String[] args){
    	OpenSave frame = new OpenSave();
        frame.setBounds(500,100,1000,500);
        frame.setVisible(true);
    }
    JTextArea textArea;
    public OpenSave(){
        textArea = new JTextArea();
        add(textArea);
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);
        JMenuItem openMenuItem = new JMenuItem("Open");
        JMenuItem saveMenuItem = new JMenuItem("save");
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        openMenuItem.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent actionEvent){
                try{
                    openFile();
                }
                catch (Exception exception){
                    System.out.println(exception);
                }
            }
        });

        saveMenuItem.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String text = textArea.getText();
                try {
                    saveFile(text);
                }
                catch(Exception execption){
                    System.out.println(execption);
                }
            }
        });
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void openFile() throws Exception{
        String userDir = System.getProperty("user.home");
        JFileChooser fileChooser = new JFileChooser(userDir+"/Desktop");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files(*.txt)","txt"));
        int result = fileChooser.showOpenDialog(this);

        if(result == JFileChooser.APPROVE_OPTION) {
            File selectedFile =fileChooser.getSelectedFile();

            BufferedReader in = null;
            String fileName = selectedFile.getName();
            setTitle(fileName);
            try{
                in = new BufferedReader(new FileReader(selectedFile));
                StringBuilder sb = new StringBuilder();
                String line;
                while (true){
                    line = in.readLine();
                    sb.append(line + "\n");
                    if (line==null)
                        break;
                    textArea.setText(sb.toString());
                }
            }
            finally {
                if (in!=null)
                    in.close();
            }

        }
    }

    private void saveFile(String text) throws IOException{
        String userDir = System.getProperty("user.home");
        JFileChooser chooser = new JFileChooser(userDir+"/Desktop");
        chooser.setFileFilter(new FileNameExtensionFilter("Text Files (*.txt)", "txt"));
        chooser.setSelectedFile(new File(".txt"));
        int result = chooser.showSaveDialog(this);
        if(result == JFileChooser.APPROVE_OPTION){
            File file = chooser.getSelectedFile();
            PrintWriter out = null;
            try{
                out = new PrintWriter(file);
                out.print(text);
            }
            finally{
                out.close();
            }
        }
        else
            return;
    }
}