/*
Abduljabbar Shaamala
Lab Number 9
 */
public class UsedCar extends Car {

    private double mileage;

    public UsedCar() {

    }

    public UsedCar(String make, String model, int year, double price, double mileage) {
        super( make, model, year, price );
        this.mileage = mileage;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
    public String toString(){
        return String.format("%-10s%-12s%-10d $%-12s%-10s",super.getMake(), super.getModel(), super.getYear(), super.getPrice(),mileage+"miles");
    }
}
