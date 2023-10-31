package ClasseAbstrata;

public abstract class Veiculos {
	
	private String modelo;
	private String cor;
	private int ano;
	
	private String placa;
	public Veiculos(String placa, String modelo, String cor, int ano) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
	}
	
	public abstract void acelerar();
	
	public abstract void frear();
	
	public abstract void virar();
	
	public abstract void ligar();
}
