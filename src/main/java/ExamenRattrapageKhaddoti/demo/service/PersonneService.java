package ExamenRattrapageKhaddoti.demo.service;

import ExamenRattrapageKhaddoti.demo.DTO.PersonneDTO;
import ExamenRattrapageKhaddoti.demo.Exception.PersonneNotFoundException;
import ExamenRattrapageKhaddoti.demo.model.Personne;

import java.util.List;

public interface PersonneService {
    Personne getPersonnesById(long id);
    void addPersonne(PersonneDTO personneDTO);
    void deletePersonneById(long id) throws PersonneNotFoundException;
    Personne updatePersonne(PersonneDTO personneDTO) throws PersonneNotFoundException;
    List<Personne>getAllPersonnes();
}
