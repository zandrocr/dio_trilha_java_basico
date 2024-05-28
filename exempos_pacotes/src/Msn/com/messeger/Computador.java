package Msn.com.messeger;

import Msn.com.messeger.services.Servico;

public class Computador {
	public static void main(String[] args) {
		Servico servi = null;
		String app = "msn";
		
		if(app.equals("msn"))
			servi = new MSNMessenger();
		else if(app.equals("fbm"))
			servi = new FacebookMessager();		
			
		servi.enviarMensagem();
		servi.receberMensagem();		
	}
}
