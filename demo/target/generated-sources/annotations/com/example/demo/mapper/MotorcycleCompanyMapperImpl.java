package com.example.demo.mapper;

import com.example.demo.dto.AssemblyLineDTO;
import com.example.demo.dto.MotorcycleCompanyDTO;
import com.example.demo.dto.ProductionLineDTO;
import com.example.demo.model.AssemblyLine;
import com.example.demo.model.MotorcycleCompany;
import com.example.demo.model.ProductionLine;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-27T16:03:26+0530",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19.0.2 (Oracle Corporation)"
)
public class MotorcycleCompanyMapperImpl implements MotorcycleCompanyMapper {

    @Override
    public MotorcycleCompanyDTO motorcycleCompanyToDTO(MotorcycleCompany motorcycleCompany) {
        if ( motorcycleCompany == null ) {
            return null;
        }

        MotorcycleCompanyDTO motorcycleCompanyDTO = new MotorcycleCompanyDTO();

        motorcycleCompanyDTO.setId( motorcycleCompany.getId() );
        motorcycleCompanyDTO.setName( motorcycleCompany.getName() );
        motorcycleCompanyDTO.setProductionLines( productionLineListToProductionLineDTOList( motorcycleCompany.getProductionLines() ) );
        motorcycleCompanyDTO.setAssemblyLine( assemblyLineToAssemblyLineDTO( motorcycleCompany.getAssemblyLine() ) );
        motorcycleCompanyDTO.setNumberOfMotorcycles( motorcycleCompany.getNumberOfMotorcycles() );

        return motorcycleCompanyDTO;
    }

    @Override
    public MotorcycleCompany dtoToMotorcycleCompany(MotorcycleCompanyDTO motorcycleCompanyDTO) {
        if ( motorcycleCompanyDTO == null ) {
            return null;
        }

        MotorcycleCompany motorcycleCompany = new MotorcycleCompany();

        motorcycleCompany.setId( motorcycleCompanyDTO.getId() );
        motorcycleCompany.setName( motorcycleCompanyDTO.getName() );
        motorcycleCompany.setProductionLines( productionLineDTOListToProductionLineList( motorcycleCompanyDTO.getProductionLines() ) );
        motorcycleCompany.setAssemblyLine( assemblyLineDTOToAssemblyLine( motorcycleCompanyDTO.getAssemblyLine() ) );
        motorcycleCompany.setNumberOfMotorcycles( motorcycleCompanyDTO.getNumberOfMotorcycles() );

        return motorcycleCompany;
    }

    protected ProductionLineDTO productionLineToProductionLineDTO(ProductionLine productionLine) {
        if ( productionLine == null ) {
            return null;
        }

        ProductionLineDTO productionLineDTO = new ProductionLineDTO();

        productionLineDTO.setId( productionLine.getId() );
        productionLineDTO.setType( productionLine.getType() );
        productionLineDTO.setProductionRate( productionLine.getProductionRate() );

        return productionLineDTO;
    }

    protected List<ProductionLineDTO> productionLineListToProductionLineDTOList(List<ProductionLine> list) {
        if ( list == null ) {
            return null;
        }

        List<ProductionLineDTO> list1 = new ArrayList<ProductionLineDTO>( list.size() );
        for ( ProductionLine productionLine : list ) {
            list1.add( productionLineToProductionLineDTO( productionLine ) );
        }

        return list1;
    }

    protected AssemblyLineDTO assemblyLineToAssemblyLineDTO(AssemblyLine assemblyLine) {
        if ( assemblyLine == null ) {
            return null;
        }

        AssemblyLineDTO assemblyLineDTO = new AssemblyLineDTO();

        assemblyLineDTO.setId( assemblyLine.getId() );
        assemblyLineDTO.setType( assemblyLine.getType() );
        assemblyLineDTO.setProductionRate( assemblyLine.getProductionRate() );

        return assemblyLineDTO;
    }

    protected ProductionLine productionLineDTOToProductionLine(ProductionLineDTO productionLineDTO) {
        if ( productionLineDTO == null ) {
            return null;
        }

        ProductionLine productionLine = new ProductionLine();

        productionLine.setId( productionLineDTO.getId() );
        productionLine.setType( productionLineDTO.getType() );
        productionLine.setProductionRate( productionLineDTO.getProductionRate() );

        return productionLine;
    }

    protected List<ProductionLine> productionLineDTOListToProductionLineList(List<ProductionLineDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<ProductionLine> list1 = new ArrayList<ProductionLine>( list.size() );
        for ( ProductionLineDTO productionLineDTO : list ) {
            list1.add( productionLineDTOToProductionLine( productionLineDTO ) );
        }

        return list1;
    }

    protected AssemblyLine assemblyLineDTOToAssemblyLine(AssemblyLineDTO assemblyLineDTO) {
        if ( assemblyLineDTO == null ) {
            return null;
        }

        AssemblyLine assemblyLine = new AssemblyLine();

        assemblyLine.setId( assemblyLineDTO.getId() );
        assemblyLine.setType( assemblyLineDTO.getType() );
        assemblyLine.setProductionRate( assemblyLineDTO.getProductionRate() );

        return assemblyLine;
    }
}
