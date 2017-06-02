package jpu2016.dogfight.controller;

public class UserOrder implements IUserOrder{
	
	private int player;
	
	public UserOrder(){
		
	}
	
	public UserOrder(int player, Order order){
		
	}
	
	public Order getOrder(){
		return order;
	}
	
	public int getPlayer() {
		return player;
	}
}
