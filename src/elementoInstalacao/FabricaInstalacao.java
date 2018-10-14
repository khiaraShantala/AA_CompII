package elementoInstalacao;

import classesAbstratas.ElementoInstalacao;
import classesAbstratas.Instalacao;
import instalacoes.InstalacaoBaleia;
import instalacoes.InstalacaoElefante;
import instalacoes.InstalacaoFoca;
import instalacoes.InstalacaoLeao;
import instalacoes.InstalacaoMacaco;
import instalacoes.InstalacaoPeixeBoi;
import instalacoes.InstalacaoPinguim;
import instalacoes.InstalacaoTartaruga;
import instalacoes.InstalacaoTubarao;
import instalacoes.InstalacaoZebra;

public class FabricaInstalacao extends Instalacao{

	public Instalacao criarInstalacaoElefante(int capacidadeMaxima, double temperatura,
			ElementoInstalacao elementoInstalacao) {
		return new InstalacaoElefante(capacidadeMaxima, temperatura, elementoInstalacao);
	}

	public Instalacao criarInstalacaoMacaco(int capacidadeMaxima, double temperatura,
			ElementoInstalacao elementoInstalacao) {
		return new InstalacaoMacaco(capacidadeMaxima, temperatura, elementoInstalacao);
	}

	public Instalacao criarInstalacaoZebra(int capacidadeMaxima, double temperatura,
			ElementoInstalacao elementoInstalacao) {
		return new InstalacaoZebra(capacidadeMaxima, temperatura, elementoInstalacao);
	}

	public Instalacao criarInstalacaoLeao(int capacidadeMaxima, double temperatura,
			ElementoInstalacao elementoInstalacao) {
		return new InstalacaoLeao(capacidadeMaxima, temperatura, elementoInstalacao);
	}

	public Instalacao criarInstalacaoTartaruga(int capacidadeMaxima, double temperatura,
			ElementoInstalacao elementoInstalacao) {
		return new InstalacaoTartaruga(capacidadeMaxima, temperatura, elementoInstalacao);
	}

	public Instalacao criarInstalacaoPinguim(int capacidadeMaxima, double temperatura,
			ElementoInstalacao elementoInstalacao) {
		return new InstalacaoPinguim(capacidadeMaxima, temperatura, elementoInstalacao);
	}

	public Instalacao criarInstalacaoFoca(int capacidadeMaxima, double temperatura,
			ElementoInstalacao elementoInstalacao) {
		return new InstalacaoFoca(capacidadeMaxima, temperatura, elementoInstalacao);
	}

	public Instalacao criarInstalacaoPeixeBoi(int capacidadeMaxima, double temperatura,
			ElementoInstalacao elementoInstalacao) {
		return new InstalacaoPeixeBoi(capacidadeMaxima, temperatura, elementoInstalacao);
	}

	public Instalacao criarInstalacaoBaleia(int capacidadeMaxima, double temperatura,
			ElementoInstalacao elementoInstalacao) {
		return new InstalacaoBaleia(capacidadeMaxima, temperatura, elementoInstalacao);
	}

	public Instalacao criarInstalacaoTubarao(int capacidadeMaxima, double temperatura,
			ElementoInstalacao elementoInstalacao) {
		return new InstalacaoTubarao(capacidadeMaxima, temperatura, elementoInstalacao);
	}
}
