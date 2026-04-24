package beverages;

import java.util.Collections;
import java.util.List;

public class Coffee extends Beverage {
    public Coffee() {
        this(Collections.<Supplement>emptyList());
    }

    public Coffee(List<Supplement> supplements) {
        super(1.2, supplements);
    }
}
