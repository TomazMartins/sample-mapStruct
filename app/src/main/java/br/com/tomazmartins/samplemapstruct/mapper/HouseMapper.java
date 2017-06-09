package br.com.tomazmartins.samplemapstruct.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import br.com.tomazmartins.samplemapstruct.entity.HouseEntity;
import br.com.tomazmartins.samplemapstruct.model.House;

@Mapper( uses = PersonMapper.class )
public interface HouseMapper {
    HouseMapper INSTANCE = Mappers.getMapper( HouseMapper.class );

    @Mapping( source = "owner", target = "owner", ignore = true )
    House mapFrom( HouseEntity entity );
}
