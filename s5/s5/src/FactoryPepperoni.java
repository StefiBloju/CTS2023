public class FactoryPepperoni implements  IPizza{

    @Override
    public Pizza createPizza(String denumire) {
        return new Pizza(denumire);
    }
}
