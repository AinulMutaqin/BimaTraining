package com.bimapalma.view;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

public class POWindow {

	protected Shell shell;
	private Text text;
	private Table table;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			POWindow window = new POWindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		Label lblPoNumber = new Label(shell, SWT.NONE);
		lblPoNumber.setBounds(10, 29, 71, 15);
		lblPoNumber.setText("PO Number");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(119, 29, 189, 21);
		
		table = new Table(shell, SWT.BORDER | SWT.FULL_SELECTION);
		table.setBounds(10, 61, 390, 152);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn tblclmnItemName = new TableColumn(table, SWT.NONE);
		tblclmnItemName.setWidth(100);
		tblclmnItemName.setText("Item Name");
		
		TableColumn tblclmnPrice = new TableColumn(table, SWT.NONE);
		tblclmnPrice.setWidth(100);
		tblclmnPrice.setText("Price");
		
		TableColumn tblclmnQuantity = new TableColumn(table, SWT.NONE);
		tblclmnQuantity.setWidth(100);
		tblclmnQuantity.setText("Quantity");
		
		TableItem tableItem = new TableItem(table, SWT.NONE);
		tableItem.setText(0, "Pupuk Urea");
		
		
	}
}
