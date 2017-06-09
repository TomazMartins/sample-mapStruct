package br.com.tomazmartins.samplemapstruct.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import br.com.tomazmartins.samplemapstruct.entity.PhoneEntity;
import br.com.tomazmartins.samplemapstruct.model.Phone;

@Mapper( uses = PersonMapper.class )
public interface PhoneMapper {
    PhoneMapper INSTANCE = Mappers.getMapper( PhoneMapper.class );


    Phone mapFrom( PhoneEntity entity );
}
