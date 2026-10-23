package aula_01_10;

public class Gato implements Animal {

	@Override
	public void dormir() {
		System.out.println("O gato está dormindo");
	}

	@Override
	public void emitirSom() {
		System.out.println(" O gato está Miandoooo");
	}

	@Override
	public void correr() {
		System.out.println(" O gato está correndo");
	}

	@Override
	public void caminhar() {
		System.out.println(" O Gato está caminhando...");
	}

}
