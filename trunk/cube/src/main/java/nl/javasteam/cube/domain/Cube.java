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
 * A rotatable cube
 * 
 * @author bbergsma
 */
@Entity
public class Cube {

	@SuppressWarnings("unused")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@OneToOne(cascade = CascadeType.ALL)
	private Side top;
	@OneToOne(cascade = CascadeType.ALL)
	private Side bottom;
	@OneToOne(cascade = CascadeType.ALL)
	private Side left;
	@OneToOne(cascade = CascadeType.ALL)
	private Side right;
	@OneToOne(cascade = CascadeType.ALL)
	private Side front;
	@OneToOne(cascade = CascadeType.ALL)
	private Side rear;
	@CollectionOfElements()
	@Enumerated(EnumType.STRING)
	private List<CubeRotation> history = new ArrayList<CubeRotation>();

	public Cube() {
		// Do nothing
	}

	public Cube(Side top, Side bottom, Side left, Side right, Side front,
			Side rear) {
		this.top = top;
		this.bottom = bottom;
		this.left = left;
		this.right = right;
		this.front = front;
		this.rear = rear;
	}

	/**
	 * Performs the given rotation on the complete cube
	 * 
	 * @param rotation
	 */
	public void rotate(CubeRotation rotation) {
		// TODO: implement
		history.add(rotation);
	}

	public List<CubeRotation> getHistory() {
		return Collections.unmodifiableList(history);
	}

	public Side getTop() {
		return top;
	}

	public void setTop(Side top) {
		this.top = top;
	}

	public Side getBottom() {
		return bottom;
	}

	public void setBottom(Side bottom) {
		this.bottom = bottom;
	}

	public Side getLeft() {
		return left;
	}

	public void setLeft(Side left) {
		this.left = left;
	}

	public Side getRight() {
		return right;
	}

	public void setRight(Side right) {
		this.right = right;
	}

	public Side getFront() {
		return front;
	}

	public void setFront(Side front) {
		this.front = front;
	}

	public Side getRear() {
		return rear;
	}

	public void setRear(Side rear) {
		this.rear = rear;
	}

}