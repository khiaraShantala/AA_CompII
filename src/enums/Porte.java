package enums;

public enum Porte {
	PEQUENO(1), MEDIO(2), GRANDE(3);

	private int valor;

	Porte(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}
}
