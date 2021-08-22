package decorators;

import model.Assinatura;

/**
 * 
 * @author Dione
 *
 */
public class PacoteQuatro extends AssServStreamDecorator {

	public PacoteQuatro(Assinatura assinatura) {
		super(assinatura);
	}

	@Override
	public void adquirir() {
		assinatura.adquirir();
		System.out.println("-Pacote 4 => Cartão de crédito Platinum:  R$49,99");
	}

	@Override
	public Double getValor() {
		return assinatura.getValor() + 49.99;
	}
}