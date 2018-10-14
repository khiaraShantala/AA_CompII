package zoologico;


import java.util.HashSet;
import java.util.Set;

import enums.Localizacao;


public class Zoologico {
	
	private Set<Localizacao> localizacoes = new HashSet<Localizacao>();
	
	public Set<Localizacao> getLocalizacoes() {
		return localizacoes;
	}
	
	public String add(Localizacao localizacao) {
		int a = localizacoes.size();
		localizacoes.add(localizacao);
		int b = localizacoes.size();
		if( (b - a) == 0) {
			return "Localizacao ja existente!";
		}
		return "Localizacao aceita!";
		
	}
	
	public void print() {
		
			System.out.println(localizacoes.toString());
		
			
	
	}
	
	
	
}
