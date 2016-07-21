package com.bimapalma.view;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

import com.bimapalma.model.Item;

public class AppWindow {

	protected Shell shell;
	private Text txtJumlah;
	private Text txHarga;
	private Text txtIdKey;
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Daay11");
	private Text txtItemName;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			AppWindow window = new AppWindow();
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
		
		Label lblNamaItem = new Label(shell, SWT.NONE);
		lblNamaItem.setBounds(10, 30, 67, 15);
		lblNamaItem.setText("Nama Item");
		
		Label lblJumlah = new Label(shell, SWT.NONE);
		lblJumlah.setBounds(10, 62, 55, 15);
		lblJumlah.setText("Jumlah");
		
		Label lblHarga = new Label(shell, SWT.NONE);
		lblHarga.setBounds(10, 99, 55, 15);
		lblHarga.setText("Harga");
		
		Label lblIdKey = new Label(shell, SWT.NONE);
		lblIdKey.setBounds(10, 177, 55, 15);
		lblIdKey.setText("ID Key");
		
		txtItemName = new Text(shell, SWT.BORDER);
		txtItemName.setBounds(96, 27, 164, 21);
		
		txtJumlah = new Text(shell, SWT.BORDER);
		txtJumlah.setBounds(96, 54, 76, 21);
		
		txHarga = new Text(shell, SWT.BORDER);
		txHarga.setBounds(96, 81, 76, 21);
		
		Button btnSimpan = new Button(shell, SWT.NONE);
		btnSimpan.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				Item item = new Item();
				item.setItemName(txtIdKey.getText());
				item.setPrice(Double.parseDouble(txHarga.getText()));
				item.setQuantity(Integer.parseInt(txtJumlah.getText()));
				
				EntityManager em = emf.createEntityManager();
				em.getTransaction().begin();
				em.persist(item);
				em.getTransaction().commit();
				em.close();
			}
		});
		btnSimpan.setBounds(99, 126, 75, 25);
		btnSimpan.setText("Simpan");
		
		Button btnBaru = new Button(shell, SWT.NONE);
		btnBaru.setBounds(205, 126, 75, 25);
		btnBaru.setText("Baru");
		
		txtIdKey = new Text(shell, SWT.BORDER);
		txtIdKey.setBounds(96, 177, 76, 21);
		
		Button btnCari = new Button(shell, SWT.NONE);
		btnCari.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				//int key = Integer.parseInt();
			}
		});
		btnCari.setBounds(194, 177, 75, 25);
		btnCari.setText("Cari");
		
		Label label = new Label(shell, SWT.SEPARATOR | SWT.HORIZONTAL);
		label.setBounds(10, 157, 396, 13);

	}
}
