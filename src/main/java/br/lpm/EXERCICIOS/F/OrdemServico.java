package br.lpm.EXERCICIOS.F;

import java.util.ArrayList;
import java.util.List;

public class OrdemServico implements OrdenadorServico{
    private static OrdemServico instance;
    private final List<ServicoClinica> servicos;
    private OrdenadorServico() {
        servicos = new ArrayList<>();
    }
    public static OrdemServico getInstance() {
        if (instance==null) {
            return instance = new OrdemServico();
        }
        return instance;
    }
    @Override
    public double calcTotal() {
        return
    }
    @Override
    public void exibirOs() {
        for (ServicoClinica servico : servicos) {
            System.out.println(servico);
        }
    }
}
