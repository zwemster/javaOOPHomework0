public class Chocolate extends Product {
    private String brand;

    public Chocolate(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    @Override
    public String toString() {
        StringBuilder localString = new StringBuilder(super.toString());
        localString.append(String.format(" марка %s", brand));
        return localString.toString();
    }
}