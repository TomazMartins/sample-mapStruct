package br.com.tomazmartins.samplemapstruct.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import br.com.tomazmartins.samplemapstruct.entity.HouseEntity;
import br.com.tomazmartins.samplemapstruct.model.House;

@Mapper( uses = PersonMapper.class )
public interface HouseMapper {
    HouseMapper INSTANCE = Mappers.getMapper( HouseMapper.class );

    House mapFrom( HouseEntity entity );
}
