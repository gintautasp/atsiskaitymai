package egzaminas_atsiskaitymai;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Apmokejimai {
	

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)		
	private int id;	
	private int saskaitos_id;	
	private double suma;
	private String data;
	
    public Apmokejimai() {
	}	
	
    public Apmokejimai(int id, int saskaitos_id, double suma, String data) {
		this.id = id;
		this.saskaitos_id = saskaitos_id;
		this.suma = suma;
		this.data = data;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSaskaitos_id() {
		return saskaitos_id;
	}

	public void setSaskaitos_id(int saskaitos_id) {
		this.saskaitos_id = saskaitos_id;
	}

	public double getSuma() {
		return suma;
	}

	public void setSuma(double suma) {
		this.suma = suma;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}	

}
