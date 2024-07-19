package com.server.nata_service.services;

import com.server.nata_service.entities.Certificate;
import com.server.nata_service.repositories.CertificateRepository;
import com.server.nata_service.services.exceptions.DatabaseException;
import com.server.nata_service.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CertificateService {

    @Autowired
    private CertificateRepository certificateRepository;

    @Transactional(readOnly = true)
    public Page<Certificate> findAll(Pageable pageable) {
        return certificateRepository.findAll(pageable);
    }

    @Transactional(readOnly = true)
    public Certificate findById(Long id) {
        return certificateRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Resource Not Found"));
    }

    @Transactional
    public Certificate create(Certificate certificate) {
        return certificateRepository.save(certificate);
    }

    @Transactional
    public Certificate update(Certificate certificate, Long id) {
        try {
            Certificate certificate1 =  certificateRepository.getReferenceById(id);
            certificate1.setName(certificate.getName());
            return certificateRepository.save(certificate1);
        }
        catch (EntityNotFoundException e){
            throw new ResourceNotFoundException("Resource Not Found");
        }


    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public void delete(Long id) {
        if(!certificateRepository.existsById(id))
        {
            throw new ResourceNotFoundException("Resource Not Found");
        }
        try {
            certificateRepository.deleteById(id);
        }
        catch (DataIntegrityViolationException e) {
            throw new DatabaseException("Referential integrity failure");
        }
    }
}
