package br.lpm.EXERCICIOS.F;

import java.util.ArrayList;
import java.util.List;

public class OrdemServico implements OrdenadorServico {
    private final List<ServicoClinica> servicos;
    private String nomeCliente;
    private static int autoincremento = 1; //Quando você define uma variável como estática (static), ela pertence à classe, e não a instâncias específicas dessa classe. Isso significa que todos os objetos dessa classe compartilham a mesma variável nextId.
    private final int numero;

    public OrdemServico(String nomeCliente) {
        servicos = new ArrayList<>();
        setNomeCliente(nomeCliente);
        this.numero= autoincremento++;
    }

    public void adicionarServico(ServicoClinica servicoClinica) {
        servicos.add(servicoClinica);
    }

    
    public List<ServicoClinica> getServicos() {
        return servicos;
    }
    
    public String getNomeCliente() {
        return nomeCliente;
    }
    
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    @Override
    public double calcTotal() {
        return servicos.stream().mapToDouble(servico -> servico.getPrice()).sum();
    }

    @Override
    public void exibirOs() {
        System.out.println("OS: Numero" + numero + ", Cliente: " + getNomeCliente() + ", Itens comprados: ");
        for (ServicoClinica servico : servicos) {
            System.out.println(servico);
        }
    }
}