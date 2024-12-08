package com.ravedev.clinicVet.service;

import com.ravedev.clinicVet.dto.MascotaDuenioDTO;
import com.ravedev.clinicVet.model.Mascota;
import com.ravedev.clinicVet.repository.IMascotaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MascotaService implements IMascotaService{

    private final IMascotaRepository mascotaRepository;

    @Override
    public List<Mascota> getAllMascotas() {
        return mascotaRepository.findAll().stream().toList();
    }

    @Override
    public void saveMascota(Mascota mascota) {
        mascotaRepository.save(mascota);
    }

    @Override
    public void deleteMascota(Long id) {
        mascotaRepository.deleteById(id);
    }

    @Override
    public Mascota findMascota(Long id) {
        return mascotaRepository.findById(id).orElse(null);
    }

    @Override
    public void updateMascota(Mascota mascotaDetails) {
        this.saveMascota(mascotaDetails);
    }

    @Override
    public List<Mascota> getCaniches() {
        List<Mascota> listMascotas = this.getAllMascotas();
        List<Mascota> listCaniches = new ArrayList<Mascota>();

        for (Mascota mascota:listMascotas){
            if (mascota.getEspecie().equalsIgnoreCase("perro") && mascota.getRaza().equalsIgnoreCase("caniche")){
                listCaniches.add(mascota);
            }
        }

        return listCaniches;
    }

    @Override
    public List<MascotaDuenioDTO> getMascotaDuenios() {
        List<Mascota> listMascotas = this.getAllMascotas();
        List<MascotaDuenioDTO> listMascotaDuenioDTO = new ArrayList<MascotaDuenioDTO>();
        MascotaDuenioDTO mdDTO = new MascotaDuenioDTO();

        for (Mascota mascota:listMascotas){
            System.out.println(mascota.getNombre());

            mdDTO.setNombre_mascota(mascota.getNombre());
            mdDTO.setRaza(mascota.getRaza());
            mdDTO.setEspecie(mascota.getEspecie());
            mdDTO.setNombre_duenio(mascota.getDuenio().getNombre());
            mdDTO.setApellido_duenio(mascota.getDuenio().getApellido());

            listMascotaDuenioDTO.add(mdDTO);
            mdDTO = new MascotaDuenioDTO();
        }

        return listMascotaDuenioDTO;
    }
}
