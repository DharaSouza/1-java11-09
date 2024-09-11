package ClasseAbstrata;

public class cachorro extends Animal{
	
	public cachorro (String nome, String sexo, String raca) {
		
		 super (nome, sexo, raca);
		}
		
		@Override
		
		public void dormir() {
			System.out.println("o cachorro está dormindo ");
		}
		
		@Override
		
		public void caminhar() {
			System.out.println("o cachorro está caminhando");
		}
		
		@Override
		
		public void correr() {
			System.out.println("o cachorro está correndo");
		}
		
		@Override
		public void emitirsom() {
			System.out.println("o cachorro está rugir ");
			

		}
}
