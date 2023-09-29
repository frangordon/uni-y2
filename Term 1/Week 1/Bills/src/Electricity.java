public class Electricity {

    // fields
    public double unit;
    //public float price;

    public Electricity(double unit) {
        this.unit = unit;
    //    this.price = price;
    }

    public double getUnit() {
        return unit;
    }

    public double calculateCost(){
        double cost;
        if (unit <= 100){
            cost = unit * 26.7;
        }
        else {
            cost = (100 * 26.7) + ((unit - 100) * 15.6);
        }
        return cost;
    }


    // logic for unitPriceOver100 // unitPriceUnder100

}
