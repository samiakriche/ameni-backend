package org.raoul.PFE.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "superviseur")
public class Superviseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String prenom;
    private String nom;
    
    @OneToOne
    @JoinColumn(name = "succursales")
    private Succursale succursales;

    private LocalDateTime date_add;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Succursale getSuccursales() {
		return succursales;
	}

	public void setSuccursales(Succursale succursales) {
		this.succursales = succursales;
	}

	public LocalDateTime getDate_add() {
		return date_add;
	}

	public void setDate_add(LocalDateTime date_add) {
		this.date_add = date_add;
	}

    
}
