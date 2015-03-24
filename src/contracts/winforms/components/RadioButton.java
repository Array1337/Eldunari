package contracts.winforms.components;

import javax.swing.JRadioButton;

import contracts.kernel.interfaces.IComponent;

public class RadioButton extends JRadioButton implements IComponent{
	private static final long serialVersionUID = -4187208235979508932L;

	private String tag;
	
	public void setTag(String value){
		this.tag = value;
	}
	public String getTag(){
		return this.tag;
	}
	
}
