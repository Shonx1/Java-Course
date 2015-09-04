import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.awt.event.ActionEvent;

public class CreateNewItem extends JDialog {

	private Item mainItem;
	
	public Item getMainItem(){
		return mainItem;
	}

	/**
	 * Create the dialog.
	 */
	public CreateNewItem() {
		setTitle("CREATE NEW ITEM");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JButton btnAddNewItem = new JButton("Add New Item");
		
		JFormattedTextField formattedNameTextField = new JFormattedTextField();
		formattedNameTextField.setBounds(177, 22, 178, 33);
		getContentPane().add(formattedNameTextField);
		
		JFormattedTextField formattedBarcodeTextField = new JFormattedTextField("{0,number,#}");
		formattedBarcodeTextField.setBounds(177, 66, 178, 33);
		formattedBarcodeTextField.setValue(new Long(0L));
		getContentPane().add(formattedBarcodeTextField);
		
		JFormattedTextField formattedPriceTextField = new JFormattedTextField();
		formattedPriceTextField.setBounds(177, 110, 178, 33);
		formattedPriceTextField.setValue(new Double(0d));
		getContentPane().add(formattedPriceTextField);
		
		JFormattedTextField formattedCountTextField = new JFormattedTextField();
		formattedCountTextField.setBounds(177, 154, 178, 33);
		formattedCountTextField.setValue(new Integer(0));
		getContentPane().add(formattedCountTextField);
		
		btnAddNewItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mainItem = new Item();
				NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
				
				String name = formattedNameTextField.getText();
				long barcode = 0;
				double price = 0;
				int count = 0;
				try {
					barcode = numberFormat.parse(formattedBarcodeTextField.getText()).longValue();
					price = numberFormat.parse(formattedPriceTextField.getText()).doubleValue();
					count = numberFormat.parse(formattedCountTextField.getText()).intValue();
				} catch (ParseException ex) {
					JOptionPane.showMessageDialog(null, "Error parsing!");
					ex.printStackTrace();
				}

				if (formattedNameTextField.getText() == null || formattedNameTextField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter a name!");
					
				} else if (formattedBarcodeTextField.getText() == null || 
						formattedBarcodeTextField.getText().equals("") ||
						barcode <= 0) {
							JOptionPane.showMessageDialog(null, "Please enter a barcode greater than 0!");	
				} else if (formattedPriceTextField.getText() == null || 
						formattedPriceTextField.getText().equals("") ||
						price < 0)
						 {
					JOptionPane.showMessageDialog(null, "Please enter a valid and positive price!");
					
				} else if (formattedCountTextField.getText() == null || 
						formattedCountTextField.getText().equals("") ||
						count < 0) {
					JOptionPane.showMessageDialog(null, "Please enter a count greater than 0!");
					
				} else {
					mainItem.setName(name);
					mainItem.setBarcode(barcode);
					mainItem.setPrice(price);
					mainItem.setCount(count);
					setVisible(false);
				}
			}
		});
		btnAddNewItem.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAddNewItem.setBounds(10, 206, 195, 33);
		getContentPane().add(btnAddNewItem);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblName.setBounds(28, 23, 129, 26);
		getContentPane().add(lblName);
		
		JLabel lblBarcode = new JLabel("Barcode:");
		lblBarcode.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBarcode.setBounds(28, 67, 129, 26);
		getContentPane().add(lblBarcode);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPrice.setBounds(28, 111, 129, 26);
		getContentPane().add(lblPrice);
		
		JLabel lblCount = new JLabel("Count:");
		lblCount.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCount.setBounds(28, 155, 129, 26);
		getContentPane().add(lblCount);
		

	
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCancel.setBounds(229, 206, 195, 33);
		getContentPane().add(btnCancel);

	}
}