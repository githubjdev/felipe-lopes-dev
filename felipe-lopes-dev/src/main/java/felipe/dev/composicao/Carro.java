package felipe.dev.composicao;

public class Carro {

	/* Motoro fica dentro do carro */
	private Motor motor = new Motor();

	public void ligarCarro() {
		motor.ligar();
	}
	
	public void acelerar() {
		motor.acelerar();
	}

	public void desligarMotor() {
		motor.desligar();
	}

}
