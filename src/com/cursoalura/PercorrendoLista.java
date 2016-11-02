package com.cursoalura;

import java.util.ArrayList;

public class PercorrendoLista {

	public static void main(String[] args) {
		
		ArrayList<String> aulas = new ArrayList<>();
		
		aulas.add("Trabalhando com aula");
		aulas.add("Listas de aulas");
		aulas.add("Ordenando aulas");
		
		System.out.println("\n Trabalhando com laço foreach ");
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}
		
		System.out.println("\n\n Trabalhando com outro laço FOR");
		
		for (int i = 0; i < aulas.size(); i++) {	//tipos listas/collection usam o size() e arrays usa o length.
			System.out.println("Aulas: "+ i + " - " + aulas.get(i));
		}
		
	}
	
	
}
