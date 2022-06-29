public class Car extends Vehicle {
    Car(){

    }
    private String transmission;

    private double co2Emissions;

    private double maxSpeed;

    private void carTransmissionType (String transmission){
        System.out.println(transmission);
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