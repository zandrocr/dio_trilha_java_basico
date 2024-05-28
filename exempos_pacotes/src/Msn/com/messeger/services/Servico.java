package Msn.com.messeger.services;

public abstract class Servico {
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}	
}
