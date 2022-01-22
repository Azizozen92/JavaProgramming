package day_35_Encapsulation.DinnerTasks;

public class Carpet {

    private double width;
    private double length;
    private double unitPrice;
    private boolean isPersian;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width < 0 ){
            System.err.println("Invalid width "+width);
            return;
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 0){
            System.err.println("Invalid length "+length);
        }
        this.length = length;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice < 0){
            System.err.println("Invalid Price");
            return;
        }
        this.unitPrice = unitPrice;
    }

    public boolean isPersian() {
        return isPersian;
    }

    public void setPersian(boolean persian) {
        isPersian = persian;
    }
    public double calcPrice(){
        double totalPrice=(width*length)*unitPrice;
        if(isPersian){
            totalPrice += 200;
        }
        return totalPrice;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", totalPrice=" + calcPrice()+
                '}';
    }

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        setWidth(width);
        setLength(length);
        setUnitPrice(unitPrice);
        setPersian(isPersian);
    }

    public static void main(String[] args) {
        Carpet carpet1 = new Carpet(60,15,221.32,true);
        System.out.println(carpet1);
    }
}
