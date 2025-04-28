package hierarquiaExcecoes;

public class FormatadorCepExemplo {
	public static void main(String[] args) {
		try {
			String cepFormatado = formartarCep("237650640");
			System.out.println(cepFormatado);
		} catch (CepInvalidoException e) {
			System.err.println("O CEP não corresponde com as regras de negocio");
			e.printStackTrace();
		}
	}
	
	static String formartarCep(String cep) throws CepInvalidoException {
	    if(cep.length() != 8){
	        throw new CepInvalidoException();
	    }
	    return "23.765-064";
	}
}
