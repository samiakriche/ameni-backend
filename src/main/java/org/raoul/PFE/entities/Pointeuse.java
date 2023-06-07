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
@Table(name="pointeuse")

public class Pointeuse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="nom")
    private String nom;
    private String ip;
    private int numero;
    private int port;
    private String mot_passe;
    private int bauds;
    private int numero_serie;
    @OneToOne
    @JoinColumn(name = "succursales")
    private Succursale succursales;
    private String status;
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
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getMot_passe() {
		return mot_passe;
	}
	public void setMot_passe(String mot_passe) {
		this.mot_passe = mot_passe;
	}
	public int getBauds() {
		return bauds;
	}
	public void setBauds(int bauds) {
		this.bauds = bauds;
	}
	public int getNumero_serie() {
		return numero_serie;
	}
	public void setNumero_serie(int numero_serie) {
		this.numero_serie = numero_serie;
	}
	public Succursale getSuccursales() {
		return succursales;
	}
	public void setSuccursales(Succursale succursales) {
		this.succursales = succursales;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDateTime getDate_add() {
		return date_add;
	}
	public void setDate_add(LocalDateTime date_add) {
		this.date_add = date_add;
	}
    

}
