class CoffeeFactory {
    public static Coffee getCoffee(String type) {
        switch (type.toLowerCase()) {
            case "espresso": return new Espresso();
            case "cappuccino": return new Cappuccino();
            case "latte": return new Latte();
            case "americano": return new Americano();
            default: throw new IllegalArgumentException("Invalid coffee type");
        }
    }
}
