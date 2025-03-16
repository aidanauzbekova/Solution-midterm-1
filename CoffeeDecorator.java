abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;
    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }
    public double getCost() { return decoratedCoffee.getCost(); }
    public String getDescription() { return decoratedCoffee.getDescription(); }
}

class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) { super(coffee); }
    public double getCost() { return super.getCost() + 0.50; }
    public String getDescription() { return super.getDescription() + ", Milk"; }
}

class CaramelDecorator extends CoffeeDecorator {
    public CaramelDecorator(Coffee coffee) { super(coffee); }
    public double getCost() { return super.getCost() + 0.75; }
    public String getDescription() { return super.getDescription() + ", Caramel Syrup"; }
}

class WhippedCreamDecorator extends CoffeeDecorator {
    public WhippedCreamDecorator(Coffee coffee) { super(coffee); }
    public double getCost() { return super.getCost() + 1.00; }
    public String getDescription() { return super.getDescription() + ", Whipped Cream"; }
}

class ChocolateDecorator extends CoffeeDecorator {
    public ChocolateDecorator(Coffee coffee) { super(coffee); }
    public double getCost() { return super.getCost() + 0.80; }
    public String getDescription() { return super.getDescription() + ", Chocolate Syrup"; }
}