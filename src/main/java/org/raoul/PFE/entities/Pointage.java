package org.raoul.PFE.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.json.JSONObject;

import javax.persistence.*;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "pointage")
public class Pointage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    @JoinColumn(name = "employes")
    private Employe employes;

    @OneToOne
    @JoinColumn(name = "pointeuses")
    private Pointeuse pointeuses;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate date;

    @OneToOne
    @JoinColumn(name = "heureprevue")
    private Heure heureprevue;

    @JsonFormat(pattern = "HH:mm:ss")
    private LocalTime pointage;

    @OneToOne
    @JoinColumn(name = "succursales")
    private Succursale succursales;
    private String retard;
	private LocalDateTime date_add;
    
   public Duration calculerRetard() {
        Heure heurePrevue = getHeureprevue();
        if (heurePrevue == null) {
            return Duration.ZERO;
        }

        LocalTime heurePointage = getPointage();
        if (heurePointage == null) {
            return Duration.ZERO;
        }

        LocalTime heurePrevueLocalTime = heurePrevue.getHeureprevue().toLocalTime();
        return Duration.between(heurePrevueLocalTime, heurePointage);
    }
  
   

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

	public Pointeuse getPointeuses() {
		return pointeuses;
	}

	public void setPointeuses(Pointeuse pointeuses) {
		this.pointeuses = pointeuses;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Heure getHeureprevue() {
		return heureprevue;
	}

	public void setHeureprevue(Heure heureprevue) {
		this.heureprevue = heureprevue;
	}

	public LocalTime getPointage() {
		return pointage;
	}

	public void setPointage(LocalTime pointage) {
		this.pointage = pointage;
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
	public void setRetard(String retard) {
        this.retard = retard;
    }



	 public String getRetard() {
	        Duration retard = calculerRetard();
	        long minutes = retard.toMinutes();
	        long heures = minutes / 60;
	        minutes = minutes % 60;

	        String formatRetard;
	        if (minutes > 0) {
	            formatRetard = String.format("%d heures %02d minutes", heures, minutes);
	        } else {
	            formatRetard = String.format("%d heures", heures);
	        }

	        return formatRetard;
	    }
	
		     
}
