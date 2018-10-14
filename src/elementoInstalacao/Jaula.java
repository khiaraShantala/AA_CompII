package elementoInstalacao;

import classesAbstratas.ElementoInstalacao;

public class Jaula extends ElementoInstalacao {

	private double altura;
	private double largura;
	private double comprimento;

	public Jaula(double altura, double largura, double comprimento) {
		this.altura = altura;
		this.largura = largura;
		this.comprimento = comprimento;

	}

	public double getAltura() {
		return altura;
	}

	public double getLargura() {
		return largura;
	}

	public double getComprimento() {
		return comprimento;
	}

	public double areaDaJaula(double altura, double largura, double comprimento) {
		return (altura * largura * comprimento);
	}

}
