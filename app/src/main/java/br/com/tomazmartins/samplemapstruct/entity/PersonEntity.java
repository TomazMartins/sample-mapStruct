package br.com.tomazmartins.samplemapstruct.entity;

public class PersonEntity {
    private HouseEntity house;
    private PhoneEntity phone;
    private String name;
    private String email;

    public PersonEntity() {}

    public HouseEntity getHouse() {
        return house;
    }

    public void setHouse( HouseEntity house ) {
        this.house = house;
    }

    public PhoneEntity getPhone() {
        return phone;
    }

    public void setPhone( PhoneEntity phone ) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail( String email ) {
        this.email = email;
    }
}
