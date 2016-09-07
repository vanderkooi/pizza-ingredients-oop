package ca.ubc.cpsc210.pizza.model;

// represents a topping on a pizza
public abstract class Topping extends Ingredient implements Surchargeable {
    private int surcharge;

    // EFFECTS: topping has given name, cost and the surcharge is zero
    public Topping() {
        super();
    }

    @Override
    public void setSurcharge(int surcharge) {
        this.surcharge = surcharge;
    }


    @Override
    public int getCost() {
        return cost + surcharge;

    }
}
