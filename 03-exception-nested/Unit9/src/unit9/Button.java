package unit9;

public class Button {
	public static interface ClickListener{
		void onClick();
	}
	
	private ClickListener clickListner;
	
	public void setClickListener(ClickListener clickListner) {
		this.clickListner = clickListner;
	}
	public void click() {
		this.clickListner.onClick();
	}
}
