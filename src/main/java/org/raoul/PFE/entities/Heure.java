package org.raoul.PFE.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

import java.sql.Time;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="heure")
public class Heure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Time heureprevue;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Time getHeureprevue() {
		return heureprevue;
	}
	public void setHeureprevue(Time heureprevue) {
		this.heureprevue = heureprevue;
	}
    

}
