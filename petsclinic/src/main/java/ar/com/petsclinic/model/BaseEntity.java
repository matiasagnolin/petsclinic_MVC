package ar.com.petsclinic.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity<T> {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected T id;
	
	public T getId(){
		return this.id;
	}
	
	public void setId(T value){
		this.id = value;
	}
}