
public class Carro extends Veiculo {
	public void ligar() {
		confereCambio();
		confereCombustivel();
		System.out.println("Carro Ligado");
	}
	
	private void confereCombustivel() {
		System.out.println("Conferindo Combustivél");
	}
	
	private void confereCambio() {
		System.out.println("Conferindo Cambio em P");
	}
}
