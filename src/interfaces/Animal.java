package interfaces;

import enums.Alimento;
import enums.Porte;
import enums.Sexo;

public interface Animal {

	// implicitamente possui public e abstract
	Sexo getSexo();

	void setSexo(Sexo sexo);

	Porte getPorte();

	void setPorte(Porte porte);

	boolean alimentar(Alimento alimento);

	void locomover();
}
