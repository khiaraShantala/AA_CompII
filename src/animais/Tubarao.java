package animais;

import java.util.ArrayList;

import enums.Alimento;
import enums.Porte;
import enums.Sexo;
import interfaces.Aquatico;

public class Tubarao implements Aquatico {

	private Sexo sexo;
	private Porte porte;
	private ArrayList<Alimento> alimento;

	public Tubarao(Sexo sexo, Porte porte, ArrayList<Alimento> alimento) {
		this.sexo = sexo;
		this.porte = porte;
		this.alimento = alimento;
	}

	public ArrayList<Alimento> getAlimento() {
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
	}

	@Override
	public void nadar() {
		System.out.println("Estou nadando");

	}

}
