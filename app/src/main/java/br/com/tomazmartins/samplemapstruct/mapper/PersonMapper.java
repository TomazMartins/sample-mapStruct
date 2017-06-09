package br.com.tomazmartins.samplemapstruct.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import br.com.tomazmartins.samplemapstruct.entity.PersonEntity;
import br.com.tomazmartins.samplemapstruct.model.Person;

@Mapper( uses = {HouseMapper.class, PhoneMapper.class} )
public abstract class PersonMapper {
    public static PersonMapper INSTANCE = Mappers.getMapper( PersonMapper.class );

    public Person mapFrom( PersonEntity entity ) {
        Person person = toPerson( entity );
        person.getHouse().setOwner( person );
        person.getPhone().setOwner( person );

        return person;
    }

    abstract Person toPerson( PersonEntity entity );
}
