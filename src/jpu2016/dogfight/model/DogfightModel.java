package jpu2016.dogfight.model;

import java.util.ArrayList;

public class DogfightModel implements IDogfightModel {
	
	DogfightModel(){}
	public IArea getArea(){return null;}
	
	//@Override
	public void buildArea(java.awt.Dimension dimension) {}

	
	//@Override
	public void addMobile(IMobile Mobile) {}
	
	//@Override
	public void removeMobile(IMobile Mobile) {}
				
	public ArrayList<IMobile> getMobiles() {return new ArrayList<IMobile>();}
	
	//@Override
	public IMobile getMobilesByPlayer(int player) { return null;}
		
	//@Override
	public void setMobilesHavesMoved() {}

}
