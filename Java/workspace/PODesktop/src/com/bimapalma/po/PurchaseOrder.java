package com.bimapalma.po;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;

public class PurchaseOrder {

	protected Shell shlPurchaseOrder;
	private Text text;
	private Text text_1;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			PurchaseOrder window = new PurchaseOrder();
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
		shlPurchaseOrder.open();
		shlPurchaseOrder.layout();
		while (!shlPurchaseOrder.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlPurchaseOrder = new Shell();
		shlPurchaseOrder.setSize(688, 466);
		shlPurchaseOrder.setText("Purchase Order Form");
		shlPurchaseOrder.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Composite mainPanel = new Composite(shlPurchaseOrder, SWT.NONE);
		mainPanel.setLayout(new GridLayout(1, false));
		
		Composite composite = new Composite(mainPanel, SWT.NONE);
		GridData gd_composite = new GridData(SWT.LEFT, SWT.TOP, true, false, 1, 1);
		gd_composite.heightHint = 79;
		gd_composite.widthHint = 241;
		composite.setLayoutData(gd_composite);
		
		Label lblPoNumber = new Label(composite, SWT.NONE);
		lblPoNumber.setBounds(10, 10, 72, 15);
		lblPoNumber.setText("PO Number");
		
		Label lblPurchaseType = new Label(composite, SWT.NONE);
		lblPurchaseType.setBounds(10, 31, 89, 15);
		lblPurchaseType.setText("Purchase Type");
		
		text = new Text(composite, SWT.BORDER);
		text.setBounds(118, 7, 76, 21);
		
		text_1 = new Text(composite, SWT.BORDER);
		text_1.setBounds(118, 34, 76, 21);
		
		Composite composite_1 = new Composite(mainPanel, SWT.NONE);
		GridData gd_composite_1 = new GridData(SWT.LEFT, SWT.TOP, false, true, 1, 1);
		gd_composite_1.heightHint = 193;
		gd_composite_1.widthHint = 659;
		composite_1.setLayoutData(gd_composite_1);
		
		Label lblPoItemDetails = new Label(composite_1, SWT.NONE);
		lblPoItemDetails.setBounds(10, 10, 95, 15);
		lblPoItemDetails.setText("PO Item Details");
		
		Composite composite_2 = new Composite(mainPanel, SWT.NONE);
		
		Composite composite_3 = new Composite(mainPanel, SWT.NONE);

	}
}
