package cat.itacademy.barcelonactiva.ramirez.xavi.s04.t02.n01.model;

import javax.persistence.*;

@Entity
@Table(name = "Fruites")
public class Fruita {

    //int id, String nom, int quantitatQuilos

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "quantitatQuilos")
    private int quantitatQuilos;

    public Fruita() {

    }

    public Fruita(String nom, int quantitatQuilos) {
        this.nom = nom;
        this.quantitatQuilos = quantitatQuilos;

    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQuantitatQuilos() {
        return quantitatQuilos;
    }

    public void setQuantitatQuilos(int quantitatQuilos) {
        this.quantitatQuilos = quantitatQuilos;
    }

    @Override
    public String toString() {
        return "Tutorial [id=" + id + ", nom=" + nom + ", quantitatQuilos=" + quantitatQuilos + "]";
    }

}

