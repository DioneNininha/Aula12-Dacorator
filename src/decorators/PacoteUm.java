package decorators;

import model.Assinatura;

/**
 * 
 * @author Dione
 *
 */
public class PacoteUm extends AssServStreamDecorator {

	public PacoteUm(Assinatura assinatura) {
		super(assinatura);
	}

	@Override
	public void adquirir() {
		assinatura.adquirir();
		System.out.println("-Pacote 1 => Assistir vídeos em vários Dipositivos:  R$19,99 ");
	}

	@Override
	public Double getValor() {
		return assinatura.getValor() + 19.99;
	}

}
