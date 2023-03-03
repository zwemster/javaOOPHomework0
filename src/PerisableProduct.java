import java.util.Date;

public class PerisableProduct extends Product{
    private Date expireDate = new Date();
    public PerisableProduct(String name, double price, Date expireDate) {
        super(name, price);
        this.expireDate = expireDate;
    }

    @Override
    public String toString() {
        StringBuilder localString = new StringBuilder(super.toString());
        localString.append(String.format(" годен до %s", expireDate.toString()));
        return localString.toString();
    }
}
