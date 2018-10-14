package zoologico;

import enums.Alimento;
import enums.Porte;
import enums.Sexo;
import interfaces.Terrestre;

public class AnimalTerrestre implements Terrestre {

	private Porte porte;
	private Alimento alimento;
	private Sexo sexo;

	public AnimalTerrestre(Porte porte, Alimento alimento, Sexo sexo) {
		this.porte = porte;
		this.alimento = alimento;
		this.sexo = sexo;
	}

	public AnimalTerrestre(Porte porte, Alimento alimento, Alimento aliment, Sexo sexo) {
		this.porte = porte;
		this.alimento = alimento;
		this.alimento = aliment;
		this.sexo = sexo;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Porte getPorte() {
		return porte;
	}

	public void setPorte(Porte porte) {
		this.porte = porte;
	}

	public Alimento getAlimento() {
		return alimento;
	}

	public void setAlimento(Alimento alimento) {
		this.alimento = alimento;
	}

	public boolean alimentar(Alimento alimento) {
		return true;
	}

	public void locomover() {
		System.out.println("Estou andando");
	}

	public void andar() {
		System.out.println("Estou andando");

	}

}
