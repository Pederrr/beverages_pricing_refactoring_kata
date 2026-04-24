package unit_tests;

import beverages.Beverage;
import beverages.Coffee;
import beverages.HotChocolate;
import beverages.Supplement;
import beverages.Tea;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

public class BeveragesPricingTest {
    @Test
    public void computes_coffee_price() {
        Beverage coffee = new Coffee();
        assertThat(coffee.price(), is(closeTo(1.20, 0.001)));
    }

    @Test
    public void computes_tea_price() {
        Beverage tea = new Tea();
        assertThat(tea.price(), is(closeTo(1.50, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_price() {
        Beverage hotChocolate = new HotChocolate();
        assertThat(hotChocolate.price(), is(closeTo(1.45, 0.001)));
    }

    @Test
    public void computes_tea_with_milk_price() {
        Tea teaWithMilk = new Tea(List.of(Supplement.MILK));
        assertThat(teaWithMilk.price(), is(closeTo(1.60, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_price() {
        Coffee coffeeWithMilk = new Coffee(List.of(Supplement.MILK));
        assertThat(coffeeWithMilk.price(), is(closeTo(1.30, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_and_cream_price() {
        Coffee coffeeWithMilkAndCream = new Coffee(List.of(Supplement.MILK, Supplement.CREAM));
        assertThat(coffeeWithMilkAndCream.price(), is(closeTo(1.45, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_with_cream_price() {
        HotChocolate hotChocolateWithCream = new HotChocolate(List.of(Supplement.CREAM));
        assertThat(hotChocolateWithCream.price(),  is(closeTo(1.60, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_with_cinammon_price() {
        HotChocolate chocolate = new HotChocolate(List.of(Supplement.CINNAMON));
        assertThat(chocolate.price(), is(closeTo(1.50, 0.001)));
    }

    @Test
    public void computes_tea_with_milk_and_cinammon_price() {
        Tea tea = new Tea(List.of(Supplement.MILK, Supplement.CINNAMON));
        assertThat(tea.price(), is(closeTo(1.65, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_and_cream_and_cinammon_price() {
        Coffee coffee = new Coffee(List.of(Supplement.MILK, Supplement.CREAM, Supplement.CINNAMON));
        assertThat(coffee.price(), is(closeTo(1.50, 0.001)));
    }
}
