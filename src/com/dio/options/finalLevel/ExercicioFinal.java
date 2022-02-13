package com.dio.options.finalLevel;

import java.util.Optional;

/* # Exercicio Final
 * ## Crie um optional de um determinado tipo de dado 
 * Crie com estado vazio, estado presente, e com null
 * Se presente, exiba o valor no console 
 * Se vazio, lançe uma expressão IlegalStateException
 * Se vazio, exiba "Optional Vazio" no console
 * Se presente, transforme o valor e exiba no console 
 * Se presente, pegue o valor do optional e atribua em uma variável
 * Se presente, filtre o optional com uma determinada regra de negócio
 * */


public class ExercicioFinal {

	public static void main(String[] args) {

		Optional<String> optionalString = Optional.of("Valor Presente");
		optionalString.ifPresentOrElse(System.out::println,()->System.out.println("não está presente"));
		Optional<String> emptyOptional = Optional.empty();
		emptyOptional.ifPresentOrElse(System.out::println,()-> System.out.println("empty = não está presente"));
		//Optional<String> optionalNullErro = Optional.of(null);
		//optionalNullErro.ifPresentOrElse(System.out::println, ()-> System.out.println("erro = não está presente"));
		
		if(optionalString.isPresent()) {
			String valor = optionalString.get();
			System.out.println(valor);
		}
		
		optionalString.map((valor)-> valor.concat(" valorzinho")).ifPresent(System.out::println);
		optionalString.orElseThrow(IllegalStateException::new);
	}

}
