package ClasseAbstrata;

public class Gato extends Animais {
	
	public Gato(String nome, String sexo, String raca){
	    super(nome, sexo,raca);
	}
	
	@Override
	public void dormir() {
		System.out.println("O gato esta uivando");
	}

	@Override
	public void caminhar() {
		System.out.println("O gato esta caminhando");
		
	}

	@Override
	public void correr() {
		System.out.println("O gato esta correndo");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("O gato esta correndo");
		
	}

}
