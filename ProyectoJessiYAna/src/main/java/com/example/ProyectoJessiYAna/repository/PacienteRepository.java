package com.example.ProyectoJessiYAna.repository;

import com.example.ProyectoJessiYAna.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface PacienteRepository extends JpaRepository<Paciente,Long> {
    Optional<Paciente> findByEmail(String email);
}
