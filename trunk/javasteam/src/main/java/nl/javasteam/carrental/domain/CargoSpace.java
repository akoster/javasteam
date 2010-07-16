package nl.javasteam.carrental.domain;

import javax.persistence.Embeddable;

/**
 * CargoSpace of a Vehicle
 * 
 * @author mlapre
 */
@Embeddable
public class CargoSpace {

	private int widthCentimeters;
	private int depthCentimeters;
	private int heightCentimeters;
	
	public int getWidthCentimeters(){
		return widthCentimeters;
	}
	
	public void setWidthCentimeters(int widthCentimeters) {
		this.widthCentimeters = widthCentimeters;
	}
		
	public int getDepthCentimeters() {
		return depthCentimeters;
	}
	
	public void setDepthCentimeters(int depthCentimeters) {
		this.depthCentimeters = depthCentimeters;
	}
	
	public int getHeightCentimeters() {
		return heightCentimeters;
	}
	
	public void setHeightCentimeters(int heightCentimeters) {
		this.heightCentimeters = heightCentimeters;
	}
}
