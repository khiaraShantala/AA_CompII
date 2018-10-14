package classesAbstratas;

import java.util.ArrayList;

import enums.Localizacao;
import interfaces.Animal;

public abstract class Instalacao {

	protected int capacidadeMaxima;
	protected double temperatura;
	protected Localizacao localizacao;
	protected ArrayList<Animal> animaisInstalados = new ArrayList<Animal>();
	protected ElementoInstalacao elementoInstalacao;

	public boolean instalaAnimal(Animal animal) {
		if(animaisInstalados.size() < capacidadeMaxima)
			return animaisInstalados.add(animal);
		else
			return false;
	}


}
