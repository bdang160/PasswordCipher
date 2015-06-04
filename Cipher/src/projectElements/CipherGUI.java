package projectElements;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CipherGUI {

	private JFrame frame;
	private JTextField inputField = new JTextField();
	private JTextField outputField = new JTextField();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CipherGUI window = new CipherGUI();
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
	public CipherGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 505, 305);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//VERY IMPORTANT ELIMINATES DEFAULT BORDER LAYOUT
		frame.getContentPane().setLayout(null); 
		inputField.setText("");
		outputField.setText("");
		
		JLabel Header = new JLabel("Cipher Maker:");
		Header.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Header.setBounds(10, 11, 150, 30);
		frame.getContentPane().add(Header);
		
		JLabel InputLabel = new JLabel("Input:");
		InputLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		InputLabel.setBounds(10, 76, 84, 30);
		frame.getContentPane().add(InputLabel);
		
		JLabel OutputLabel = new JLabel("Output:");
		OutputLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		OutputLabel.setBounds(10, 144, 84, 30);
		frame.getContentPane().add(OutputLabel);
		
		inputField = new JTextField();
		inputField.setBounds(10, 113, 150, 20);
		frame.getContentPane().add(inputField);
		inputField.setColumns(10);
		
		outputField = new JTextField();
		outputField.setColumns(10);
		outputField.setBounds(8, 185, 152, 20);
		frame.getContentPane().add(outputField);
		
		JButton btnEncrypt = new JButton("Encrypt");
		btnEncrypt.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnEncrypt.setBounds(299, 47, 111, 87);
		frame.getContentPane().add(btnEncrypt);
		
		JButton btnDecrypt = new JButton("Decrypt");
		btnDecrypt.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDecrypt.setBounds(299, 150, 111, 87);
		frame.getContentPane().add(btnDecrypt);
		
		JLabel lblOnlyUsePassword = new JLabel("Letter, numbers, or \"!, \", #, $, %, &\"");
		lblOnlyUsePassword.setBounds(10, 35, 241, 30);
		frame.getContentPane().add(lblOnlyUsePassword);
		
		btnEncrypt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					CipherMaker temp = new CipherMaker(inputField.getText());
					outputField.setText(temp.getCipher());
				}
				catch (Exception e){
					JOptionPane.showMessageDialog(null, 
							"Please enter a proper password", "Error", 
							JOptionPane.PLAIN_MESSAGE);
				}
				
			}
		});
		
		btnDecrypt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					CipherMaker temp = new CipherMaker(inputField.getText());
					outputField.setText(temp.getDecryption());
				}
				catch (Exception e){
					JOptionPane.showMessageDialog(null, 
							"Please enter a proper password", "Error", 
							JOptionPane.PLAIN_MESSAGE);
				}
				
			}
		});
	}
}
