package br.lpm.EXERCICIOS.B;

public class User {
    private String name;
    private int age;
    private String email;

    public User(String name, int age, String email) throws InvalidUserName,InvalidUserAge,InvalidUserEmail{
        setName(name);
        setAge(age);
        setEmail(email);
    }

    public void setName(String name) throws InvalidUserName{
        if(name.length()<3) {
            throw new InvalidUserName("O nome deve ter pelo menos 3 caracteres.");
        }
        this.name = name;
    }

    public void setAge(int age) throws InvalidUserAge {
        if(age<18) {
            throw new InvalidUserAge("A idade deve ser maior ou igual a 18 anos.");
        }
        this.age = age;
    }

    public void setEmail(String email) throws InvalidUserEmail{
        if(!email.contains("@")) {
            throw new InvalidUserEmail("O e-mail deve conter o símbolo `@`");
        }
        this.email = email;
    }
}
