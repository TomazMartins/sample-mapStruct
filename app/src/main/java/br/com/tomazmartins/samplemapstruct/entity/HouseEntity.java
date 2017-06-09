package br.com.tomazmartins.samplemapstruct.entity;


public class HouseEntity {
    private int numberOfRooms;
    private String address;
    private PersonEntity owner;

    public HouseEntity() {}

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

    public PersonEntity getOwner() {
        return owner;
    }

    public void setOwner( PersonEntity owner ) {
        this.owner = owner;
    }
}
