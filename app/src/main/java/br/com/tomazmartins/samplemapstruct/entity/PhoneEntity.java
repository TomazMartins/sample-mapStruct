package br.com.tomazmartins.samplemapstruct.entity;

import br.com.tomazmartins.samplemapstruct.model.Person;


public class PhoneEntity {
    private String number;
    private Person owner;

    public PhoneEntity() {}

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
