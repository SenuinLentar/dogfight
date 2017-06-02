package jpu2016.gameframe;

public interface IGraphicsBuilder {
	public void applyModelToGrophics(Graphics graphics, ImageObserver observer);
	
	public int getGlobalWidth();
	
	public int getGlobalHeight();
	
}
