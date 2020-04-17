import java.util.Scanner;

public class Car {
    int currentlyYear = 2017;
    double price = 0;

    public Car() {

    }

    void insuranceCategory(String brand, String model, int year, int power) {
        if ((currentlyYear - year) <= 8) {
            price = 150;
        } else {
            if ((currentlyYear - year) > 8 && (currentlyYear - year) <= 15) {
                price = 200;
            } else {
                if ((currentlyYear - year) > 15 && (currentlyYear - year) <= 25) {
                    price = 300;
                } else {
                    if ((currentlyYear - year) > 25) {
                        price = 500;
                    }
                }
            }
        }

        if (power < 80) {
            price = price + (0.20 * price);
        } else {
            if (power > 140) {
                price = price + (0.45 * price);
            }
        }
    }

    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        String brand;
        System.out.print("Enter brand: ");
        brand = one.next();

        String model;
        System.out.print("Enter model: ");
        model = one.next();

        int year;
        System.out.print("Enter year: ");
        year = one.nextInt();

        int power;
        System.out.print("Enter power: ");
        power = one.nextInt();

        Car calculate = new Car();
        calculate.insuranceCategory(brand,model,year,power);
        System.out.println("The car tax is: " + calculate.price + "лв.");

    }
}
