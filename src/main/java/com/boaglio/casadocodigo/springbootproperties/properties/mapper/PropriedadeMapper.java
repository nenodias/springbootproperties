package com.boaglio.casadocodigo.springbootproperties.properties.mapper;

import com.boaglio.casadocodigo.springbootproperties.properties.dto.PropriedadeDTO;
import com.boaglio.casadocodigo.springbootproperties.properties.model.Propriedade;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PropriedadeMapper {

    PropriedadeMapper INSTANCE = Mappers.getMapper( PropriedadeMapper.class );

    @Mappings({
        @Mapping(source = "nome", target = "name"),
        @Mapping(source = "valor", target = "value"),
        @Mapping(source = "descricao", target = "description"),
        @Mapping(source = "categoria", target = "category"),
        @Mapping(source = "subcategoria", target = "subcategory"),
    })
    PropriedadeDTO propriedadeToDTO(Propriedade propriedade);

}
