package beverages;

import java.util.Collections;
import java.util.List;

public class HotChocolate extends Beverage {
    public HotChocolate() {
        this(Collections.<Supplement>emptyList());
    }

    public HotChocolate(List<Supplement> supplements) {
        super(1.45, supplements);
    }
}
