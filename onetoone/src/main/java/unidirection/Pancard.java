package unidirection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pancard {
	@Id
	private int pan_id;
	@Column(nullable=false,unique=false)
	private String name;
	@Column(nullable=false,unique=true)
	private long Department;
	
	@OneToOne
	Person pe;
	
	public int getPan_id() {
		return pan_id;
	}

	public void setPan_id(int pan_id) {
		this.pan_id = pan_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getDepartment() {
		return Department;
	}

	public void setDepartment(long department) {
		Department = department;
	}

	public Person getPe() {
		return pe;
	}

	public void setPe(Person pe) {
		this.pe = pe;
	}
}

	
	
//	
