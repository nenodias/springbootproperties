package com.boaglio.casadocodigo.springbootproperties.properties.controller;

import com.boaglio.casadocodigo.springbootproperties.properties.dto.PropriedadeDTO;
import com.boaglio.casadocodigo.springbootproperties.properties.mapper.PropriedadeMapper;
import com.boaglio.casadocodigo.springbootproperties.properties.model.Propriedade;
import com.boaglio.casadocodigo.springbootproperties.properties.repository.PropriedadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class PropriedadeController {

    @Autowired
    private PropriedadeRepository propriedadeRepository;

    @RequestMapping(value = "/find/{filtro}", method = RequestMethod.GET)
    public List<PropriedadeDTO> findByFiltro(@PathVariable("filtro") String filtro){
        return propriedadeRepository.findByFiltro(filtro).stream().map(PropriedadeMapper.INSTANCE::propriedadeToDTO).collect(Collectors.toList());
    }

}
