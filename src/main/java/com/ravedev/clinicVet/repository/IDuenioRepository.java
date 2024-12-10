package com.ravedev.clinicVet.repository;

import com.ravedev.clinicVet.model.Duenio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDuenioRepository extends JpaRepository<Duenio, Long> {
}
