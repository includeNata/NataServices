package com.server.nata_service.services;

import com.server.nata_service.entities.Area;
import com.server.nata_service.repositories.AreaRepository;
import com.server.nata_service.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AreaService {

    @Autowired
    private AreaRepository areaRepository;

    @Transactional(readOnly = true)
    public Page<Area> findAll(Pageable pageable) {
        return areaRepository.findAll(pageable);
    }

    @Transactional(readOnly = true)
    public Area findById(Long id) {
        return areaRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Area not found"));
    }

    @Transactional
    public Area create(Area area) {
        return areaRepository.save(area);
    }

    @Transactional
    public Area update(Long id, Area area) {
        Area existingArea = areaRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Area not found"));

        BeanUtils.copyProperties(area, existingArea, "id");

        return areaRepository.save(existingArea);
    }

    @Transactional
    public void delete(Long id) {
        areaRepository.deleteById(id);
    }
}
