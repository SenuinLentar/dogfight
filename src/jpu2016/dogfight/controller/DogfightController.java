package jpu2016.dogfight.controller;

import jpu2016.dogfight.view.*;
import jpu2016.dogfight.model.*;

public class DogfightController implements IOrderPerformer{

	private int TIME_SLEEP = 30;
	
	public DogfightController(IDogfightModel dogfightModel){
		
	}
	
	
	public void orderPerform(UserOrder userOrder){
		//La méthode orderPerform() récupère les ordre envoyés par la vue et en fonction lance les
		//méthodes adéquat sur les éléments du modèle (plane.setDirection()). 
	}
	
	public void play(){
		//affiche un message (via l’interface IViewSystem fournie par la vue) de fin de partie
		this.gameLoop();
	}
	
	public void setViewSystem(IViewSystem viewSystem){
		
	}
	
	private void lauchMissile(int player){
		
	}
	
	private void gameLoop(){
		
	}
	
	private void isWeaponOnMobile(){
		//La méthode isWeaponOnMobile() permet de calculer si un missile se trouve sur un mobile. 
	}
	
	public void manageCollision(){
		//La méthode manageCollision() a la charge de gérer les collisions des missiles (via la
		//méthode isWeaponOnMobile()), de détruire le missile et de prévenir l’avion en fonction du
	    //résultat. Pas très compliqué en soi.
	}
	
	
	
}
