package org.raoul.PFE.entities;

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
@Table(name = "employe")
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    private Date date_naissance;
    @OneToOne
    @JoinColumn(name = "sexs")
    private Sexe sexs;
    @Column(name = "adresse")
    private String adresse;
    @Column(name = "telephone")
    private int telephone;
    @Column(name = "email")
    private String email;
    @OneToOne
    @JoinColumn(name = "succursales")
    private Succursale succursales;
    @OneToOne
    @JoinColumn(name = "equipes")
    private Equipe equipes;
    @OneToOne
    @JoinColumn(name = "superviseurs")
    private Superviseur superviseurs;
    @OneToOne
    @JoinColumn(name = "typeContrats")
    private TypeContrat typeContrats;
    private Date debutcontrat;
    private String matricule;
    @OneToOne
    @JoinColumn(name = "pointeuses")
    private Pointeuse pointeuses;
    @OneToOne
    @JoinColumn(name = "plannings")
    private Planning plannings;

	@Column(name = "date_add")
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
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}
	public Sexe getSexs() {
		return sexs;
	}
	public void setSexs(Sexe sexs) {
		this.sexs = sexs;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Succursale getSuccursales() {
		return succursales;
	}
	public void setSuccursales(Succursale succursales) {
		this.succursales = succursales;
	}
	public Equipe getEquipes() {
		return equipes;
	}
	public void setEquipes(Equipe equipes) {
		this.equipes = equipes;
	}
	public Superviseur getSuperviseurs() {
		return superviseurs;
	}
	public void setSuperviseurs(Superviseur superviseurs) {
		this.superviseurs = superviseurs;
	}
	public TypeContrat getTypeContrats() {
		return typeContrats;
	}
	public void setTypeContrats(TypeContrat typeContrats) {
		this.typeContrats = typeContrats;
	}
	public Date getDebutcontrat() {
		return debutcontrat;
	}
	public void setDebutcontrat(Date debutcontrat) {
		this.debutcontrat = debutcontrat;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public Pointeuse getPointeuses() {
		return pointeuses;
	}
	public void setPointeuses(Pointeuse pointeuses) {
		this.pointeuses = pointeuses;
	}
	public Planning getPlannings() {
		return plannings;
	}
	public void setPlannings(Planning plannings) {
		this.plannings = plannings;
	}
	public LocalDateTime getDate_add() {
		return date_add;
	}
	public void setDate_add(LocalDateTime date_add) {
		this.date_add = date_add;
	}
	
	

}
