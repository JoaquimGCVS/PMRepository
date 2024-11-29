package br.lpm.SOLID.OCP.ferido;

public class ApproveCard {
    public void approveCreditCard(Card card) {
        if(validateCreditCard(card)) {
            //
        }
    }
    public void approveDebitCard(Card card) {
        if(validateDebitCard(card)) {
            //
        }
    }

    private boolean validateCreditCard(Card card) {
        //
        return true;
    }
    private boolean validateDebitCard(Card card) {
        //
        return true;
    }
}
