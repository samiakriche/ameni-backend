package org.raoul.PFE.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="succursale")

public class Succursale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
   
	@Column(name="nom",unique = true)
    private String nom;
    @Column(name="adresse")
    private String adresse;
    @Column(name="ville")
    private String ville;
    @Column(name="email",unique = true)
    private String email;
    @Column(name="telephone",unique = true)
    private int telephone;
    @JsonFormat(pattern="dd-MM-yyyy")
    private Date date_creation;
    private LocalDateTime date_add;
    public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	public LocalDateTime getDate_add() {
		return date_add;
	}
	public void setDate_add(LocalDateTime date_add) {
		this.date_add = date_add;
	}

}
