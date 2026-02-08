/**
 * @author Mehrdad Sabetzadeh, University of Ottawa\
 	Ahmad Alomari & Ismael Abed Ali
 */
public class Car {

	// Private Instance Variables for storing the car's type and its plate number (not storing anything right now)
	private CarType type;
	private String plateNum;

	// Method to get the type of the car and store it in type
	public CarType getType() {
		return this.type; // Returning the type of the car
	}

	// Method to update the type of the car if needed
	public void setType(CarType type) {
		this.type = type; // Updates the type of the car
	}

	// Method to return the plate number of a car
	public String getPlateNum() {
		return this.plateNum; // returning the plate number of the car
	}

	// Sets the plate number of the car
	public void setPlateNum(String plateNum) {
		this.plateNum  = plateNum; // setting the plate number of the car to the one provided
	}

	// Constructor class for the car, this sets the initial information of the car
	public Car(CarType type, String plateNum) {
	this.type = type;
	this.plateNum = plateNum;
	
	}

	// Method to return a string representation of the car
	public String toString() {
		// NOTE: The implementation of this method is complete. You do NOT need to
		// change it for the assignment.
		return Util.getLabelByCarType(type) + '(' + plateNum + ')';
	}
}