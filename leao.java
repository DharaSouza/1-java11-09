package ClasseAbstrata;

public class leao extends Animal{
	
	public leao (String nome, String sexo, String raca) {
		
		 super (nome, sexo, raca);
		}
		
		@Override
		public void dormir() {
			System.out.println("o Leao está dormindo ");
		}
		
		@Override
		public void caminhar() {
			System.out.println("o Leao está caminhando");
		}
		
		@Override
		public void correr() {
			System.out.println("o Leao está correndo");
		}
		
		@Override
		public void emitirsom() {
			System.out.println("o Leao está rugindo ");
		}
}
