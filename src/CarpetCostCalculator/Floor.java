package CarpetCostCalculator;

/*17. Carpet Cost Calculator
The Carpet Company has asked you to write an application that calculates the price of carpeting for
rectangular rooms. To calculate the price, you multiply the area of the floor (width times length) by
the price per square meter of carpet. For example, the area of the floor that is 12 meters long and 10
meters wide is 120 square meters. To cover the floor with a carpet that costs $8 per square meter
would cost $960.*/
public class Floor {

    double width;
    double length;

    Floor(double w, double l) {
        this.width = this.length = 0;
        if (w > 0) {
            this.width = w;
        }
        if (l > 0) {
            this.length = l;
        }
    }

    public double getArea() {

        return (this.width * this.length);
    }
}

class Carpet {

    double cost;

    Carpet(double c) {

        this.cost = 0;
        if (c > 0) {
            this.cost = c;
        }
    }

    public double getCost() {

        return this.cost;
    }
}

class Calculator {

    Floor floor;
    Carpet carpet;

    Calculator(Floor f, Carpet c) {

        this.floor = f;
        this.carpet = c;
    }

    public double getTotalCost() {

        return this.floor.getArea() * this.carpet.getCost();
    }

}

class Main {

    public static void main(String[] args) {
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
    }
}