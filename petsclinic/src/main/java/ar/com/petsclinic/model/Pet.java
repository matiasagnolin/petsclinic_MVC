package ar.com.petsclinic.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="pet")
public class Pet extends BaseEntity<Integer> {
	
	@Column(name="name")
	private String name;
	
	@Column(name="birthdate")
	@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy/MM/dd")
	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	private Date birthdate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
