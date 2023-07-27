package com.example.demo.mapper;

import com.example.demo.dto.AssemblyLineDTO;
import com.example.demo.model.AssemblyLine;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AssemblyLineMapper {
    AssemblyLineMapper INSTANCE = Mappers.getMapper(AssemblyLineMapper.class);

    AssemblyLineDTO assemblyLineToDTO(AssemblyLine assemblyLine);

    AssemblyLine dtoToAssemblyLine(AssemblyLineDTO assemblyLineDTO);
}
