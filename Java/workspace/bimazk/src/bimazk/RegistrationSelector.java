package bimazk;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Button;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Textbox;

public class RegistrationSelector extends SelectorComposer<Component> {
	@Wire
	Textbox nameBox;
	
	@Wire
	private Button submitButton; //harus sama dengan ID pada view.zul
	
	@Wire
	private Checkbox acceptTermBox;
	
	@Listen("onCheck = #acceptTermBox")
	public void changeSubmitStatus() {
		if (acceptTermBox.isChecked()) {
			submitButton.setDisabled(false);
			System.out.println(nameBox.getText());
		} else {
			submitButton.setDisabled(true);
			submitButton.setImage("");
		}
	}
}
