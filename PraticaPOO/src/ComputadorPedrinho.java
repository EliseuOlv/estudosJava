import apps.FacebookMenssenger;
import apps.MSNMenssenger;
import apps.ServicoDeMensagemInstantanea;
import apps.Telegram;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		
		ServicoDeMensagemInstantanea smi = null;
		
		String appEscolhido = "tlg";
		
		if(appEscolhido.equals("msn")) {
			smi = new MSNMenssenger();
		}else if(appEscolhido.equals("fbm")){
			smi = new FacebookMenssenger();
		}else if(appEscolhido.equals("tlg")) {
			smi = new Telegram();
		}
		
		smi.enviarMensagem();
		smi.receberMensagem();
		
	}

}
