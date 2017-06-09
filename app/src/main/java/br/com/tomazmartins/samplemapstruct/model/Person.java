package br.com.tomazmartins.samplemapstruct.model;


public class Person {
    private House mHouse;
    private Phone mPhone;
    private String mName;
    private String mEmail;

    public Person() {}

    public House getHouse() {
        return mHouse;
    }

    public void setHouse( House house ) {
        this.mHouse = house;
    }

    public Phone getPhone() {
        return mPhone;
    }

    public void setPhone( Phone phone ) {
        this.mPhone = phone;
    }

    public String getName() {
        return mName;
    }

    public void setName( String name ) {
        this.mName = name;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail( String email ) {
        this.mEmail = email;
    }
}
