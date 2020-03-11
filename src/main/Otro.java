package main;

import processing.core.PApplet;

public class Otro extends Carro{

	public Otro(int precio, int velocidad, int auto, PApplet app) {
		super(precio, velocidad, auto, app);
	}
	public void comparaVel(){
		app.rect(130,265,this.auto,20);
		this.velocidad -= 5;
		if(this.velocidad <= -50) {
			this.velocidad = -50;
		}
	}
	
	
}