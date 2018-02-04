/*
Abduljabbar Shaamala
Lab Number 9
 */

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println( "Welcome to the Grand Circus Motors admin console!" );
        System.out.println("");

        // create cars objects
        // new cars
        Car c1 = new Car("Nikolai","Model S", 2017, 54999.90);
        Car c2 = new Car("Ford","Escapade",2017,31999.90);
        Car c3 = new Car("Chewie","Vette",2017,44989.95);
        // used car
        UsedCar uc1 = new UsedCar("Hyonda","Prior",2015,14795.55,35987.6);
        UsedCar uc2 = new UsedCar("GC","Chirpus",2013,8500.00,12345.0);
        UsedCar uc3 = new UsedCar("GC","Witherell",2016,14450.00,3500.3);

        //create car list
        ArrayList<Car> carList = new ArrayList <>(  );
        carList.add( c1 );
        carList.add( c2 );
        carList.add( c3 );
        carList.add( uc1 );
        carList.add( uc2 );
        carList.add( uc3 );

        String cont = "y"; //loop condition

        while (cont.equalsIgnoreCase( "y" )) {
            int j = 1; // counter for Quit
            // display cars list
            for (Car i:carList) {
                System.out.println(carList.indexOf( i )+1 + "." + i);
                j++;
            }
            System.out.println( j + " .Quit!");
            System.out.println("");

            System.out.println("Which car would you like? ");
            int input = scan.nextInt();
            if( input == j){
                cont ="n";
                continue; // exit loop
            }
            System.out.println(carList.get( input-1 ));

            System.out.println("Would you like to buy this car? ");
            String answer = scan.next();

            if(answer.equalsIgnoreCase( "y" )){
                System.out.println("Excellent! Our finance department will be in touch shortly.");
                // remove chosen car
                carList.remove( input -1 );
                cont = "y"; // continue choose cars
            }else{

                cont = "n"; // end the loop
            }
        }
        //end program
        System.out.println("Have a great day! ");
    }
}

