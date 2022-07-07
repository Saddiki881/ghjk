package ExamenRattrapageKhaddoti.demo.repository;

import ExamenRattrapageKhaddoti.demo.model.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepository extends JpaRepository<Personne,Long> {
    Personne findPersonneById(long id);
}
