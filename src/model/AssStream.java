package model;

/**
 * 
 * @author Dione
 *
 */
public class AssStream implements Assinatura {

	@Override
	public void adquirir() {
		System.out.println("-Assinatura do Stream => Assinatura Base: Assistir vídeos num único dispositivo: R$9,99");
	}

	@Override
	public Double getValor() {
		return 9.99;
	}
}
