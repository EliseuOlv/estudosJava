package sistemaSmartTV;

public class Usuario {

	public static void main(String[] args) {
		
		SmartTv smartTv = new SmartTv();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		
		smartTv.aumentarVolume();
		
		smartTv.mudarCanal(13);
		System.out.println("Canal Atural? -> " + smartTv.canal);
		
		System.out.println("TV Ligada? -> " + smartTv.ligada);
		System.out.println("Volume Atual? -> " + smartTv.volume);
		
		smartTv.ligar();
		
		System.out.println("Novow Status -> TV Ligada ? " + smartTv.ligada);
		
		
	}

}
