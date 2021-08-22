package decorators;

import model.Assinatura;

/**
 * 
 * @author Dione
 *
 */
public class PacoteDois extends AssServStreamDecorator {

	public PacoteDois(Assinatura assinatura) {
		super(assinatura);

	}

	@Override
	public void adquirir() {
		assinatura.adquirir();
		System.out.println("-Pacote 2 => Frete gráties em produtos: R$9,99 ");
	}

	@Override
	public Double getValor() {
		return assinatura.getValor() + 9.99;
	}
}
