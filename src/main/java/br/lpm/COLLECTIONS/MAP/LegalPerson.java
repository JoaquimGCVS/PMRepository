package br.lpm.COLLECTIONS.MAP;

public class LegalPerson extends Person{
    private int CNPJ;
    public LegalPerson(String name, int CNPJ) {
        super(name);
        this.CNPJ=CNPJ;
    }

    public int getCNPJ() {
        return CNPJ;
    }

    public String toString(){
        return "Type: Legal Person" + super.toString() + ", CNPJ: " + this.getCNPJ();
    }
}
