package Msn.com.messeger;

import Msn.com.messeger.services.Servico;

public class FacebookMessager extends Servico{
		public void enviarMensagem() {
			System.out.println("Enviando mensagem pelo Facebook Messenger");
		}
		public void receberMensagem() {
			System.out.println("Recebendo mensagem pelo Facebook Messenger");
		}
}
