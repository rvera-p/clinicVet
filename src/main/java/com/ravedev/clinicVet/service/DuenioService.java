package com.ravedev.clinicVet.service;

import com.ravedev.clinicVet.model.Duenio;
import com.ravedev.clinicVet.repository.IDuenioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DuenioService implements IDuenioService{

    private final IDuenioRepository duenioRepository;

    @Override
    public List<Duenio> getAllDuenios() {
        return duenioRepository.findAll().stream().toList();
    }

    @Override
    public void saveDuenio(Duenio duenio) {
        duenioRepository.save(duenio);
    }

    @Override
    public void deleteDuenio(Long id) {
        duenioRepository.deleteById(id);
    }

    @Override
    public Duenio findDuenio(Long id) {
        return duenioRepository.findById(id).orElse(null);
    }

    @Override
    public void updateDuenio(Duenio duenioDetails) {
        this.saveDuenio(duenioDetails);
    }
}
