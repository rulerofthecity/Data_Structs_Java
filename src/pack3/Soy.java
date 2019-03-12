package pack3;

public class Soy extends CondimentDecorator {
    Beverage beverage;
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public String getDescription() {
        String desc = beverage.getDescription();
        return desc + ", Soy";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
