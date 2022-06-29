public class Vehicle {
    private String brand;

    private String model;

    private String color;

    private int yearOfMaking;

    Vehicle (String brand, String model, String color, int yearOfMaking){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearOfMaking = yearOfMaking;
        System.out.println("This is your Vehicle : " + this.brand + " " + this.model + " " + this.color +  " " +this.yearOfMaking);
    }
    Vehicle(){

    }

    private int gear;

    private double currentSpeed;

    private String steer;

    void direction(String way) {
        System.out.println("You are going " + way);
    }

    void changeGear (int gear){
        this.gear = gear;
        System.out.println("Gear switched to " + this.gear);
    }
    void chaneSpeed (double newSpeed) {
        this.currentSpeed  = newSpeed;
        System.out.println("Driving at " + this.currentSpeed + " km/h");
    }


    void go(){
        System.out.println("This vehicle is moving");
    }
    void stop(){
        System.out.println("This vehicle is stopped");
    }

}
/*5) Vehicle
// Create a base class of a Vehicle,
// then create a Car class which inherits from the Vehicle class.
// Also, create another class, a specific type of Car that inherits from the Car class.
// Program should be able to handle steering, changing gears, and drive (having speed in other words).
// You might decide where to put the appropriate state and behaviors (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed of driving should be included.
*/