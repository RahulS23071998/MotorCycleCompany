package com.example.demo.controller;

import com.example.demo.dto.AssemblyLineDTO;
import com.example.demo.dto.MotorcycleCompanyDTO;
import com.example.demo.model.AssemblyLine;
import com.example.demo.model.MotorcycleCompany;
import com.example.demo.model.ProductionLine;
import com.example.demo.repository.AssemblyLineRepository;
import com.example.demo.repository.MotorcycleCompanyRepository;
import com.example.demo.repository.ProductionLineRepository;
import com.example.demo.service.MotorcycleCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class MotorcycleCompanyController {

    @Autowired
    private MotorcycleCompanyService motorcycleCompanyService;
    @Autowired
    private MotorcycleCompanyRepository motorcycleCompanyRepository;
    @Autowired
    private ProductionLineRepository productionLineRepository;
    @Autowired
    private AssemblyLineRepository assemblyLineRepository;

    @GetMapping
    public ResponseEntity<List<MotorcycleCompanyDTO>> getAllCompanies() {
        return new ResponseEntity<>(motorcycleCompanyService.getAllCompany(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<MotorcycleCompanyDTO> createCompany(@RequestBody MotorcycleCompanyDTO motorcycleCompanyDTO) {
        return new ResponseEntity<>(motorcycleCompanyService.saveMotorcycleCompany(motorcycleCompanyDTO), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MotorcycleCompanyDTO> getCompanyById(@PathVariable Long id) {
        MotorcycleCompanyDTO companyDTO = motorcycleCompanyService.getMotorcycleCompanyById(id);
        if (companyDTO != null) {
            return ResponseEntity.ok(companyDTO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCompanyById(@PathVariable Long id) {
        motorcycleCompanyService.deleteMotorcycleCompany(id);
        return ResponseEntity.noContent().build();
    }

}