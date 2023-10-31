package ClasseAbstrata;

public abstract class Animais {
	
	protected String nome;
	private String sexo;
	private String raca;
	public Animais(String nome, String sexo, String raca) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.raca = raca;
	}
	
	public abstract void dormir();
	
	public abstract void caminhar();
	
	public abstract void correr();
	
	public abstract void emitirSom();

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

}
