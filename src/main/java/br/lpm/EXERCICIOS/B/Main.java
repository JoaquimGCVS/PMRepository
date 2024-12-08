package br.lpm.EXERCICIOS.B;

public class Main {
    public static void main (String[] args) {
        try {
            User user1 = new User("Joa",17,"Joaquimgmail.com");
        } catch (InvalidUserName | InvalidUserEmail | InvalidUserAge e) {
            System.out.println(e.getMessage());
        }
    }
}
