package org.raoul.PFE.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "planning")
public class Planning {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name = "description")
    private String description;
    
    @JsonFormat(pattern = "dd-MM-yyyy")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private java.util.Date date_debut;
    
    @JsonFormat(pattern = "dd-MM-yyyy")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private java.util.Date date_fin;
    
    @JsonFormat(pattern = "HH:mm:ss")
    @DateTimeFormat(pattern = "HH:mm:ss")
    private java.sql.Time heure_debut;
    
    @JsonFormat(pattern = "HH:mm:ss")
    @DateTimeFormat(pattern = "HH:mm:ss")
    private java.sql.Time heure_fin;
    
    private LocalDateTime date_add;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public java.util.Date getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(java.util.Date date_debut) {
		this.date_debut = date_debut;
	}

	public java.util.Date getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(java.util.Date date_fin) {
		this.date_fin = date_fin;
	}

	public java.sql.Time getHeure_debut() {
		return heure_debut;
	}

	public void setHeure_debut(java.sql.Time heure_debut) {
		this.heure_debut = heure_debut;
	}

	public java.sql.Time getHeure_fin() {
		return heure_fin;
	}

	public void setHeure_fin(java.sql.Time heure_fin) {
		this.heure_fin = heure_fin;
	}

	public LocalDateTime getDate_add() {
		return date_add;
	}

	public void setDate_add(LocalDateTime date_add) {
		this.date_add = date_add;
	}
    
    
}
