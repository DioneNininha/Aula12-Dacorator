package decorators;

import model.Assinatura;

/**
 * 
 * @author Dione
 *
 */
public class PacoteTres extends AssServStreamDecorator {

	public PacoteTres(Assinatura assinatura) {
		super(assinatura);

	}

	@Override
	public void adquirir() {
		assinatura.adquirir();
		System.out.println("-Pacote 3 => Caixa surpresa com produtos relacionados a filmes e séries: R$29,99 ");
	}

	@Override
	public Double getValor() {
		return assinatura.getValor() + 29.99;
	}
}