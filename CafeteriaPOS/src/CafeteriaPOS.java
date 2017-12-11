import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

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

// Computer 3 Cafeteria POS project. Done by: Sunatchapol and Chinnakrit.

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
		lblNewLabel.setFont(new Font("Source Code Pro Light", Font.BOLD, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		frmEisCafeteriaPos.getContentPane().add(lblNewLabel);
		
		JLabel time = new JLabel("");
		time.setFont(new Font("Source Code Pro Light", Font.PLAIN, 17));
		time.setBounds(10, 658, 327, 34);
		frmEisCafeteriaPos.getContentPane().add(time);
		
		Timer SimpleTimer = new Timer(1000, new ActionListener(){
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	Date date = new Date();
		    	time.setText(String.valueOf(date));
		    }
		});
		SimpleTimer.setInitialDelay(1000);
		SimpleTimer.start();
		
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
		
//Panel "Thai Food" Menu

		JButton btnNewButton_1 = new JButton("Rice");
		btnNewButton_1.setToolTipText("Rice");
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
					qty = 1;
					map.put(btnNewButton_1.getText(), qty);
					price.put(btnNewButton_1.getText(), 5);
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
		panel.add(btnNewButton_1);
		
		JButton button_2 = new JButton("Chicken Green Curry + Rice");
		button_2.setToolTipText("Chicken Green Curry + Rice");
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
					qty = 1;
					map.put(button_2.getText(), qty);
					price.put(button_2.getText(), 30);
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
		panel.add(button_2);
		
		JButton button_3 = new JButton("Masaman Curry + Rice");
		button_3.setToolTipText("Masaman Curry + Rice");
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
					qty = 1;
					map.put(button_3.getText(), qty);
					price.put(button_3.getText(), 30);
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
		panel.add(button_3);
		
		JButton button_4 = new JButton("Yellow Curry + Rice");
		button_4.setToolTipText("Yellow Curry + Rice");
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
					qty = 1;
					map.put(button_4.getText(), qty);
					price.put(button_4.getText(), 30);
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
		panel.add(button_4);
		
		JButton button_5 = new JButton("Orange Curry + Rice");
		button_5.setToolTipText("Orange Curry + Rice");
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
					qty = 1;
					map.put(button_5.getText(), qty);
					price.put(button_5.getText(), 30);
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
		panel.add(button_5);
		
		JButton button_6 = new JButton("Fish Sour Soup + Rice");
		button_6.setToolTipText("Fish Sour Soup + Rice");
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
					qty = 1;
					map.put(button_6.getText(), qty);
					price.put(button_6.getText(), 30);
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
		panel.add(button_6);
		
		JButton button_7 = new JButton("Northern Style Curry + Rice");
		button_7.setToolTipText("Northern Style Curry + Rice");
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
					total += price.get(button_7.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_7.getText(), qty);
					price.put(button_7.getText(), 30);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_7.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_7.setBounds(129, 70, 109, 48);
		panel.add(button_7);
		
		JButton button_8 = new JButton("Northern Mixed Curry + Rice");
		button_8.setToolTipText("Northern Mixed Curry + Rice");
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
					qty = 1;
					map.put(button_8.getText(), qty);
					price.put(button_8.getText(), 30);
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
		panel.add(button_8);
		
		JButton button_9 = new JButton("Curry Pho Soup + Rice");
		button_9.setToolTipText("Curry Pho Soup + Rice");
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
					qty = 1;
					map.put(button_9.getText(), qty);
					price.put(button_9.getText(), 30);
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
		panel.add(button_9);
		
		JButton button_10 = new JButton("Mushroom Curry + Rice");
		button_10.setToolTipText("Mushroom Curry + Rice");
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
					qty = 1;
					map.put(button_10.getText(), qty);
					price.put(button_10.getText(), 30);
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
		panel.add(button_10);
		
		JButton button_11 = new JButton("Chicken Tom Yum + Rice");
		button_11.setToolTipText("Chicken Tom Yum + Rice");
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
					qty = 1;
					map.put(button_11.getText(), qty);
					price.put(button_11.getText(), 30);
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
		panel.add(button_11);
		
		JButton button_12 = new JButton("Fish Tom Yum + Rice");
		button_12.setToolTipText("Fish Tom Yum + Rice");
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
					qty = 1;
					map.put(button_12.getText(), qty);
					price.put(button_12.getText(), 30);
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
		panel.add(button_12);
		
		JButton button_13 = new JButton("Chili Fish + Rice");
		button_13.setToolTipText("Chili Fish + Rice");
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
					qty = 1;
					map.put(button_13.getText(), qty);
					price.put(button_13.getText(), 45);
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
		panel.add(button_13);
		
		JButton button_14 = new JButton("Bitter Gourd Soup + Rice");
		button_14.setToolTipText("Bitter Gourd Soup + Rice");
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
					qty = 1;
					map.put(button_14.getText(), qty);
					price.put(button_14.getText(), 25);
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
		panel.add(button_14);
		
		JButton button_15 = new JButton("Fried Tilapia Fish + Rice");
		button_15.setToolTipText("Fried Tilapia Fish + Rice");
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
					qty = 1;
					map.put(button_15.getText(), qty);
					price.put(button_15.getText(), 45);
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
		panel.add(button_15);
		
		JButton button_16 = new JButton("Fried Tuna + Rice");
		button_16.setToolTipText("Fried Tuna + Rice");
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
					qty = 1;
					map.put(button_16.getText(), qty);
					price.put(button_16.getText(), 30);
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
		panel.add(button_16);
		
		JButton button_17 = new JButton("Chicken and Vegetable Stir Fry + Rice");
		button_17.setToolTipText("Chicken and Vegetable Stir Fry + Rice");
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
					qty = 1;
					map.put(button_17.getText(), qty);
					price.put(button_17.getText(), 30);
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
		panel.add(button_17);
		
		JButton button_18 = new JButton("Tuna with Chili sauce and Vegetable + Rice");
		button_18.setToolTipText("Tuna with Chili sauce and Vegetable + Rice");
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
					qty = 1;
					map.put(button_18.getText(), qty);
					price.put(button_18.getText(), 30);
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
		panel.add(button_18);
		
		JButton button_19 = new JButton("Chili Paste with Vegetable + Rice");
		button_19.setToolTipText("Chili Paste with Vegetable + Rice");
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
					qty = 1;
					map.put(button_19.getText(), qty);
					price.put(button_19.getText(), 30);
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
		panel.add(button_19);
		
		JButton button_20 = new JButton("Chili Paste with Vegetable and Fried Tuna + Rice");
		button_20.setToolTipText("Chili Paste with Vegetable and Fried Tuna + Rice");
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
					qty = 1;
					map.put(button_20.getText(), qty);
					price.put(button_20.getText(), 55);
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
		panel.add(button_20);
		
		JButton button_21 = new JButton("Spicy Tilapia Fish + Rice");
		button_21.setToolTipText("Spicy Tilapia Fish + Rice");
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
					qty = 1;
					map.put(button_21.getText(), qty);
					price.put(button_21.getText(), 50);
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
		panel.add(button_21);
		
		JButton button_22 = new JButton("Spicy Tuna + Rice");
		button_22.setToolTipText("Spicy Tuna + Rice");
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
					qty = 1;
					map.put(button_22.getText(), qty);
					price.put(button_22.getText(), 35);
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
		panel.add(button_22);
		
		JButton button_23 = new JButton("Egg in Sweet Brown Sauce + Rice");
		button_23.setToolTipText("Egg in Sweet Brown Sauce + Rice");
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
					qty = 1;
					map.put(button_23.getText(), qty);
					price.put(button_23.getText(), 25);
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
		panel.add(button_23);
		
		JButton button_24 = new JButton("Tilapia Fish with Chili Sauce + Rice");
		button_24.setToolTipText("Tilapia Fish with Chili Sauce + Rice");
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
					qty = 1;
					map.put(button_24.getText(), qty);
					price.put(button_24.getText(), 50);
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
		panel.add(button_24);
		
		JButton button_25 = new JButton("Fried Rice");
		button_25.setToolTipText("Fried Rice");
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
					qty = 1;
					map.put(button_25.getText(), qty);
					price.put(button_25.getText(), 30);
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
		panel.add(button_25);
		
		JButton button_26 = new JButton("Stir Fry Noodle with Soy Sauce");
		button_26.setToolTipText("Stir Fry Noodle with Soy Sauce");
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
					qty = 1;
					map.put(button_26.getText(), qty);
					price.put(button_26.getText(), 30);
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
		panel.add(button_26);
		
		JButton button_27 = new JButton("Pad Thai");
		button_27.setToolTipText("Pad Thai");
		button_27.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_27.getText())) {
					qty += 1;
					map.put(button_27.getText(), qty);
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
					qty = 1;
					map.put(button_27.getText(), qty);
					price.put(button_27.getText(), 30);
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
		panel.add(button_27);
		
		JButton button_28 = new JButton("Noodles in Gravy with Chicken");
		button_28.setToolTipText("Noodles in Gravy with Chicken");
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
					qty = 1;
					map.put(button_28.getText(), qty);
					price.put(button_28.getText(), 30);
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
		panel.add(button_28);
		
		JButton button_29 = new JButton("Chicken Porridge");
		button_29.setToolTipText("Chicken Porridge");
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
					qty = 1;
					map.put(button_29.getText(), qty);
					price.put(button_29.getText(), 10);
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
		panel.add(button_29);
		
		JButton button_30 = new JButton("Fried Egg/Omelette");
		button_30.setToolTipText("Fried Egg/Omelette");
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
					qty = 1;
					map.put(button_30.getText(), qty);
					price.put(button_30.getText(), 7);
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
		panel.add(button_30);
		
		JButton button_31 = new JButton("Namthip Water");
		button_31.setToolTipText("Namthip Water");
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
					qty = 1;
					map.put(button_31.getText(), qty);
					price.put(button_31.getText(), 8);
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
		panel.add(button_31);
		
		JButton button_32 = new JButton("Betagen (Small)");
		button_32.setToolTipText("Betagen (Small)");
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
					qty = 1;
					map.put(button_32.getText(), qty);
					price.put(button_32.getText(), 10);
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
		panel.add(button_32);
		
		JButton button_33 = new JButton("Betagen (Large)");
		button_33.setToolTipText("Betagen (Large)");
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
					qty = 1;
					map.put(button_33.getText(), qty);
					price.put(button_33.getText(), 25);
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
		panel.add(button_33);
		
		JButton button_34 = new JButton("Minute Maid");
		button_34.setToolTipText("Minute Maid");
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
					qty = 1;
					map.put(button_34.getText(), qty);
					price.put(button_34.getText(), 15);
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
		panel.add(button_34);
		
//Panel END
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("International Food", null, panel_1, null);
		panel_1.setLayout(null);
		
//Panel 1 "International Food" Menu
		
		JButton btnNewButton_1_1 = new JButton("Spaghetti Meatballs");
		btnNewButton_1_1.setToolTipText("Spaghetti Meatballs");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(btnNewButton_1_1.getText())) {
					qty += 1;
					map.put(btnNewButton_1_1.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					total += price.get(btnNewButton_1_1.getText());
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(btnNewButton_1_1.getText(), qty);
					price.put(btnNewButton_1_1.getText(), 30);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));			  
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(btnNewButton_1_1.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		btnNewButton_1_1.setBounds(10, 11, 109, 48);
		panel_1.add(btnNewButton_1_1);
		
		JButton button_1_2 = new JButton("Spaghetti White Sauce");
		button_1_2.setToolTipText("Spaghetti White Sauce");
		button_1_2.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_1_2.getText())) {
					qty += 1;
					map.put(button_1_2.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_2.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_1_2.getText(), qty);
					price.put(button_1_2.getText(), 30);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_2.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_1_2.setBounds(129, 11, 109, 48);
		panel_1.add(button_1_2);
		
		JButton button_1_3 = new JButton("Spaghetti with Grilled Chicken");
		button_1_3.setToolTipText("Spaghetti with Grilled Chicken");
		button_1_3.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_1_3.getText())) {
					qty += 1;
					map.put(button_1_3.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_3.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_1_3.getText(), qty);
					price.put(button_1_3.getText(), 40);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_3.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_1_3.setBounds(248, 11, 109, 48);
		panel_1.add(button_1_3);
		
		JButton button_1_4 = new JButton("Spaghetti with Mashed Potatoes");
		button_1_4.setToolTipText("Spaghetti with Mashed Potatoes");
		button_1_4.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_1_4.getText())) {
					qty += 1;
					map.put(button_1_4.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_4.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_1_4.getText(), qty);
					price.put(button_1_4.getText(), 40);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_4.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_1_4.setBounds(367, 11, 109, 48);
		panel_1.add(button_1_4);
		
		JButton button_1_5 = new JButton("Pesto Spaghetti");
		button_1_5.setToolTipText("Pesto Spaghetti");
		button_1_5.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_1_5.getText())) {
					qty += 1;
					map.put(button_1_5.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_5.getText());
					totalPrice.setText(String.valueOf(total));
			}
				
				else {
					qty = 1;
					map.put(button_1_5.getText(), qty);
					price.put(button_1_5.getText(), 30);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_5.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_1_5.setBounds(486, 11, 109, 48);
		panel_1.add(button_1_5);
		
		JButton button_1_6 = new JButton("Potato Salad");
		button_1_6.setToolTipText("Potato Salad");
		button_1_6.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_1_6.getText())) {
					qty += 1;
					map.put(button_1_6.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_6.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_1_6.getText(), qty);
					price.put(button_1_6.getText(), 30);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_6.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_1_6.setBounds(10, 70, 109, 48);
		panel_1.add(button_1_6);
		
		JButton button_1_7 = new JButton("Macaroni Salad");
		button_1_7.setToolTipText("Macaroni Salad");
		button_1_7.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_1_7.getText())) {
					qty += 1;
					map.put(button_1_7.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_7.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_1_7.getText(), qty);
					price.put(button_1_7.getText(), 30);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_7.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_1_7.setBounds(129, 70, 109, 48);
		panel_1.add(button_1_7);
		
		JButton button_1_8 = new JButton("Salad");
		button_1_8.setToolTipText("Salad");
		button_1_8.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_1_8.getText())) {
					qty += 1;
					map.put(button_1_8.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_8.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_1_8.getText(), qty);
					price.put(button_1_8.getText(), 35);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_8.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_1_8.setBounds(248, 70, 109, 48);
		panel_1.add(button_1_8);
		
		JButton button_1_9 = new JButton("Beef Stew + Rice");
		button_1_9.setToolTipText("Beef Stew + Rice");
		button_1_9.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_1_9.getText())) {
					qty += 1;
					map.put(button_1_9.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_9.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_1_9.getText(), qty);
					price.put(button_1_9.getText(), 35);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_9.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_1_9.setBounds(367, 70, 109, 48);
		panel_1.add(button_1_9);
		
		JButton button_1_10 = new JButton("Fried Chicken + Rice");
		button_1_10.setToolTipText("Fried Chicken + Rice");
		button_1_10.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_1_10.getText())) {
					qty += 1;
					map.put(button_1_10.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_10.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_1_10.getText(), qty);
					price.put(button_1_10.getText(), 30);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_10.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_1_10.setBounds(486, 70, 109, 48);
		panel_1.add(button_1_10);
		
		JButton button_1_11 = new JButton("Grilled Chicken + Rice");
		button_1_11.setToolTipText("Grilled Chicken + Rice");
		button_1_11.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_1_11.getText())) {
					qty += 1;
					map.put(button_1_11.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_11.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_1_11.getText(), qty);
					price.put(button_1_11.getText(), 30);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_11.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_1_11.setBounds(10, 129, 109, 48);
		panel_1.add(button_1_11);
		
		JButton button_1_12 = new JButton("Grilled Chicken + Fried Chicken + Rice");
		button_1_12.setToolTipText("Grilled Chicken + Fried Chicken + Rice");
		button_1_12.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_1_12.getText())) {
					qty += 1;
					map.put(button_1_12.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_12.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_1_12.getText(), qty);
					price.put(button_1_12.getText(), 40);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_12.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_1_12.setBounds(129, 129, 109, 48);
		panel_1.add(button_1_12);
		
		JButton button_1_13 = new JButton("Teriyaki Chicken + Rice");
		button_1_13.setToolTipText("Teriyaki Chicken + Rice");
		button_1_13.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_1_13.getText())) {
					qty += 1;
					map.put(button_1_13.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_13.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_1_13.getText(), qty);
					price.put(button_1_13.getText(), 30);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_13.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_1_13.setBounds(248, 129, 109, 48);
		panel_1.add(button_1_13);
		
		JButton button_1_14 = new JButton("Beef Curry + Rice");
		button_1_14.setToolTipText("Beef Curry + Rice");
		button_1_14.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_1_14.getText())) {
					qty += 1;
					map.put(button_1_14.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_14.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_1_14.getText(), qty);
					price.put(button_1_14.getText(), 35);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_14.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_1_14.setBounds(367, 129, 109, 48);
		panel_1.add(button_1_14);
		
		JButton button_1_15 = new JButton("Chicken Curry + Rice");
		button_1_15.setToolTipText("Chicken Curry + Rice");
		button_1_15.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_1_15.getText())) {
					qty += 1;
					map.put(button_1_15.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_15.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_1_15.getText(), qty);
					price.put(button_1_15.getText(), 30);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_15.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_1_15.setBounds(486, 129, 109, 48);
		panel_1.add(button_1_15);
		
		JButton button_1_16 = new JButton("BBQ Chicken + Rice");
		button_1_16.setToolTipText("BBQ Chicken + Rice");
		button_1_16.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_1_16.getText())) {
					qty += 1;
					map.put(button_1_16.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_16.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_1_16.getText(), qty);
					price.put(button_1_16.getText(), 30);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_16.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_1_16.setBounds(10, 188, 109, 48);
		panel_1.add(button_1_16);
		
		JButton button_1_17 = new JButton("Chicken Bites + Rice");
		button_1_17.setToolTipText("Chicken Bites + Rice");
		button_1_17.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_1_17.getText())) {
					qty += 1;
					map.put(button_1_17.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_17.getText());
					totalPrice.setText(String.valueOf(total));
			}
				
				else {
					qty = 1;
					map.put(button_1_17.getText(), qty);
					price.put(button_1_17.getText(), 30);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_17.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_1_17.setBounds(129, 188, 109, 48);
		panel_1.add(button_1_17);
		
		JButton button_1_18 = new JButton("Fried Fish + Rice");
		button_1_18.setToolTipText("Fried Fish + Rice");
		button_1_18.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_1_18.getText())) {
					qty += 1;
					map.put(button_1_18.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_18.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_1_18.getText(), qty);
					price.put(button_1_18.getText(), 35);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_18.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_1_18.setBounds(248, 188, 109, 48);
		panel_1.add(button_1_18);
		
		JButton button_1_19 = new JButton("Mashed Potato");
		button_1_19.setToolTipText("Mashed Potato");
		button_1_19.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_1_19.getText())) {
					qty += 1;
					map.put(button_1_19.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_19.getText());
					totalPrice.setText(String.valueOf(total));
			}
				
				else {
					qty = 1;
					map.put(button_1_19.getText(), qty);
					price.put(button_1_19.getText(), 20);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_19.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_1_19.setBounds(367, 188, 109, 48);
		panel_1.add(button_1_19);
		
		JButton button_1_20 = new JButton("Chicken Steak");
		button_1_20.setToolTipText("Chicken Steak");
		button_1_20.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_1_20.getText())) {
					qty += 1;
					map.put(button_1_20.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_20.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_1_20.getText(), qty);
					price.put(button_1_20.getText(), 60);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_20.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_1_20.setBounds(486, 188, 109, 48);
		panel_1.add(button_1_20);
		
		JButton button_1_21 = new JButton("Steak");
		button_1_21.setToolTipText("Steak");
		button_1_21.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_1_21.getText())) {
					qty += 1;
					map.put(button_1_21.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_21.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_1_21.getText(), qty);
					price.put(button_1_21.getText(), 60);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_21.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_1_21.setBounds(10, 247, 109, 48);
		panel_1.add(button_1_21);
		
		JButton button_1_22 = new JButton("Fried Sausage");
		button_1_22.setToolTipText("Fried Sausage");
		button_1_22.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_1_22.getText())) {
					qty += 1;
					map.put(button_1_22.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_22.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_1_22.getText(), qty);
					price.put(button_1_22.getText(), 15);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_22.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_1_22.setBounds(129, 247, 109, 48);
		panel_1.add(button_1_22);
		
		JButton button_1_23 = new JButton("Chicken Nuggets");
		button_1_23.setToolTipText("Chicken Nuggets");
		button_1_23.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_1_23.getText())) {
					qty += 1;
					map.put(button_1_23.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_23.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_1_23.getText(), qty);
					price.put(button_1_23.getText(), 7);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_23.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_1_23.setBounds(248, 247, 109, 48);
		panel_1.add(button_1_23);
		
		JButton button_1_24 = new JButton("Spring Rolls");
		button_1_24.setToolTipText("Spring Rolls");
		button_1_24.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_1_24.getText())) {
					qty += 1;
					map.put(button_1_24.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_24.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_1_24.getText(), qty);
					price.put(button_1_24.getText(), 7);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_24.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_1_24.setBounds(367, 247, 109, 48);
		panel_1.add(button_1_24);
		
		JButton button_1_25 = new JButton("Fried Egg/Omelette");
		button_1_25.setToolTipText("Fried Egg/Omelette");
		button_1_25.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_1_25.getText())) {
					qty += 1;
					map.put(button_1_25.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_25.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_1_25.getText(), qty);
					price.put(button_1_25.getText(), 7);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_25.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_1_25.setBounds(486, 247, 109, 48);
		panel_1.add(button_1_25);
		
		JButton button_1_26 = new JButton("French Fries");
		button_1_26.setToolTipText("French Fries");
		button_1_26.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_1_26.getText())) {
					qty += 1;
					map.put(button_1_26.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_26.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_1_26.getText(), qty);
					price.put(button_1_26.getText(), 20);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_26.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_1_26.setBounds(10, 306, 109, 48);
		panel_1.add(button_1_26);
		
		JButton button_1_27 = new JButton("Fried Dumplings");
		button_1_27.setToolTipText("Fried Dumplings");
		button_1_27.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_1_27.getText())) {
					qty += 1;
					map.put(button_1_27.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_27.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_1_27.getText(), qty);
					price.put(button_1_27.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_27.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_1_27.setBounds(129, 306, 109, 48);
		panel_1.add(button_1_27);
		
		
//Panel 1 END
		
		panel_2 = new JPanel();
		tabbedPane.addTab("Asian Food", null, panel_2, null);
		panel_2.setLayout(null);
		
//Panel 2 "Asian Food" Menu
		
		JButton btnNewButton_2_1 = new JButton("Fried Chicken + Rice");
		btnNewButton_2_1.setToolTipText("Fried Chicken + Rice");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(btnNewButton_2_1.getText())) {
					qty += 1;
					map.put(btnNewButton_2_1.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					total += price.get(btnNewButton_2_1.getText());
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(btnNewButton_2_1.getText(), qty);
					price.put(btnNewButton_2_1.getText(), 30);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));			  
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(btnNewButton_2_1.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		btnNewButton_2_1.setBounds(10, 11, 109, 48);
		panel_2.add(btnNewButton_2_1);
		
		JButton button_2_2 = new JButton("Beef Jerky + Rice");
		button_2_2.setToolTipText("Beef Jerky + Rice");
		button_2_2.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_2_2.getText())) {
					qty += 1;
					map.put(button_2_2.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_2.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_2_2.getText(), qty);
					price.put(button_2_2.getText(), 35);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_2.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_2_2.setBounds(129, 11, 109, 48);
		panel_2.add(button_2_2);
		
		JButton button_2_3 = new JButton("Fried Fish + Rice");
		button_2_3.setToolTipText("Fried Fish + Rice");
		button_2_3.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_2_3.getText())) {
					qty += 1;
					map.put(button_2_3.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_3.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_2_3.getText(), qty);
					price.put(button_2_3.getText(), 35);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_1_3.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_2_3.setBounds(248, 11, 109, 48);
		panel_2.add(button_2_3);
		
		JButton button_2_4 = new JButton("Fried Chicken + Beef Jerky + Rice");
		button_2_4.setToolTipText("Fried Chicken + Beef Jerky + Rice");
		button_2_4.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_2_4.getText())) {
					qty += 1;
					map.put(button_2_4.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_4.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_2_4.getText(), qty);
					price.put(button_2_4.getText(), 40);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_4.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_2_4.setBounds(367, 11, 109, 48);
		panel_2.add(button_2_4);
		
		JButton button_2_5 = new JButton("Chicken Larb + Rice");
		button_2_5.setToolTipText("Chicken Larb + Rice");
		button_2_5.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_2_5.getText())) {
					qty += 1;
					map.put(button_2_5.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_5.getText());
					totalPrice.setText(String.valueOf(total));
			}
				
				else {
					qty = 1;
					map.put(button_2_5.getText(), qty);
					price.put(button_2_5.getText(), 30);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_5.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_2_5.setBounds(486, 11, 109, 48);
		panel_2.add(button_2_5);
		
		JButton button_2_6 = new JButton("Spicy Chicken + Rice");
		button_2_6.setToolTipText("Spicy Chicken + Rice");
		button_2_6.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_2_6.getText())) {
					qty += 1;
					map.put(button_2_6.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_6.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_2_6.getText(), qty);
					price.put(button_2_6.getText(), 35);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_6.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_2_6.setBounds(10, 70, 109, 48);
		panel_2.add(button_2_6);
		
		JButton button_2_7 = new JButton("Fried Chicken + Vegetable Stir Fry + Rice");
		button_2_7.setToolTipText("Fried Chicken + Vegetable Stir Fry + Rice");
		button_2_7.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_2_7.getText())) {
					qty += 1;
					map.put(button_2_7.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_7.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_2_7.getText(), qty);
					price.put(button_2_7.getText(), 35);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_7.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_2_7.setBounds(129, 70, 109, 48);
		panel_2.add(button_2_7);
		
		JButton button_2_8 = new JButton("Beef Stew + Rice");
		button_2_8.setToolTipText("Beef Stew + Rice");
		button_2_8.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_2_8.getText())) {
					qty += 1;
					map.put(button_2_8.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_8.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_2_8.getText(), qty);
					price.put(button_2_8.getText(), 35);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_8.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_2_8.setBounds(248, 70, 109, 48);
		panel_2.add(button_2_8);
		
		JButton button_2_9 = new JButton("Beef Paneang + Rice");
		button_2_9.setToolTipText("Beef Paneang + Rice");
		button_2_9.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_2_9.getText())) {
					qty += 1;
					map.put(button_2_9.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_9.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_2_9.getText(), qty);
					price.put(button_2_9.getText(), 35);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_9.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_2_9.setBounds(367, 70, 109, 48);
		panel_2.add(button_2_9);
		
		JButton button_2_10 = new JButton("Beef with Basil + Rice");
		button_2_10.setToolTipText("Beef with Basil + Rice");
		button_2_10.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_2_10.getText())) {
					qty += 1;
					map.put(button_2_10.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_10.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_2_10.getText(), qty);
					price.put(button_2_10.getText(), 35);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_10.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_2_10.setBounds(486, 70, 109, 48);
		panel_2.add(button_2_10);
		
		JButton button_2_11 = new JButton("Chicken Paneang + Rice");
		button_2_11.setToolTipText("Chicken Paneang + Rice");
		button_2_11.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_2_11.getText())) {
					qty += 1;
					map.put(button_2_11.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_11.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_2_11.getText(), qty);
					price.put(button_2_11.getText(), 30);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_11.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_2_11.setBounds(10, 129, 109, 48);
		panel_2.add(button_2_11);
		
		JButton button_2_12 = new JButton("Chicken with Basil + Rice");
		button_2_12.setToolTipText("Chicken with Basil + Rice");
		button_2_12.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_2_12.getText())) {
					qty += 1;
					map.put(button_2_12.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_12.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_2_12.getText(), qty);
					price.put(button_2_12.getText(), 30);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_12.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_2_12.setBounds(129, 129, 109, 48);
		panel_2.add(button_2_12);
		
		JButton button_2_13 = new JButton("Baked Chicken + Rice");
		button_2_13.setToolTipText("Baked Chicken + Rice");
		button_2_13.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_2_13.getText())) {
					qty += 1;
					map.put(button_2_13.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_13.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_2_13.getText(), qty);
					price.put(button_2_13.getText(), 35);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_13.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_2_13.setBounds(248, 129, 109, 48);
		panel_2.add(button_2_13);
		
		JButton button_2_14 = new JButton("Fried Sausage + Rice");
		button_2_14.setToolTipText("Fried Sausage + Rice");
		button_2_14.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_2_14.getText())) {
					qty += 1;
					map.put(button_2_14.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_14.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_2_14.getText(), qty);
					price.put(button_2_14.getText(), 30);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_14.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_2_14.setBounds(367, 129, 109, 48);
		panel_2.add(button_2_14);
		
		JButton button_2_15 = new JButton("Garlic Chicken + Rice");
		button_2_15.setToolTipText("Garlic Chicken + Rice");
		button_2_15.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_2_15.getText())) {
					qty += 1;
					map.put(button_2_15.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_15.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_2_15.getText(), qty);
					price.put(button_2_15.getText(), 30);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_15.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_2_15.setBounds(486, 129, 109, 48);
		panel_2.add(button_2_15);
		
		JButton button_2_16 = new JButton("Boiled Chicken + Rice");
		button_2_16.setToolTipText("Boiled Chicken + Rice");
		button_2_16.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_2_16.getText())) {
					qty += 1;
					map.put(button_2_16.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_16.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_2_16.getText(), qty);
					price.put(button_2_16.getText(), 25);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_16.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_2_16.setBounds(10, 188, 109, 48);
		panel_2.add(button_2_16);
		
		JButton button_2_17 = new JButton("Curry Rice with Chicken");
		button_2_17.setToolTipText("Curry Rice with Chicken");
		button_2_17.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_2_17.getText())) {
					qty += 1;
					map.put(button_2_17.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_17.getText());
					totalPrice.setText(String.valueOf(total));
			}
				
				else {
					qty = 1;
					map.put(button_2_17.getText(), qty);
					price.put(button_2_17.getText(), 40);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_17.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_2_17.setBounds(129, 188, 109, 48);
		panel_2.add(button_2_17);
		
		JButton button_2_18 = new JButton("Hainanese Chicken Rice");
		button_2_18.setToolTipText("Hainanese Chicken Rice");
		button_2_18.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_2_18.getText())) {
					qty += 1;
					map.put(button_2_18.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_18.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_2_18.getText(), qty);
					price.put(button_2_18.getText(), 30);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_18.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_2_18.setBounds(248, 188, 109, 48);
		panel_2.add(button_2_18);
		
		JButton button_2_19 = new JButton("Fried Rice with Egg");
		button_2_19.setToolTipText("Fried Rice with Egg");
		button_2_19.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_2_19.getText())) {
					qty += 1;
					map.put(button_2_19.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_19.getText());
					totalPrice.setText(String.valueOf(total));
			}
				
				else {
					qty = 1;
					map.put(button_2_19.getText(), qty);
					price.put(button_2_19.getText(), 30);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_19.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_2_19.setBounds(367, 188, 109, 48);
		panel_2.add(button_2_19);
		
		JButton button_2_20 = new JButton("Fried Rice with Basil Chicken");
		button_2_20.setToolTipText("Fried Rice with Basil Chicken");
		button_2_20.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_2_20.getText())) {
					qty += 1;
					map.put(button_2_20.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_20.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_2_20.getText(), qty);
					price.put(button_2_20.getText(), 30);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_20.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_2_20.setBounds(486, 188, 109, 48);
		panel_2.add(button_2_20);
		
		JButton button_2_21 = new JButton("Fried Rice with Sausage");
		button_2_21.setToolTipText("Fried Rice with Sausage");
		button_2_21.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_2_21.getText())) {
					qty += 1;
					map.put(button_2_21.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_21.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_2_21.getText(), qty);
					price.put(button_2_21.getText(), 30);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_21.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_2_21.setBounds(10, 247, 109, 48);
		panel_2.add(button_2_21);
		
		JButton button_2_22 = new JButton("Sticky Rice and Fried Chicken");
		button_2_22.setToolTipText("Sticky Rice and Fried Chicken");
		button_2_22.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_2_22.getText())) {
					qty += 1;
					map.put(button_2_22.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_22.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_2_22.getText(), qty);
					price.put(button_2_22.getText(), 30);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_22.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_2_22.setBounds(129, 247, 109, 48);
		panel_2.add(button_2_22);
		
		JButton button_2_23 = new JButton("Sticky Rice and Beef Jerky");
		button_2_23.setToolTipText("Sticky Rice and Beef Jerky");
		button_2_23.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_2_23.getText())) {
					qty += 1;
					map.put(button_2_23.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_23.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_2_23.getText(), qty);
					price.put(button_2_23.getText(), 35);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_23.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_2_23.setBounds(248, 247, 109, 48);
		panel_2.add(button_2_23);
		
		JButton button_2_24 = new JButton("Sticky Rice with Fried Chicken (Small)");
		button_2_24.setToolTipText("Sticky Rice with Fried Chicken (Small)");
		button_2_24.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_2_24.getText())) {
					qty += 1;
					map.put(button_2_24.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_24.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_2_24.getText(), qty);
					price.put(button_2_24.getText(), 15);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_24.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_2_24.setBounds(367, 247, 109, 48);
		panel_2.add(button_2_24);
		
		JButton button_2_25 = new JButton("Fried Egg/Omelette");
		button_2_25.setToolTipText("Fried Egg/Omelette");
		button_2_25.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_2_25.getText())) {
					qty += 1;
					map.put(button_2_25.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_25.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_2_25.getText(), qty);
					price.put(button_2_25.getText(), 7);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_2_25.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_2_25.setBounds(486, 247, 109, 48);
		panel_2.add(button_2_25);
		
//Panel 2 END
		
		panel_3 = new JPanel();
		tabbedPane.addTab("Noodles", null, panel_3, null);
		panel_3.setLayout(null);
		
//Panel 3 "Noodles" Menu
		
		JButton btnNewButton_3_1 = new JButton("Chicken Noodle Soup");
		btnNewButton_3_1.setToolTipText("Chicken Noodle Soup");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(btnNewButton_3_1.getText())) {
					qty += 1;
					map.put(btnNewButton_3_1.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					total += price.get(btnNewButton_3_1.getText());
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(btnNewButton_3_1.getText(), qty);
					price.put(btnNewButton_3_1.getText(), 30);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));			  
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(btnNewButton_3_1.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		btnNewButton_3_1.setBounds(10, 11, 109, 48);
		panel_3.add(btnNewButton_3_1);
		
		JButton button_3_2 = new JButton("Beef Noodle Soup");
		button_3_2.setToolTipText("Beef Noodle Soup");
		button_3_2.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_3_2.getText())) {
					qty += 1;
					map.put(button_3_2.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_3_2.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_3_2.getText(), qty);
					price.put(button_3_2.getText(), 30);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_3_2.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_3_2.setBounds(129, 11, 109, 48);
		panel_3.add(button_3_2);
		
		JButton button_3_3 = new JButton("Chicken Tom Yum Noodle Soup");
		button_3_3.setToolTipText("Chicken Tom Yum Noodle Soup");
		button_3_3.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_3_3.getText())) {
					qty += 1;
					map.put(button_3_3.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_3_3.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_3_3.getText(), qty);
					price.put(button_3_3.getText(), 35);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_3_3.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_3_3.setBounds(248, 11, 109, 48);
		panel_3.add(button_3_3);
		
		JButton button_3_4 = new JButton("Beef Tom Yum Noodle Soup");
		button_3_4.setToolTipText("Beef Tom Yum Noodle Soup");
		button_3_4.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_3_4.getText())) {
					qty += 1;
					map.put(button_3_4.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_3_4.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_3_4.getText(), qty);
					price.put(button_3_4.getText(), 35);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_3_4.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_3_4.setBounds(367, 11, 109, 48);
		panel_3.add(button_3_4);
		
		JButton button_3_5 = new JButton("Yen Ta Fo");
		button_3_5.setToolTipText("Yen Ta Fo");
		button_3_5.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_3_5.getText())) {
					qty += 1;
					map.put(button_3_5.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_3_5.getText());
					totalPrice.setText(String.valueOf(total));
			}
				
				else {
					qty = 1;
					map.put(button_3_5.getText(), qty);
					price.put(button_3_5.getText(), 30);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_3_5.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_3_5.setBounds(486, 11, 109, 48);
		panel_3.add(button_3_5);
		
		JButton button_3_6 = new JButton("Egg");
		button_3_6.setToolTipText("Egg");
		button_3_6.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_3_6.getText())) {
					qty += 1;
					map.put(button_3_6.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_3_6.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_3_6.getText(), qty);
					price.put(button_3_6.getText(), 6);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_3_6.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_3_6.setBounds(10, 70, 109, 48);
		panel_3.add(button_3_6);
		
//Panel 3 END
		
		panel_4 = new JPanel();
		tabbedPane.addTab("Desserts and Drinks", null, panel_4, null);
		panel_4.setLayout(null);
		
//Panel 4 "Desserts and Drinks" Menu
		
		JButton btnNewButton_4_1 = new JButton("Rod Chong + Thai Melon");
		btnNewButton_4_1.setToolTipText("Rod Chong + Thai Melon");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(btnNewButton_4_1.getText())) {
					qty += 1;
					map.put(btnNewButton_4_1.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					total += price.get(btnNewButton_4_1.getText());
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(btnNewButton_4_1.getText(), qty);
					price.put(btnNewButton_4_1.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));			  
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(btnNewButton_4_1.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		btnNewButton_4_1.setBounds(10, 11, 109, 48);
		panel_4.add(btnNewButton_4_1);
		
		JButton button_4_2 = new JButton("Tub Tim + Sweet Tub Tim");
		button_4_2.setToolTipText("Tub Tim + Sweet Tub Tim");
		button_4_2.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_4_2.getText())) {
					qty += 1;
					map.put(button_4_2.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_2.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_4_2.getText(), qty);
					price.put(button_4_2.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_2.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_4_2.setBounds(129, 11, 109, 48);
		panel_4.add(button_4_2);
		
		JButton button_4_3 = new JButton("Singaporean Rod Chong");
		button_4_3.setToolTipText("Singaporean Rod Chong");
		button_4_3.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_4_3.getText())) {
					qty += 1;
					map.put(button_4_3.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_3.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_4_3.getText(), qty);
					price.put(button_4_3.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_3.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_4_3.setBounds(248, 11, 109, 48);
		panel_4.add(button_4_3);
		
		JButton button_4_4 = new JButton("Coconut Jelly + Tub Tim");
		button_4_4.setToolTipText("Coconut Jelly + Tub Tim");
		button_4_4.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_4_4.getText())) {
					qty += 1;
					map.put(button_4_4.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_4.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_4_4.getText(), qty);
					price.put(button_4_4.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_4.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_4_4.setBounds(367, 11, 109, 48);
		panel_4.add(button_4_4);
		
		JButton button_4_5 = new JButton("Grass Jelly + Coconut Jelly");
		button_4_5.setToolTipText("Grass Jelly + Coconut Jelly");
		button_4_5.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_4_5.getText())) {
					qty += 1;
					map.put(button_4_5.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_5.getText());
					totalPrice.setText(String.valueOf(total));
			}
				
				else {
					qty = 1;
					map.put(button_4_5.getText(), qty);
					price.put(button_4_5.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_5.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_4_5.setBounds(486, 11, 109, 48);
		panel_4.add(button_4_5);
		
		JButton button_4_6 = new JButton("Ruam Mid + Coconut Jelly");
		button_4_6.setToolTipText("Ruam Mid + Coconut Jelly");
		button_4_6.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_4_6.getText())) {
					qty += 1;
					map.put(button_4_6.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_6.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_4_6.getText(), qty);
					price.put(button_4_6.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_6.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_4_6.setBounds(10, 70, 109, 48);
		panel_4.add(button_4_6);
		
		JButton button_4_7 = new JButton("Bua Roi");
		button_4_7.setToolTipText("Bua Roi");
		button_4_7.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_4_7.getText())) {
					qty += 1;
					map.put(button_4_7.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_7.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_4_7.getText(), qty);
					price.put(button_4_7.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_7.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_4_7.setBounds(129, 70, 109, 48);
		panel_4.add(button_4_7);
		
		JButton button_4_8 = new JButton("Sa Ku");
		button_4_8.setToolTipText("Sa Ku");
		button_4_8.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_4_8.getText())) {
					qty += 1;
					map.put(button_4_8.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_8.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_4_8.getText(), qty);
					price.put(button_4_8.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_8.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_4_8.setBounds(248, 70, 109, 48);
		panel_4.add(button_4_8);
		
		JButton button_4_9 = new JButton("Banana in Coconut Milk");
		button_4_9.setToolTipText("Banana in Coconut Milk");
		button_4_9.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_4_9.getText())) {
					qty += 1;
					map.put(button_4_9.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_9.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_4_9.getText(), qty);
					price.put(button_4_9.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_9.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_4_9.setBounds(367, 70, 109, 48);
		panel_4.add(button_4_9);
		
		JButton button_4_10 = new JButton("Pumpkin in Coconut Milk");
		button_4_10.setToolTipText("Pumpkin in Coconut Milk");
		button_4_10.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_4_10.getText())) {
					qty += 1;
					map.put(button_4_10.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_10.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_4_10.getText(), qty);
					price.put(button_4_10.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_10.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_4_10.setBounds(486, 70, 109, 48);
		panel_4.add(button_4_10);
		
		JButton button_4_11 = new JButton("Taro in Coconut Milk");
		button_4_11.setToolTipText("Taro in Coconut Milk");
		button_4_11.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_4_11.getText())) {
					qty += 1;
					map.put(button_4_11.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_11.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_4_11.getText(), qty);
					price.put(button_4_11.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_11.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_4_11.setBounds(10, 129, 109, 48);
		panel_4.add(button_4_11);
		
		JButton button_4_12 = new JButton("Sticky Rice with Black Beans");
		button_4_12.setToolTipText("Sticky Rice with Black Beans");
		button_4_12.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_4_12.getText())) {
					qty += 1;
					map.put(button_4_12.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_12.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_4_12.getText(), qty);
					price.put(button_4_12.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_12.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_4_12.setBounds(129, 129, 109, 48);
		panel_4.add(button_4_12);
		
		JButton button_4_13 = new JButton("Krong Kreang");
		button_4_13.setToolTipText("Krong Kreang");
		button_4_13.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_4_13.getText())) {
					qty += 1;
					map.put(button_4_13.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_13.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_4_13.getText(), qty);
					price.put(button_4_13.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_13.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_4_13.setBounds(248, 129, 109, 48);
		panel_4.add(button_4_13);
		
		JButton button_4_14 = new JButton("Salim");
		button_4_14.setToolTipText("Salim");
		button_4_14.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_4_14.getText())) {
					qty += 1;
					map.put(button_4_14.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_14.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_4_14.getText(), qty);
					price.put(button_4_14.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_14.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_4_14.setBounds(367, 129, 109, 48);
		panel_4.add(button_4_14);
		
		JButton button_4_15 = new JButton("Tao Suan");
		button_4_15.setToolTipText("Tao Suan");
		button_4_15.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_4_15.getText())) {
					qty += 1;
					map.put(button_4_15.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_15.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_4_15.getText(), qty);
					price.put(button_4_15.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_15.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_4_15.setBounds(486, 129, 109, 48);
		panel_4.add(button_4_15);
		
		JButton button_4_16 = new JButton("Ruk Piek");
		button_4_16.setToolTipText("Ruk Piek");
		button_4_16.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_4_16.getText())) {
					qty += 1;
					map.put(button_4_16.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_16.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_4_16.getText(), qty);
					price.put(button_4_16.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_16.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_4_16.setBounds(10, 188, 109, 48);
		panel_4.add(button_4_16);
		
		JButton button_4_17 = new JButton("Fruits");
		button_4_17.setToolTipText("Fruits");
		button_4_17.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_4_17.getText())) {
					qty += 1;
					map.put(button_4_17.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_17.getText());
					totalPrice.setText(String.valueOf(total));
			}
				
				else {
					qty = 1;
					map.put(button_4_17.getText(), qty);
					price.put(button_4_17.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_17.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_4_17.setBounds(129, 188, 109, 48);
		panel_4.add(button_4_17);
		
		JButton button_4_18 = new JButton("Punch");
		button_4_18.setToolTipText("Punch");
		button_4_18.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_4_18.getText())) {
					qty += 1;
					map.put(button_4_18.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_18.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_4_18.getText(), qty);
					price.put(button_4_18.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_18.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_4_18.setBounds(248, 188, 109, 48);
		panel_4.add(button_4_18);
		
		JButton button_4_19 = new JButton("Grape Juice");
		button_4_19.setToolTipText("Grape Juice");
		button_4_19.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_4_19.getText())) {
					qty += 1;
					map.put(button_4_19.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_19.getText());
					totalPrice.setText(String.valueOf(total));
			}
				
				else {
					qty = 1;
					map.put(button_4_19.getText(), qty);
					price.put(button_4_19.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_19.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_4_19.setBounds(367, 188, 109, 48);
		panel_4.add(button_4_19);
		
		JButton button_4_20 = new JButton("Orange Juice");
		button_4_20.setToolTipText("Orange Juice");
		button_4_20.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_4_20.getText())) {
					qty += 1;
					map.put(button_4_20.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_20.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_4_20.getText(), qty);
					price.put(button_4_20.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_20.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_4_20.setBounds(486, 188, 109, 48);
		panel_4.add(button_4_20);
		
		JButton button_4_21 = new JButton("Strawberry Juice");
		button_4_21.setToolTipText("Strawberry Juice");
		button_4_21.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_4_21.getText())) {
					qty += 1;
					map.put(button_4_21.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_21.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_4_21.getText(), qty);
					price.put(button_4_21.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_21.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_4_21.setBounds(10, 247, 109, 48);
		panel_4.add(button_4_21);
		
		JButton button_4_22 = new JButton("Coconut Juice");
		button_4_22.setToolTipText("Coconut Juice");
		button_4_22.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_4_22.getText())) {
					qty += 1;
					map.put(button_4_22.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_22.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_4_22.getText(), qty);
					price.put(button_4_22.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_22.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_4_22.setBounds(129, 247, 109, 48);
		panel_4.add(button_4_22);
		
		JButton button_4_23 = new JButton("Coconut Juice (Blended)");
		button_4_23.setToolTipText("Coconut Juice (Blended)");
		button_4_23.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_4_23.getText())) {
					qty += 1;
					map.put(button_4_23.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_23.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_4_23.getText(), qty);
					price.put(button_4_23.getText(), 20);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_23.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_4_23.setBounds(248, 247, 109, 48);
		panel_4.add(button_4_23);
		
		JButton button_4_24 = new JButton("Hale's Blue Boy Red (Blended)");
		button_4_24.setToolTipText("Hale's Blue Boy Red (Blended)");
		button_4_24.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_4_24.getText())) {
					qty += 1;
					map.put(button_4_24.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_24.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_4_24.getText(), qty);
					price.put(button_4_24.getText(), 20);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_24.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_4_24.setBounds(367, 247, 109, 48);
		panel_4.add(button_4_24);
		
		JButton button_4_25 = new JButton("Yogurt");
		button_4_25.setToolTipText("Yogurt");
		button_4_25.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_4_25.getText())) {
					qty += 1;
					map.put(button_4_25.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_25.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_4_25.getText(), qty);
					price.put(button_4_25.getText(), 15);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_25.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_4_25.setBounds(486, 247, 109, 48);
		panel_4.add(button_4_25);
		
		JButton button_4_26 = new JButton("Yakult (Small)");
		button_4_26.setToolTipText("Yakult (Small)");
		button_4_26.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_4_26.getText())) {
					qty += 1;
					map.put(button_4_26.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_26.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_4_26.getText(), qty);
					price.put(button_4_26.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_26.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_4_26.setBounds(10, 306, 109, 48);
		panel_4.add(button_4_26);
		
		JButton button_4_27 = new JButton("Yakult (Large)");
		button_4_27.setToolTipText("Yakult (Large)");
		button_4_27.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_4_27.getText())) {
					qty += 1;
					map.put(button_4_27.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_27.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_4_27.getText(), qty);
					price.put(button_4_27.getText(), 25);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_27.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_4_27.setBounds(129, 306, 109, 48);
		panel_4.add(button_4_27);
		
		JButton button_4_28 = new JButton("DutchMilk (Regular, Chocolate, Strawberry)");
		button_4_28.setToolTipText("DutchMilk (Regular, Chocolate, Strawberry)");
		button_4_28.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_4_28.getText())) {
					qty += 1;
					map.put(button_4_28.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_28.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_4_28.getText(), qty);
					price.put(button_4_28.getText(), 13);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_28.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_4_28.setBounds(248, 306, 109, 48);
		panel_4.add(button_4_28);
		
		JButton button_4_29 = new JButton("Chokchai Milk (Regular, Choc Malt, Sweet)");
		button_4_29.setToolTipText("Chokchai Milk (Regular, Choc Malt, Sweet)");
		button_4_29.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_4_29.getText())) {
					qty += 1;
					map.put(button_4_29.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_29.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_4_29.getText(), qty);
					price.put(button_4_29.getText(), 12);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_29.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_4_29.setBounds(367, 306, 109, 48);
		panel_4.add(button_4_29);
		
		JButton button_4_30 = new JButton("Tipco Juice");
		button_4_30.setToolTipText("Tipco Juice");
		button_4_30.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_4_30.getText())) {
					qty += 1;
					map.put(button_4_30.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_30.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_4_30.getText(), qty);
					price.put(button_4_30.getText(), 18);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_30.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_4_30.setBounds(486, 306, 109, 48);
		panel_4.add(button_4_30);
		
		JButton button_4_31 = new JButton("Malee Juice");
		button_4_31.setToolTipText("Malee Juice");
		button_4_31.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_4_31.getText())) {
					qty += 1;
					map.put(button_4_31.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_31.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_4_31.getText(), qty);
					price.put(button_4_31.getText(), 18);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_31.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_4_31.setBounds(10, 365, 109, 48);
		panel_4.add(button_4_31);
		
		JButton button_4_32 = new JButton("Chrysanthemum Juice");
		button_4_32.setToolTipText("Chrysanthemum Juice");
		button_4_32.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_4_32.getText())) {
					qty += 1;
					map.put(button_4_32.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_32.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_4_32.getText(), qty);
					price.put(button_4_32.getText(), 15);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_32.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_4_32.setBounds(129, 365, 109, 48);
		panel_4.add(button_4_32);
		
		JButton button_4_33 = new JButton("Roselle Juice");
		button_4_33.setToolTipText("Roselle Juice");
		button_4_33.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_4_33.getText())) {
					qty += 1;
					map.put(button_4_33.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_33.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_4_33.getText(), qty);
					price.put(button_4_33.getText(), 15);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_33.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_4_33.setBounds(248, 365, 109, 48);
		panel_4.add(button_4_33);
		
		JButton button_4_34 = new JButton("Aura Water");
		button_4_34.setToolTipText("Aura Water");
		button_4_34.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_4_34.getText())) {
					qty += 1;
					map.put(button_4_34.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_34.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_4_34.getText(), qty);
					price.put(button_4_34.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_34.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_4_34.setBounds(367, 365, 109, 48);
		panel_4.add(button_4_34);
		
		JButton button_4_35 = new JButton("Crystal Water");
		button_4_35.setToolTipText("Crystal Water");
		button_4_35.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_4_35.getText())) {
					qty += 1;
					map.put(button_4_35.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_35.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_4_35.getText(), qty);
					price.put(button_4_35.getText(), 8);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_4_35.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_4_35.setBounds(486, 365, 109, 48);
		panel_4.add(button_4_35);

//Panel 4 END
		
		panel_5 = new JPanel();
		tabbedPane.addTab("Vegetarian Food", null, panel_5, null);
		panel_5.setLayout(null);
		
//Panel 5 "Vegetarian Food" Menu
		
		JButton btnNewButton_5_1 = new JButton("Tofu Soup + Rice");
		btnNewButton_5_1.setToolTipText("Tofu Soup + Rice");
		btnNewButton_5_1.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(btnNewButton_5_1.getText())) {
					qty += 1;
					map.put(btnNewButton_5_1.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					total += price.get(btnNewButton_5_1.getText());
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(btnNewButton_5_1.getText(), qty);
					price.put(btnNewButton_5_1.getText(), 25);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));			  
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(btnNewButton_5_1.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		btnNewButton_5_1.setBounds(10, 11, 109, 48);
		panel_5.add(btnNewButton_5_1);
		
		JButton button_5_2 = new JButton("Chicken Green Curry + Rice");
		button_5_2.setToolTipText("Chicken Green Curry + Rice");
		button_5_2.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_5_2.getText())) {
					qty += 1;
					map.put(button_5_2.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_5_2.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_5_2.getText(), qty);
					price.put(button_5_2.getText(), 30);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_5_2.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_5_2.setBounds(129, 11, 109, 48);
		panel_5.add(button_5_2);
		
		JButton button_5_3 = new JButton("Chicken Masaman Curry + Rice");
		button_5_3.setToolTipText("Chicken Masaman Curry + Rice");
		button_5_3.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_5_3.getText())) {
					qty += 1;
					map.put(button_5_3.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_5_3.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_5_3.getText(), qty);
					price.put(button_5_3.getText(), 30);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_5_3.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_5_3.setBounds(248, 11, 109, 48);
		panel_5.add(button_5_3);
		
		JButton button_5_4 = new JButton("Squash Soup + Rice");
		button_5_4.setToolTipText("Squash Soup + Rice");
		button_5_4.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_5_4.getText())) {
					qty += 1;
					map.put(button_5_4.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_5_4.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_5_4.getText(), qty);
					price.put(button_5_4.getText(), 25);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_5_4.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_5_4.setBounds(367, 11, 109, 48);
		panel_5.add(button_5_4);
		
		JButton button_5_5 = new JButton("Tofu in Brown Sauce + Rice");
		button_5_5.setToolTipText("Tofu in Brown Sauce + Rice");
		button_5_5.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_5_5.getText())) {
					qty += 1;
					map.put(button_5_5.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_5_5.getText());
					totalPrice.setText(String.valueOf(total));
			}
				
				else {
					qty = 1;
					map.put(button_5_5.getText(), qty);
					price.put(button_5_5.getText(), 30);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_5_5.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_5_5.setBounds(486, 11, 109, 48);
		panel_5.add(button_5_5);
		
		JButton button_5_6 = new JButton("Tofu in Gravy Sauce + Rice");
		button_5_6.setToolTipText("Tofu in Gravy Sauce + Rice");
		button_5_6.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_5_6.getText())) {
					qty += 1;
					map.put(button_5_6.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_5_6.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_5_6.getText(), qty);
					price.put(button_5_6.getText(), 30);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_5_6.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_5_6.setBounds(10, 70, 109, 48);
		panel_5.add(button_5_6);
		
		JButton button_5_7 = new JButton("Stewed Tofu + Rice");
		button_5_7.setToolTipText("Stewed Tofu + Rice");
		button_5_7.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_5_7.getText())) {
					qty += 1;
					map.put(button_5_7.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_5_7.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_5_7.getText(), qty);
					price.put(button_5_7.getText(), 30);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_5_7.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_5_7.setBounds(129, 70, 109, 48);
		panel_5.add(button_5_7);
		
		JButton button_5_8 = new JButton("Vegetarian BBQ + Rice");
		button_5_8.setToolTipText("Vegetarian BBQ + Rice");
		button_5_8.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_5_8.getText())) {
					qty += 1;
					map.put(button_5_8.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_5_8.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_5_8.getText(), qty);
					price.put(button_5_8.getText(), 30);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_5_8.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_5_8.setBounds(248, 70, 109, 48);
		panel_5.add(button_5_8);
		
		JButton button_5_9 = new JButton("Vegetarian Basil Stir Fry + Rice");
		button_5_9.setToolTipText("Vegetarian Basil Stir Fry + Rice");
		button_5_9.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_5_9.getText())) {
					qty += 1;
					map.put(button_5_9.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_5_9.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_5_9.getText(), qty);
					price.put(button_5_9.getText(), 30);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_5_9.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_5_9.setBounds(367, 70, 109, 48);
		panel_5.add(button_5_9);
		
		JButton button_5_10 = new JButton("Mushroom Stem in Gravy Sauce + Rice");
		button_5_10.setToolTipText("Mushroom Stem in Gravy Sauce + Rice");
		button_5_10.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_5_10.getText())) {
					qty += 1;
					map.put(button_5_10.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_5_10.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_5_10.getText(), qty);
					price.put(button_5_10.getText(), 30);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_5_10.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_5_10.setBounds(486, 70, 109, 48);
		panel_5.add(button_5_10);
		
		JButton button_5_11 = new JButton("Stir Fry Vegetables + Rice");
		button_5_11.setToolTipText("Stir Fry Vegetables + Rice");
		button_5_11.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_5_11.getText())) {
					qty += 1;
					map.put(button_5_11.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_5_11.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_5_11.getText(), qty);
					price.put(button_5_11.getText(), 25);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_5_11.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_5_11.setBounds(10, 129, 109, 48);
		panel_5.add(button_5_11);
		
		JButton button_5_12 = new JButton("Stir Fry Tofu with Chili and Ginger + Rice");
		button_5_12.setToolTipText("Stir Fry Tofu with Chili and Ginger + Rice");
		button_5_12.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_5_12.getText())) {
					qty += 1;
					map.put(button_5_12.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_5_12.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_5_12.getText(), qty);
					price.put(button_5_12.getText(), 30);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_5_12.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_5_12.setBounds(129, 129, 109, 48);
		panel_5.add(button_5_12);
		
		JButton button_5_13 = new JButton("Beef with Garlic + Rice");
		button_5_13.setToolTipText("Beef with Garlic + Rice");
		button_5_13.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_5_13.getText())) {
					qty += 1;
					map.put(button_5_13.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_5_13.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_5_13.getText(), qty);
					price.put(button_5_13.getText(), 30);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_5_13.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_5_13.setBounds(248, 129, 109, 48);
		panel_5.add(button_5_13);
		
		JButton button_5_14 = new JButton("Tofu with Garlic + Rice");
		button_5_14.setToolTipText("Tofu with Garlic + Rice");
		button_5_14.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_5_14.getText())) {
					qty += 1;
					map.put(button_5_14.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_5_14.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_5_14.getText(), qty);
					price.put(button_5_14.getText(), 30);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_5_14.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_5_14.setBounds(367, 129, 109, 48);
		panel_5.add(button_5_14);
		
		JButton button_5_15 = new JButton("Fried Curry Rice");
		button_5_15.setToolTipText("Fried Curry Rice");
		button_5_15.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_5_15.getText())) {
					qty += 1;
					map.put(button_5_15.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_5_15.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_5_15.getText(), qty);
					price.put(button_5_15.getText(), 30);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_5_15.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_5_15.setBounds(486, 129, 109, 48);
		panel_5.add(button_5_15);
		
		JButton button_5_16 = new JButton("Vegetarian Hainanese Chicken Rice");
		button_5_16.setToolTipText("Vegetarian Hainanese Chicken Rice");
		button_5_16.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_5_16.getText())) {
					qty += 1;
					map.put(button_5_16.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_5_16.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_5_16.getText(), qty);
					price.put(button_5_16.getText(), 30);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_5_16.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_5_16.setBounds(10, 188, 109, 48);
		panel_5.add(button_5_16);
		
		JButton button_5_17 = new JButton("Vegetarian Fried Rice with Basil");
		button_5_17.setToolTipText("Vegetarian Fried Rice with Basil");
		button_5_17.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_5_17.getText())) {
					qty += 1;
					map.put(button_5_17.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_5_17.getText());
					totalPrice.setText(String.valueOf(total));
			}
				
				else {
					qty = 1;
					map.put(button_5_17.getText(), qty);
					price.put(button_5_17.getText(), 30);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_5_17.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_5_17.setBounds(129, 188, 109, 48);
		panel_5.add(button_5_17);
		
		JButton button_5_18 = new JButton("Tofu Larb + Rice");
		button_5_18.setToolTipText("Tofu Larb + Rice");
		button_5_18.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_5_18.getText())) {
					qty += 1;
					map.put(button_5_18.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_5_18.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_5_18.getText(), qty);
					price.put(button_5_18.getText(), 30);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_5_18.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_5_18.setBounds(248, 188, 109, 48);
		panel_5.add(button_5_18);
		
		JButton button_5_19 = new JButton("Mixed Egg Salad + Rice");
		button_5_19.setToolTipText("Mixed Egg Salad + Rice");
		button_5_19.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_5_19.getText())) {
					qty += 1;
					map.put(button_5_19.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_5_19.getText());
					totalPrice.setText(String.valueOf(total));
			}
				
				else {
					qty = 1;
					map.put(button_5_19.getText(), qty);
					price.put(button_5_19.getText(), 30);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_5_19.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_5_19.setBounds(367, 188, 109, 48);
		panel_5.add(button_5_19);
		
		JButton button_5_20 = new JButton("Vegetarian Red Sauce + Rice");
		button_5_20.setToolTipText("Vegetarian Red Sauce + Rice");
		button_5_20.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_5_20.getText())) {
					qty += 1;
					map.put(button_5_20.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_5_20.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_5_20.getText(), qty);
					price.put(button_5_20.getText(), 30);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_5_20.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_5_20.setBounds(486, 188, 109, 48);
		panel_5.add(button_5_20);
		
		JButton button_5_21 = new JButton("Mixed Vegetables + Rice");
		button_5_21.setToolTipText("Mixed Vegetables + Rice");
		button_5_21.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_5_21.getText())) {
					qty += 1;
					map.put(button_5_21.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_5_21.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_5_21.getText(), qty);
					price.put(button_5_21.getText(), 25);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_5_21.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_5_21.setBounds(10, 247, 109, 48);
		panel_5.add(button_5_21);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Misc.", null, panel_6, null);
		panel_6.setLayout(null);
		
		JButton button_35 = new JButton("+5");
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
					qty = 1;
					map.put(button_35.getText(), qty);
					price.put(button_35.getText(), 5);
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
		button_35.setToolTipText("+5 to total price");
		button_35.setBounds(252, 11, 109, 48);
		panel_6.add(button_35);
		
		JButton button_36 = new JButton("+10");
		button_36.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_36.getText())) {
					qty += 1;
					map.put(button_36.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_36.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_36.getText(), qty);
					price.put(button_36.getText(), 10);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_36.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_36.setToolTipText("+10 to total price");
		button_36.setBounds(371, 11, 109, 48);
		panel_6.add(button_36);
		
		JButton button_37 = new JButton("+15");
		button_37.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_37.getText())) {
					qty += 1;
					map.put(button_37.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_37.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_37.getText(), qty);
					price.put(button_37.getText(), 15);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_37.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_37.setToolTipText("+15 to total price");
		button_37.setBounds(490, 11, 109, 48);
		panel_6.add(button_37);
		
		JButton button_38 = new JButton("+1");
		button_38.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_38.getText())) {
					qty += 1;
					map.put(button_38.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_38.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_38.getText(), qty);
					price.put(button_38.getText(), 1);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_5_21.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_38.setToolTipText("+1 to total price");
		button_38.setBounds(10, 11, 109, 48);
		panel_6.add(button_38);
		
		JButton button_39 = new JButton("+3");
		button_39.addActionListener(new ActionListener() {
			private int qty = 1;
			public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
				if (map.containsKey(button_39.getText())) {
					qty += 1;
					map.put(button_39.getText(), qty);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_39.getText());
					totalPrice.setText(String.valueOf(total));
					
			}
				
				else {
					qty = 1;
					map.put(button_39.getText(), qty);
					price.put(button_39.getText(), 3);
					Iterator<String> test = map.keySet().iterator();
					while (test.hasNext()) {
					     String obj = (String)test.next();
					     //System.out.println(String.format("%s %d %d", obj, map.get(obj), price.get(obj)));
					     ee = ee + String.format("%s\t%d %d\n", obj, map.get(obj), price.get(obj)*map.get(obj));
					     
					}
					ee = ee + String.format("\n%s\n-----------------------------------------\n", date);
					receiptArea.setText(ee);
					total += price.get(button_39.getText());
					totalPrice.setText(String.valueOf(total));
					}
			}
		});
		button_39.setToolTipText("+3 to total price");
		button_39.setBounds(129, 11, 109, 48);
		panel_6.add(button_39);
		
//Panel 5 END
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(1041, 72, 223, 500);
		frmEisCafeteriaPos.getContentPane().add(scrollPane);
		
		
		receiptArea = new JTextArea();
		scrollPane.setViewportView(receiptArea);
		receiptArea.setEditable(false);
		
		totalPrice = new JTextField();
		totalPrice.setHorizontalAlignment(SwingConstants.TRAILING);
		totalPrice.setEditable(false);
		totalPrice.setBounds(1045, 613, 86, 20);
		frmEisCafeteriaPos.getContentPane().add(totalPrice);
		totalPrice.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Total Price");
		lblNewLabel_1.setBounds(939, 616, 72, 14);
		frmEisCafeteriaPos.getContentPane().add(lblNewLabel_1);
		
		amountPaid = new JTextField();
		amountPaid.setHorizontalAlignment(SwingConstants.TRAILING);
		amountPaid.setColumns(10);
		amountPaid.setBounds(1045, 582, 86, 20);
		frmEisCafeteriaPos.getContentPane().add(amountPaid);
		
		JLabel lblAmountPaid = new JLabel("Amount Paid");
		lblAmountPaid.setBounds(939, 583, 72, 14);
		frmEisCafeteriaPos.getContentPane().add(lblAmountPaid);
		
		change = new JTextField();
		change.setHorizontalAlignment(SwingConstants.TRAILING);
		change.setEditable(false);
		change.setBounds(1045, 644, 86, 20);
		frmEisCafeteriaPos.getContentPane().add(change);
		change.setColumns(10);
		
		JLabel lblChange = new JLabel("Change");
		lblChange.setBounds(939, 647, 72, 14);
		frmEisCafeteriaPos.getContentPane().add(lblChange);
		
		JButton btnNewButton_2 = new JButton("Clear");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				receiptArea.setText("");
				totalPrice.setText("");
				amountPaid.setText("");
				change.setText("");
				ee = "";
				total = 0;
				price.clear();
				map.clear();
				
			}
			
		});
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
				change.setText(String.valueOf(Integer.valueOf(amountPaid.getText())-Integer.valueOf(totalPrice.getText())));
			}
		});
		btnCalculate.setFont(new Font("Source Code Pro Light", Font.PLAIN, 13));
		btnCalculate.setBounds(1141, 632, 123, 40);
		frmEisCafeteriaPos.getContentPane().add(btnCalculate);
		
	
		
	}
}
