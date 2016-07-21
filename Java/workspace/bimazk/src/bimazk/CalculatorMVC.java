package bimazk;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Button;
import org.zkoss.zul.Intbox;

public class CalculatorMVC extends SelectorComposer<Component> {
	@Wire
	Intbox bil1;
	
	@Wire
	Intbox bil2;
	
	@Wire
	Intbox hasil;
	
	@Wire
	Button buttonHitung;
	
	@Listen("onClick=#buttonTambah")
	public void tambahInteger() {
		hasil.setValue(bil1.getValue() + bil2.getValue());
	}
	
	@Listen("onClick=#buttonKurang")
	public void kurangInteger() {
		hasil.setValue(bil1.getValue() - bil2.getValue());
	}
	
	@Listen("onClick=#buttonKali")
	public void kaliInteger() {
		hasil.setValue(bil1.getValue() * bil2.getValue());
	}
	
	@Listen("onClick=#buttonBagi")
	public void bagiInteger() {
		hasil.setValue(bil2.getValue() / bil1.getValue());
	}
}
