package br.lpm.EXERCICIOS.F;

public class Artigo extends ServicoClinica {
    private boolean novo;
    private String desc;


    public Artigo(double price, boolean novo, String desc) {
        super(price);
        this.novo = novo;
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    private String definirGarantia() {
        if (novo) {
            return "Garantia deve ser definida pelo fabricante";
        } else {
            return "Garantia de 30 dias";
        }
    }

    public boolean isNovo() {
        return novo;
    }

    public void setNovo(boolean novo) {
        this.novo = novo;
    }

    @Override
    public String toString() {
        return "Artigo [Garantia=" + definirGarantia() + ", desc=" + desc + ", toString()=" + super.toString() + "]";
    }

    

}
