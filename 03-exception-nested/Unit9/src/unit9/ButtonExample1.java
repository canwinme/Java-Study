package unit9;

public class ButtonExample1 {

	public static void main(String[] args) {
		Button btnOK = new Button();
		
		btnOK.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("OK 버튼 클릭");
				
			}
		});
		
		btnOK.click();
		
		Button btnCancel = new Button();
		
		btnCancel.setClickListener(new Button.ClickListener() {
			public void onClick() {
				System.out.println("Cancel 버튼 클릭");
			}
		});
		btnCancel.click();
	}

}
