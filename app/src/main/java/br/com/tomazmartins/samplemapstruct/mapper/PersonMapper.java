package br.com.tomazmartins.samplemapstruct.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import br.com.tomazmartins.samplemapstruct.entity.HouseEntity;
import br.com.tomazmartins.samplemapstruct.entity.PersonEntity;
import br.com.tomazmartins.samplemapstruct.entity.PhoneEntity;
import br.com.tomazmartins.samplemapstruct.model.House;
import br.com.tomazmartins.samplemapstruct.model.Person;
import br.com.tomazmartins.samplemapstruct.model.Phone;

@Mapper
public interface PersonMapper {
    PersonMapper INSTANCE = Mappers.getMapper( PersonMapper.class );

    Person mapFrom( PersonEntity entity );
    House mapFrom( HouseEntity entity );
    Phone mapFrom( PhoneEntity entity );
}
