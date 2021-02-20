package com.boaglio.casadocodigo.springbootproperties.properties.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PropriedadeDTO {
        private String name;
        private String value;
        private String description;
        private String category;
        private String subcategory;
}
