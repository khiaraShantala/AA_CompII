package instalacoes;

import classesAbstratas.ElementoInstalacao;
import classesAbstratas.Instalacao;

public class InstalacaoElefante extends Instalacao {

	public InstalacaoElefante(int capacidadeMaxima, double temperatura, ElementoInstalacao elementoInstalacao) {
		this.capacidadeMaxima = capacidadeMaxima;
		this.temperatura = temperatura;
		this.elementoInstalacao = elementoInstalacao;
	}
}
