package com.server.nata_service.services;

import com.server.nata_service.dto.TechnologyDTO;
import com.server.nata_service.entities.Technology;
import com.server.nata_service.repositories.TechnologyRepository;
import com.server.nata_service.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class TechnologyService {

    private final TechnologyRepository technologyRepository;

    @Autowired
    public TechnologyService(TechnologyRepository technologyRepository) {
        this.technologyRepository = technologyRepository;
    }

    public List<TechnologyDTO> getAllTechnologies() {
        List<Technology> technologies = technologyRepository.findAll();
        return technologies.stream()
                .map(TechnologyDTO::new)
                .collect(Collectors.toList());
    }

    public TechnologyDTO getTechnologyById(Long id) {
        Technology technology = technologyRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Technology not found"));
        return new TechnologyDTO(technology);
    }

    public TechnologyDTO createTechnology(TechnologyDTO technologyDTO) {
        Technology technology = new Technology();
        BeanUtils.copyProperties(technologyDTO, technology);
        technology = technologyRepository.save(technology);
        return new TechnologyDTO(technology);
    }

    public TechnologyDTO updateTechnology(Long id, TechnologyDTO technologyDTO) {
        Technology existingTechnology = technologyRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Technology not found"));

        BeanUtils.copyProperties(technologyDTO, existingTechnology);

        existingTechnology = technologyRepository.save(existingTechnology);
        return new TechnologyDTO(existingTechnology);
    }

    public void deleteTechnology(Long id) {
        technologyRepository.deleteById(id);
    }
}
