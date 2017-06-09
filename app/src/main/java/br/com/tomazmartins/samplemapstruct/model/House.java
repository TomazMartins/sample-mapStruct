package br.com.tomazmartins.samplemapstruct.model;


public class House {
    private int numberOfRooms;
    private String address;
    private Person owner;

    public House() {}

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms( int numberOfRooms ) {
        this.numberOfRooms = numberOfRooms;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress( String address ) {
        this.address = address;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner( Person owner ) {
        this.owner = owner;
    }
}
