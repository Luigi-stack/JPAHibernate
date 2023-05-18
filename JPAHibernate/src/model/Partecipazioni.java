package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import utils.Stato;

@Entity
@Table(name = "partecipazioni")
@NamedQuery(name = "findAllPartecipazioni", query = "SELECT p FROM Partecipazioni p")
public class Partecipazioni {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(nullable = false)
	@ManyToOne
	private Persona persona;
	
	@ManyToOne
	@Column(nullable = false)
	private Evento evento;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Stato state;

	public Partecipazioni() {
		super();
	}

	public Partecipazioni(Persona persona, Evento evento, Stato state) {
		super();
		this.persona = persona;
		this.evento = evento;
		this.state = state;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public Stato getState() {
		return state;
	}

	public void setState(Stato state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Partecipazioni [id=" + id + ", persona=" + persona + ", evento=" + evento + ", state=" + state + "]";
	}

	
	
	
}
