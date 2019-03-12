package pack3;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        String desc = beverage.getDescription();
        return desc + ", WHip";
    }

    @Override
    public double cost() {
        return 0.19 +  beverage.cost();
    }
}
