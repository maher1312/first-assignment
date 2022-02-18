package assignment;

import java.util.*;

public class assignment {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in); 
	System.out.println("enter the following attributes of your car in the following order: ");
			System.out.println( "enter the tank capacity of your car in liters :") ;
	double tankCapacity=s.nextDouble();
	System.out.println("enter the efficiency of your car (distance in Km covered by only 1 liter of fuel )");
	double efficiency=s.nextDouble();
    System.out.println("enter the current amout of fuel found in your car in liters :");
    double fuelInTank=s.nextDouble();
	carAttributes(tankCapacity, efficiency,fuelInTank);//set the values of the attributes used by the car calculator to do the tasks 
	System.out.println("the car is out of fuel: "+isEmpty());// checks if the car is out of fuel 
	System.out.println("your car contains "+fuelInTank+" liters in the tank"+"it can hold "+fuelSpaceAvailable()+" liters till it is full");
	System.out.println("your car can travel "+distanceThatCanBeTraveled()+"km , by the fuel found in the tank");// shows the distance that your can travel using fuel found in it by dividing the fuel found by the car's efficiency 
	System.out.println("thank you for using the car efficiency app ");
	String comment;
	
		System.out.println("in case of any recomandation please leave a note ");
		comment = s.next();
	
	
	
	}
	
	
	private static  double  tankCapacity ;//method of type private so no one can access it from outside this class 
	private static double carEfficiency ;
	private static double fuelInCar ;
	
	public static void carAttributes (double tank, double efficiency, double fuelInTank) {// of type public so it can be used in other classes
		tankCapacity=tank;
		carEfficiency=efficiency;
		fuelInCar=fuelInTank;
	}
	public static boolean isEmpty() {//boolean type test to check if the fuel in the tank is 0 liters than it is empty
		boolean empty;
		if(fuelInCar==0) {empty=true;
			
		}else {
			empty=false;
		}
		return empty;
		
	}
	public static double fuelSpaceAvailable () {// subtracts the amount available from the max amount to check how much it can hold more 
		double fuelCapacityAvailable= tankCapacity-fuelInCar;
		return fuelCapacityAvailable ;
	}
	public static double distanceThatCanBeTraveled() {//a method used to calculate the distance that the car can travel with the fuel in its tank
		double distance = fuelInCar*carEfficiency;
		return distance;
	}
	
	
}
