package com.nationwide.davidspizzashopapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PizzaController {

	@Autowired
	private PizzaService pizzaService;

	@RequestMapping("/pizzas")
	public List<Pizza> getPizzas() {
		return pizzaService.getPizzas();
	}

}
