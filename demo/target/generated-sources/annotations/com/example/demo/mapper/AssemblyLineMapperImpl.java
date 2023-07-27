package com.example.demo.mapper;

import com.example.demo.dto.AssemblyLineDTO;
import com.example.demo.model.AssemblyLine;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-27T16:03:27+0530",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19.0.2 (Oracle Corporation)"
)
public class AssemblyLineMapperImpl implements AssemblyLineMapper {

    @Override
    public AssemblyLineDTO assemblyLineToDTO(AssemblyLine assemblyLine) {
        if ( assemblyLine == null ) {
            return null;
        }

        AssemblyLineDTO assemblyLineDTO = new AssemblyLineDTO();

        assemblyLineDTO.setId( assemblyLine.getId() );
        assemblyLineDTO.setType( assemblyLine.getType() );
        assemblyLineDTO.setProductionRate( assemblyLine.getProductionRate() );

        return assemblyLineDTO;
    }

    @Override
    public AssemblyLine dtoToAssemblyLine(AssemblyLineDTO assemblyLineDTO) {
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
