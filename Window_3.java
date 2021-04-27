import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Window_3 extends JFrame {

	static String username3;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window_3 frame = new Window_3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Window_3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 316, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		display3 = new JTextArea();
		display3.setBounds(0, 22, 300, 272);
		contentPane.add(display3);
		
		text3 = new JTextArea();
		text3.setBounds(0, 343, 210, 72);
		contentPane.add(text3);
		
		send3 = new JButton("SEND");
		send3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent xe) {
				String c = text3.getText();
				if (c.equals("")) {
					return;			
				}
				display3.append(username3 + ":" + c + "\n" );
				Window_1.sendText();
				Window_2.sendText();
				text3.setText("");	
			}					
								
		});
		send3.setBounds(211, 344, 89, 71);
		contentPane.add(send3);
		
		label3 = new JLabel("Chat window for: " + username3);
		label3.setBounds(0, 0, 197, 22);
		contentPane.add(label3);
		
		JButton clear = new JButton("CLEAR");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display3.setText("");
			}
		});
		clear.setBounds(201, 0, 89, 23);
		contentPane.add(clear);
		
		//*********
		sqFunct = new JButton("²");
		sqFunct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text3.setText("²");
			}
		});
		sqFunct.setBounds(0, 298, 51, 23);
		contentPane.add(sqFunct);
		
		degree = new JButton("\u00B0");
		degree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text3.setText("°");
			}
		});
		degree.setBounds(52, 298, 51, 23);
		contentPane.add(degree);
	}
		//*********
	
	public static void sendText() {
		String y = Window_1.text1.getText();
		String y1 = Window_2.text2.getText();
		
		if (y.equals("")) {
			display3.append("");			
		}
		else {display3.append(Window_1.username1 + ":" + y + "\n" );
		}
		
		if (y1.equals("")) {
			display3.append("");			
		}
		else {display3.append(Window_2.username2 + ":" + y1 + "\n" );
		}
	}

	private javax.swing.JLabel label3;
	private static javax.swing.JTextArea display3;
	private javax.swing.JButton send3;
	public static javax.swing.JTextArea text3;
	private JButton sqFunct;
	private JButton degree;


}
