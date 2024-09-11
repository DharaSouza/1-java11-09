package ClasseAbstrata;

public class PrincipalAni {

	public static void main(String[] args) {
		
		lobo husky = new lobo ("Ciborg","macho", "husky siberiano");
		husky.dormir();
		husky.caminhar();
		husky.correr();
		husky.emitirsom();
		
		System.out.println("-------------------------------");

		leao africano = new leao ("tanos","macho", "leao africano");
		africano.dormir();
		africano.caminhar();
		africano.correr();
		africano.emitirsom();
		
		System.out.println("-------------------------------");
		
		tigre malaio = new tigre ("tigrinho","macho", "tigre malaio");
		malaio.dormir();
		malaio.caminhar();
		malaio.correr();
		malaio.emitirsom();
		
		System.out.println("-------------------------------");
		
		cachorro pinscher = new cachorro ("snoopy","macho", "pinscher");
		pinscher.dormir();
		pinscher.caminhar();
		pinscher.correr();
		pinscher.emitirsom();
		
		System.out.println("-------------------------------");
		
		gato srd = new gato ("luna","femea", "srd");
		srd.dormir();
		srd.caminhar();
		srd.correr();
		srd.emitirsom();
		
	}

}
