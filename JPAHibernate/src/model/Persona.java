package model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import utils.Sesso;

@Entity
@Table(name = "persone")
@NamedQuery(name = "findAllPersone", query = "SELECT p FROM Persona p")
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String cognome;
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	private LocalDate data_nascita;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Sesso sesso;
	
	@OneToMany(mappedBy = "persona", cascade = CascadeType.REMOVE)
	@OrderBy(value = "evento.dataEvento")
	@Column(nullable = false)
	private List<Partecipazioni> lista_partecipazioni;

	public Persona() {
		super();
	}

	public Persona(String nome, String cognome, String email, LocalDate data_nascita, Sesso sesso,
			List<Partecipazioni> lista_partecipazioni) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.data_nascita = data_nascita;
		this.sesso = sesso;
		this.lista_partecipazioni = lista_partecipazioni;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getData_nascita() {
		return data_nascita;
	}

	public void setData_nascita(LocalDate data_nascita) {
		this.data_nascita = data_nascita;
	}

	public Sesso getSesso() {
		return sesso;
	}

	public void setSesso(Sesso sesso) {
		this.sesso = sesso;
	}

	public List<Partecipazioni> getLista_partecipazioni() {
		return lista_partecipazioni;
	}

	public void setLista_partecipazioni(List<Partecipazioni> lista_partecipazioni) {
		this.lista_partecipazioni = lista_partecipazioni;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", email=" + email + ", data_nascita="
				+ data_nascita + ", sesso=" + sesso + ", lista_partecipazioni=" + lista_partecipazioni + "]";
	}

	
	
}
