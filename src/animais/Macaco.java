package animais;

import enums.Alimento;
import enums.Porte;
import enums.Sexo;
import interfaces.Terrestre;

public class Macaco implements Terrestre {

	private Sexo sexo;
	private Porte porte;
	private Alimento alimento;

	public Macaco(Sexo sexo, Porte porte, Alimento alimento) {
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
		andar();
	}

	@Override
	public void andar() {
		System.out.println("Estou andando");

	}

}
