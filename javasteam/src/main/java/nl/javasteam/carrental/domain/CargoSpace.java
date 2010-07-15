package nl.javasteam.carrental.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CargoSpace {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	
	@Column(name="widthCentimeters")
	private int widthCentimeters;
	
	public int getWidthCentimeters(){
		return widthCentimeters;
	}
	
	public void setWidthCentimeters(int widthCentimeters) {
		this.widthCentimeters = widthCentimeters;
	}
	
	@Column(name="depthCentimeters")
	private int depthCentimeters;
	
	public int getDepthCentimeters() {
		return depthCentimeters;
	}
	
	public void setDepthCentimeters(int depthCentimeters) {
		this.depthCentimeters = depthCentimeters;
	}
	
	@Column(name="heightCentimeters")
	private int heightCentimeters;
	
	public int getHeightCentimeters() {
		return heightCentimeters;
	}
	
	public void setHeightCentimeters(int heightCentimeters) {
		this.heightCentimeters = heightCentimeters;
	}
}
