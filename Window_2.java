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

public class Window_2 extends JFrame {

	static String username2;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window_2 frame = new Window_2();
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
	public Window_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 316, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		display2 = new JTextArea();
		display2.setBounds(0, 22, 300, 272);
		contentPane.add(display2);
		
		text2 = new JTextArea();
		text2.setBounds(0, 343, 210, 72);
		contentPane.add(text2);
		
		send2 = new JButton("SEND");
		send2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ye) {
				String b = text2.getText();
				if (b.equals("")) {
					return;			
				}
				display2.append(username2 + ":" + b + "\n" );
				Window_1.sendText();
				Window_3.sendText();
				text2.setText("");	
			}					
								
		});
		send2.setBounds(211, 344, 89, 71);
		contentPane.add(send2);
		
		label2 = new JLabel("Chat window for: " + username2);
		label2.setBounds(0, 0, 197, 22);
		contentPane.add(label2);
		
		JButton clear = new JButton("CLEAR");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display2.setText("");
			}
		});
		clear.setBounds(201, 0, 89, 23);
		contentPane.add(clear);
		
		//*********
		sqFunct = new JButton("²");
		sqFunct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text2.setText("²");
			}
		});
		sqFunct.setBounds(0, 298, 51, 23);
		contentPane.add(sqFunct);
		
		degree = new JButton("\u00B0");
		degree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text2.setText("°");
			}
		});
		degree.setBounds(52, 298, 51, 23);
		contentPane.add(degree);
	}
		//*********
	
	public static void sendText() {
		String x = Window_1.text1.getText();
		String x1 = Window_3.text3.getText();
		
		if (x.equals("")) {
			display2.append("");
		}
		else {display2.append(Window_1.username1 + ":" + x + "\n" );
		}
				
		if (x1.equals("")) {
			display2.append("");			
		}
		else {display2.append(Window_3.username3 + ":" + x1 + "\n" );
		}
	}
	
	private javax.swing.JLabel label2;
	private static javax.swing.JTextArea display2;
	private javax.swing.JButton send2;
	public static javax.swing.JTextArea text2;
	private JButton sqFunct;
	private JButton degree;


}
