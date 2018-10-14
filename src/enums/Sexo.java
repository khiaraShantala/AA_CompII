package enums;

public enum Sexo {
	FEMININO(1), MASCULINO(2);

	private int valor;

	Sexo(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

}
