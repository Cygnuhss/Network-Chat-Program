package com.NetworkChatProgram;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtAddress;
	private JTextField txtPort;

	public Login() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		setResizable(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 380);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtName = new JTextField();
		txtName.setBounds(64, 60, 165, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(131, 43, 31, 14);
		contentPane.add(lblName);
		
		txtAddress = new JTextField();
		txtAddress.setBounds(64, 127, 165, 20);
		contentPane.add(txtAddress);
		txtAddress.setColumns(10);
		
		JLabel lblAddress = new JLabel("IP Address:");
		lblAddress.setBounds(118, 110, 57, 14);
		contentPane.add(lblAddress);
		
		txtPort = new JTextField();
		txtPort.setColumns(10);
		txtPort.setBounds(64, 190, 165, 20);
		contentPane.add(txtPort);
		
		JLabel lblPort = new JLabel("Port:");
		lblPort.setBounds(135, 173, 24, 14);
		contentPane.add(lblPort);
		
		JLabel lblAddressDesc = new JLabel("(eg. 192.168.0.2)");
		lblAddressDesc.setBounds(104, 148, 87, 14);
		contentPane.add(lblAddressDesc);
		
		JLabel lblPortDesc = new JLabel("(eg. 8192)");
		lblPortDesc.setBounds(121, 212, 51, 14);
		contentPane.add(lblPortDesc);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				String address = txtAddress.getText();
				int port = Integer.parseInt(txtPort.getText());
				login(name, address, port);
			}
		});
		btnLogin.setBounds(104, 277, 87, 20);
		contentPane.add(btnLogin);
	}
	
	private void login(String name, String address, int port) {
		dispose();
		System.out.println(name + address + port);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
