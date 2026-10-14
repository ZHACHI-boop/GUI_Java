package ejemplo2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class view_registro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view_registro frame = new view_registro();
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
	public view_registro() {
		setTitle("REGISTRAR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 719, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.window);
		panel.setBounds(10, 10, 341, 306);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Datos Personales");
		lblNewLabel.setBounds(10, 0, 136, 13);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cedula: ");
		lblNewLabel_1.setBounds(10, 29, 65, 13);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombres: ");
		lblNewLabel_2.setBounds(10, 54, 65, 13);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Apellidos:");
		lblNewLabel_3.setBounds(10, 79, 65, 13);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Genero:");
		lblNewLabel_4.setBounds(10, 104, 65, 13);
		panel.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(83, 26, 229, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(83, 51, 229, 19);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(83, 76, 229, 19);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Femenino");
		rdbtnNewRadioButton.setBounds(83, 104, 107, 21);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Masculino");
		rdbtnNewRadioButton_1.setBounds(83, 132, 107, 21);
		panel.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_5 = new JLabel("Edad:");
		lblNewLabel_5.setBounds(10, 162, 65, 13);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Ciudad:");
		lblNewLabel_6.setBounds(10, 187, 65, 13);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Direccion:");
		lblNewLabel_7.setBounds(12, 218, 65, 13);
		panel.add(lblNewLabel_7);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(83, 159, 38, 20);
		panel.add(spinner);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(83, 183, 229, 21);
		panel.add(comboBox);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(83, 218, 229, 46);
		panel.add(textArea);
		
		textField_3 = new JTextField();
		textField_3.setBounds(83, 270, 229, 19);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Email:");
		lblNewLabel_8.setBounds(10, 276, 65, 13);
		panel.add(lblNewLabel_8);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.window);
		panel_1.setBounds(10, 326, 692, 48);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setBounds(154, 10, 97, 21);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpiar");
		btnNewButton_1.setBounds(294, 10, 97, 21);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Buscar");
		btnNewButton_2.setBounds(441, 10, 97, 21);
		panel_1.add(btnNewButton_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.window);
		panel_2.setBounds(361, 10, 341, 306);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("Educacion");
		lblNewLabel_9.setBounds(10, 0, 133, 13);
		panel_2.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Nivel de Estudios:");
		lblNewLabel_10.setBounds(10, 27, 118, 13);
		panel_2.add(lblNewLabel_10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(138, 23, 181, 21);
		panel_2.add(comboBox_1);
		
		JLabel lblNewLabel_11 = new JLabel("Ingles:");
		lblNewLabel_11.setBounds(10, 56, 84, 13);
		panel_2.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Escrito:");
		lblNewLabel_12.setBounds(36, 71, 58, 13);
		panel_2.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Hablado:");
		lblNewLabel_13.setBounds(36, 97, 58, 13);
		panel_2.add(lblNewLabel_13);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(104, 68, 53, 20);
		panel_2.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(104, 94, 53, 20);
		panel_2.add(spinner_2);
		
		JLabel lblNewLabel_14 = new JLabel("Habilidades:");
		lblNewLabel_14.setBounds(10, 128, 108, 13);
		panel_2.add(lblNewLabel_14);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Trabajo en Equipo");
		chckbxNewCheckBox.setBounds(36, 147, 220, 21);
		panel_2.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Resolucion de Conflictos");
		chckbxNewCheckBox_1.setBounds(36, 181, 220, 21);
		panel_2.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Orientacion al Cliente");
		chckbxNewCheckBox_2.setBounds(36, 220, 220, 21);
		panel_2.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Liderazgo");
		chckbxNewCheckBox_3.setBounds(36, 260, 220, 21);
		panel_2.add(chckbxNewCheckBox_3);

	}
}
