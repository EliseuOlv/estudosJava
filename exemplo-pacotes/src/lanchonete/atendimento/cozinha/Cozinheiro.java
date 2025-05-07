package lanchonete.atendimento.cozinha;

public class Cozinheiro {
	public void adicionarLancheNoBalcao() {
		System.out.println("Adicionando Lanche Natural Hamburger no Balcão");
	}
	
	public void adicionarSucoNoBalcao() {
		System.out.println("Adicionando Suco no Balcão");
	}
	
	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}
	
	private void prepararLanche() {
		System.out.println("Preparando Lanche Tipo Hamburger");
	}
	
	private void prepararVitamina() {
		System.out.println("Preparando Vitamina");
	}
	
	private void prepararCombo() {
		prepararLanche();
		prepararVitamina();
	}
	
	private void selecionarIngredientesLanche() {
		System.out.println("Selecionar o Pão, Salada, Ovo e Carne");
	}
	
	private void selecionarIgredientesVitamina() {
		System.out.println("Selecionando Fruta, Leite e Suco");
	}
	
	private void lavarIgredientes() {
		System.out.println("Lavando Igredientes");
	}
	
	private void baterVitaminaLiquidificador() {
		System.out.println("Batendo Vitamina Liquidificador");
	}
	
	private void fritarIngredientesLanche() {
		System.out.println("Fritando a Carne e Ovo Para o Hamburger");
	}
	
	private void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}
	
	private void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}
}
