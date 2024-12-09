
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(5, 100.0, 0.75);
        Product product2 = new Product(10, 50.0, 42.575);
        Product product3 = new Product(3, 200.0, 59.1);

        // Выводим результаты для каждого объекта
        printCalculationResults(product1);
        printCalculationResults(product2);
        printCalculationResults(product3);
    }


    public static void printCalculationResults(Product product) {
        double Sum = product.calculateSumWithoutDiscount();
        double Sum_Discount = product.calculateSumWithDiscount();

        System.out.printf("Общая сумма без скидки: %.2f\n", Sum);
        System.out.printf("Общая сумма со скидкой: %.2f\n", Sum_Discount);
        System.out.println("-----------------------------");

    }

}