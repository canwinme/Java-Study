package unit5;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxspeed;
	
	Car(){}
	
	Car(String model){
		this(model,"은색",250);
	}
	Car(String model, String color){
		this(model,color,20);
			}
	Car(String model, String color,int maxspeed){
		this.model=model;
		this.color=color;
		this.maxspeed=maxspeed;
	}
	
}

