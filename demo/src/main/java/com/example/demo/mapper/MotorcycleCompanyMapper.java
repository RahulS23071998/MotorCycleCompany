package com.example.demo.mapper;

import com.example.demo.dto.MotorcycleCompanyDTO;
import com.example.demo.model.MotorcycleCompany;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MotorcycleCompanyMapper {
    MotorcycleCompanyMapper INSTANCE = Mappers.getMapper(MotorcycleCompanyMapper.class);

    MotorcycleCompanyDTO motorcycleCompanyToDTO(MotorcycleCompany motorcycleCompany);

    MotorcycleCompany dtoToMotorcycleCompany(MotorcycleCompanyDTO motorcycleCompanyDTO);
}
