package animais;



import enums.Alimento;
import enums.Porte;
import enums.Sexo;
import interfaces.Anfibio;

public class Tartaruga implements Anfibio {

	private Sexo sexo;
	private Porte porte;
	private Alimento alimento;
	private Alimento alimento1;
	private Alimento alimento2;

	public Tartaruga(Sexo sexo, Porte porte, Alimento alimento, Alimento alimento1, Alimento alimento2) {
		this.sexo = sexo;
		this.porte = porte;
		this.alimento = alimento;
		this.alimento1 = alimento1;
		this.alimento2 = alimento2;
		

	}

	public Alimento getAlimento() {
		return alimento;
	}

	public Alimento getAlimento1() {
		return alimento1;
	}

	public Alimento getAlimento2() {
		return alimento2;
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
		System.out.println("estou andando");

	}

}
