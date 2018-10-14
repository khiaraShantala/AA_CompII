package animais;


import enums.Alimento;
import enums.Porte;
import enums.Sexo;
import interfaces.Terrestre;

public class Zebra implements Terrestre {
	private Sexo sexo;
	private Porte porte;
	private Alimento alimento;
	private Alimento alimento1;

	public Zebra(Sexo sexo, Porte porte, Alimento alimento, Alimento alimento1) {
		this.sexo = sexo;
		this.porte = porte;
		this.alimento = alimento;
		this.alimento1 = alimento1;
	}

	public Alimento getAlimento() {
		return alimento;
	}
	public Alimento getAlimento1() {
		return alimento1;
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
