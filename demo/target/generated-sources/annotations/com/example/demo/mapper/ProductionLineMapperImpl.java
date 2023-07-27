package com.example.demo.mapper;

import com.example.demo.dto.ProductionLineDTO;
import com.example.demo.model.ProductionLine;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-27T16:03:27+0530",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19.0.2 (Oracle Corporation)"
)
public class ProductionLineMapperImpl implements ProductionLineMapper {

    @Override
    public ProductionLineDTO productionLineToDTO(ProductionLine productionLine) {
        if ( productionLine == null ) {
            return null;
        }

        ProductionLineDTO productionLineDTO = new ProductionLineDTO();

        productionLineDTO.setId( productionLine.getId() );
        productionLineDTO.setType( productionLine.getType() );
        productionLineDTO.setProductionRate( productionLine.getProductionRate() );

        return productionLineDTO;
    }

    @Override
    public ProductionLine dtoToProductionLine(ProductionLineDTO productionLineDTO) {
        if ( productionLineDTO == null ) {
            return null;
        }

        ProductionLine productionLine = new ProductionLine();

        productionLine.setId( productionLineDTO.getId() );
        productionLine.setType( productionLineDTO.getType() );
        productionLine.setProductionRate( productionLineDTO.getProductionRate() );

        return productionLine;
    }
}
