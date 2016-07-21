package com.bimapalma.model;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class SegiEmpatView {

	protected Shell shell;
	private Text tinggiInput;
	private Text lebarInput;
	private Label lblKeliling;
	private Label hasilLuas;
	private Label hasilKeliling;
	
	PersegiEmpat persegiEmpat;
	private Label warning;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			SegiEmpatView window = new SegiEmpatView();
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
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(21, 24, 66, 15);
		lblNewLabel.setText("Segi Empat");
		
		Label lblTinggi = new Label(shell, SWT.NONE);
		lblTinggi.setBounds(21, 55, 40, 15);
		lblTinggi.setText("Tinggi");
		
		Label lblLebar = new Label(shell, SWT.NONE);
		lblLebar.setBounds(21, 80, 40, 15);
		lblLebar.setText("Lebar");
		
		tinggiInput = new Text(shell, SWT.BORDER);
		tinggiInput.setBounds(67, 55, 94, 21);
		
		lebarInput = new Text(shell, SWT.BORDER);
		lebarInput.setBounds(67, 80, 94, 21);
		
		Label lblLuas = new Label(shell, SWT.NONE);
		lblLuas.setBounds(202, 55, 55, 15);
		lblLuas.setText("Luas");
		
		lblKeliling = new Label(shell, SWT.NONE);
		lblKeliling.setBounds(202, 80, 55, 15);
		lblKeliling.setText("Keliling");
		
		Button btnHitung = new Button(shell, SWT.NONE);
		
		btnHitung.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				String strTinggi = tinggiInput.getText();
				String strLebar = lebarInput.getText();
				
				if (validate(strTinggi) && validate(strLebar)) {
					
				
//				int tinggi = Integer.valueOf(strTinggi);
//				int lebar = Integer.valueOf(strLebsar);
//				int luas = tinggi * lebar;
//				int keliling = 2*tinggi + 2*lebar;
				
				persegiEmpat = new PersegiEmpat(strTinggi, Integer.parseInt(strLebar));
				
				
				hasilLuas.setText(Integer.toString(persegiEmpat.hitungLuas()));
				hasilKeliling.setText(Integer.toString(persegiEmpat.hitungKeliling()));
				warning.setText("");
				} else {
					System.out.println("Harap memasukkan angka!");
					warning.setText("Harap memasukkan angka!");
				}
			}
			
			
		});
		btnHitung.setBounds(86, 121, 75, 25);
		btnHitung.setText("Hitung");
		
		hasilLuas = new Label(shell, SWT.NONE);
		hasilLuas.setBounds(265, 55, 55, 15);
		
		hasilKeliling = new Label(shell, SWT.NONE);
		hasilKeliling.setBounds(263, 80, 55, 15);
		
		warning = new Label(shell, SWT.NONE);
		warning.setBounds(36, 166, 238, 25);

	}
	public boolean validate(String input) {
		boolean isValid = false;
		try {
			int number = Integer.valueOf(input);
			isValid = true;
		} catch (Exception e) {
			isValid = false;
		}
		
		return isValid;
	}
}
