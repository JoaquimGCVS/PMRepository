package br.lpm.EXERCICIOS.F;

import java.time.LocalDate;

public class Petshop extends ServicoClinica implements Agendavel {
    private LocalDate dataHora;
    private String nomeServico;
    private String responsavel;

    public Petshop(double price, LocalDate dataHora, String nomeServico, String responsavel) {
        super(price);
        this.dataHora = dataHora;
        this.nomeServico = nomeServico;
        this.responsavel = responsavel;
    }

    @Override
    public LocalDate getDataHora() {
        return dataHora;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public void setDataHora(LocalDate dataHora) {
        this.dataHora = dataHora;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    @Override
    public String toString() {
        return "Petshop [dataHora=" + dataHora + ", nomeServico=" + nomeServico + ", responsavel=" + responsavel
                + ", toString()=" + super.toString() + "]";
    }

    

}
