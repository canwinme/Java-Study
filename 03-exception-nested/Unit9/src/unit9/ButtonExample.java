package unit9;

public class ButtonExample {

	public static void main(String[] args) {
		Button btn0k = new Button();
		
		class OkListener implements Button.ClickListener{
			public void onClick() {
				System.out.println("Ok버튼클릭");
			}
		}
		
		btn0k.setClickListener(new OkListener());
		
		btn0k.click();
		
		Button btnCancel = new Button();
		
		class CancelListener implements Button.ClickListener{
			public void onClick() {
				System.out.println("Cancel 버튼 클릭");
			}
		}
		
		btnCancel.setClickListener(new CancelListener());
		
		btnCancel.click();
	}

}
