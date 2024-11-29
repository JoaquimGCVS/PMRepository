package br.lpm.SOLID.OCP.corrigido;

public class DebitCard implements ApproveCard{
    @Override
    public void approveCard(Card card) {
        if(validateCard(card)) {
            //
        }
    }
    @Override
    public boolean validateCard(Card card) {
        //
        return true;
    }
}
