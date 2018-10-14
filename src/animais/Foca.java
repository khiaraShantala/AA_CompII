package animais;

import enums.Alimento;
import enums.Porte;
import enums.Sexo;
import interfaces.Anfibio;

public class Foca implements Anfibio {

	private Sexo sexo;
	private Porte porte;
	private Alimento alimento;

	public Foca(Sexo sexo, Porte porte, Alimento alimento) {
		this.sexo = sexo;
		this.porte = porte;
		this.alimento = alimento;
	}

	public Alimento getAlimento() {
		return alimento;
	}

	@Override
	public Sexo getSexo() {
		return sexo;
	}

	@Override
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;

	}

	@Override
	public Porte getPorte() {
		return porte;
	}

	@Override
	public void setPorte(Porte porte) {
		this.porte = porte;

	}

	@Override
	public boolean alimentar(Alimento alimento) {
		return false;
	}

	@Override
	public void locomover() {
		nadar();
		andar();
	}

	@Override
	public void nadar() {
		System.out.println("Estou nadando");

	}

	@Override
	public void andar() {
		System.out.println("Estou andando");

	}

}
