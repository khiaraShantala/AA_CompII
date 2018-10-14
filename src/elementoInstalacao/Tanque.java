package elementoInstalacao;

import classesAbstratas.ElementoInstalacao;

public class Tanque extends ElementoInstalacao {

	private double volumeEmLitros;

	public Tanque(double volumeEmLitros) {
		this.volumeEmLitros = volumeEmLitros;

	}

	public double getVolumeEmLitros() {
		return volumeEmLitros;
	}

}
