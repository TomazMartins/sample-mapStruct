package br.com.tomazmartins.samplemapstruct.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import br.com.tomazmartins.samplemapstruct.entity.PersonEntity;
import br.com.tomazmartins.samplemapstruct.model.Person;

@Mapper( uses = {HouseMapper.class, PhoneMapper.class} )
public interface PersonMapper {
    PersonMapper INSTANCE = Mappers.getMapper( PersonMapper.class );

    Person mapFrom( PersonEntity entity );
}
