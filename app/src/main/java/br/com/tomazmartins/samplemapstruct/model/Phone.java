package br.com.tomazmartins.samplemapstruct.model;


public class Phone {
    private String number;
    private Person owner;

    public Phone() {}

    public String getNumber() {
        return number;
    }

    public void setNumber( String number ) {
        this.number = number;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner( Person owner ) {
        this.owner = owner;
    }
}
