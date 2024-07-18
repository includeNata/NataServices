package com.server.nata_service.services;

import com.server.nata_service.dto.AreaDTO;
import com.server.nata_service.entities.Area;
import com.server.nata_service.repositories.AreaRepository;
import com.server.nata_service.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class AreaService {

    private final AreaRepository areaRepository;

    @Autowired
    public AreaService(AreaRepository areaRepository) {
        this.areaRepository = areaRepository;
    }

    public List<AreaDTO> getAllAreas() {
        List<Area> areas = areaRepository.findAll();
        return areas.stream()
                .map(AreaDTO::new)
                .collect(Collectors.toList());
    }

    public AreaDTO getAreaById(Long id) {
        Area area = areaRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Area not found"));
        return new AreaDTO(area);
    }

    public AreaDTO createArea(AreaDTO areaDTO) {
        Area area = new Area();
        BeanUtils.copyProperties(areaDTO, area);
        area = areaRepository.save(area);
        return new AreaDTO(area);
    }

    public AreaDTO updateArea(Long id, AreaDTO areaDTO) {
        Area existingArea = areaRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Area not found"));

        BeanUtils.copyProperties(areaDTO, existingArea);

        existingArea = areaRepository.save(existingArea);
        return new AreaDTO(existingArea);
    }

    public void deleteArea(Long id) {
        areaRepository.deleteById(id);
    }
}
