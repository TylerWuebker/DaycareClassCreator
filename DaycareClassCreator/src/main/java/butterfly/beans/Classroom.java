/**@author wuebk - Tyler Wuebker
 * Class : CIS175 Spring 2021
 * Mar 18, 2021
 */
package butterfly.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author wuebk
 *
 */
@Entity
public class Classroom {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String parentsName;
	private int ageMonths;
	
	public Classroom() {
		super();
	}
	
	public Classroom(String name) {
		super();
		this.setName(name);
	}
	
	public Classroom(String name, String parentsName, int ageMonths) {
		super();
		this.setName(name);
		this.setParentsName(parentsName);
		this.setAgeMonths(ageMonths);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParentsName() {
		return parentsName;
	}

	public void setParentsName(String parentsName) {
		this.parentsName = parentsName;
	}

	public int getAgeMonths() {
		return ageMonths;
	}

	public void setAgeMonths(int ageMonths) {
		this.ageMonths = ageMonths;
	}
	
	@Override
		public String toString() {
		return "Child [id= " + id + ", name= " + name + ", parents name= " + parentsName + ", age in months= " + ageMonths + "]";
	}
}
