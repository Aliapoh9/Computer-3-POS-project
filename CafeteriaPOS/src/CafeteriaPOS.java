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
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTabbedPane;
import javax.swing.JScrollBar;
import javax.swing.JToggleButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JToolBar;
import javax.swing.JLayeredPane;
import javax.swing.JScrollPane;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;

public class CafeteriaPOS {

	private JFrame frmEisCafeteriaPos;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CafeteriaPOS window = new CafeteriaPOS();
					window.frmEisCafeteriaPos.setVisible(true);
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
	private JButton button;
	private JButton button_1;
	private JButton btnNewButton;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JTextArea receiptArea;
	private JScrollBar scrollBar;
	Map<String, Integer> map = new HashMap<String, Integer>();
	Map<String, Integer> price = new HashMap<String, Integer>();
	String ee = "";
	int total;
	private JTextField amountPaid;
	private JTextField totalPrice;
	private JTextField change;
	private void initialize() {
		frmEisCafeteriaPos = new JFrame();
		frmEisCafeteriaPos.setTitle("EIS Cafeteria POS");
		frmEisCafeteriaPos.setResizable(false);
		frmEisCafeteriaPos.setBounds(100, 100, 1280, 720);
		frmEisCafeteriaPos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEisCafeteriaPos.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("EIS Cafeteria POS System");
		lblNewLabel.setBounds(29, 11, 486, 50);
		lblNewLabel.setFont(new Font("Source Code Pro Light", Font.PLAIN, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		frmEisCafeteriaPos.getContentPane().add(lblNewLabel);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(773, 138, -10, 335);
		frmEisCafeteriaPos.getContentPane().add(separator_4);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		tabbedPane.setBounds(29, 72, 991, 500);
		tabbedPane.setFont(new Font("Source Code Pro Light", Font.PLAIN, 32));
		frmEisCafeteriaPos.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Thai Food", null, panel, null);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("International Food", null, panel_1, null);
		panel_1.setLayout(null);
		
		panel_2 = new JPanel();
		tabbedPane.addTab("Asian Food", null, panel_2, null);
		panel_2.setLayout(null);
		
		panel_3 = new JPanel();
		tabbedPane.addTab("Noodles", null, panel_3, null);
		panel_3.setLayout(null);
		
		panel_4 = new JPanel();
		tabbedPane.addTab("Desserts and Drinks", null, panel_4, null);
		panel_4.setLayout(null);
		
		
		
		JButton btnNewButton_1 = new JButton("Rod Chong + Thai Melon");
		btnNewButton_1.setToolTipText("Rod Chong + Thai Melon");
		btnNewButton_1.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(btnNewButton_1.getText())) {
					qty += 1;
					map.put(btnNewButton_1.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					total += price.get(btnNewButton_1.getText());
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					map.put(btnNewButton_1.getText(), qty);
					price.put(btnNewButton_1.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));			  
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(btnNewButton_1.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		btnNewButton_1.setBounds(10, 11, 109, 48);
		panel_4.add(btnNewButton_1);
		
		JButton button_2 = new JButton("Tub Tim + Sweet Tub Tim");
		button_2.setToolTipText("Tub Tim + Sweet Tub Tim");
		button_2.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_2.getText())) {
					qty += 1;
					map.put(button_2.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					map.put(button_2.getText(), qty);
					price.put(button_2.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_2.setBounds(129, 11, 109, 48);
		panel_4.add(button_2);
		
		JButton button_3 = new JButton("Singaporean Rod Chong");
		button_3.setToolTipText("Singaporean Rod Chong");
		button_3.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_3.getText())) {
					qty += 1;
					map.put(button_3.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_3.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					map.put(button_3.getText(), qty);
					price.put(button_3.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_3.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_3.setBounds(248, 11, 109, 48);
		panel_4.add(button_3);
		
		JButton button_4 = new JButton("Coconut Jelly + Tub Tim");
		button_4.setToolTipText("Coconut Jelly + Tub Tim");
		button_4.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_4.getText())) {
					qty += 1;
					map.put(button_4.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					map.put(button_4.getText(), qty);
					price.put(button_4.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_4.setBounds(367, 11, 109, 48);
		panel_4.add(button_4);
		
		JButton button_5 = new JButton("Grass Jelly + Coconut Jelly");
		button_5.setToolTipText("Grass Jelly + Coconut Jelly");
		button_5.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_5.getText())) {
					qty += 1;
					map.put(button_5.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_5.getText());
					totalPrice.setText(String.valueOf(total));
			}
				
				else {
					map.put(button_5.getText(), qty);
					price.put(button_5.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_5.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_5.setBounds(486, 11, 109, 48);
		panel_4.add(button_5);
		
		JButton button_6 = new JButton("Ruam Mid + Coconut Jelly");
		button_6.setToolTipText("Ruam Mid + Coconut Jelly");
		button_6.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_6.getText())) {
					qty += 1;
					map.put(button_6.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_6.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					map.put(button_6.getText(), qty);
					price.put(button_6.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_6.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_6.setBounds(10, 70, 109, 48);
		panel_4.add(button_6);
		
		JButton button_7 = new JButton("Bua Roi");
		button_7.setToolTipText("Bua Roi");
		button_7.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_7.getText())) {
					qty += 1;
					map.put(button_7.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					
			}
				
				else {
					map.put(button_7.getText(), qty);
					price.put(button_7.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					}
			}
		});
		button_7.setBounds(129, 70, 109, 48);
		panel_4.add(button_7);
		
		JButton button_8 = new JButton("Sa Ku");
		button_8.setToolTipText("Sa Ku");
		button_8.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_8.getText())) {
					qty += 1;
					map.put(button_8.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_8.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					map.put(button_8.getText(), qty);
					price.put(button_8.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_8.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_8.setBounds(248, 70, 109, 48);
		panel_4.add(button_8);
		
		JButton button_9 = new JButton("Banana in Coconut Milk");
		button_9.setToolTipText("Banana in Coconut Milk");
		button_9.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_9.getText())) {
					qty += 1;
					map.put(button_9.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_9.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					map.put(button_9.getText(), qty);
					price.put(button_9.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_9.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_9.setBounds(367, 70, 109, 48);
		panel_4.add(button_9);
		
		JButton button_10 = new JButton("Pumpkin in Coconut Milk");
		button_10.setToolTipText("Pumpkin in Coconut Milk");
		button_10.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_10.getText())) {
					qty += 1;
					map.put(button_10.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_10.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					map.put(button_10.getText(), qty);
					price.put(button_10.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_10.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_10.setBounds(486, 70, 109, 48);
		panel_4.add(button_10);
		
		JButton button_11 = new JButton("Taro in Coconut Milk");
		button_11.setToolTipText("Taro in Coconut Milk");
		button_11.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_11.getText())) {
					qty += 1;
					map.put(button_11.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_11.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					map.put(button_11.getText(), qty);
					price.put(button_11.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_11.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_11.setBounds(10, 129, 109, 48);
		panel_4.add(button_11);
		
		JButton button_12 = new JButton("Sticky Rice with Black Beans");
		button_12.setToolTipText("Sticky Rice with Black Beans");
		button_12.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_12.getText())) {
					qty += 1;
					map.put(button_12.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_12.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					map.put(button_12.getText(), qty);
					price.put(button_12.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_12.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_12.setBounds(129, 129, 109, 48);
		panel_4.add(button_12);
		
		JButton button_13 = new JButton("Krong Kreang");
		button_13.setToolTipText("Krong Kreang");
		button_13.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_13.getText())) {
					qty += 1;
					map.put(button_13.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_13.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					map.put(button_13.getText(), qty);
					price.put(button_13.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_13.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_13.setBounds(248, 129, 109, 48);
		panel_4.add(button_13);
		
		JButton button_14 = new JButton("Salim");
		button_14.setToolTipText("Salim");
		button_14.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_14.getText())) {
					qty += 1;
					map.put(button_14.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_14.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					map.put(button_14.getText(), qty);
					price.put(button_14.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_14.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_14.setBounds(367, 129, 109, 48);
		panel_4.add(button_14);
		
		JButton button_15 = new JButton("Tao Suan");
		button_15.setToolTipText("Tao Suan");
		button_15.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_15.getText())) {
					qty += 1;
					map.put(button_15.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_15.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					map.put(button_15.getText(), qty);
					price.put(button_15.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_15.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_15.setBounds(486, 129, 109, 48);
		panel_4.add(button_15);
		
		JButton button_16 = new JButton("Ruk Piek");
		button_16.setToolTipText("Ruk Piek");
		button_16.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_16.getText())) {
					qty += 1;
					map.put(button_16.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_16.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					map.put(button_16.getText(), qty);
					price.put(button_16.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_16.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_16.setBounds(10, 188, 109, 48);
		panel_4.add(button_16);
		
		JButton button_17 = new JButton("Fruits");
		button_17.setToolTipText("Fruits");
		button_17.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_17.getText())) {
					qty += 1;
					map.put(button_17.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_17.getText());
					totalPrice.setText(String.valueOf(total));
			}
				
				else {
					map.put(button_17.getText(), qty);
					price.put(button_17.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_17.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_17.setBounds(129, 188, 109, 48);
		panel_4.add(button_17);
		
		JButton button_18 = new JButton("Punch");
		button_18.setToolTipText("Punch");
		button_18.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_18.getText())) {
					qty += 1;
					map.put(button_18.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_18.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					map.put(button_18.getText(), qty);
					price.put(button_18.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_18.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_18.setBounds(248, 188, 109, 48);
		panel_4.add(button_18);
		
		JButton button_19 = new JButton("Grape Juice");
		button_19.setToolTipText("Grape Juice");
		button_19.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_19.getText())) {
					qty += 1;
					map.put(button_19.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_19.getText());
					totalPrice.setText(String.valueOf(total));
			}
				
				else {
					map.put(button_19.getText(), qty);
					price.put(button_19.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_19.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_19.setBounds(367, 188, 109, 48);
		panel_4.add(button_19);
		
		JButton button_20 = new JButton("Orange Juice");
		button_20.setToolTipText("Orange Juice");
		button_20.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_20.getText())) {
					qty += 1;
					map.put(button_20.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_20.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					map.put(button_20.getText(), qty);
					price.put(button_20.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_20.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_20.setBounds(486, 188, 109, 48);
		panel_4.add(button_20);
		
		JButton button_21 = new JButton("Strawberry Juice");
		button_21.setToolTipText("Strawberry Juice");
		button_21.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_21.getText())) {
					qty += 1;
					map.put(button_21.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_21.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					map.put(button_21.getText(), qty);
					price.put(button_21.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_21.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_21.setBounds(10, 247, 109, 48);
		panel_4.add(button_21);
		
		JButton button_22 = new JButton("Coconut Juice");
		button_22.setToolTipText("Coconut Juice");
		button_22.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_22.getText())) {
					qty += 1;
					map.put(button_22.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_22.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					map.put(button_22.getText(), qty);
					price.put(button_22.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_22.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_22.setBounds(129, 247, 109, 48);
		panel_4.add(button_22);
		
		JButton button_23 = new JButton("Coconut Juice (Blended)");
		button_23.setToolTipText("Coconut Juice (Blended)");
		button_23.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_23.getText())) {
					qty += 1;
					map.put(button_23.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_23.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					map.put(button_23.getText(), qty);
					price.put(button_23.getText(), 20);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_23.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_23.setBounds(248, 247, 109, 48);
		panel_4.add(button_23);
		
		JButton button_24 = new JButton("HaleÅfs Blue Boy Red (Blended)");
		button_24.setToolTipText("Hale\u2019s Blue Boy Red (Blended)");
		button_24.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_24.getText())) {
					qty += 1;
					map.put(button_24.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_24.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					map.put(button_24.getText(), qty);
					price.put(button_24.getText(), 20);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_24.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_24.setBounds(367, 247, 109, 48);
		panel_4.add(button_24);
		
		JButton button_25 = new JButton("Yogurt");
		button_25.setToolTipText("Yogurt");
		button_25.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_25.getText())) {
					qty += 1;
					map.put(button_25.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_25.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					map.put(button_25.getText(), qty);
					price.put(button_25.getText(), 15);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_25.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_25.setBounds(486, 247, 109, 48);
		panel_4.add(button_25);
		
		JButton button_26 = new JButton("Yakult (Small)");
		button_26.setToolTipText("Yakult (Small)");
		button_26.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_26.getText())) {
					qty += 1;
					map.put(button_26.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_26.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					map.put(button_26.getText(), qty);
					price.put(button_26.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_26.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_26.setBounds(10, 306, 109, 48);
		panel_4.add(button_26);
		
		JButton button_27 = new JButton("Yakult (Large)");
		button_27.setToolTipText("Yakult (Large)");
		button_27.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_27.getText())) {
					qty += 1;
					map.put(button_26.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_27.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					map.put(button_27.getText(), qty);
					price.put(button_27.getText(), 25);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_27.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_27.setBounds(129, 306, 109, 48);
		panel_4.add(button_27);
		
		JButton button_28 = new JButton("DutchMilk (Regular, Chocolate, Strawberry)");
		button_28.setToolTipText("DutchMilk (Regular, Chocolate, Strawberry)");
		button_28.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_28.getText())) {
					qty += 1;
					map.put(button_28.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_28.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					map.put(button_28.getText(), qty);
					price.put(button_28.getText(), 13);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_28.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_28.setBounds(248, 306, 109, 48);
		panel_4.add(button_28);
		
		JButton button_29 = new JButton("Chokchai Milk (Regular, Choc Malt, Sweet)");
		button_29.setToolTipText("Chokchai Milk (Regular, Choc Malt, Sweet)");
		button_29.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_29.getText())) {
					qty += 1;
					map.put(button_29.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_29.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					map.put(button_29.getText(), qty);
					price.put(button_29.getText(), 12);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_29.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_29.setBounds(367, 306, 109, 48);
		panel_4.add(button_29);
		
		JButton button_30 = new JButton("Tipco Juice");
		button_30.setToolTipText("Tipco Juice");
		button_30.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_30.getText())) {
					qty += 1;
					map.put(button_30.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_30.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					map.put(button_30.getText(), qty);
					price.put(button_30.getText(), 18);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_30.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_30.setBounds(486, 306, 109, 48);
		panel_4.add(button_30);
		
		JButton button_31 = new JButton("Malee Juice");
		button_31.setToolTipText("Malee Juice");
		button_31.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_31.getText())) {
					qty += 1;
					map.put(button_31.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_31.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					map.put(button_31.getText(), qty);
					price.put(button_31.getText(), 18);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_31.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_31.setBounds(10, 365, 109, 48);
		panel_4.add(button_31);
		
		JButton button_32 = new JButton("Chrysanthemum Juice");
		button_32.setToolTipText("Chrysanthemum Juice");
		button_32.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_32.getText())) {
					qty += 1;
					map.put(button_32.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_32.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					map.put(button_32.getText(), qty);
					price.put(button_32.getText(), 15);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_32.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_32.setBounds(129, 365, 109, 48);
		panel_4.add(button_32);
		
		JButton button_33 = new JButton("Roselle Juice");
		button_33.setToolTipText("Roselle Juice");
		button_33.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_33.getText())) {
					qty += 1;
					map.put(button_33.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_33.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					map.put(button_33.getText(), qty);
					price.put(button_33.getText(), 15);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_33.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_33.setBounds(248, 365, 109, 48);
		panel_4.add(button_33);
		
		JButton button_34 = new JButton("Aura Water");
		button_34.setToolTipText("Aura Water");
		button_34.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_34.getText())) {
					qty += 1;
					map.put(button_34.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_34.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					map.put(button_34.getText(), qty);
					price.put(button_34.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_34.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_34.setBounds(367, 365, 109, 48);
		panel_4.add(button_34);
		
		JButton button_35 = new JButton("Crystal Water");
		button_35.setToolTipText("Crystal Water");
		button_35.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_35.getText())) {
					qty += 1;
					map.put(button_35.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_35.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					map.put(button_35.getText(), qty);
					price.put(button_35.getText(), 8);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_35.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_35.setBounds(486, 365, 109, 48);
		panel_4.add(button_35);
		
		panel_5 = new JPanel();
		tabbedPane.addTab("Vegetarian Food", null, panel_5, null);
		panel_5.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(1041, 72, 223, 500);
		frmEisCafeteriaPos.getContentPane().add(scrollPane);
		
		
		receiptArea = new JTextArea();
		scrollPane.setViewportView(receiptArea);
		receiptArea.setEditable(false);
		
		totalPrice = new JTextField();
		totalPrice.setEditable(false);
		totalPrice.setBounds(1045, 613, 86, 20);
		frmEisCafeteriaPos.getContentPane().add(totalPrice);
		totalPrice.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Total Price");
		lblNewLabel_1.setBounds(939, 616, 72, 14);
		frmEisCafeteriaPos.getContentPane().add(lblNewLabel_1);
		
		amountPaid = new JTextField();
		amountPaid.setColumns(10);
		amountPaid.setBounds(1045, 582, 86, 20);
		frmEisCafeteriaPos.getContentPane().add(amountPaid);
		
		JLabel lblAmountPaid = new JLabel("Amount Paid");
		lblAmountPaid.setBounds(939, 583, 72, 14);
		frmEisCafeteriaPos.getContentPane().add(lblAmountPaid);
		
		change = new JTextField();
		change.setEditable(false);
		change.setBounds(1045, 644, 86, 20);
		frmEisCafeteriaPos.getContentPane().add(change);
		change.setColumns(10);
		
		JLabel lblChange = new JLabel("Change");
		lblChange.setBounds(939, 647, 72, 14);
		frmEisCafeteriaPos.getContentPane().add(lblChange);
		
		JButton btnNewButton_2 = new JButton("Clear");
		btnNewButton_2.setFont(new Font("Source Code Pro Light", Font.PLAIN, 24));
		btnNewButton_2.setBounds(1141, 581, 123, 40);
		frmEisCafeteriaPos.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("Item");
		lblNewLabel_2.setBounds(1041, 53, 46, 14);
		frmEisCafeteriaPos.getContentPane().add(lblNewLabel_2);
		
		JLabel lblQty = new JLabel("qty");
		lblQty.setBounds(1199, 53, 23, 14);
		frmEisCafeteriaPos.getContentPane().add(lblQty);
		
		JLabel lblTotalPrice = new JLabel("Price");
		lblTotalPrice.setBounds(1232, 53, 32, 14);
		frmEisCafeteriaPos.getContentPane().add(lblTotalPrice);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnCalculate.setFont(new Font("Source Code Pro Light", Font.PLAIN, 13));
		btnCalculate.setBounds(1141, 632, 123, 40);
		frmEisCafeteriaPos.getContentPane().add(btnCalculate);
		
				
	}
}
