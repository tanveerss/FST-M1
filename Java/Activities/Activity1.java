/*


    Create 2 Classes, Activity1 and Car in your activities package.
    The Car class will not have the main() method.
    In the Car class, add these variables:
        A String color
        A String transmission
        An int make
        An int tyres
        An int doors
    Make a constructor to initialize tyres to 4 and doors to 4
    Create these methods:
        displayCharacteristics() - This displays the values of all the variables
        accelarate() - This prints "Car is moving forward."
        brake() - This prints "Car has stopped."


 */



package Activities;

public class Activity1 {
	public static void main(String[] args) 
	{
	 Car toyota = new Car();
     toyota.make = 2014;
     toyota.color = "Black";
     toyota.transmission = "Manual";
 
     //Using Car class method
     toyota.displayCharacterstics();
     toyota.accelerate();
     toyota.brake();
}
}