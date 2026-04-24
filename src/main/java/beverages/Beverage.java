package beverages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Beverage {
    private final double basePrice;
    private final List<Supplement> supplements;

    protected Beverage(double basePrice, List<Supplement> supplements) {
        this.basePrice = basePrice;
        this.supplements = Collections.unmodifiableList(new ArrayList<>(supplements));
    }

    public double price() {
		return basePrice + supplements.stream().mapToDouble(Supplement::getPrice).sum();
    }
}
