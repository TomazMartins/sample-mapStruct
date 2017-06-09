package br.com.tomazmartins.samplemapstruct.entity;

public class PhoneEntity {
    private String number;
    private PersonEntity owner;

    public PhoneEntity() {}

    public String getNumber() {
        return number;
    }

    public void setNumber( String number ) {
        this.number = number;
    }

    public PersonEntity getOwner() {
        return owner;
    }

    public void setOwner( PersonEntity owner ) {
        this.owner = owner;
    }
}
