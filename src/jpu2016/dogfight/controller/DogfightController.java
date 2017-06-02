package jpu2016.dogfight.controller;

import jpu2016.dogfight.view.*;
import jpu2016.dogfight.model.*;

public class DogfightController implements IOrderPerformer{

	private int TIME_SLEEP = 30;
	
	public DogfightController(IDogfightModel dogfightModel){
		
	}
	
	
	public void orderPerform(UserOrder userOrder){
		//La m�thode orderPerform() r�cup�re les ordre envoy�s par la vue et en fonction lance les
		//m�thodes ad�quat sur les �l�ments du mod�le (plane.setDirection()). 
	}
	
	public void play(){
		//affiche un message (via l�interface IViewSystem fournie par la vue) de fin de partie
		this.gameLoop();
	}
	
	public void setViewSystem(IViewSystem viewSystem){
		
	}
	
	private void lauchMissile(int player){
		
	}
	
	private void gameLoop(){
		
	}
	
	private void isWeaponOnMobile(){
		//La m�thode isWeaponOnMobile() permet de calculer si un missile se trouve sur un mobile. 
	}
	
	public void manageCollision(){
		//La m�thode manageCollision() a la charge de g�rer les collisions des missiles (via la
		//m�thode isWeaponOnMobile()), de d�truire le missile et de pr�venir l�avion en fonction du
	    //r�sultat. Pas tr�s compliqu� en soi.
	}
	
	
	
}
