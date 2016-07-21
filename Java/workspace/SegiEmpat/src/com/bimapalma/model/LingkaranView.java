package com.bimapalma.model;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class LingkaranView {

	protected Shell shlLingkaran;
	private Text txtJari;
	
	Lingkaran lingkaran;
	private Label luasLingkaran;
	private Label kelilingLingkaran;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			LingkaranView window = new LingkaranView();
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
		shlLingkaran.open();
		shlLingkaran.layout();
		while (!shlLingkaran.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlLingkaran = new Shell();
		shlLingkaran.setSize(450, 300);
		shlLingkaran.setText("Lingkaran");
		
		Label lblJarijari = new Label(shlLingkaran, SWT.NONE);
		lblJarijari.setBounds(21, 35, 55, 15);
		lblJarijari.setText("Jari-jari");
		
		txtJari = new Text(shlLingkaran, SWT.BORDER);
		txtJari.setBounds(108, 29, 76, 21);
		
		Label lblNewLabel = new Label(shlLingkaran, SWT.NONE);
		lblNewLabel.setBounds(21, 98, 55, 15);
		lblNewLabel.setText("Luas");
		
		Label lblKeliling = new Label(shlLingkaran, SWT.NONE);
		lblKeliling.setBounds(21, 119, 55, 15);
		lblKeliling.setText("Keliling");
		
		Button btnHitung = new Button(shlLingkaran, SWT.NONE);
		btnHitung.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				String strJari = txtJari.getText();
				
				lingkaran = new Lingkaran(strJari);
				
				luasLingkaran.setText(Integer.toString(lingkaran.hitungLuas()));
				kelilingLingkaran.setText(Integer.toString(lingkaran.hitungKeliling()));
			}
		});
		btnHitung.setBounds(108, 64, 75, 25);
		btnHitung.setText("Hitung");
		
		luasLingkaran = new Label(shlLingkaran, SWT.NONE);
		luasLingkaran.setBounds(108, 98, 55, 15);
		
		kelilingLingkaran = new Label(shlLingkaran, SWT.NONE);
		kelilingLingkaran.setBounds(108, 119, 55, 15);

	}

}
