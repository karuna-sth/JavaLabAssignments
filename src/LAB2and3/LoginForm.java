package LAB2and3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class LoginForm extends JFrame
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args)
    {
    	LoginForm app   =new LoginForm();
        app.setVisible(true);
        app.setSize(400,400);
        app.setLocationRelativeTo(null);
    }

    public LoginForm (){
        setLayout(new FlowLayout());
        add(new JLabel("Username"));
        JTextField LoginTextField = new JTextField(5);
        add(LoginTextField);

        add(new JLabel("Password"));
        JPasswordField LoginPasswordField = new JPasswordField(10);
        add(LoginPasswordField);

        JButton LoginButton = new JButton("Login");
        add(LoginButton);

        LoginButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String username = LoginTextField.getText();
                char[] password = LoginPasswordField.getPassword();
                char[] actualPassword = {'a','d','m','i','n'};
                if (username.equals("admin") && Arrays.equals(actualPassword,password)){
                	add(new JLabel("Access Granted"));
                    LoginTextField.setText("");
                    LoginPasswordField.setText("");
                    LoginTextField.requestFocus();
                }
                else{
                	add(new JLabel("Access Denied"));
                    LoginTextField.setText("");
                    LoginPasswordField.setText("");
                    LoginTextField.requestFocus();
                }
            }
        });
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
