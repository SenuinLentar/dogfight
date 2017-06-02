package jpu2016.dogfight.model;

import java.awt.Image;
import java.awt.Point;

public class Mobile implements IMobile {

	private int speed;
	
	public Mobile() {
		// TODO Auto-generated constructor stub
	}
	
	public Mobile(Direction direction, Position position, Dimension dimension, Integer speed, String image) {
	}

	public Direction getDirection() {
		return getDirection();
	}

	public void setDirection(Direction direction) {
	}

	public Point getPosition() {
		return new Point(1, 1);
	}

	public Dimension getDimension() {
		return new Dimension(1, 1);
	}

	public Integer getSpeed() {
		return new Integer(1);
	}

	public Integer getWidth() {
		return new Integer(1);
	}

	public Integer getHeight() {
		return new Integer(1);
	}

	public void move() {
	}

	public void placeInArea(IArea area) {
	}

	public boolean isPlayer(int player) {
		return false;
	}

	public void moveUp() {
	}

	public void moveRight() {
	}

	public void moveDown() {
	}

	public void moveLeft() {
	}

	public IDogfightModel getDogfightModel() {
		return null;
	}

	public void setDogfightModel(DogfightModel dogfightModel) {
	}

	public boolean hit() {
		return false;
	}

	public boolean isWeapon() {
		return false;
	}

	public Image getImage() {
		return null;
	}

}