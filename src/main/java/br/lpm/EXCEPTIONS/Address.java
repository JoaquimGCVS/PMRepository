package br.lpm.EXCEPTIONS;

public class Address {
    private String road;
    private int number;
    private String neighborhood;
    private int CEP;

    public Address(String road, int number, String neighborhood, int CEP) throws InvalidAdressException{
        setRoad(road);
        setNumber(number);
        setNeighborhood(neighborhood);
        setCEP(CEP);
    }

    public void setRoad(String road) throws InvalidAdressException{
        if(road!=null && !road.isEmpty()) {
            this.road = road;
        } else {
            throw new InvalidAdressException("Invalid road");
        }
    }

    public void setNumber(int number) throws InvalidAdressException{
        if (number>0) {
            this.number = number;
        } else {
            throw new InvalidAdressException("Invalid number");
        }
    }

    public void setNeighborhood(String neighborhood) throws InvalidAdressException{
        if(neighborhood!= null && !neighborhood.isEmpty()) {
            this.neighborhood = neighborhood;
        } else {
            throw new InvalidAdressException("Invalid neighborhood");
        }
    }

    public void setCEP(int CEP) throws InvalidAdressException{
        if(String.valueOf(CEP).length()==8) {
            this.CEP = CEP;
        } else {
            throw new InvalidAdressException("Invalid CEP");
        }
    }
}
