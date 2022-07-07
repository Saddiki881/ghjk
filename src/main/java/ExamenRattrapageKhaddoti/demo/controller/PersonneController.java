package ExamenRattrapageKhaddoti.demo.controller;

import ExamenRattrapageKhaddoti.demo.DTO.PersonneDTO;
import ExamenRattrapageKhaddoti.demo.Exception.PersonneNotFoundException;
import ExamenRattrapageKhaddoti.demo.model.Personne;
import ExamenRattrapageKhaddoti.demo.repository.PersonneRepository;
import ExamenRattrapageKhaddoti.demo.service.PersonneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PersonneController {
    PersonneService personneService;
    @Autowired
    PersonneRepository personneRepository;
    @GetMapping("/personnes")
    public List<Personne>getAllPersonnes(){
        return  personneService.getAllPersonnes();
    }
    @GetMapping("/personne")
    public Personne getPersonne(@RequestParam long id){
        return personneService.getPersonnesById(id);
    }
    @PutMapping("/personne/update")
    public Personne updatePersonne(@RequestBody PersonneDTO personneDTO) throws PersonneNotFoundException {
        return personneService.updatePersonne(personneDTO);
    }
    @DeleteMapping("/personne/delete")
    public  String deletePersonne(@RequestParam long id) throws PersonneNotFoundException {
        personneService.deletePersonneById(id);
        return "Personne est supprimé en bonne santé,id "+id;
    }
    @PostMapping("/personne/add")
    public String addPersonne(@RequestBody PersonneDTO personneDTO){
        personneService.addPersonne(personneDTO);
        return "Personne est ajouté en bonne santé"+personneDTO.getNom()+" "+personneDTO.getPrenom();
    }
}
