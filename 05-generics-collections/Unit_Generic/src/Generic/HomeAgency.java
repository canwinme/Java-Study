package Generic;

public class HomeAgency implements Rentable<Home>{
	public Home rent() {
		return new Home();
	}

}
