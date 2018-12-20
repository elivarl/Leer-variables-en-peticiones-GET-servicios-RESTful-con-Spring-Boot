package com.restfull.calculadora.restfulcalculadora.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {
	
	//uso de @PathVariable (leer variables)
	@GetMapping(path="suma/{num1}/{num2}")
	public String sumar(@PathVariable String num1, @PathVariable String num2) {
				
		return "Opcion Sumar: La suma es: "+(Integer.parseInt(num1)+Integer.parseInt(num2) );
	}
	
	//uso de @PathVariable (leer variables)
	@GetMapping(path="/resta/{num1}/{num2}")
	public String restar(@PathVariable String num1, @PathVariable String num2) {
		
		return "Opcion Sumar: La resta es: "+(Integer.parseInt(num1)-Integer.parseInt(num2) );
	}
	
	//uso de @RequestParam (Leer parámetros)
	@GetMapping
	public String multiplicar(@RequestParam (value="num1") int num1, @RequestParam (value="num2") int num2) {
		return "La multiplicacion es : "+(num1*num2);
	}
	
}
