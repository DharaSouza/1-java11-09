package ClasseAbstrata;

public class lobo extends Animal {


	
		public lobo (String nome, String sexo, String raca) {
			
			 super (nome, sexo, raca);
			}
			
			@Override
			
			public void dormir() {
				System.out.println("o lobo está dormindo ");
			}
			
			@Override
			
			public void caminhar() {
				System.out.println("o lobo está caminhando");
			}
			
			@Override
			
			public void correr() {
				System.out.println("o lobo está correndo");
			}
			
			@Override
			public void emitirsom() {
				System.out.println("o lobo está uivando ");
				

	}

}
