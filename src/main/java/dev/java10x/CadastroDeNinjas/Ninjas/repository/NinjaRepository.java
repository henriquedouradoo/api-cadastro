package dev.java10x.CadastroDeNinjas.Ninjas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NinjaRepository extends JpaRepository<NinjaRepository, Long> {
}
