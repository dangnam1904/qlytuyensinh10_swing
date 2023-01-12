package view;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controller.UserController;
import dao.UserDAO;
import model.User;

public class UserView extends JFrame {

	private JPanel contentPane;
	private JTextField txt_username;
	private JTextField txt_password;
	private JLabel lblMtKhu;
	private JButton btn_login;

	public UserView() {
		setTitle("Đăng nhập");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		UserController controller = new UserController(this);
		JLabel lblNewLabel = new JLabel("Tên đăng nhập");
		lblNewLabel.setBounds(55, 30, 79, 14);
		contentPane.add(lblNewLabel);

		txt_username = new JTextField();
		txt_username.setBounds(156, 27, 138, 20);
		contentPane.add(txt_username);
		txt_username.setColumns(10);

		txt_password = new JTextField();
		txt_password.setBounds(156, 77, 138, 20);
		contentPane.add(txt_password);

		lblMtKhu = new JLabel("Mật khẩu");
		lblMtKhu.setBounds(78, 80, 79, 14);
		contentPane.add(lblMtKhu);

		btn_login = new JButton("Đăng nhập");
		btn_login.addActionListener(controller);
		btn_login.setBounds(156, 133, 89, 23);
		contentPane.add(btn_login);
		this.setVisible(true);
	}

	public void login() {
		String a = "";
		if (UserDAO.login(txt_username.getText().trim(), txt_password.getText().trim())) {
			JOptionPane.showMessageDialog(null, "Đăng nhập thành công", "Thông báo", 1);
			this.setVisible(false);
			Mainview vMainview = new Mainview();
			vMainview.setLocationRelativeTo(null);
		} else {
			JOptionPane.showMessageDialog(null, "Tên Tài khoan hoặc mật khẩu không chính xác", "Thông báo", 1);
		}

	}
}
