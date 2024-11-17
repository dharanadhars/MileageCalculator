import java.util.Scanner;
class Vehicle {
     double distance; 
     double fuel;     

    
    Vehicle(double distance, double fuel) {
        this.distance = distance;
        this.fuel = fuel;
    }

    double calculateMileage() {
        return distance / fuel;
    }

    
    void displayMileage() {
        System.out.println("Mileage (Vehicle): " + calculateMileage() + " km/l");
    }
}

class Car extends Vehicle {

  
    Car(double distance, double fuel) {
        super(distance, fuel);
    }

    
    double calculateMileage() {
        double efficiencyFactor = 0.9;
        return (distance / fuel) * efficiencyFactor;
    }

    
    void displayMileage() {
        System.out.println("Mileage (Car): " + calculateMileage() + " km/l");
    }
}


public class Mileagecalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Enter vehicle type (1 for Vehicle, 2 for Car): ");
        int choice = scanner.nextInt();

        
        System.out.println("Enter the distance traveled (in km): ");
        double distance = scanner.nextDouble();

        System.out.println("Enter the fuel consumed (in liters): ");
        double fuel = scanner.nextDouble();

        Vehicle vehicle;

        
        switch (choice) {
            case 1:
                vehicle = new Vehicle(distance, fuel);
                break;
            case 2:
                vehicle = new Car(distance, fuel);
                break;
            default:
                System.out.println("Invalid choice! Defaulting to Vehicle.");
                vehicle = new Vehicle(distance, fuel);
        }

       
        vehicle.displayMileage();

    }
}
