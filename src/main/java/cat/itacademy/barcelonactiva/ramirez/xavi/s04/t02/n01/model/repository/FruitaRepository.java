package cat.itacademy.barcelonactiva.ramirez.xavi.s04.t02.n01.model.repository;

import cat.itacademy.barcelonactiva.ramirez.xavi.s04.t02.n01.model.Fruita;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FruitaRepository extends JpaRepository<Fruita, Integer> {
   // List<Fruita> findByNameContaining(String nom);

    }