package ExamenRattrapageKhaddoti.demo.model;

import javax.naming.ldap.PagedResultsControl;
import javax.persistence.*;

@Entity
@Table(name = "Personne")
public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "CIN",unique = true)
    private String Cin;

    public Personne() {
        super();
    }

    public Personne( String cin, String prenom, String nom) {
        super();
        Cin = cin;
        Prenom = prenom;
        Nom = nom;
    }

    @Column(name = "PRENOM")
    private String Prenom;
    @Column(name = "NOM")
    private String Nom;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCin() {
        return Cin;
    }

    public void setCin(String cin) {
        Cin = cin;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }
}
