package day_31_Constructors.PracticeTasks;

public class Carpet {

    public double width;
    public double length;
    public double unitPrice;
    public boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double totalCost(){
        double totalCost=(length*width)*unitPrice;
        if(isPersian){
            totalCost +=200;
        }
        return totalCost;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice= $" + unitPrice +
                ", isPersian=" + isPersian +
                ", total cost= $" + totalCost() +
                '}';
    }
}
