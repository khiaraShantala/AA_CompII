package instalacoes;

import classesAbstratas.ElementoInstalacao;
import classesAbstratas.Instalacao;

public class InstalacaoBaleia extends Instalacao {

	public InstalacaoBaleia(int capacidadeMaxima, double temperatura, ElementoInstalacao elementoInstalacao) {
		this.capacidadeMaxima = capacidadeMaxima;
		this.temperatura = temperatura;
		this.elementoInstalacao = elementoInstalacao;
	}
}
