package com.fusesource.examples.persistence.part1.model;
import javax.persistence.*;

@Entity
@Table(name="Employee")
public class Employee implements java.io.Serializable {

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	private static final long serialVersionUID = -1789111755129114127L;
	
	
	
   

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/*public Employee() {
        }

        public Employee(Long id) {
          this.id=id;
        }
*/
	private String name;



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

        public String toString() {
             return "[Employee: "+id+", "+name+"]";
        }
}
