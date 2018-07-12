package org.waschke.notes_app.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String beschreibung;
    private String note;
    private LocalDateTime lastChange;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBeschreibung() {
		return beschreibung;
	}
	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public LocalDateTime getLastChange() {
		return lastChange;
	}
	public void setLastChange(LocalDateTime lastChange) {
		this.lastChange = lastChange;
	}

    
}
