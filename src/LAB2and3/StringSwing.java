package LAB2and3;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class StringSwing extends JFrame implements ActionListener{
	JLabel l1, res;
	JTextField f1, showRes;
	JButton palindrome, reverse, findVowel;
	public StringSwing(){
		l1 = new JLabel("Input any String");
		l1.setBounds(20, 20, 100, 20);
		f1 = new JTextField(20);
		f1.setBounds(120, 20, 100, 20);
		res = new JLabel("Result");
		res.setBounds(20, 50, 100, 20);
		showRes = new JTextField(20);
		showRes.setBounds(120, 50, 200, 20);
		palindrome = new JButton("Palindrome or not? ");
		palindrome.setBounds(20, 80, 150, 25 );
		reverse = new JButton("Find Reverse ");
		reverse.setBounds(20, 120, 150, 25 );
		findVowel = new JButton("Find Vowel");
		findVowel.setBounds(20, 160, 150, 25 );
		add(l1);
		add(f1);
		add(palindrome);
		add(findVowel);
		add(reverse);
		add(res);
		add(showRes);
		palindrome.addActionListener(this); 
		findVowel.addActionListener(this); 
		reverse.addActionListener(this); 
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	 public void actionPerformed(ActionEvent e){
	    if(e.getSource()==palindrome){
	        String s = f1.getText();
	        String res = "";
	        for(int i=0; i<s.length(); i++) {
	        	char ch= s.charAt(i);
	        	res = ch + res;
	        }
	        if (s.equals(res)) {
	        	showRes.setText("String is palindrome");
	        }
	        else {
	        	showRes.setText("String is not palindrome");
	        }
	        
	    }
	    if(e.getSource()==findVowel){
	    	String s = f1.getText();
	    	String res = "";
	    	for(int i=0; i<s.length(); i++) {
	        	if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
	        		res += s.charAt(i);	
	        	}
	        	showRes.setText(String.valueOf(res));
	    	}
	    }
	    if(e.getSource()==reverse){
	    	String s = f1.getText();
	        String res = "";
	        for(int i=0; i<s.length(); i++) {
	        	char ch= s.charAt(i);
	        	res = ch + res;
	        }
	        showRes.setText(String.valueOf(res));
	    }
	}
	public static void main(String args[]) {
		new StringSwing();
	}
}
