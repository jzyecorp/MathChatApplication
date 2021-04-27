import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Server extends JFrame {

	private JPanel contentPane;
	private JTextField name1;
	private JTextField name2;
	private JTextField name3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Server frame = new Server();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Server() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		name1 = new JTextField();
		name1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createRoom();
			}
		});
		name1.setBounds(104, 50, 237, 31);
		contentPane.add(name1);
		name1.setColumns(10);
		
		name2 = new JTextField();
		name2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createRoom();
			}
		});
		name2.setBounds(104, 134, 237, 31);
		contentPane.add(name2);
		name2.setColumns(10);
		
		//****
		name3 = new JTextField();
		name3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createRoom();
			}
		});
		name3.setBounds(104, 214, 237, 31);
		contentPane.add(name3);
		name3.setColumns(10);
		
		//***
		JLabel lblNewLabel = new JLabel("Tutor");
		lblNewLabel.setBounds(187, 25, 104, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel2 = new JLabel("Student1");
		lblNewLabel2.setBounds(187, 109, 104, 14);
		contentPane.add(lblNewLabel2);
		
		//**
		JLabel lblNewLabel3 = new JLabel("Student2");
		lblNewLabel3.setBounds(187, 189, 104, 14);
		contentPane.add(lblNewLabel3);
		
		//**
		
		JButton btnNewButton = new JButton("JOIN CHAT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createRoom();
			}
		});
		btnNewButton.setBounds(160, 283, 128, 47);
		contentPane.add(btnNewButton);
	}

	private void createRoom() {
		String p1, p2, p3;
		
		p1 = name1.getText();
		p2 = name2.getText();
		p3 = name3.getText();
		
		if(p1.equals("") || p2.equals("")) {
			JOptionPane.showMessageDialog (null, "Please enter a valid username!");
			return;
		}
		
		if(p2.equals("") || p3.equals("")) {
			JOptionPane.showMessageDialog (null, "Please enter a valid username!");
			return;
		}
		
		if(p1.equals("") || p3.equals("")) {
			JOptionPane.showMessageDialog (null, "Please enter a valid username!");
			return;
		}
		
		Window_1.username1 = name1.getText();
		Window_2.username2 = name2.getText();
		Window_3.username3 = name3.getText();
		ChatRoom.createRoom();		
	}	
}