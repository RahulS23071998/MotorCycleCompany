package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MotorcycleCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "motorcycleCompany", cascade = CascadeType.ALL)
    private List<ProductionLine> productionLines;

    @OneToOne(mappedBy = "motorcycleCompany", cascade = CascadeType.ALL)
    private AssemblyLine assemblyLine;

    private int numberOfMotorcycles;

}
