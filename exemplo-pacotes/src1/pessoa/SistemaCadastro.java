package pessoa;

public class SistemaCadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa marcos = new Pessoa("MARCOS", "123");
		
		marcos.setEndereco("Rua das Marias");
		
		System.out.println(marcos.getNome() + "-" + marcos.getCpf());
	}

}
