import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.BorderLayout;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class CurrencyConvertor {

	private JFrame frame;
	private JTextField txtamount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CurrencyConvertor window = new CurrencyConvertor();
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
	public CurrencyConvertor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 524, 415);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter the Amount");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 77, 128, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFrom.setBounds(10, 158, 105, 27);
		frame.getContentPane().add(lblFrom);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTo.setBounds(10, 241, 68, 21);
		frame.getContentPane().add(lblTo);
		
		txtamount = new JTextField();
		txtamount.setBounds(190, 73, 166, 36);
		frame.getContentPane().add(txtamount);
		txtamount.setColumns(10);
		
		JComboBox txtfrom = new JComboBox();
		txtfrom.setFont(new Font("Times New Roman", Font.BOLD, 12));
		txtfrom.setModel(new DefaultComboBoxModel(new String[] {"USD", "CEDI", "POUNDS"}));
		txtfrom.setBounds(190, 142, 166, 36);
		frame.getContentPane().add(txtfrom);
		
		JComboBox txtto = new JComboBox();
		txtto.setFont(new Font("Times New Roman", Font.BOLD, 12));
		txtto.setModel(new DefaultComboBoxModel(new String[] {"CEDI", "POUNDS", "USD"}));
		txtto.setBounds(190, 226, 166, 36);
		frame.getContentPane().add(txtto);
		
		JButton jbtnConvert = new JButton("Convert");
		jbtnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Double tot;
				
				Double amount = Double.parseDouble(txtamount.getText());
				
				if(txtfrom.getSelectedItem().toString() == "USD" && txtto.getSelectedItem().toString()== "CEDI")
			    {
					tot = amount * 5.78;
					
		           JOptionPane.showMessageDialog(jbtnConvert, this, "Your Amount will be " + tot. toString(), 0);
			    }
				else if(txtfrom.getSelectedItem().toString() == "USD" && txtto.getSelectedItem().toString()== "POUNDS")
			    {
					tot = amount * 0.70;
					
		           JOptionPane.showMessageDialog(jbtnConvert, this, "Your Amount will be " + tot. toString(), 0);
			    }
				else if(txtfrom.getSelectedItem().toString() == "POUNDS" && txtto.getSelectedItem().toString()== "USD")
			    {
					tot = amount * 1.42;
					
		           JOptionPane.showMessageDialog(jbtnConvert, this, "Your Amount will be " + tot. toString(), 0);
			    }
				else if(txtfrom.getSelectedItem().toString() == "POUNDS" && txtto.getSelectedItem().toString()== "CEDI")
			    {
					tot = amount * 8.20;
					
		           JOptionPane.showMessageDialog(jbtnConvert, this, "Your Amount will be " + tot. toString(), 0);
			    }
		        	   else if(txtfrom.getSelectedItem().toString() == "CEDI" && txtto.getSelectedItem().toString()== "USD")
		        	   {
							tot = amount * 0.17;
							
				           JOptionPane.showMessageDialog(jbtnConvert, this, "Your Amount will be " + tot. toString(), 0);
		        	   }
				        	   else if(txtfrom.getSelectedItem().toString() == "CEDI" && txtto.getSelectedItem().toString()== "POUNDS")
							    {
									tot = amount * 0.12;
									
						           JOptionPane.showMessageDialog(jbtnConvert, this, "Your Amount will be " + tot. toString(), 0);
				           }
		}});
		jbtnConvert.setFont(new Font("Tahoma", Font.BOLD, 13));
		jbtnConvert.setBounds(375, 286, 105, 36);
		frame.getContentPane().add(jbtnConvert);
		
		JLabel lblNewLabel_1 = new JLabel("CURRENCY CONVERTER");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(197, 11, 217, 27);
		frame.getContentPane().add(lblNewLabel_1);
	}

	}


