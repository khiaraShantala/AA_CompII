package instalacoes;

import classesAbstratas.ElementoInstalacao;
import classesAbstratas.Instalacao;

public class InstalacaoPinguim extends Instalacao {

	public InstalacaoPinguim(int capacidadeMaxima, double temperatura, ElementoInstalacao elementoInstalacao) {
		this.capacidadeMaxima = capacidadeMaxima;
		this.temperatura = temperatura;
		this.elementoInstalacao = elementoInstalacao;
	}
}
