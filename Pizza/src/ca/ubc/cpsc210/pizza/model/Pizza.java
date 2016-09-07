package ca.ubc.cpsc210.pizza.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Represents a pizza

public class Pizza {
    public static final int CRUSTCOST = 5;
    public static final String INGREDIENT_DESCRIPTOR = " topped by ";
	public Crust crust;
	public List<Ingredient> ingredients;


	// EFFECTS: pizza has a crust and empty list of ingredients
	public Pizza() {
		crust = new Crust(CRUSTCOST);
		ingredients = new ArrayList<>();
	}

	// REQUIRES: newIngredient is not null
	// MODIFIES: this
	// EFFECTS: newIngredient is added to end of list of ingredients
	public void addIngredient(Ingredient newIngredient) {
        ingredients.add(newIngredient);
	}

	// EFFECTS: the returned string starts with CRUST_DESCRIPTOR followed by
	// all ingredients in the order in which they were added,
    // with INGREDIENT_DESCRIPTOR between each ingredient
	public String ingredientsAsString() {
		String INGREDIENT_NAMES = "";
		for (Ingredient i : ingredients) {
			INGREDIENT_NAMES +=  INGREDIENT_DESCRIPTOR + i.getName();
		}
        return Crust.DESCRIPTOR + INGREDIENT_NAMES;   // stub
	}

    // EFFECTS: Return the total cost of the pizza with crust and
	// all ingredients. Total cost >= CRUSTCOST.
	public int totalCost() {
        int INGREDIENT_COST = 0;

		for (Ingredient i : ingredients) {
			INGREDIENT_COST += i.getCost();
		}
        return CRUSTCOST + INGREDIENT_COST;   // stub
	}
}
