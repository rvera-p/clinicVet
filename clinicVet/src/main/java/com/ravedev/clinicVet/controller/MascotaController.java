package com.ravedev.clinicVet.controller;

import com.ravedev.clinicVet.dto.MascotaDuenioDTO;
import com.ravedev.clinicVet.model.Mascota;
import com.ravedev.clinicVet.service.IMascotaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mascota")
@RequiredArgsConstructor
public class MascotaController {

    private final IMascotaService mascotaService;

    @GetMapping("/all")
    public ResponseEntity<List<Mascota>> getAllMascotas(){
        return ResponseEntity.ok(mascotaService.getAllMascotas());
    }

    @PostMapping("/create")
    public ResponseEntity<String> saveMascota(@RequestBody Mascota duenio){
        mascotaService.saveMascota(duenio);
        return ResponseEntity.ok("Save successfully");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteMascota(@PathVariable Long id){
        mascotaService.deleteMascota(id);
        return ResponseEntity.ok("Delete successfully");
    }

    @PutMapping("/update")
    public ResponseEntity<Mascota> updateMascota(@RequestBody Mascota duenio){
        mascotaService.updateMascota(duenio);
        return ResponseEntity.ok(mascotaService.findMascota(duenio.getId()));
    }

    @GetMapping("get-caniches")
    public ResponseEntity<List<Mascota>> getCaniches(){
        return ResponseEntity.ok(mascotaService.getCaniches());
    }

    @GetMapping("/get-duenios")
    public ResponseEntity<List<MascotaDuenioDTO>> getMascotaDuenios(){
        return ResponseEntity.ok(mascotaService.getMascotaDuenios());
    }
}
