package br.lpm.SOLID.SRP.corrigido;

public class Doc {
    private String description;

    public Doc(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Doc{" +
                "description='" + description + '\'' +
                '}';
    }
}
