package nl.javasteam.cube.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CollectionOfElements;

/**
 * A rotatable side
 * 
 * @author bbergsma
 */
@Entity
public class Side {

	@SuppressWarnings("unused")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@OneToOne(cascade = CascadeType.ALL)
	private Square northWest;
	@OneToOne(cascade = CascadeType.ALL)
	private Square north;
	@OneToOne(cascade = CascadeType.ALL)
	private Square northEast;
	@OneToOne(cascade = CascadeType.ALL)
	private Square west;
	@OneToOne(cascade = CascadeType.ALL)
	private Square center;
	@OneToOne(cascade = CascadeType.ALL)
	private Square east;
	@OneToOne(cascade = CascadeType.ALL)
	private Square southWest;
	@OneToOne(cascade = CascadeType.ALL)
	private Square south;
	@OneToOne(cascade = CascadeType.ALL)
	private Square southEast;
	@CollectionOfElements()
	@Enumerated(EnumType.STRING)
	private List<SideRotation> history = new ArrayList<SideRotation>();

	public Side() {
		// empty
	}

	public Side(Square northWest, Square north, Square northEast, Square west,
			Square center, Square east, Square southWest, Square south,
			Square southEast) {

		this.northWest = northWest;
		this.north = north;
		this.northEast = northEast;
		this.west = west;
		this.center = center;
		this.east = east;
		this.southWest = southWest;
		this.south = south;
		this.southEast = east;
	}

	/**
	 * Creates a side consisting of new squares of the given color
	 * 
	 * @param color
	 */
	public Side(Color color) {
		this.northWest = new Square(color);
		this.north = new Square(color);
		this.northEast = new Square(color);
		this.west = new Square(color);
		this.center = new Square(color);
		this.east = new Square(color);
		this.southWest = new Square(color);
		this.south = new Square(color);
		this.southEast = new Square(color);
	}

	/**
	 * Performs the given rotation on this side
	 * 
	 * @param rotation
	 */
	public void rotate(SideRotation rotation) {
		// TODO: implement
		// XXX: a side rotation influences other sides so should occur in the
		// Cube
		this.history.add(rotation);
	}

	public List<SideRotation> getHistory() {
		return Collections.unmodifiableList(history);
	}

	public Square getNorthWest() {
		return northWest;
	}

	public void setNorthWest(Square northWest) {
		this.northWest = northWest;
	}

	public Square getNorth() {
		return north;
	}

	public void setNorth(Square north) {
		this.north = north;
	}

	public Square getNorthEast() {
		return northEast;
	}

	public void setNorthEast(Square northEast) {
		this.northEast = northEast;
	}

	public Square getWest() {
		return west;
	}

	public void setWest(Square west) {
		this.west = west;
	}

	public Square getCenter() {
		return center;
	}

	public void setCenter(Square center) {
		this.center = center;
	}

	public Square getEast() {
		return east;
	}

	public void setEast(Square east) {
		this.east = east;
	}

	public Square getSouthWest() {
		return southWest;
	}

	public void setSouthWest(Square southWest) {
		this.southWest = southWest;
	}

	public Square getSouth() {
		return south;
	}

	public void setSouth(Square south) {
		this.south = south;
	}

	public Square getSouthEast() {
		return southEast;
	}

	public void setSouthEast(Square southEast) {
		this.southEast = southEast;
	}

}
