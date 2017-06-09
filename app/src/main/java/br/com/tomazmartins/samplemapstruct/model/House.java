package br.com.tomazmartins.samplemapstruct.model;


public class House {
    private int mNumberOfRooms;
    private String mAddress;
    private Person mOwner;

    public House() {}

    public int getNumberOfRooms() {
        return mNumberOfRooms;
    }

    public void setNumberOfRooms( int numberOfRooms ) {
        this.mNumberOfRooms = numberOfRooms;
    }

    public String getAddress() {
        return mAddress;
    }

    public void setAddress( String address ) {
        this.mAddress = address;
    }

    public Person getOwner() {
        return mOwner;
    }

    public void setOwner( Person owner ) {
        this.mOwner = owner;
    }
}
