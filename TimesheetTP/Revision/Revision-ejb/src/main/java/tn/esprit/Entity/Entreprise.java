package tn.esprit.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Entreprise implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id ;
	private String name ;
	private String raisonSocial ;
	@OneToMany(mappedBy="entreprise")
	private List<Departement> departements;
	public Entreprise(int id, String name, String raisonSocial, List<Departement> departements) {
		super();
		this.id = id;
		this.name = name;
		this.raisonSocial = raisonSocial;
		this.departements = departements;
	}
	public List<Departement> getDepartements() {
		return departements;
	}
	public void setDepartements(List<Departement> departements) {
		this.departements = departements;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRaisonSocial() {
		return raisonSocial;
	}
	public void setRaisonSocial(String raisonSocial) {
		this.raisonSocial = raisonSocial;
	}
	public Entreprise() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Entreprise(int id, String name, String raisonSocial) {
		super();
		this.id = id;
		this.name = name;
		this.raisonSocial = raisonSocial;
	}
	public Entreprise(String name, String raisonSocial) {
		super();
		this.name = name;
		this.raisonSocial = raisonSocial;
	}
	@Override
	public String toString() {
		return "Entreprise [id=" + id + ", name=" + name + ", raisonSocial=" + raisonSocial + "]";
	}
	
	

}
