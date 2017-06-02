package jpu2016.dogfight.model;



import java.util.ArrayList;
import java.util.Observable;

public class DogfightModel extends Observable implements IDogfightModel{

	public DogfightModel() {
	}

	public IArea getArea() {
		return new Sky();
	}

	// @Override
	public void buildArea(java.awt.Dimension dimension) {
	}

	// @Override
	public void addMobile(IMobile Mobile) {
	}

	// @Override
	public void removeMobile(IMobile Mobile) {
	}

	public ArrayList<IMobile> getMobiles() {
		return new ArrayList<IMobile>();
	}

	// @Override
	public IMobile getMobilesByPlayer(int player) {
		return new Mobile();
	}

	// @Override
	public void setMobilesHavesMoved() {
	}

}
