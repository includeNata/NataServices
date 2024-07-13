package com.server.nata_service.services;

import com.server.nata_service.dto.SkillDTO;
import com.server.nata_service.entities.Skill;
import com.server.nata_service.repositories.SkillRepository;
import com.server.nata_service.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SkillService {

    @Autowired
    private SkillRepository skillRepository;

    @Transactional(readOnly = true)
    public Page<SkillDTO> findAll(Pageable pageable) {
        Page<Skill> skills = skillRepository.findAll(pageable);
        return skills.map(SkillDTO::new);
    }

    @Transactional(readOnly = true)
    public SkillDTO findById(Long id) {
        Skill skill = skillRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("cannot found the resource"));
        return new SkillDTO(skill);
    }

    @Transactional
    public SkillDTO createSkill(SkillDTO skillDTO) {
        Skill skill = new Skill();
        skill.setArea(skillDTO.getArea());
        skill.setCertificate(skillDTO.getCertificate());
        skill.setDescription(skillDTO.getDescription());
        skill.setFormation(skillDTO.getFormation());
        skill.setTechnology(skillDTO.getTechnology());
        skill = skillRepository.save(skill);
        return new SkillDTO(skill);
    }

    @Transactional
    public SkillDTO updateSkill(Long id, SkillDTO skillDTO) {
        Skill skill = skillRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("cannot found the resource"));
        skill.setArea(skillDTO.getArea());
        skill.setCertificate(skillDTO.getCertificate());
        skill.setDescription(skillDTO.getDescription());
        skill.setFormation(skillDTO.getFormation());
        skill.setTechnology(skillDTO.getTechnology());
        skill = skillRepository.save(skill);
        return new SkillDTO(skill);
    }

    //delete

}
