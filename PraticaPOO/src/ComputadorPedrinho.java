
public class ComputadorPedrinho {

	public static void main(String[] args) {
		MSNMenssenger msn = new MSNMenssenger();		
		msn.enviarMensagem();
		msn.receberMensagem();

		FacebookMenssenger fcb = new FacebookMenssenger();
		fcb.enviarMensagem();
		fcb.receberMensagem();
		
		Telegram tlg = new Telegram();
		tlg.enviarMensagem();
		tlg.receberMensagem();
	}

}
