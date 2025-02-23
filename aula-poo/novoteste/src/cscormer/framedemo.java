package cscormer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.PopupMenuListener;
import javax.swing.event.PopupMenuEvent;
import javax.swing.JCheckBox;

public class framedemo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JTextField tfResultado;
	
	MetodosCalculadora mc = new MetodosCalculadora();
	private JButton btnSub;
	private JButton btnDiv;
	private JButton btnMult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					framedemo frame = new framedemo();
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
	public framedemo() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 359, 434);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Número 1:");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel.setBounds(22, 25, 84, 14);
		contentPane.add(lblNewLabel);
		
		tfNum1 = new JTextField();
		tfNum1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		tfNum1.setBounds(117, 24, 155, 20);
		contentPane.add(tfNum1);
		tfNum1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Número 2:");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_1.setBounds(22, 56, 84, 14);
		contentPane.add(lblNewLabel_1);
		
		tfNum2 = new JTextField();
		tfNum2.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		tfNum2.setBounds(117, 55, 155, 20);
		contentPane.add(tfNum2);
		tfNum2.setColumns(10);
		
		JButton btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mc.setNum1(Double.parseDouble(tfNum1.getText()));
				mc.setNum2(Double.parseDouble(tfNum2.getText()));
				
				tfResultado.setText(""+mc.soma());
				
				
			}
		});
		btnSoma.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnSoma.setBounds(32, 125, 41, 23);
		contentPane.add(btnSoma);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado:");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_2.setBounds(22, 365, 102, 14);
		contentPane.add(lblNewLabel_2);
		
		tfResultado = new JTextField();
		tfResultado.setEditable(false);
		tfResultado.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		tfResultado.setBounds(117, 364, 155, 20);
		contentPane.add(tfResultado);
		tfResultado.setColumns(10);
		
		btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mc.setNum1(Double.parseDouble(tfNum1.getText()));
				mc.setNum2(Double.parseDouble(tfNum2.getText()));
				
				tfResultado.setText(""+mc.subtracao());
			}
		});
		btnSub.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnSub.setBounds(83, 125, 41, 23);
		contentPane.add(btnSub);
		
		btnDiv = new JButton("*");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mc.setNum1(Double.parseDouble(tfNum1.getText()));
				mc.setNum2(Double.parseDouble(tfNum2.getText()));
				
				tfResultado.setText(""+mc.multiplicacao());
			}
		});
		btnDiv.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnDiv.setBounds(138, 125, 41, 23);
		contentPane.add(btnDiv);
		
		btnMult = new JButton("/");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mc.setNum1(Double.parseDouble(tfNum1.getText()));
				mc.setNum2(Double.parseDouble(tfNum2.getText()));
				
				tfResultado.setText(""+mc.divisao());
			}
		});
		btnMult.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnMult.setBounds(192, 125, 41, 23);
		contentPane.add(btnMult);
		
		JComboBox cbOperacao = new JComboBox();
		cbOperacao.addPopupMenuListener(new PopupMenuListener() {
			public void popupMenuCanceled(PopupMenuEvent e) {
			}
			public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
				mc.setNum1(Double.parseDouble(tfNum1.getText()));
				mc.setNum2(Double.parseDouble(tfNum2.getText()));

				if(cbOperacao.getSelectedItem().equals("Soma")) {
					tfResultado.setText(""+mc.soma());
				}else if(cbOperacao.getSelectedItem().equals("Subtração")) {
					tfResultado.setText(""+mc.subtracao());
				}else if(cbOperacao.getSelectedItem().equals("Multiplicação")) {
					tfResultado.setText(""+mc.multiplicacao());
				}else if(cbOperacao.getSelectedItem().equals("Divisão:")) {
					tfResultado.setText(""+mc.divisao());
				}else {
					JOptionPane.showMessageDialog(null, "Opção de escolha invalida");
				}
				
			}
			public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
			}
		});
		cbOperacao.setModel(new DefaultComboBoxModel(new String[] {"Selecione...", "Soma", "Subtração", "Multiplicação", "Divisão:"}));
		cbOperacao.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		cbOperacao.setBounds(117, 171, 116, 22);
		contentPane.add(cbOperacao);
		
		JLabel lblNewLabel_1_1 = new JLabel("Operação:");
		lblNewLabel_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(10, 175, 84, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				mc.setNum1(Double.parseDouble(tfNum1.getText()));
				mc.setNum2(Double.parseDouble(tfNum2.getText()));
				
//				if(cbOperacao.getSelectedIndex() == 1) {
//					tfResultado.setText(""+mc.soma());
//				}else if(cbOperacao.getSelectedIndex() == 2) {
//					tfResultado.setText(""+mc.subtracao());
//				}else if(cbOperacao.getSelectedIndex() == 3) {
//					tfResultado.setText(""+mc.multiplicacao());
//				}else if(cbOperacao.getSelectedIndex() == 4) {
//					tfResultado.setText(""+mc.divisao());
//				}else {
//					JOptionPane.showMessageDialog(null, "Opção de escolha invalida");
//				}
				
				if(cbOperacao.getSelectedItem().equals("Soma")) {
					tfResultado.setText(""+mc.soma());
				}else if(cbOperacao.getSelectedItem().equals("Subtração")) {
					tfResultado.setText(""+mc.subtracao());
				}else if(cbOperacao.getSelectedItem().equals("Multiplicação")) {
					tfResultado.setText(""+mc.multiplicacao());
				}else if(cbOperacao.getSelectedItem().equals("Divisão:")) {
					tfResultado.setText(""+mc.divisao());
				}else {
					JOptionPane.showMessageDialog(null, "Opção de escolha invalida");
				}
			}
		});
		btnNewButton.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
		btnNewButton.setBounds(117, 331, 116, 23);
		contentPane.add(btnNewButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(117, 200, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_1.setBounds(117, 234, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("New check box");
		chckbxNewCheckBox_2.setBounds(117, 267, 97, 23);
		contentPane.add(chckbxNewCheckBox_2);
	}
}
