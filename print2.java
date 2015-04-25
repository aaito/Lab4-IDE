package alunos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class print2 extends JFrame {

	public JPanel contentPane;
	JLabel titleLabel = new JLabel();
	JLabel firstNameLabel = new JLabel();
	JLabel lastNameLabel = new JLabel();
	JLabel date = new JLabel();
	JLabel email = new JLabel();
	JLabel cpf = new JLabel();
	JLabel phone = new JLabel();
	JLabel address1 = new JLabel();
	JLabel address2 = new JLabel();
	JLabel cep = new JLabel();
	JLabel city = new JLabel();
	JLabel state = new JLabel();
	JLabel country = new JLabel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					print2 frame = new print2();					
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
	public print2() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 310, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(Color.white);
		contentPane.setLayout(null);
		
		JLabel formtitle = new JLabel("Your formulary");
		formtitle.setFont(new Font("Dialog", Font.BOLD, 20));
		formtitle.setBounds(80, 12, 159, 31);
		contentPane.add(formtitle);

		JLabel lbltitle = new JLabel("Title:");
		lbltitle.setBounds(30, 60, 70, 15);
		contentPane.add(lbltitle);
		titleLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		titleLabel.setBounds(102, 60, 180, 15);
		contentPane.add(titleLabel);
		
		JLabel lblfirstname = new JLabel("First Name:");
		lblfirstname.setBounds(30, 80, 106, 15);
		contentPane.add(lblfirstname);		
		firstNameLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		firstNameLabel.setBounds(102, 80, 180, 15);
		contentPane.add(firstNameLabel);		
		
		JLabel lbllastname = new JLabel("Last Name:");
		lbllastname.setBounds(30, 100, 98, 15);
		contentPane.add(lbllastname);
		lastNameLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		lastNameLabel.setBounds(102, 100, 180, 15);
		contentPane.add(lastNameLabel);
		
		JLabel lbldate = new JLabel("Birth date:");
		lbldate.setBounds(30, 120, 250, 15);
		contentPane.add(lbldate);
		date.setFont(new Font("Dialog", Font.PLAIN, 12));
		date.setBounds(102, 120, 180, 15);
		contentPane.add(date);
		
		JLabel lblemail = new JLabel("Email:");
		lblemail.setBounds(30, 140, 98, 15);
		contentPane.add(lblemail);
		email.setFont(new Font("Dialog", Font.PLAIN, 12));
		email.setBounds(102, 140, 180, 15);
		contentPane.add(email);
		
		JLabel lblcpf = new JLabel("CPF:");
		lblcpf.setBounds(30, 160, 98, 15);
		contentPane.add(lblcpf);
		cpf.setFont(new Font("Dialog", Font.PLAIN, 12));
		cpf.setBounds(102, 160, 180, 15);
		contentPane.add(cpf);
		
		JLabel lblphone = new JLabel("Phone:");
		lblphone.setBounds(30, 180, 98, 15);
		contentPane.add(lblphone);
		phone.setFont(new Font("Dialog", Font.PLAIN, 12));
		phone.setBounds(102, 180, 180, 15);
		contentPane.add(phone);
		
		JLabel lbladdress1 = new JLabel("Address 1:");
		lbladdress1.setBounds(30, 200, 98, 15);
		contentPane.add(lbladdress1);
		address1.setFont(new Font("Dialog", Font.PLAIN, 12));
		address1.setBounds(102, 200, 180, 15);
		contentPane.add(address1);
		
		JLabel lbladdress2 = new JLabel("Address 2:");
		lbladdress2.setBounds(30, 220, 98, 15);
		contentPane.add(lbladdress2);
		address2.setFont(new Font("Dialog", Font.PLAIN, 12));
		address2.setBounds(102, 220, 216, 15);
		contentPane.add(address2);
		
		JLabel lblcep = new JLabel("CEP:");
		lblcep.setBounds(30, 240, 98, 15);
		contentPane.add(lblcep);
		cep.setFont(new Font("Dialog", Font.PLAIN, 12));
		cep.setBounds(102, 240, 180, 15);
		contentPane.add(cep);
		
		JLabel lblcity = new JLabel("City:");
		lblcity.setBounds(30, 260, 98, 15);
		contentPane.add(lblcity);
		city.setFont(new Font("Dialog", Font.PLAIN, 12));
		city.setBounds(102, 260, 180, 15);
		contentPane.add(city);
		
		JLabel lblstate = new JLabel("State:");
		lblstate.setBounds(30, 280, 98, 15);
		contentPane.add(lblstate);
		state.setFont(new Font("Dialog", Font.PLAIN, 12));
		state.setBounds(102, 280, 216, 15);
		contentPane.add(state);
		
		JLabel lblcountry = new JLabel("Country:");
		lblcountry.setBounds(30, 300, 98, 15);
		contentPane.add(lblcountry);
		country.setFont(new Font("Dialog", Font.PLAIN, 12));
		country.setBounds(102, 300, 180, 15);
		contentPane.add(country);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(Color.white);
		btnExit.setBackground(Color.getHSBColor(.58f, 1f, .85f));
		btnExit.setBounds(87, 350, 117, 25);
		contentPane.add(btnExit);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

	}

}
