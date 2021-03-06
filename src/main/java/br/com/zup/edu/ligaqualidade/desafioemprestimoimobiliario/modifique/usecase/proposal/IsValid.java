package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.usecase.proposal;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.proposal.Proposal;

import java.math.BigDecimal;

public class IsValid {

    private static final BigDecimal MIN_VALUE = new BigDecimal(30000);
    private static final BigDecimal MAX_VALUE = new BigDecimal(3000000);

    private static final Integer MIN_INSTALLMENTS = 12 * 2;
    private static final Integer MAX_INSTALLMENTS = 12 * 15;

    public static Boolean execute(Proposal proposal) {

        if (proposal.getLoanValue().compareTo(MIN_VALUE) < 0 || proposal.getLoanValue().compareTo(MAX_VALUE) > 0) {
            return false;
        }

        if (proposal.getInstallments() < MIN_INSTALLMENTS || proposal.getInstallments() > MAX_INSTALLMENTS) {
            return false;
        }

        if (proposal.getProponents().size() < 2){
            return false;
        }

        if (proposal.getMainProponent() == null) {
            return false;
        }

        if (proposal.hasUnderAge()) {
            return false;
        }

        return true;
    }
}
