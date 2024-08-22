package diojava;

public class Usuario {
	
	
	public static void main (String [] args) {
		
		SmartTv smartTv = new SmartTv();
		
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		
		System.out.println("A TV está: " + smartTv.ligada);
		System.out.println("Canal atual: " + smartTv.canal);
		System.out.println("Volume: " + smartTv.volume);
		
		smartTv.ligar();
		System.out.println("A TV está: " + smartTv.ligada);
		
		
		smartTv.diminuirVolume();
		System.out.println("Volume: " + smartTv.volume);
		
		smartTv.mudarCanal(90);
		System.out.println("Indo para o canal:  " + smartTv.canal);
		smartTv.diminuirCanal();
		System.out.println("Diminuindo  para o canal:  " + smartTv.canal);

		


		
		
	}

}

