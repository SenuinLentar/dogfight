package jpu2016.dogfight.model;

import java.awt.Dimension;
import java.util.ArrayList;

public interface IDogfightModel {

	// public ArrayList<IMobile> list getMobiles(){};//= new
	// ArrayList<String>();

	public ArrayList<IMobile> getMobiles();

	public void setMobilesHavesMoved();

	public IMobile getMobilesByPlayer(int player);

	public void removeMobile(IMobile Mobile);

	public void addMobile(IMobile Mobile);

	public void buildArea(Dimension dimension);
}
