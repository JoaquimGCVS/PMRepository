package br.lpm.DESIGNPATTERNS.singleton.two;

public class FilaUnica {

    private static FilaUnica instance;

    private FilaUnica(){

    }

    public static FilaUnica criarInstancia() {
        if (instance==null) {
            instance = new FilaUnica();
        }
        return instance;
    }
}
