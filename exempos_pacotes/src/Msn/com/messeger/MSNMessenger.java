package Msn.com.messeger;

import Msn.com.messeger.services.Servico;

public class MSNMessenger extends Servico {
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo MSN Messenger");
	}

	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN Messenger");
	}
}
