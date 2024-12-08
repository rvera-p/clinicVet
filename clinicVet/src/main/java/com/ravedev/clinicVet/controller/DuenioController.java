package com.ravedev.clinicVet.controller;

import com.ravedev.clinicVet.model.Duenio;
import com.ravedev.clinicVet.service.IDuenioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/duenio")
@RequiredArgsConstructor
public class DuenioController {

    private final IDuenioService duenioService;

    @GetMapping("/all")
    public ResponseEntity<List<Duenio>> getAllDuenios(){
        return ResponseEntity.ok(duenioService.getAllDuenios());
    }

    @PostMapping("/create")
    public ResponseEntity<String> saveDuenio(@RequestBody Duenio duenio){
        duenioService.saveDuenio(duenio);
        return ResponseEntity.ok("Save successfully");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteDuenio(@PathVariable Long id){
        duenioService.deleteDuenio(id);
        return ResponseEntity.ok("Delete successfully");
    }

    @PutMapping("/update")
    public ResponseEntity<Duenio> updateDuenio(@RequestBody Duenio duenio){
        duenioService.updateDuenio(duenio);
        return ResponseEntity.ok(duenioService.findDuenio(duenio.getId()));
    }
}
