package ClasseAbstrata;

public class Todos {

	public static void main(String[] args) {
		
		Lobo lobo = new Lobo ("roger", "M","" );
		lobo.caminhar();
		lobo.correr();
		lobo.dormir();
		lobo.emitirSom();
		
		System.out.println("-------");
		
		Leao leao = new Leao ("roger", "M","" );
		leao.caminhar();
		leao.correr();
		leao.dormir();
		leao.emitirSom();
		
		System.out.println("-------");
		
		Tigre tigre = new Tigre ("roger", "M","" );
		tigre.caminhar();
		tigre.correr();
		tigre.dormir();
		tigre.emitirSom();
		
		System.out.println("-------");
		
		Cachorro cachorro = new Cachorro ("roger", "M","" );
		cachorro.caminhar();
		cachorro.correr();
		cachorro.dormir();
		cachorro.emitirSom();
		
		System.out.println("-------");
		
		Gato gato = new Gato ("roger", "M","" );
		gato.caminhar();
		gato.correr();
		gato.dormir();
		gato.emitirSom();
		
		System.out.println("-------");

	}
}
