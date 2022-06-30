public class Main {
    public static void main(String[] args) {
        Vehicle vec = new Vehicle("VW", "Passat", "gold", 2015);
        Vehicle car = new Car(vec);
        car.direction("right");
        car.chaneSpeed(123.4);
        car.go();
        car.stop();
        car.changeGear(1);
        car.direction("right");
    }
}
/*5) Vehicle
// Create a base class of a Vehicle,
// then create a Car class which inherits from the Vehicle class.
// Also, create another class, a specific type of Car that inherits from the Car class.
// Program should be able to handle steering, changing gears, and drive (having speed in other words).
// You might decide where to put the appropriate state and behaviors (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed of driving should be included.
 " " + */