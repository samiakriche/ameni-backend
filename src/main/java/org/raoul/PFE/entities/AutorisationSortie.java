package org.raoul.PFE.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="autorisationSortie")
public class AutorisationSortie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    @JoinColumn(name = "employes",nullable=false)
    private Employe employes;
    @Column(name="motif", nullable = false)
    private String motif;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date date_sortie;
    private Time heure_sortie;
    private Time heure_retour;
    private LocalDateTime date_add;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getMotif() {
		return motif;
	}
	public void setMotif(String motif) {
		this.motif = motif;
	}
	public Date getDate_sortie() {
		return date_sortie;
	}
	public void setDate_sortie(Date date_sortie) {
		this.date_sortie = date_sortie;
	}
	public Time getHeure_sortie() {
		return heure_sortie;
	}
	public void setHeure_sortie(Time heure_sortie) {
		this.heure_sortie = heure_sortie;
	}
	public Time getHeure_retour() {
		return heure_retour;
	}
	public void setHeure_retour(Time heure_retour) {
		this.heure_retour = heure_retour;
	}
	public LocalDateTime getDate_add() {
		return date_add;
	}
	public void setDate_add(LocalDateTime date_add) {
		this.date_add = date_add;
	}
}

