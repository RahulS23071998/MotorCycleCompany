package com.example.demo.mapper;

import com.example.demo.dto.ProductionLineDTO;
import com.example.demo.model.ProductionLine;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductionLineMapper {
    ProductionLineMapper INSTANCE = Mappers.getMapper(ProductionLineMapper.class);

    ProductionLineDTO productionLineToDTO(ProductionLine productionLine);

    ProductionLine dtoToProductionLine(ProductionLineDTO productionLineDTO);
}
