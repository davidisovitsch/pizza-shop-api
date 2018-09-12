package com.nationwide.davidspizzashopapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PizzaService {

	public List<Pizza> getPizzas() {
		Topping cheese = new Topping("Cheese", null);
		Topping pepperoni = new Topping("Pepperoni", null);

		List<Topping> toppings = new ArrayList<Topping>();
		toppings.add(cheese);
		toppings.add(pepperoni);

		List<Pizza> pizzas = new ArrayList<Pizza>();
		Pizza pizza = new Pizza("David's Pizza", toppings);
		pizzas.add(pizza);

		return pizzas;
	}
}
