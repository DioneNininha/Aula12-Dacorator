package pedir;

import decorators.PacoteUm;
import decorators.PacoteDois;
import decorators.PacoteTres;
import decorators.PacoteQuatro;
import model.Assinatura;
import model.AssStream;

/**
 * 
 * @author Dione
 *
 */
public class Cliente {

	public static void Pedir(String name, Assinatura Stream) {

		System.out.println("Adquirir: " + name);
		Stream.adquirir();

		System.out.println(Stream.getValor());
		System.out.println("-----------------------------------------------------------------------------");
	}

	public static void main(String[] args) {

		// AssStream é a assinatura Base
		Pedir("", new AssStream());
		Pedir("", new PacoteUm(new AssStream()));
		Pedir("", new PacoteUm(new PacoteDois(new AssStream())));
		Pedir("", new PacoteUm(new PacoteDois(new PacoteTres(new AssStream()))));
		Pedir("", new PacoteUm(new PacoteDois(new PacoteTres(new PacoteQuatro(new AssStream())))));

	}
}