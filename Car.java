// car

/**
 * Lab 10 Vehicle class
 * @author Robin M. Givens
 *
 */
 public class Car extends Vehicle {
	
 	private int numDoors;
 	private int numPass;
 	 
 	public Car(String make, String model, String plate, int doors, int passengers){
 		super(make, model, plate);
 		this.numDoors = 4;
 		this.numPass = 1;
 	} // end car constructor
 	 
 	public int getDoors(){
 		return this.numDoors;
 	} 
 	
 	public int getPass(){
 		return this.numPass;
 	}
 	
 	@Override
 	public String toString(){
 		String totalString = "";
 		totalString = String.format("%d-door %s %s with license %s.", this.numDoors, super.getMake(), super.getModel(), super.getPlate());
 		return totalString;
 	}
 	
 	@Override 
 	public boolean equals(Object obj) {
 		if (!(obj instanceof Car)) {
 			return false;
 		}
 		
 		Car otherCar = (Car) obj;
 		
 		if(this.numDoors == otherCar.numDoors) {
 			if (this.numPass == otherCar.numPass){
 				return super.equals(otherCar);
 			}
 		}
 		
 		return false;
 	} // end equals
 	 
 	
 	public Car copy() {
 		int doors = this.numDoors;
 		int pass = this.numPass;
 		Car copy = new Car(super.getMake(), super.getModel(), super.getPlate(), doors, pass);
 		return copy;
 	}
 	
 	
} // end main