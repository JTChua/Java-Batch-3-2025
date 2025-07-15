package Task13;

public class Car extends Vehicle {

  private int numberOfDoors;

  public Car(String make, String model, int year, int numberOfDoors) {
    super(make, model, year);
    this.numberOfDoors = numberOfDoors;
  }

  public int getNumberOfDoors() {
    return numberOfDoors;
  }

  public void setNumberOfDoors(int numberOfDoors) {
    this.numberOfDoors = numberOfDoors;
  }

  public void displayDetails() {
    System.out.println("Car Details:");
    System.out.println(toString());
    System.out.println("Number of Doors: " + numberOfDoors);
  }

}
