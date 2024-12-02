package br.lpm.COLLECTIONS.LIST;

public class Application {
    public static void main (String[] args) {
        MovieManager movieManager = new MovieManager();
        
        movieManager.addMovie(new Movie ("Esposa de Mentirinha",2013));
        movieManager.addMovie(new Movie ("As branquelas",2010));
        movieManager.addMovie(new Movie ("Duna 2",2023));

        try {
            movieManager.getMovieByName("Duna");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        // o try-catch trata a excecao com o chamador, permitindo que, em caso de erro o codigo
        // imprima o erro no terminal, mas continue rodando

        // movieManager.getMovieByName("Duna");
        // a chamada do metodo sem try-catch exibiria o mesmo erro no terminal, mas interromperia
        // a execucao do programa no momento em que ocorreesse

        System.out.println("End of code");

    }


}
