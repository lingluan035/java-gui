package com.mlw;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.Window.Type;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Mygui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	static Student std1=new Student("王云","1101",98f);
	static Student std2=new Student("李磊","1102",95f);
	static Student std3=new Student("刘明","1103",88f);
	static Student std4=new Student("迟程","1104",99f);
	static Student std5=new Student("李伦","1105",96f);
	static Student std[]={std1,std2,std3,std4,std5};
	private JTextArea textArea;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mygui frame = new Mygui();
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
	public Mygui() {
		setTitle("\u5B66\u751F\u4FE1\u606F\u67E5\u8BE2\u7CFB\u7EDF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("\u5F00\u59CB\u67E5\u8BE2");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=0;i<std.length;i++){
					if(std[i].StudentName.equals(textField.getText())){
						textArea.setText("学生姓名："+std[i].StudentName+"\r\n"
								         +"学生学号："+std[i].StudentNum+"\r\n"
										 +"学生分数："+std[i].grade);
				    }
				}
			}
		});
		btnNewButton.setBounds(321, 10, 93, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\u901A\u8FC7\u59D3\u540D\u67E5\u8BE2\uFF1A");
		lblNewLabel.setBounds(10, 9, 108, 25);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(116, 11, 195, 23);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("\u901A\u8FC7\u5B66\u53F7\u67E5\u8BE2\uFF1A");
		label.setBounds(10, 44, 108, 25);
		panel.add(label);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(116, 44, 195, 23);
		panel.add(textField_1);
		
		JButton button = new JButton("\u5F00\u59CB\u67E5\u8BE2");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=0;i<std.length;i++){
					if(std[i].StudentNum.equals(textField_1.getText())){
						textArea.setText("学生姓名："+std[i].StudentName+"\r\n"
								         +"学生学号："+std[i].StudentNum+"\r\n"
										 +"学生分数："+std[i].grade);
				    }
			}
			//System.out.print(textField_1.getText());
			}
		});
		button.setBounds(321, 43, 93, 23);
		panel.add(button);
		
		JLabel label_1 = new JLabel("\u67E5\u8BE2\u7ED3\u679C\u663E\u793A\uFF1A");
		label_1.setBounds(10, 79, 108, 25);
		panel.add(label_1);
		
		textArea = new JTextArea();
		textArea.setBounds(35, 114, 379, 128);
		panel.add(textArea);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPane, panel, btnNewButton, lblNewLabel, textField, label, textField_1, button, label_1}));
	}
}
