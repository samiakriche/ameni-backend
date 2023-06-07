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
@Table(name="equipe")

public class Equipe {
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "nom")
    private String nom;
    @ManyToOne
    private Succursale succursales;
    @OneToOne
    @JoinColumn(name = "superviseurs")
    private Superviseur superviseurs;
    private Date date_creation;
    @OneToOne
    @JoinColumn(name = "plannings")
    private Planning plannings;
    @Column(name= "date_add")
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
	public Succursale getSuccursales() {
		return succursales;
	}
	public void setSuccursales(Succursale succursales) {
		this.succursales = succursales;
	}
	public Superviseur getSuperviseurs() {
		return superviseurs;
	}
	public void setSuperviseurs(Superviseur superviseurs) {
		this.superviseurs = superviseurs;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
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
