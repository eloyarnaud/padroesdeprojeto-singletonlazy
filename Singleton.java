package singleton;
//M�todo "Lazy" para inicializa��o de bloco est�tico

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