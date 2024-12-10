package com.ravedev.clinicVet.service;

import com.ravedev.clinicVet.model.Duenio;

import java.util.List;

public interface IDuenioService {

    public List<Duenio> getAllDuenios();

    public void saveDuenio(Duenio duenio);

    public void deleteDuenio(Long id);

    public Duenio findDuenio(Long id);

    public void updateDuenio(Duenio duenioDetails);
}
