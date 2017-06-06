import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class calc_window {

	private JFrame frame;
	private JTextField textField;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calc_window window = new calc_window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calc_window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 250, 250));
		frame.getContentPane().setForeground(Color.ORANGE);
		frame.setBackground(Color.GRAY);
		frame.setBounds(50, 50, 350, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		// only 10 characters at time
		textField = new JTextField(10);
		textField.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField.setForeground(new Color(0, 0, 139));
		textField.setBackground(new Color(240, 255, 255));
		textField.setBounds(31, 20, 286, 47);
		textField.setText("");
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button_1 = new JButton("9");
		button_1.setBounds(180, 100, 68, 34);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				// perform the action 
				textField.setText(textField.getText() + "9"); 
				
			
		
			}
		});
		
		
		frame.getContentPane().add(button_1);
		
		JButton button_4 = new JButton("/");
		button_4.setBounds(249, 100, 68, 35);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Duplicate_symbols(textField); 

				// perform the action 
				textField.setText(textField.getText() + "/"); 

		
			}
		});
		
		
		frame.getContentPane().add(button_4);
		
		JButton btnX = new JButton("*");
		btnX.setBounds(249, 133, 68, 36);
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Duplicate_symbols(textField); 

				// perform the action 
				textField.setText(textField.getText() + "*"); 

		
			}
		});
		frame.getContentPane().add(btnX);
		
		JButton button_12 = new JButton("-");
		button_12.setBounds(249, 173, 68, 34);
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Duplicate_symbols(textField); 

				// perform the action 
				textField.setText(textField.getText() + "-"); 

		
			}
		});
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("+");
		button_13.setBounds(249, 210, 68, 34);
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Duplicate_symbols(textField); 

				// perform the action 
				textField.setText(textField.getText() + "+"); 
				
				

		
			}
		});
		frame.getContentPane().add(button_13);
		
		
		JButton button_14 = new JButton("6");
		button_14.setBounds(180, 134, 68, 35);
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
				// perform the action 
				textField.setText(textField.getText() + "6"); 
		
			}
		});
		frame.getContentPane().add(button_14);
		
		JButton button_7 = new JButton("3");
		button_7.setBounds(180, 173, 68, 34);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				// perform the action 
				textField.setText(textField.getText() + "3"); 
		
			}
		});
		frame.getContentPane().add(button_7);
		
		JButton button_10 = new JButton("=");
		button_10.setBounds(180, 210, 68, 34);
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
						
					// perform the action 
					ScriptEngineManager manager = new ScriptEngineManager();
					ScriptEngine engine = manager.getEngineByName("js");
					int length = textField.getText().length(); 
					String textString = textField.getText().toString(); 
					try {
						
						// before evaluating the string, make sure no symbols are trailing. if so, delete the symbol
						if(!Character.isDigit(textString.charAt(length-1)) && textString.matches(".*\\d+.*") )
						{
							JOptionPane.showMessageDialog(null, "Hello, we deleted you error made at the end of the equation. \n The equation will be solved as if that extra symbol never existed.");
					 		int endIndex; 
					 		endIndex = length - 1;
							textField.setText(textField.getText().substring(0, endIndex) );
						}
							
						
						Object result = engine.eval(textField.getText().toString());
						textField.setText(result.toString());  

					} catch (ScriptException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
				
				
			    
			    	
		
			}
		});
		frame.getContentPane().add(button_10);
		
		JButton button = new JButton("8");
		button.setBounds(105, 101, 68, 34);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				// perform the action 
				textField.setText(textField.getText() + "8"); 
		
			}
		});
		frame.getContentPane().add(button);
		
		JButton button_3 = new JButton("5");
		button_3.setBounds(105, 137, 68, 34);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				// perform the action 
				textField.setText(textField.getText() + "5"); 
		
			}
		});
		frame.getContentPane().add(button_3);
		
		JButton button_6 = new JButton("2");
		button_6.setBounds(105, 175, 68, 34);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				// perform the action 
				textField.setText(textField.getText() + "2"); 
				
		
			}
		});
		frame.getContentPane().add(button_6);
		
		JButton button_9 = new JButton("0");
		button_9.setBounds(105, 210, 68, 34);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				// perform the action 
				textField.setText(textField.getText() + "0"); 
		
			}
		});
		frame.getContentPane().add(button_9);
		
		JButton button_2 = new JButton("7");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				// perform the action 
				textField.setText(textField.getText() + "7"); 
		
			}
		});
		button_2.setBounds(32, 101, 68, 34);
		frame.getContentPane().add(button_2);
		
		JButton button_5 = new JButton("4");
		button_5.setBounds(32, 139, 68, 34);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				// perform the action 
				textField.setText(textField.getText() + "4"); 
		
			}
		});
		frame.getContentPane().add(button_5);
		
		JButton button_8 = new JButton("1");
		button_8.setBounds(31, 175, 68, 34);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				// perform the action 
				textField.setText(textField.getText() + "1"); 
		
			}
		});
		frame.getContentPane().add(button_8);
		
		JButton button_15 = new JButton(".");
		button_15.setBounds(31, 210, 68, 34);
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				

				// perform the action 
				Duplicate_symbols(textField); 

				textField.setText(textField.getText() + ".");


		
			}
		});
		frame.getContentPane().add(button_15);
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// perform the action 
				textField.setText(""); 

			}
		});
		btnNewButton.setBounds(31, 65, 142, 34);
		frame.getContentPane().add(btnNewButton);
		
		
		// backspace button 
		JButton btnBackspace = new JButton("Backspace");
		
		
		int length = textField.getText().length(); 
		
		

		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int endIndex; 

				if(length > -1 && !textField.getText().isEmpty()){
					endIndex = textField.getText().length() - 1;
					textField.setText(textField.getText().substring(0, endIndex) );

					
					}else{
						textField.setText(""); 
					}

			}
		});
	
		
		
		btnBackspace.setBounds(175, 65, 142, 34);
		frame.getContentPane().add(btnBackspace);
		
		
		
		
		
	}
	
			// check to make sure that 2 symbols are not repeated 
			public static void Duplicate_symbols(JTextField tf)
			{
				
				// length of string 
				int length = tf.getText().length(); 
				
			
				// 3 conditions:
				// if last 2 characters are not digits 
				//and there is at least 1 character 
				//and if the text is not empty
				// go ahead and delete the character 
			 if(!tf.getText().substring(length -1, length).matches("[0-9]") &&  length > -1 && !tf.getText().isEmpty()){
				 
				 		int endIndex; 
				 		endIndex = tf.getText().length() - 1;
						tf.setText(tf.getText().substring(0, endIndex) );

						
					
			 }
			 
			
			} /// end of the Duplicate Symbols Method 
			
			
			
}
