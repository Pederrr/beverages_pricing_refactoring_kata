package beverages;

public enum Supplement {
    MILK(0.10),
    CREAM(0.15),
    CINNAMON(0.05);

    private final double price;

    Supplement(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
