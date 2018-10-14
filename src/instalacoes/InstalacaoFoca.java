package instalacoes;

import classesAbstratas.ElementoInstalacao;
import classesAbstratas.Instalacao;

public class InstalacaoFoca extends Instalacao {

	public InstalacaoFoca(int capacidadeMaxima, double temperatura, ElementoInstalacao elementoInstalacao) {
		this.capacidadeMaxima = capacidadeMaxima;
		this.temperatura = temperatura;
		this.elementoInstalacao = elementoInstalacao;
	}
}
