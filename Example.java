package Jan2018;
import java.util.Scanner;

public class Example {
public static void main(String[] args){
    //dedicate memory space for arrays Java.
    //its not going to be an array of objects,
    //but an array of reference variables
    //reference variable points to an object on the memory
    Car[] cars = new Car[3];

    //create a for loop to cycle through an array of objects:

    //create a new scanner:
    Scanner input = new Scanner(System.in);
    String temp;
    for(int i = 0; i < cars.length; i++){
        System.out.println("Enter the car model ");
        temp = input.next();
        cars[i] = new Car();
        cars[i].setModel(temp);
    }
    for (int i = 0; i<cars.length; i++){
        System.out.println("Model: " + cars[i].getModel());
    }
}

}
