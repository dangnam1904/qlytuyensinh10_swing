package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.*;

public class UserView extends JFrame {

	private JPanel contentPane;
	private JTextField txt_username;
	private JTextField txt_password;
	private JTextField textField;
	private JLabel lblMtKhu;
	private JButton btn_login;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserView frame = new UserView();
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
	public UserView() {
		setTitle("Đăng nhập");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tên đăng nhập");
		lblNewLabel.setBounds(55, 30, 79, 14);
		contentPane.add(lblNewLabel);
		
		txt_username = new JTextField();
		txt_username.setBounds(156, 27, 138, 20);
		contentPane.add(txt_username);
		textField.setColumns(10);
		
		txt_password = new JTextField();
		txt_password.setBounds(156, 77, 138, 20);
		contentPane.add(txt_password);
		
		lblMtKhu = new JLabel("Mật khẩu");
		lblMtKhu.setBounds(78, 80, 79, 14);
		contentPane.add(lblMtKhu);
		
		btn_login = new JButton("Đăng nhập");
		btn_login.setBounds(156, 133, 89, 23);
		contentPane.add(btn_login);
		textField.setColumns(10);
	}
}
