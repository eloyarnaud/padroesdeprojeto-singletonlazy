package singleton;
//Método "Lazy" para inicialização de bloco estático

public class Singleton {

	private static Singleton instance;

	private Singleton(){

	}

	public static Singleton getInstance(){

		if(instance == null){
			instance = new Singleton();
		}

		return instance;
	}
}