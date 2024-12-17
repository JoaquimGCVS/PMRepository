package br.lpm.EXERCICIOS.F;

import java.time.LocalDate;

public class Consulta extends ServicoClinica implements Agendavel {
    private String nome;
    private LocalDate dataHora;
    private Animal animal;

    public Consulta(double price, String nome, LocalDate dataHora, Animal animal) {
        super(price);
        this.nome = nome;
        this.dataHora = dataHora;
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Consulta(double price) {
        super(price);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public LocalDate getDataHora() {
        return dataHora;
    }

    @Override
    public String toString() {
        return "Consulta [nome=" + nome + ", dataHora=" + dataHora + ", animal=" + animal + ", toString()="
                + super.toString() + "]";
    }

   

}
