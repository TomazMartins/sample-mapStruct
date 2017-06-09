package br.com.tomazmartins.samplemapstruct.model;


public class Phone {
    private String mNumber;
    private Person mOwner;

    public Phone() {}

    public String getNumber() {
        return mNumber;
    }

    public void setNumber( String number ) {
        this.mNumber = number;
    }

    public Person getOwner() {
        return mOwner;
    }

    public void setOwner( Person owner ) {
        this.mOwner = owner;
    }
}
