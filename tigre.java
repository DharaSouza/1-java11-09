package ClasseAbstrata;

public class tigre extends Animal{
		
		public tigre (String nome, String sexo, String raca) {
			
			 super (nome, sexo, raca);
			}
			
			@Override
			
			public void dormir() {
				System.out.println("o tigre está dormindo ");
			}
			
			@Override
			
			public void caminhar() {
				System.out.println("o tigre está caminhando");
			}
			
			@Override
			
			public void correr() {
				System.out.println("o tigre está correndo");
			}
			
			@Override
			public void emitirsom() {
				System.out.println("o tigre está rugir ");
				

			}
}
