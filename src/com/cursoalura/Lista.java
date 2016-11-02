package com.cursoalura;

import java.util.ArrayList;
import java.util.Collections;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<String> aulas = new ArrayList<>();
		
		aulas.add("Trabalhando com aula 01");
		aulas.add("Listas de aulas");
		aulas.add("Ordenando aulas");
		
		System.out.println(aulas);
		Collections.sort(aulas);
		System.out.println("\n Mostrando lista ordenada:");
		System.out.println(aulas);
	}
}
