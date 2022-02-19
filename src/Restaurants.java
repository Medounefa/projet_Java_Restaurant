import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import java.awt.Choice;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Restaurants {

	private JFrame frame;
	private JTextField jTxtChicBurger;
	private JTextField jTxtChicBurgerMeal;
	private JTextField jTxtBCBuger;
	private JPanel panel_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField jTxtQty;
	private JTextField jTxtConvert;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurants window = new Restaurants();
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
	public Restaurants() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1368, 1289);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel.setBounds(62, 64, 619, 298);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Chicken Burger");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(27, 22, 206, 32);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Chicken Burger Meal");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1_1.setBounds(27, 65, 229, 29);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Cheese Burger");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1_2.setBounds(27, 105, 206, 29);
		panel.add(lblNewLabel_1_2);
		
		jTxtChicBurger = new JTextField();
		jTxtChicBurger.setBounds(301, 22, 229, 32);
		panel.add(jTxtChicBurger);
		jTxtChicBurger.setColumns(10);
		
		jTxtChicBurgerMeal = new JTextField();
		jTxtChicBurgerMeal.setColumns(10);
		jTxtChicBurgerMeal.setBounds(301, 65, 229, 32);
		panel.add(jTxtChicBurgerMeal);
		
		jTxtBCBuger = new JTextField();
		jTxtBCBuger.setColumns(10);
		jTxtBCBuger.setBounds(301, 105, 229, 32);
		panel.add(jTxtBCBuger);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("DRINK");
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1_2_2.setBounds(27, 172, 206, 29);
		panel.add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("Qty");
		lblNewLabel_1_2_3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1_2_3.setBounds(301, 172, 206, 29);
		panel.add(lblNewLabel_1_2_3);
		
		jTxtQty = new JTextField();
		jTxtQty.setColumns(10);
		jTxtQty.setBounds(301, 212, 229, 32);
		panel.add(jTxtQty);
		
		final JCheckBox chckbTax = new JCheckBox("Tax");
		chckbTax.setFont(new Font("Tahoma", Font.BOLD, 20));
		chckbTax.setBounds(301, 261, 79, 29);
		panel.add(chckbTax);
		
		final JCheckBox chcDev = new JCheckBox("Home Delivery");
		chcDev.setFont(new Font("Tahoma", Font.BOLD, 20));
		chcDev.setBounds(23, 267, 173, 23);
		panel.add(chcDev);
		
		final JComboBox jCmdDink = new JComboBox();
		jCmdDink.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jCmdDink.setModel(new DefaultComboBoxModel(new String[] {"Select a Drink", "Apple Juice", "Tea", "Cola", "Coke", "Coffee", "Ice Tea", "Ice Coffee", "Orange"}));
		jCmdDink.setBounds(27, 212, 198, 32);
		panel.add(jCmdDink);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(62, 172, 500, -5);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(27, 159, 500, 2);
		panel.add(separator_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1.setBounds(704, 64, 248, 298);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		final JComboBox jCmdCurrenty = new JComboBox();
		jCmdCurrenty.setModel(new DefaultComboBoxModel(new String[] {"Choose one..", "USA", "Nigeria", "Kenyan", "Canada", "Brazil", "Indonesia", "Philipine", "India"}));
		jCmdCurrenty.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jCmdCurrenty.setBounds(25, 25, 198, 32);
		panel_1.add(jCmdCurrenty);
		
		jTxtConvert = new JTextField();
		jTxtConvert.setColumns(10);
		jTxtConvert.setBounds(25, 76, 204, 44);
		panel_1.add(jTxtConvert);
		
		final JLabel jlblConvert = new JLabel("");
		jlblConvert.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblConvert.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblConvert.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblConvert.setBounds(25, 140, 204, 32);
		panel_1.add(jlblConvert);
		
		JButton jBtnConvert = new JButton("Convert");
		jBtnConvert.setFont(new Font("Tahoma", Font.BOLD, 20));
		jBtnConvert.setBounds(10, 228, 118, 23);
		panel_1.add(jBtnConvert);
		
		JButton jBtnClose = new JButton("Close");
		jBtnClose.setFont(new Font("Tahoma", Font.BOLD, 20));
		jBtnClose.setBounds(138, 228, 91, 23);
		panel_1.add(jBtnClose);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1_1.setBounds(704, 386, 248, 173);
		frame.getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Tax");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(24, 31, 57, 20);
		panel_1_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Sub Total");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(24, 69, 100, 20);
		panel_1_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Total");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(24, 113, 46, 20);
		panel_1_1.add(lblNewLabel_5);
		
		final JLabel jlblTax = new JLabel("");
		jlblTax.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblTax.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblTax.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblTax.setBounds(117, 19, 110, 32);
		panel_1_1.add(jlblTax);
		
		final JLabel jlblSubTax = new JLabel("");
		jlblSubTax.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblSubTax.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblSubTax.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblSubTax.setBounds(117, 62, 110, 32);
		panel_1_1.add(jlblSubTax);
		
		final JLabel jlblTotal = new JLabel("");
		jlblTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblTotal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblTotal.setBounds(117, 101, 110, 32);
		panel_1_1.add(jlblTotal);
		
		panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_2.setBounds(62, 386, 619, 173);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1_3 = new JLabel("Cost of Drinks");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1_3.setBounds(24, 28, 206, 32);
		panel_2.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Cost of Meal");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1_1_1.setBounds(24, 71, 229, 29);
		panel_2.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Cost of Delivery");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1_2_1.setBounds(24, 111, 206, 29);
		panel_2.add(lblNewLabel_1_2_1);
		
		final JLabel jlblCostOfDrink = new JLabel("");
		jlblCostOfDrink.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblCostOfDrink.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblCostOfDrink.setBounds(311, 28, 224, 32);
		jlblCostOfDrink.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.add(jlblCostOfDrink);
		
		final JLabel jlblCostOfMeal = new JLabel("0");
		jlblCostOfMeal.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblCostOfMeal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblCostOfMeal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblCostOfMeal.setBounds(311, 68, 224, 32);
		panel_2.add(jlblCostOfMeal);
		
		final JLabel jlblCostOfDelivery = new JLabel("");
		jlblCostOfDelivery.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblCostOfDelivery.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblCostOfDelivery.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblCostOfDelivery.setBounds(311, 111, 224, 32);
		panel_2.add(jlblCostOfDelivery);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1_2.setBounds(986, 59, 311, 500);
		frame.getContentPane().add(panel_1_2);
		panel_1_2.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(20, 32, 281, 457);
		panel_1_2.add(tabbedPane);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_3, null);
		panel_3.setLayout(null);
		
		textField_4 = new JTextField();
		textField_4.setBounds(10, 11, 256, 407);
		panel_3.add(textField_4);
		textField_4.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_4, null);
		panel_4.setLayout(null);
		
		JButton btnNewButton = new JButton("<-");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(22, 111, 50, 41);
		panel_4.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("C");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(82, 111, 50, 41);
		panel_4.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("%");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.setBounds(142, 111, 50, 41);
		panel_4.add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("+");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1.setBounds(202, 111, 50, 41);
		panel_4.add(btnNewButton_1_1);
		
		JButton btnNewButton_3 = new JButton("7");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_3.setBounds(24, 163, 50, 41);
		panel_4.add(btnNewButton_3);
		
		JButton btnNewButton_1_2 = new JButton("8");
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_2.setBounds(84, 163, 50, 41);
		panel_4.add(btnNewButton_1_2);
		
		JButton btnNewButton_2_1 = new JButton("9");
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2_1.setBounds(144, 163, 50, 41);
		panel_4.add(btnNewButton_2_1);
		
		JButton btnNewButton_1_1_1 = new JButton("-");
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1_1.setBounds(204, 163, 50, 41);
		panel_4.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_4.setBounds(24, 215, 50, 41);
		panel_4.add(btnNewButton_4);
		
		JButton btnNewButton_1_3 = new JButton("5");
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_3.setBounds(84, 215, 50, 41);
		panel_4.add(btnNewButton_1_3);
		
		JButton btnNewButton_2_2 = new JButton("6");
		btnNewButton_2_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2_2.setBounds(144, 215, 50, 41);
		panel_4.add(btnNewButton_2_2);
		
		JButton btnNewButton_1_1_2 = new JButton("*");
		btnNewButton_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1_2.setBounds(204, 215, 50, 41);
		panel_4.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_5 = new JButton("1");
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_5.setBounds(24, 267, 50, 41);
		panel_4.add(btnNewButton_5);
		
		JButton btnNewButton_1_4 = new JButton("2");
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_4.setBounds(84, 267, 50, 41);
		panel_4.add(btnNewButton_1_4);
		
		JButton btnNewButton_2_3 = new JButton("3");
		btnNewButton_2_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2_3.setBounds(144, 267, 50, 41);
		panel_4.add(btnNewButton_2_3);
		
		JButton btnNewButton_1_1_3 = new JButton("/");
		btnNewButton_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1_3.setBounds(204, 267, 50, 41);
		panel_4.add(btnNewButton_1_1_3);
		
		JButton btnNewButton_6 = new JButton("0");
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_6.setBounds(24, 319, 50, 41);
		panel_4.add(btnNewButton_6);
		
		JButton btnNewButton_1_5 = new JButton(".");
		btnNewButton_1_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_5.setBounds(84, 319, 50, 41);
		panel_4.add(btnNewButton_1_5);
		
		JButton btnNewButton_2_4 = new JButton("#");
		btnNewButton_2_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2_4.setBounds(144, 319, 50, 41);
		panel_4.add(btnNewButton_2_4);
		
		JButton btnNewButton_1_1_4 = new JButton("=");
		btnNewButton_1_1_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1_4.setBounds(204, 319, 50, 41);
		panel_4.add(btnNewButton_1_1_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(22, 46, 230, 41);
		panel_4.add(textField_3);
		textField_3.setColumns(10);
		
		
		
		
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_2_1.setBounds(62, 584, 1235, 93);
		frame.getContentPane().add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JButton jBtnExit = new JButton("Exit");
		jBtnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		jBtnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		jBtnExit.setBounds(796, 34, 89, 23);
		panel_2_1.add(jBtnExit);
		
		JButton jBtnReset = new JButton("Reset");
		jBtnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jlblCostOfDelivery.setText(null);
				jTxtChicBurger.setText(null);
				jTxtChicBurgerMeal.setText(null);
				jTxtBCBuger.setText(null);
				jTxtQty.setText(null);
				jlblCostOfDrink.setText(null);
				jTxtConvert.setText(null);
				jCmdDink.setSelectedItem("Select a Drink");
				jCmdCurrenty.setSelectedItem("Choose one..");
				chcDev.setText(null);
				jlblCostOfMeal.setText("0");
				jlblCostOfDelivery.setText(null);
				chcDev.setText(null);
				jTxtConvert.setText(null);
				jlblConvert.setText(null);
				jlblTax.setText(null);
				jlblSubTax.setText(null);
				jlblTotal.setText(null);
				chckbTax.setText(null);
				
				
				
			}
		});
		jBtnReset.setFont(new Font("Tahoma", Font.BOLD, 20));
		jBtnReset.setBounds(653, 34, 98, 23);
		panel_2_1.add(jBtnReset);
		
		JButton jBtnReceipt = new JButton("Receipt");
		jBtnReceipt.setFont(new Font("Tahoma", Font.BOLD, 20));
		jBtnReceipt.setBounds(490, 34, 128, 23);
		panel_2_1.add(jBtnReceipt);
		
		JButton jBtnTotal = new JButton("Total");
		jBtnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				double ChicBurger = Double.parseDouble(jTxtChicBurgerMeal.getText());
				double IchicBurger = 2.39;
				double Burger;
				
				Burger = (ChicBurger * IchicBurger);
				String pMeal = String.format("%.2f", Burger);
				jlblCostOfMeal.setText(pMeal);
				
				double ChicBurgerMeal = Double.parseDouble(jTxtChicBurger.getText());
				double IchicBurgerMeal = 4.39;
				double BurgerMeal;
				
				BurgerMeal = (ChicBurgerMeal * IchicBurgerMeal);
				String cbMeal = String.format("%.2f", BurgerMeal + Burger);
				jlblCostOfMeal.setText(cbMeal);
				
				
				double CheeseBurger = Double.parseDouble(jTxtBCBuger.getText());
				double cheeseBurgerPrice = 3.39;
				double cheeseBurgerMeal;
				
				cheeseBurgerMeal = (cheeseBurgerPrice * CheeseBurger);
				String cheese = String.format("%.2f", cheeseBurgerMeal + BurgerMeal + Burger);
				jlblCostOfMeal.setText(cheese);
				
				
				double iDelivery = 3.39;
				
				if(chcDev.isSelected()) {
					String pDelivery = String.format("%.2f", iDelivery);
					jlblCostOfDelivery.setText(pDelivery);
				}else {
					jlblCostOfDelivery.setText("0");
				}
				
       //--------------------------------Drinks--------------------
				
				double Drinks = Double.parseDouble(jTxtQty.getText());
				double Tea = 1.20 * Drinks;
				double Ice_Tea = 0.90 * Drinks;
				double Coffee = 2.50 * Drinks;
				double Ice_Coffee = 1.10 * Drinks;
				double Cola = 2.10 * Drinks;
				double Coke = 1.70 * Drinks;
				double Orange = 1.70 * Drinks;
				double Apple_Juice = 1.99 * Drinks;
				
				
				if(jCmdDink.getSelectedItem().equals("Apple Juice")) {
					String cApple_Juice = String.format("%.2f", Apple_Juice);
					jlblCostOfDrink.setText(cApple_Juice);
				}
				if(jCmdDink.getSelectedItem().equals("Tea")) {
					String cTea = String.format("%.2f", Tea);
					jlblCostOfDrink.setText(cTea);
				}
				if(jCmdDink.getSelectedItem().equals("Ice Tea")) {
					String cIce_Tea = String.format("%.2f", Ice_Tea);
					jlblCostOfDrink.setText(cIce_Tea);
				}
				if(jCmdDink.getSelectedItem().equals("Coke")) {
					String cCoke = String.format("%.2f", Coke);
					jlblCostOfDrink.setText(cCoke);
				}
				if(jCmdDink.getSelectedItem().equals("Cola")) {
					String cCola = String.format("%.2f", Cola);
					jlblCostOfDrink.setText(cCola);
				}
				if(jCmdDink.getSelectedItem().equals("Coffee")) {
					String cCoffee = String.format("%.2f", Coffee);
					jlblCostOfDrink.setText(cCoffee);
				}
				if(jCmdDink.getSelectedItem().equals("Ice Coffee")) {
					String cIce_Coffee = String.format("%.2f", Ice_Coffee);
					jlblCostOfDrink.setText(cIce_Coffee);
				}
				if(jCmdDink.getSelectedItem().equals("Orange")) {
					String cOrange = String.format("%.2f", Orange);
					jlblCostOfDrink.setText(cOrange);
				}
				if(jCmdDink.getSelectedItem().equals("Select a Drinkl")) {
					jlblCostOfDrink.setText("0");
				}
              //=======================================Tax==========	
				
				double cTotal1 = Double.parseDouble(jlblCostOfDrink.getText());
				double cTotal2 = Double.parseDouble(jlblCostOfMeal.getText());
				double cTotal3 = Double.parseDouble(jlblCostOfDelivery.getText());
				double AllTotal = (cTotal1 + cTotal2 + cTotal3)/100;
				
				if(chckbTax.isSelected()) {
					 String iTotal = String.format("%.2f", AllTotal);
					 jlblTax.setText(iTotal);
				}
				
			}
		});
		jBtnTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		jBtnTotal.setBounds(343, 34, 89, 23);
		panel_2_1.add(jBtnTotal);
		
		JLabel lblNewLabel = new JLabel("Loan Management System");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(408, 11, 681, 49);
		frame.getContentPane().add(lblNewLabel);
	}
}
