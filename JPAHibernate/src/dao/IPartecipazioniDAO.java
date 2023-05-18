package dao;

import java.util.List;

import model.Partecipazioni;

public interface IPartecipazioniDAO {

	public void save(Partecipazioni e);
	public Partecipazioni getById(int id);
	public void delete(Partecipazioni e);
	public void update(Partecipazioni e);
	public List<Partecipazioni> getAll();

}
