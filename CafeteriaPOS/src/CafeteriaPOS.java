import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.xml.bind.JAXBElement.GlobalScope;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTabbedPane;
import javax.swing.JScrollBar;
import javax.swing.JToggleButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class CafeteriaPOS {

	private JFrame frame;
	private JButton btnNewButton;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_11;
	private JButton button_12;
	private JButton button_13;
	private JButton button_14;
	private JButton button_15;
	private JButton button_16;
	private JButton button_17;
	private JButton button_18;
	private JButton button_19;
	private JButton button_21;
	private JButton button_22;
	private JButton button_23;
	private JButton button_24;
	private JButton button_25;
	private JButton button_26;
	private JButton button_27;
	private JButton button_28;
	private JButton button_38;
	private JButton button_37;
	private JButton button_36;
	private JButton button_35;
	private JButton button_34;
	private JButton button_33;
	private JButton button_32;
	private JButton button_31;
	private JButton button_30;
	private JButton button_29;
	private JTextArea itemList;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CafeteriaPOS window = new CafeteriaPOS();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CafeteriaPOS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public static int qty1 = 1;
	public static int qty2 = 1;
	public static int qty3 = 1;
	public static int qty5 = 1;
	public static int qty6 = 1;
	public static int qty7 = 1;
	public static int qty8 = 1;
	public static int qty9 = 1;
	public static int qty10 = 1;
	public static int qty11 = 1;
	public static int qty12 = 1;
	public static int qty13 = 1;
	public static int qty14 = 1;
	public static int qty15 = 1;
	public static int qty16 = 1;
	public static int qty17 = 1;
	public static int qty18 = 1;
	public static int qty19 = 1;
	public static int qty20 = 1;
	public static int qty21 = 1;
	public static int qty22 = 1;
	public static int qty23 = 1;
	public static int qty24 = 1;
	public static int qty25 = 1;
	public static int qty26 = 1;
	public static int qty27 = 1;
	public static int qty28 = 1;
	public static int qty29 = 1;
	public static int qty30 = 1;
	public static int qty31 = 1;
	public static int qty32 = 1;
	public static int qty33 = 1;
	public static int qty34 = 1;
	public static int qty35 = 1;
	public static int qty36 = 1;
	public static int qty37 = 1;
	public static int qty38 = 1;
	public static int qty39 = 1;
	public static int qty40 = 1;
	public static int qqti = 1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 1260, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("EIS Cafeteria POS System");
		lblNewLabel.setFont(new Font("Myriad Pro", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(29, 11, 214, 44);
		frame.getContentPane().add(lblNewLabel);
		
		JButton buttonC = new JButton("C");
		buttonC.setBounds(1187, 426, 57, 57);
		frame.getContentPane().add(buttonC);
		
		JButton JFoodBtn = new JButton("Japanese Food");
		JFoodBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNewButton.setText("JapFood test");
			}
		});
		JFoodBtn.setBounds(29, 77, 186, 76);
		frame.getContentPane().add(JFoodBtn);
		
		JButton InterFoodBtn = new JButton("International Food");
		InterFoodBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setText("InterFood test");
			}
		});
		InterFoodBtn.setBounds(29, 164, 186, 66);
		frame.getContentPane().add(InterFoodBtn);
		
		JButton NoodleBtn = new JButton("Noodles");
		NoodleBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setText("Noodle with chicken");
				button.setText("Noodle with beef");
				button_1.setText("Tomyum noodle with chicken");
				button_2.setText("Tomyum noodle with beef");
				button_3.setText("Yentafour");
				button_4.setText("+Eggs");				
			}
		});
		NoodleBtn.setBounds(29, 328, 186, 76);
		frame.getContentPane().add(NoodleBtn);
		
		JButton DDbtn = new JButton("Desserts and Drinks");
		DDbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setText("Desserts and Drinks test");
			}
		});
		DDbtn.setBounds(29, 415, 186, 79);
		frame.getContentPane().add(DDbtn);
		
		JButton VFoodBtn = new JButton("Vegetarian Food");
		VFoodBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setText("VegFood test");
			}
		});
		VFoodBtn.setBounds(29, 505, 186, 86);
		frame.getContentPane().add(VFoodBtn);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(314, 138, -10, 335);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(241, 77, 2, 434);
		frame.getContentPane().add(separator_1);
		

		
		btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (itemList.getText().contains(btnNewButton.getText())) {
					qty1 += 1;
					textField.setText(String.valueOf(qty1));
				}
				
				else {
					itemList.append(String.format("%s \n", btnNewButton.getText()));
						if (textField.getText() != "") {
							if (textField_1.getText() != "") {
								if (textField_2.getText() != "") {
									
								}
							}
						}
						else {
							textField.setText(String.valueOf(qty1));
						}
						
				}
				
			}
		});
		btnNewButton.setBounds(290, 77, 101, 44);
		frame.getContentPane().add(btnNewButton);		
		
		button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (itemList.getText().contains(button.getText())) {
					
				}
				
				else {
					itemList.append(String.format("%s \n", button.getText()));
				}
				

			}
		});
		button.setBounds(290, 134, 101, 44);
		frame.getContentPane().add(button);
		
		button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		button_1.setBounds(290, 189, 101, 44);
		frame.getContentPane().add(button_1);
		
		button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setBounds(290, 241, 101, 44);
		frame.getContentPane().add(button_2);
		
		button_3 = new JButton("");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_3.setBounds(290, 296, 101, 44);
		frame.getContentPane().add(button_3);
		
		button_4 = new JButton("");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_4.setBounds(290, 351, 101, 44);
		frame.getContentPane().add(button_4);
		
		button_5 = new JButton("");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_5.setBounds(290, 408, 101, 44);
		frame.getContentPane().add(button_5);
		
		button_6 = new JButton("");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_6.setBounds(290, 463, 101, 44);
		frame.getContentPane().add(button_6);
		
		button_7 = new JButton("");
		button_7.setBounds(290, 515, 101, 44);
		frame.getContentPane().add(button_7);
		
		button_8 = new JButton("");
		button_8.setBounds(290, 570, 101, 44);
		frame.getContentPane().add(button_8);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(464, 138, -10, 335);
		frame.getContentPane().add(separator_2);
		
		button_9 = new JButton("");
		button_9.setBounds(440, 77, 101, 44);
		frame.getContentPane().add(button_9);
		
		button_10 = new JButton("");
		button_10.setBounds(440, 134, 101, 44);
		frame.getContentPane().add(button_10);
		
		button_11 = new JButton("");
		button_11.setBounds(440, 189, 101, 44);
		frame.getContentPane().add(button_11);
		
		button_12 = new JButton("");
		button_12.setBounds(440, 241, 101, 44);
		frame.getContentPane().add(button_12);
		
		button_13 = new JButton("");
		button_13.setBounds(440, 296, 101, 44);
		frame.getContentPane().add(button_13);
		
		button_14 = new JButton("");
		button_14.setBounds(440, 351, 101, 44);
		frame.getContentPane().add(button_14);
		
		button_15 = new JButton("");
		button_15.setBounds(440, 408, 101, 44);
		frame.getContentPane().add(button_15);
		
		button_16 = new JButton("");
		button_16.setBounds(440, 463, 101, 44);
		frame.getContentPane().add(button_16);
		
		button_17 = new JButton("");
		button_17.setBounds(440, 515, 101, 44);
		frame.getContentPane().add(button_17);
		
		button_18 = new JButton("");
		button_18.setBounds(440, 570, 101, 44);
		frame.getContentPane().add(button_18);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(612, 138, -10, 335);
		frame.getContentPane().add(separator_3);
		
		button_19 = new JButton("");
		button_19.setBounds(588, 77, 101, 44);
		frame.getContentPane().add(button_19);
		
		JButton button_20 = new JButton("");
		button_20.setBounds(588, 134, 101, 44);
		frame.getContentPane().add(button_20);
		
		button_21 = new JButton("");
		button_21.setBounds(588, 189, 101, 44);
		frame.getContentPane().add(button_21);
		
		button_22 = new JButton("");
		button_22.setBounds(588, 241, 101, 44);
		frame.getContentPane().add(button_22);
		
		button_23 = new JButton("");
		button_23.setBounds(588, 296, 101, 44);
		frame.getContentPane().add(button_23);
		
		button_24 = new JButton("");
		button_24.setBounds(588, 351, 101, 44);
		frame.getContentPane().add(button_24);
		
		button_25 = new JButton("");
		button_25.setBounds(588, 408, 101, 44);
		frame.getContentPane().add(button_25);
		
		button_26 = new JButton("");
		button_26.setBounds(588, 463, 101, 44);
		frame.getContentPane().add(button_26);
		
		button_27 = new JButton("");
		button_27.setBounds(588, 515, 101, 44);
		frame.getContentPane().add(button_27);
		
		button_28 = new JButton("");
		button_28.setBounds(588, 570, 101, 44);
		frame.getContentPane().add(button_28);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(773, 138, -10, 335);
		frame.getContentPane().add(separator_4);
		
		button_29 = new JButton("");
		button_29.setBounds(749, 77, 101, 44);
		frame.getContentPane().add(button_29);
		
		button_30 = new JButton("");
		button_30.setBounds(749, 134, 101, 44);
		frame.getContentPane().add(button_30);
		
		button_31 = new JButton("");
		button_31.setBounds(749, 189, 101, 44);
		frame.getContentPane().add(button_31);
		
		button_32 = new JButton("");
		button_32.setBounds(749, 241, 101, 44);
		frame.getContentPane().add(button_32);
		
		button_33 = new JButton("");
		button_33.setBounds(749, 296, 101, 44);
		frame.getContentPane().add(button_33);
		
		button_34 = new JButton("");
		button_34.setBounds(749, 351, 101, 44);
		frame.getContentPane().add(button_34);
		
		button_35 = new JButton("");
		button_35.setBounds(749, 408, 101, 44);
		frame.getContentPane().add(button_35);
		
		button_36 = new JButton("");
		button_36.setBounds(749, 463, 101, 44);
		frame.getContentPane().add(button_36);
		
		button_37 = new JButton("");
		button_37.setBounds(749, 515, 101, 44);
		frame.getContentPane().add(button_37);
		
		button_38 = new JButton("");
		button_38.setBounds(749, 570, 101, 44);
		frame.getContentPane().add(button_38);
		
		JButton AsianFoodBtn = new JButton("Asian Food");
		AsianFoodBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setText("Fried chicken with rice");
				button.setText("Salted beef with rice");
				button_1.setText("Fried fish with rice");
				button_2.setText("Fried chicken and Salted beef with rice");
				button_3.setText("Larb chicken with rice");
				button_4.setText("Spicy chicken with rice");				
			}
		});
		AsianFoodBtn.setBounds(29, 241, 186, 76);
		frame.getContentPane().add(AsianFoodBtn);
		
		itemList = new JTextArea();
		itemList.setBounds(937, 35, 151, 349);
		frame.getContentPane().add(itemList);
		
		JLabel Quantity = new JLabel("Qty");
		Quantity.setBounds(1121, 10, 21, 14);
		frame.getContentPane().add(Quantity);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.TRAILING);
		textField.setBounds(1098, 35, 63, 16);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.TRAILING);
		textField_1.setColumns(10);
		textField_1.setBounds(1098, 51, 63, 16);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.TRAILING);
		textField_2.setColumns(10);
		textField_2.setBounds(1098, 68, 63, 16);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.TRAILING);
		textField_3.setColumns(10);
		textField_3.setBounds(1098, 85, 63, 16);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.TRAILING);
		textField_4.setColumns(10);
		textField_4.setBounds(1098, 101, 63, 16);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.TRAILING);
		textField_5.setColumns(10);
		textField_5.setBounds(1098, 117, 63, 16);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.TRAILING);
		textField_6.setColumns(10);
		textField_6.setBounds(1098, 133, 63, 16);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.TRAILING);
		textField_7.setColumns(10);
		textField_7.setBounds(1098, 150, 63, 16);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setHorizontalAlignment(SwingConstants.TRAILING);
		textField_8.setColumns(10);
		textField_8.setBounds(1098, 167, 63, 16);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setHorizontalAlignment(SwingConstants.TRAILING);
		textField_9.setColumns(10);
		textField_9.setBounds(1098, 183, 63, 16);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setHorizontalAlignment(SwingConstants.TRAILING);
		textField_10.setColumns(10);
		textField_10.setBounds(1098, 202, 63, 16);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setHorizontalAlignment(SwingConstants.TRAILING);
		textField_11.setColumns(10);
		textField_11.setBounds(1098, 218, 63, 16);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setHorizontalAlignment(SwingConstants.TRAILING);
		textField_12.setColumns(10);
		textField_12.setBounds(1098, 235, 63, 16);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setHorizontalAlignment(SwingConstants.TRAILING);
		textField_13.setColumns(10);
		textField_13.setBounds(1098, 252, 63, 16);
		frame.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setHorizontalAlignment(SwingConstants.TRAILING);
		textField_14.setColumns(10);
		textField_14.setBounds(1098, 268, 63, 16);
		frame.getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setHorizontalAlignment(SwingConstants.TRAILING);
		textField_15.setColumns(10);
		textField_15.setBounds(1098, 284, 63, 16);
		frame.getContentPane().add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setHorizontalAlignment(SwingConstants.TRAILING);
		textField_16.setColumns(10);
		textField_16.setBounds(1098, 300, 63, 16);
		frame.getContentPane().add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setHorizontalAlignment(SwingConstants.TRAILING);
		textField_17.setColumns(10);
		textField_17.setBounds(1098, 317, 63, 16);
		frame.getContentPane().add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setHorizontalAlignment(SwingConstants.TRAILING);
		textField_18.setColumns(10);
		textField_18.setBounds(1098, 334, 63, 16);
		frame.getContentPane().add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setHorizontalAlignment(SwingConstants.TRAILING);
		textField_19.setColumns(10);
		textField_19.setBounds(1098, 350, 63, 16);
		frame.getContentPane().add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setHorizontalAlignment(SwingConstants.TRAILING);
		textField_20.setColumns(10);
		textField_20.setBounds(1098, 368, 63, 16);
		frame.getContentPane().add(textField_20);
		
		
	}
}
