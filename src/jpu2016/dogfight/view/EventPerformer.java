package jpu2016.dogfight.view;

import jpu2016.gameframe.*;

import java.awt.event.KeyEvent;

import jpu2016.dogfight.controller.*;

public class EventPerformer implements IEventPerformer{
	public EventPerformer(IOrderPerformer orderPerformer){
		
	}
	
	public void eventPerform(KeyEvent keyCode){
		
	}
	
	public UserOrder keyCodeToUser(int keyCode){
		return new UserOrder();
	}
}



