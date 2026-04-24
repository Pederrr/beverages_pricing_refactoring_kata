package beverages;

import java.util.Collections;
import java.util.List;

public class Tea extends Beverage {
    public Tea() {
        this(Collections.<Supplement>emptyList());
    }

    public Tea(List<Supplement> supplements) {
        super(1.5, supplements);
    }
}
