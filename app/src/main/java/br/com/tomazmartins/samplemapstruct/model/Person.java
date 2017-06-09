package br.com.tomazmartins.samplemapstruct.model;


public class Person {
    private House house;
    private Phone phone;
    private String name;
    private String email;

    public Person() {}

    public House getHouse() {
        return house;
    }

    public void setHouse( House house ) {
        this.house = house;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone( Phone phone ) {
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
