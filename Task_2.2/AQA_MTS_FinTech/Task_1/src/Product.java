public class Product {
    private int count;
    private double price;
    private double discount;

    public Product(int count, double price, double discount) {
        this.count = count;
        this.price = price;
        this.discount = discount;
    }
    public double calculateSumWithoutDiscount() {
        return count * price;
    }

    public double calculateSumWithDiscount() {
        return calculateSumWithoutDiscount() * (1 - discount / 100);
    }

}
