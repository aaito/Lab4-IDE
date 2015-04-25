package alunos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class form2 extends JFrame {

	public JPanel contentPane;
	public JTextField textfirstName, textlastName, dateD, dateM, dateA, email, cpf, phone, address1, address2, cep, state, city, country;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form2 frame = new form2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/* Create the frame. */
	public form2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 685);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(Color.white);
		
		JLabel formtitle = new JLabel("EA975 :: Lab. Eng. SW ::1S/2015");
		formtitle.setBounds(30, 20, 450, 30);
		formtitle.setFont(new Font(formtitle.getFont().getName(), Font.PLAIN, 27));
		contentPane.add(formtitle);
		
		JLabel subtitle = new JLabel("Exercício Design & Automated Testing");
		subtitle.setBounds(30, 55, 450, 20);
		subtitle.setForeground(Color.GRAY);
		contentPane.add(subtitle);
		
		JLabel info = new JLabel("* Obrigatório");
		info.setBounds(30, 75, 100, 20);
		info.setForeground(Color.red);
		contentPane.add(info);
		
		JLabel lblTitle = new JLabel("Title");
		lblTitle.setBounds(30, 115, 90, 15);
		contentPane.add(lblTitle);
		
		final JComboBox comboTitle = new JComboBox();
		comboTitle.setBackground(Color.white);
		comboTitle.setModel(new DefaultComboBoxModel(new String[] {"Mr.", "Mrs.", "Miss.", "Ms.", "Dr.", "Other"}));
		comboTitle.setToolTipText("");
		comboTitle.setBounds(30, 135, 81, 24);
		contentPane.add(comboTitle);
		
		final JLabel lblFirstName = new JLabel("First Name *");
		lblFirstName.setBounds(30, 170, 90, 15);
		contentPane.add(lblFirstName);
		
		textfirstName = new JTextField();
		textfirstName.setBounds(30, 190, 114, 19);
		contentPane.add(textfirstName);
		textfirstName.setColumns(10);
		
		final JLabel lblLastName = new JLabel("Last Name *");
		lblLastName.setBounds(30, 220, 90, 15);
		contentPane.add(lblLastName);
		
		textlastName = new JTextField();
		textlastName.setBounds(30, 240, 114, 19);
		contentPane.add(textlastName);
		textlastName.setColumns(10);
		
		final JLabel lbldate = new JLabel("Birth date *");
		lbldate.setBounds(30, 270, 90, 19);
		contentPane.add(lbldate);
		
		JLabel dateinfo = new JLabel("DD/MM/AAAA");
		dateinfo.setBounds(30, 290, 90, 19);
		dateinfo.setForeground(Color.gray);
		contentPane.add(dateinfo);
		
		dateD = new JTextField();
		dateD.setBounds(30, 310, 20, 19);
		contentPane.add(dateD);
		dateD.setColumns(2);
		dateM = new JTextField();
		dateM.setBounds(55, 310, 20, 19);
		contentPane.add(dateM);
		dateA = new JTextField();
		dateA.setBounds(80, 310, 35, 19);
		contentPane.add(dateA);
		dateA.setColumns(2);
		
		final JLabel lblemail = new JLabel("Email *");
		lblemail.setBounds(30, 340, 90, 19);
		contentPane.add(lblemail);
		
		email = new JTextField();
		email.setBounds(30, 360, 114, 19);
		contentPane.add(email);
		email.setColumns(10);
		
		final JLabel lblcpf = new JLabel("CPF *");
		lblcpf.setBounds(30, 390, 90, 19);
		contentPane.add(lblcpf);
		
		cpf = new JTextField();
		cpf.setBounds(30, 410, 114, 19);
		contentPane.add(cpf);
		cpf.setColumns(10);
		
		JLabel lblphone = new JLabel("Phone");
		lblphone.setBounds(30, 440, 90, 19);
		contentPane.add(lblphone);
		
		JLabel phoneinfo = new JLabel("Including international country code and DDD");
		phoneinfo.setBounds(30, 460, 300, 19);
		phoneinfo.setForeground(Color.gray);
		contentPane.add(phoneinfo);
		
		phone = new JTextField();
		phone.setBounds(30, 480, 114, 19);
		contentPane.add(phone);
		phone.setColumns(10);
		
		JLabel lblAddress1 = new JLabel("Address 1");
		lblAddress1.setBounds(270, 120, 90, 15);
		contentPane.add(lblAddress1);
		
		address1 = new JTextField();
		address1.setBounds(270, 140, 114, 19);
		contentPane.add(address1);
		address1.setColumns(10);		
		
		JLabel lblAddress2 = new JLabel("Address 2");
		lblAddress2.setBounds(270, 170, 90, 15);
		contentPane.add(lblAddress2);		
		
		address2 = new JTextField();
		address2.setBounds(270, 190, 114, 19);
		contentPane.add(address2);
		address2.setColumns(10);
		
		JLabel lblcep = new JLabel("CEP");
		lblcep.setBounds(270, 220, 90, 15);
		contentPane.add(lblcep);
	
		cep = new JTextField();
		cep.setBounds(270, 240, 114, 19);
		contentPane.add(cep);
		cep.setColumns(10);
		
		JLabel lblcity = new JLabel("City");
		lblcity.setBounds(270, 270, 90, 15);
		contentPane.add(lblcity);
		
		city = new JTextField();
		city.setBounds(270, 290, 114, 19);
		contentPane.add(city);
		city.setColumns(10);
		
		JLabel lblstate = new JLabel("State");
		lblstate.setBounds(270, 320, 90, 15);
		contentPane.add(lblstate);
		
		state = new JTextField();
		state.setBounds(270, 340, 114, 19);
		contentPane.add(state);
		state.setColumns(10);
		
		JLabel lblcountry = new JLabel("Country");
		lblcountry.setBounds(270, 370, 90, 15);
		contentPane.add(lblcountry);
		
		country = new JTextField();
		country.setBounds(270, 390, 114, 19);
		contentPane.add(country);
		country.setColumns(10);
		
		JButton btnPrint = new JButton("Enviar");
		btnPrint.setBackground(Color.getHSBColor(.58f, 1f, .85f));
		btnPrint.setForeground(Color.white);
	//	btnPrint.setBorder(new EmptyBorder(5, 5, 5, 5));
		btnPrint.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
					if (textfirstName.getText().isEmpty()) {
						lblFirstName.setForeground(Color.red);
					}
					else if (textlastName.getText().isEmpty()) {
						lblFirstName.setForeground(Color.black);
						lblLastName.setForeground(Color.red);
					}
					else if (dateD.getText().isEmpty() || dateM.getText().isEmpty() || dateA.getText().isEmpty()) {
						lblFirstName.setForeground(Color.black);
						lblLastName.setForeground(Color.black);
						lbldate.setForeground(Color.red);
					}
					else if (email.getText().isEmpty()) {
						lblFirstName.setForeground(Color.black);
						lblLastName.setForeground(Color.black);
						lbldate.setForeground(Color.black);
						lblemail.setForeground(Color.red);
					}
					else if (cpf.getText().isEmpty()) {
						lblFirstName.setForeground(Color.black);
						lblLastName.setForeground(Color.black);
						lbldate.setForeground(Color.black);
						lblemail.setForeground(Color.black);
						lblcpf.setForeground(Color.red);
					}
					else {	
					//contentPane.setVisible(false);
					print2 printForm = new print2();
					printForm.titleLabel.setText((String) comboTitle.getSelectedItem());
					printForm.firstNameLabel.setText(textfirstName.getText());
					printForm.lastNameLabel.setText(textlastName.getText());
					printForm.date.setText(dateD.getText()+"/"+dateM.getText()+"/"+dateA.getText());
					printForm.email.setText(email.getText());
					printForm.cpf.setText(cpf.getText());
					printForm.phone.setText(phone.getText());
					printForm.address1.setText(address1.getText());
					printForm.address2.setText(address2.getText());
					printForm.cep.setText(cep.getText());
					printForm.city.setText(city.getText());
					printForm.state.setText(state.getText());
					printForm.country.setText(country.getText());
					//printForm.contentPane.setVisible(true);					
					printForm.show();	
					}
			}
		});
		btnPrint.setBounds(30, 550, 74, 25);
		contentPane.add(btnPrint);
		
		JLabel lblEnviar = new JLabel("Nunca envie senhas em Formulários Google.");
		lblEnviar.setBounds(30, 580, 300, 15);
		lblEnviar.setForeground(Color.GRAY);
		contentPane.add(lblEnviar);
	
		JLabel lblC = new JLabel("Este conteúdo não foi criado nem aprovado pelo Google");
		lblC.setBounds(140, 620, 400, 15);
		lblC.setForeground(Color.GRAY);
		contentPane.add(lblC);
	}
}
