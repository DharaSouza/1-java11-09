package ClasseAbstrata;

public class gato extends Animal{
	
	public gato (String nome, String sexo, String raca) {
		
		 super (nome, sexo, raca);
		}
		
		@Override
		
		public void dormir() {
			System.out.println("o gato está dormindo ");
		}
		
		@Override
		
		public void caminhar() {
			System.out.println("o gato está caminhando");
		}
		
		@Override
		
		public void correr() {
			System.out.println("o gato está correndo");
		}
		
		@Override
		public void emitirsom() {
			System.out.println("o gato está miando  ");
			

		}
}
