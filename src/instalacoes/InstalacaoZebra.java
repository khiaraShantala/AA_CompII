package instalacoes;

import classesAbstratas.ElementoInstalacao;
import classesAbstratas.Instalacao;

public class InstalacaoZebra extends Instalacao {

	public InstalacaoZebra(int capacidadeMaxima, double temperatura, ElementoInstalacao elementoInstalacao) {
		this.capacidadeMaxima = capacidadeMaxima;
		this.temperatura = temperatura;
		this.elementoInstalacao = elementoInstalacao;
	}
}
