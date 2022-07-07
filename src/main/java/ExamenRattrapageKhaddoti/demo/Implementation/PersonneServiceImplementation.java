package ExamenRattrapageKhaddoti.demo.Implementation;

import ExamenRattrapageKhaddoti.demo.DTO.PersonneDTO;
import ExamenRattrapageKhaddoti.demo.Exception.PersonneNotFoundException;
import ExamenRattrapageKhaddoti.demo.model.Personne;
import ExamenRattrapageKhaddoti.demo.repository.PersonneRepository;
import ExamenRattrapageKhaddoti.demo.service.PersonneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonneServiceImplementation implements PersonneService {
    @Autowired
    PersonneRepository personneRepository;
    @Override
    public Personne getPersonnesById(long id) {
        return personneRepository.findPersonneById(id);
    }

    @Override
    public void addPersonne(PersonneDTO personneDTO) {
        Personne personne=new Personne(personneDTO.getCin(),personneDTO.getPrenom(),personneDTO.getNom());
        personneRepository.save(personne);
    }

    @Override
    public void deletePersonneById(long id) throws PersonneNotFoundException {
        Personne personne=personneRepository.findById(id).orElseThrow(()->new PersonneNotFoundException("Non de perssonne trouvé"));
        personneRepository.delete(personne);
    }

    @Override
    public Personne updatePersonne(PersonneDTO personneDTO) throws PersonneNotFoundException {
        Personne personne=personneRepository.findById(personneDTO.getId()).orElseThrow(()->new PersonneNotFoundException("Non de perssonne trouvé"));
        personne.setCin(personneDTO.getCin());
        personne.setPrenom(personneDTO.getPrenom());
        personne.setNom(personneDTO.getNom());
        return  personneRepository.save(personne);
    }

    @Override
    public List<Personne> getAllPersonnes() {
        return personneRepository.findAll();
    }
}
