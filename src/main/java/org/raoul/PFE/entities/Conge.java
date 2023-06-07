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
@Table(name="Conge")
public class Conge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    @JoinColumn(name = "employes")
    private Employe employes;
    @Column(name="motif")
    private String motif;
    @JsonFormat(pattern="dd-MM-yyyy")
    private Date date_debut;
	@JsonFormat(pattern="dd-MM-yyyy")
    private Date date_fin;
    @JsonFormat(pattern="dd-MM-yyyy")
    private Date date_retour;
    @Column(name="date_add")
    private Date date_add;
    public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Employe getEmployes() {
		return employes;
	}
	public void setEmployes(Employe employes) {
		this.employes = employes;
	}
	public String getMotif() {
		return motif;
	}
	public void setMotif(String motif) {
		this.motif = motif;
	}
	public Date getDate_debut() {
		return date_debut;
	}
	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}
	public Date getDate_fin() {
		return date_fin;
	}
	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}
	public Date getDate_retour() {
		return date_retour;
	}
	public void setDate_retour(Date date_retour) {
		this.date_retour = date_retour;
	}
	public Date getDate_add() {
		return date_add;
	}
	public void setDate_add(Date date_add) {
		this.date_add = date_add;
	}

}
