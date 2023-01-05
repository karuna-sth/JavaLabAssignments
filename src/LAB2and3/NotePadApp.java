package LAB2and3;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class NotePadApp extends JFrame{
    public static void main(String[] args){
        NotePadApp frame = new NotePadApp();
        frame.setVisible(true);
        frame.setBounds(500,100,1000,500);
        frame.setTitle("Notepad");
    }
    JTextArea textArea;
    public NotePadApp(){
        Container c = this.getContentPane();
        c.setLayout(null);
        textArea = new JTextArea();
        textArea.setBounds(0,20,1000,500);
        c.add(textArea);
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBounds(0,0,1000,20);
        c.add(menuBar);
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);
        JMenu editMenu = new JMenu("Edit");
        menuBar.add(editMenu);
        JMenu formatMenu = new JMenu("Format");
        menuBar.add(formatMenu);
        JMenu viewMenu = new JMenu("View");
        menuBar.add(viewMenu);
        JMenu helpMenu = new JMenu("Help");
        menuBar.add(helpMenu);
        JMenuItem newMenuItem = new JMenuItem("New");
        fileMenu.add(newMenuItem);
        JMenuItem openMenuItem = new JMenuItem("Open...");
        fileMenu.add(openMenuItem);
        JMenuItem saveMenuItem = new JMenuItem("Save" );
        fileMenu.add(saveMenuItem);
        JMenuItem saveAsMenuItem = new JMenuItem("Save AS...");
        fileMenu.add(saveAsMenuItem);
        fileMenu.addSeparator();    
        JMenuItem pageSetupMenuItem = new JMenuItem("Page Setup...");
        fileMenu.add(pageSetupMenuItem);
        JMenuItem printMenuItem = new JMenuItem("Print...");
        fileMenu.add(printMenuItem);
        fileMenu.addSeparator();  
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        fileMenu.add(exitMenuItem);
        JMenuItem undoMenuItem = new JMenuItem("Undo");
        editMenu.add(undoMenuItem);
        editMenu.addSeparator();
        JMenuItem cutMenuItem = new JMenuItem("Cut");
        editMenu.add(cutMenuItem);
        JMenuItem copyMenuItem = new JMenuItem("Copy");
        editMenu.add(copyMenuItem);
        JMenuItem pasteMenuItem = new JMenuItem("Paste");
        editMenu.add(pasteMenuItem);
        JMenuItem deleteMenuItem= new JMenuItem("Delete");
        editMenu.add(deleteMenuItem);
        JCheckBox wordWrapMenuItemCheckBox = new JCheckBox("Word Wrap");
        formatMenu.add(wordWrapMenuItemCheckBox);
        JMenuItem fontMenuItem = new JMenuItem("     Font..");
        formatMenu.add(fontMenuItem);
        JMenu zoomMenu = new JMenu("Zoom"); 
        JMenuItem zoomInMenuItem = new JMenuItem("Zoom In");
        zoomMenu.add(zoomInMenuItem);

        JMenuItem zoomOutMenuItem = new JMenuItem("Zoom Out");
        zoomMenu.add(zoomOutMenuItem);

        JMenuItem defaultZoomMenuItem = new JMenuItem("Restore Default Zoom");
        zoomMenu.add(defaultZoomMenuItem);
        JCheckBox statusBarCheckBox = new JCheckBox("Status Bar");
        viewMenu.add(statusBarCheckBox);
        statusBarCheckBox.setSelected(true);
        statusBarCheckBox.setEnabled(false);
        JMenuItem viewHelpMenuItem = new JMenuItem("View Help");
        helpMenu.add(viewHelpMenuItem);
        JMenuItem sendFeedbackMenuItem = new JMenuItem("Send Feedback");
        helpMenu.add(sendFeedbackMenuItem);
        helpMenu.addSeparator();
        JMenuItem aboutNotepadMenuItem = new JMenuItem("About Notepad");
        helpMenu.add(aboutNotepadMenuItem);
        newMenuItem.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                textArea.setText("");
            }
        });
        saveMenuItem.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String text = textArea.getText();
                try{
                    saveFile(text);
                }
                catch(Exception execption){
                    System.out.println(execption);
                }
            }
        });
        openMenuItem.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent actionEvent){
                try {
                    openFile();
                }
                catch (Exception exception){
                    System.out.println(exception);
                }
            }
        });
        exitMenuItem.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void saveFile(String text) throws IOException {
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
    private void openFile() throws Exception{
        String userDir = System.getProperty("user.home");
        JFileChooser fileChooser = new JFileChooser(userDir+"/Desktop");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files(*.txt)","txt"));
        int result = fileChooser.showOpenDialog(this);
        if(result == JFileChooser.APPROVE_OPTION){
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
            finally{
                if (in!=null)
                    in.close();
            }

        }
    }
}
