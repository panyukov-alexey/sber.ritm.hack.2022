package it.ritm.catalog.app.mapper;


import it.ritm.catalog.app.dao.SomeClass;
import it.ritm.catalog.app.dto.SomeClassDTO;
import org.mapstruct.Mapper;

@Mapper
public interface SomeClassMapper {

    SomeClassDTO mapDomainToDto(SomeClass dao);

}
