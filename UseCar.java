package day7_objectwithconditions;

public class UseCar {
	public static void main(String[] args) {
		Car car1=new Car();
		car1.brand="BMW";
		car1.price=5000000;
		car1.color="Black";
		car1.isAutomaticGear=true;
		
		Car car2=new Car();
		car2.brand="Nano";
		car2.price=1000000;
		car2.color="Ash";
		car2.isAutomaticGear=false;
		
		if(car1.price>car2.price) {
			System.out.println(car1.price+" is highest");
		}
		else {
			System.out.println(car2.price+" is highest");
		}
		
		System.out.println("End of the program");
		
	}

}
