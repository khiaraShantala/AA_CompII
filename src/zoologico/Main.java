package zoologico;

import animais.*;
import elementoInstalacao.*;
import enums.Alimento;
import enums.Localizacao;
import enums.Porte;
import enums.Sexo;
import instalacoes.*;

public class Main {

	public static void main(String[] args) {

		FabricaInstalacao fabrica = new FabricaInstalacao();
		Zoologico zoo = new Zoologico();
		
		Elefante elefante = new Elefante(Sexo.MASCULINO, Porte.GRANDE, Alimento.VERDURAS, Alimento.FRUTAS);
		InstalacaoElefante instalacaoElefante = (InstalacaoElefante) fabrica.criarInstalacaoElefante(2, 23, new Jaula(20, 30, 35));
		zoo.add(Localizacao.LESTE);
		instalacaoElefante.instalaAnimal(elefante);
		
		Macaco macaco = new Macaco(Sexo.MASCULINO, Porte.PEQUENO, Alimento.FRUTAS);
		InstalacaoMacaco instalacaoMacaco =  (InstalacaoMacaco) fabrica.criarInstalacaoMacaco(10, 25, new Jaula(40, 35.7, 90));
		zoo.add(Localizacao.NORDESTE);
		instalacaoMacaco.instalaAnimal(macaco);
		
		Zebra zebra = new Zebra(Sexo.FEMININO, Porte.MEDIO, Alimento.FRUTAS, Alimento.VERDURAS);
		InstalacaoZebra instalacaoZebra = (InstalacaoZebra) fabrica.criarInstalacaoZebra(2, 24, new Jaula(20, 30, 25));
		zoo.add(Localizacao.NOROESTE);
		instalacaoZebra.instalaAnimal(zebra);
		
		Tartaruga tartaruga = new Tartaruga(Sexo.FEMININO, Porte.PEQUENO, Alimento.FRUTAS, Alimento.VERDURAS, Alimento.PEIXES);
		InstalacaoTartaruga instalacaoTartaruga = (InstalacaoTartaruga) fabrica.criarInstalacaoTartaruga(17, 20, new Tanque(200.0));
		zoo.add(Localizacao.NORTE);
		instalacaoTartaruga.instalaAnimal(tartaruga);
		
		Baleia baleia = new Baleia(Sexo.FEMININO, Porte.GRANDE, Alimento.PEIXES);
		InstalacaoBaleia instalacaoBaleia = (InstalacaoBaleia) fabrica.criarInstalacaoBaleia(2, 22, new Tanque(1000.0));
		zoo.add(Localizacao.CENTROESTE);
		instalacaoBaleia.instalaAnimal(baleia);
		
	
		
		zoo.print();
		
		


	}
}
