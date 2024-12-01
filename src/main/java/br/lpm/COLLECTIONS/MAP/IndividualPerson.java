package br.lpm.COLLECTIONS.MAP;

public class IndividualPerson extends Person{
    private int CPF;
    public IndividualPerson(String name, int CPF) {
        super(name);
        this.CPF=CPF;
    }

    public int getCPF() {
        return CPF;
    }

    public String toString(){
        return "Type: Individual Person" + super.toString() + ", CPF: " + this.getCPF();
    }

}
