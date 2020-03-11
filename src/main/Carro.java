package main;

import processing.core.PApplet;

public class Carro {
	int precio;
	int velocidad;
	int auto;
	PApplet app;
	
	public Carro(int precio, int velocidad, int auto,PApplet app) {
		
		this.precio = precio;
		this.velocidad = velocidad;
		this.auto = auto;
		this.app = app;
	}
	public void comparaVel(){
		app.rect(104,265,20,this.velocidad);
		this.velocidad -= 5;
		if(this.velocidad <= -100) {
			this.velocidad = -100;
		}
	}
	
	public void comparaAuto(){
		app.rect(183,265,this.auto,20);
		this.auto -= 5;
		if(this.auto<= -90) {
			this.auto = -90;
		}
	}
}
