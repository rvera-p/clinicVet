package com.ravedev.clinicVet.service;

import com.ravedev.clinicVet.dto.MascotaDuenioDTO;
import com.ravedev.clinicVet.model.Mascota;

import java.util.List;

public interface IMascotaService {

    public List<Mascota> getAllMascotas();

    public void saveMascota(Mascota mascota);

    public void deleteMascota(Long id);

    public Mascota findMascota(Long id);

    public void updateMascota(Mascota mascotaDetails);

    public List<Mascota> getCaniches();

    public List<MascotaDuenioDTO> getMascotaDuenios();
}
