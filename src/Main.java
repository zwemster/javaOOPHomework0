import java.util.Date;

public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.addProduct(new Product("Lay's", 99.50));
        machine.addProduct(new Product("Bounty", 70.30));
        machine.addProduct(new Product("Sneakers", 85.15));
        machine.addProduct(new Product("KitKat", 77.60));
        machine.addProduct(new Product("Nesquik", 35.95));
        machine.addProduct(new Chocolate("Alpen Gold", 67.30, "Nestle"));
        machine.addProduct(new Chocolate("Milka", 136.10, "Kraft Foods"));
        machine.addProduct(new PerisableProduct("Молоко Бурёнка", 89.50, new Date(2023, 1, 25)));
        machine.addProduct(new PerisableProduct("Молоко Коровка", 93.20, new Date(2023, 1, 25)));
        machine.addProduct(new PerisableProduct("Молоко Василёк", 91.10, new Date(2023, 1, 25)));

        System.out.println(machine);
    }
}