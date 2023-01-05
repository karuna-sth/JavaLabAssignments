package LAB2and3;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GridLayoutEX extends JFrame implements ActionListener{
	JFrame f1; 
	JTextField siField, pField, tField, rField;
	JButton cal;
	GridLayoutEX(){
		f1 = new JFrame();    
		JLabel p = new JLabel("Principal: ");
		pField = new JTextField(10);
		JLabel t = new JLabel("Time: ");
		tField = new JTextField(10);
		JLabel r = new JLabel("Rate in % : ");
		rField = new JTextField(10);
		cal = new JButton("Calculate");
		JLabel si = new JLabel("Simple Interest");
		siField = new JTextField(10);
		f1.add(p);
		f1.add(pField);
		f1.add(t);
		f1.add(tField);
		f1.add(r);
		f1.add(rField);
		f1.add(si);
		f1.add(siField);
		f1.add(cal);
		f1.setLayout(new GridLayout(5,2));    
		cal.addActionListener(this); 
	    f1.setSize(400, 250);    
	    f1.setVisible(true);  
	}
	public void actionPerformed(ActionEvent e){
	    if(e.getSource()==cal){
	        int p = Integer.parseInt(pField.getText()); 
	        int r = Integer.parseInt(rField.getText());
	        int t = Integer.parseInt(tField.getText());
	        int si = p * t * r / 100;
	        siField.setText(String.valueOf(si));
	    }
	}
	public static void main(String[] args) {
		new GridLayoutEX();
	}
}
