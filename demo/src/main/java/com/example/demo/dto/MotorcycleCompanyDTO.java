package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class MotorcycleCompanyDTO {
    private Long id;
    private String name;
    private List<ProductionLineDTO> productionLines;
    private AssemblyLineDTO assemblyLine;
    private int numberOfMotorcycles;
    private Long assemblyLineId;
    private Long productionLineId;

}
