package br.com.tomazmartins.samplemapstruct;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import br.com.tomazmartins.samplemapstruct.entity.HouseEntity;
import br.com.tomazmartins.samplemapstruct.entity.PersonEntity;
import br.com.tomazmartins.samplemapstruct.entity.PhoneEntity;
import br.com.tomazmartins.samplemapstruct.mapper.PersonMapper;
import br.com.tomazmartins.samplemapstruct.model.House;
import br.com.tomazmartins.samplemapstruct.model.Person;
import br.com.tomazmartins.samplemapstruct.model.Phone;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        PersonEntity personEntity = new PersonEntity();
        personEntity.setName( "Tested Person" );
        personEntity.setEmail( "example@sample.com" );

        PhoneEntity phoneEntity = new PhoneEntity();
        phoneEntity.setNumber( "99999-9999" );
        phoneEntity.setOwner( personEntity );

        personEntity.setPhone( phoneEntity );

        HouseEntity houseEntity = new HouseEntity();
        houseEntity.setAddress( "some place in the World" );
        houseEntity.setNumberOfRooms( 6 );
        houseEntity.setOwner( personEntity );

        personEntity.setHouse( houseEntity );

        Person person = PersonMapper.INSTANCE.mapFrom( personEntity );

        StringBuilder builder = new StringBuilder();
        builder.append( "The SOURCE PersonEntity is:\n" )
                .append( "Object: " ).append( personEntity ).append( "\n" )
                .append( "Name: " ).append( personEntity.getName() ).append( "\n" )
                .append( "Email: " ).append( personEntity.getEmail() ).append( "\n" )
                .append( "Phone: " ).append( personEntity.getPhone().getNumber() ).append( "\n" )
                .append( "House: " )
                    .append( "[" )
                        .append( personEntity.getHouse().getAddress() )
                        .append( ", " )
                        .append( personEntity.getHouse().getNumberOfRooms() )
                    .append( "];" )
                .append( "\n\n" )
                .append( "The TARGET Person is:\n" )
                .append( "Object: " ).append( person ).append( "\n" )
                .append( "Name: " ).append( person.getName() ).append( "\n" )
                .append( "Email: " ).append( person.getEmail() ).append( "\n" )
                .append( "Phone: " ).append( person.getPhone().getNumber() ).append( "\n" )
                .append( "House: " )
                    .append( "[" )
                        .append( person.getHouse().getAddress() )
                        .append( ", " )
                        .append( person.getHouse().getNumberOfRooms() )
                    .append( "];" )
                .append( "\n\n" );

        builder.append( "The SOURCE PhoneEntity is:\n" )
                .append( "Number: " ).append( phoneEntity.getNumber() ).append( "\n" )
                .append( "Owner" ).append( phoneEntity.getOwner() ).append( "\n" )
                .append( "\n\n" )
                .append( "The TARGET Phone is:\n" )
                .append( "Number: " ).append( person.getPhone().getNumber() ).append( "\n" )
                .append( "Owner" ).append( person.getPhone().getOwner() ).append( "\n" )
                .append( "\n\n" );

        builder.append( "The SOURCE HouseEntity is:\n" )
                .append( "Address: " ).append( houseEntity.getAddress() ).append( "\n" )
                .append( "Number of Rooms: " ).append( houseEntity.getNumberOfRooms() ).append( "\n" )
                .append( "Owner: " ).append( houseEntity.getOwner() ).append( "\n" )
                .append( "\n\n" )
                .append( "The TARGET House is:\n" )
                .append( "Address: " ).append( person.getHouse().getAddress() ).append( "\n" )
                .append( "Number of Rooms: " ).append( person.getHouse().getNumberOfRooms() ).append( "\n" )
                .append( "Owner: " ).append( person.getHouse().getOwner() ).append( "\n" )
                .append( "\n\n" );

        Log.i( "TEST MapStruct", builder.toString() );
    }
}
