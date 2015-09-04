import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.awt.event.ActionEvent;

public class StorageSystem {

	private JFrame frmStorageSystem;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StorageSystem window = new StorageSystem();
					window.frmStorageSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StorageSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStorageSystem = new JFrame();
		frmStorageSystem.setTitle("STORAGE SYSTEM");
		frmStorageSystem.setBounds(100, 100, 800, 600);
		frmStorageSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStorageSystem.getContentPane().setLayout(null);
		
		
		JButton btnNewButton = new JButton("Add New Item");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateNewItem dialog = new CreateNewItem();
				dialog.setModal(true);
				dialog.setVisible(true);

				Item item = dialog.getMainItem();
				
				if (item != null) {
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					model.addRow(new Object[] { item.getName(), item.getBarcode(),
							item.getPrice(), item.getCount(), item.getTotalPrice() });
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(10, 506, 141, 33);
		frmStorageSystem.getContentPane().add(btnNewButton);
		
		JButton btnEditItem = new JButton("Edit Item");
		btnEditItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int[] selectedRow = table.getSelectedRows();
				 if (selectedRow.length == 1){
					String name = (String) table.getValueAt(selectedRow[0], 0);
					long barcode = (long) table.getValueAt(selectedRow[0], 1);
					double price = (double) table.getValueAt(selectedRow[0], 2);
					int count = (int) table.getValueAt(selectedRow[0], 3);
					Item item = new Item(name, barcode, price, count);
					EditItem dialog = new EditItem(item);
					dialog.setModal(true);
					dialog.setVisible(true);
					item = dialog.getMainItem();
					table.setValueAt(item.getName(), selectedRow[0], 0);
					table.setValueAt(item.getBarcode(), selectedRow[0], 1);
					table.setValueAt(item.getPrice(), selectedRow[0], 2);
					table.setValueAt(item.getCount(), selectedRow[0], 3);
					table.setValueAt(item.getTotalPrice(), selectedRow[0], 4);
				 }
			}
		});
		btnEditItem.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEditItem.setBounds(161, 506, 141, 33);
		frmStorageSystem.getContentPane().add(btnEditItem);
		
		JButton btnDeleteItem = new JButton("Delete Item");
		btnDeleteItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 DefaultTableModel model = (DefaultTableModel) table.getModel();
				   int rows = table.getSelectedRow();
				   model.removeRow(rows);

			}
		});
		btnDeleteItem.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDeleteItem.setBounds(312, 506, 141, 33);
		frmStorageSystem.getContentPane().add(btnDeleteItem);
		
		JButton btnExport = new JButton("Export");
		btnExport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					JFileChooser fileChooser = new JFileChooser();
					fileChooser.setFileFilter(new FileNameExtensionFilter("Storage System File", "sss"));
					fileChooser.showDialog(null, "Choose...");
					
					File file = fileChooser.getSelectedFile();
					if (file == null){
						return;
					}
					String path = file.getPath();
					if (path == null){
						return;
					}
			
					path = path.endsWith(".sss") ? path : path + ".sss";
					
					FileWriter fileStream = new FileWriter(path);
					BufferedWriter writer = new BufferedWriter(fileStream);

					ArrayList<String> list = new ArrayList<String>();

			        int rowCount = table.getRowCount();
			        		        
			        for (int i = 0; i < rowCount; i++) {
			        		String line = String.format("%s;%s;%s;%s", table.getValueAt(i, 0),
							        								   table.getValueAt(i, 1), 
							        								   table.getValueAt(i, 2),
							        								   table.getValueAt(i, 3));
					        list.add(line);
			        }
					
					for (String line : list) {
						writer.append(line);
						writer.newLine();
					}
					
					writer.close();
					
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Error while saving file!");
				}
				JOptionPane.showMessageDialog(null, "Successfully saved file!");
			}
		});
		btnExport.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnExport.setBounds(463, 506, 141, 33);
		frmStorageSystem.getContentPane().add(btnExport);
		
		JButton btnImport = new JButton("Import");
		btnImport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					JFileChooser fileChooser = new JFileChooser();
					fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files", "sss"));
					fileChooser.showDialog(null, "Choose...");
					
					File file = fileChooser.getSelectedFile();
					
					List<String> fileContent = Files.readAllLines(file.toPath());
					
					for (String line : fileContent) {
						
						NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
						String[] row = line.split(";");
						String name = row[0];
						long barcode = 0;
						double price = 0;
						int count = 0;
						try {
							barcode = numberFormat.parse(row[1]).longValue();
							price = numberFormat.parse(row[2]).doubleValue();
							count = numberFormat.parse(row[3]).intValue();
							
						} catch (ParseException exx) {
							//JOptionPane.showMessageDialog(null, "Error parsing!");
							throw exx;
							//ex.printStackTrace();
						}
						Item item = new Item(name,barcode, price, count);
						DefaultTableModel model = (DefaultTableModel) table.getModel();
						model.addRow(new Object[] { item.getName(), item.getBarcode(),
								item.getPrice(), item.getCount(), item.getTotalPrice() });

					
					}
					JOptionPane.showMessageDialog(null, "Successfully loaded file!");
				}	 
				catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Error while loading file!");
				}	
				
				
			}
		});
		btnImport.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnImport.setBounds(614, 506, 141, 33);
		frmStorageSystem.getContentPane().add(btnImport);
		
		Object[][] rowData = new Object[0][5];
		Object[] columnNames = { "Name", "Barcode", "Price", "Count", "Total Price" };
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 11, 734, 484);
		frmStorageSystem.getContentPane().add(scrollPane);
		
		table = new JTable();
		table = new JTable(new DefaultTableModel(rowData, columnNames));
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(table);
	}
}