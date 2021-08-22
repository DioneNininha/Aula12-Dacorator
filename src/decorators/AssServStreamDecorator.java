package decorators;

import model.Assinatura;

/**
 * 
 * @author Dione
 *
 */
public abstract class AssServStreamDecorator implements Assinatura {

	protected Assinatura assinatura;

	public AssServStreamDecorator(Assinatura assinatura) {

		this.assinatura = assinatura;
	}
}