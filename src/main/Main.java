package main;

import processing.core.PApplet;

public class Main extends PApplet {

	Pantalla p;
	Pantalla app;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("main.Main");

	}
	public void settings() {
		size(414,896);
	}
	public void setup() {
		background(255);
		
		p = new Pantalla(this);
		p.preload();
	}
	public void draw() {
		background(255);
		p.pintar();
		
		
		
		
		System.out.println("X:" + mouseX + ",Y;" + mouseY);
		fill(255,0,0);
		  textSize(30);
		 text("X:" + mouseX + ", Y:" + mouseY, mouseX, mouseY);
		 
		 
		 
	}
	public void mouseClicked() {
		//p.clicked();
	}
	
	public void mousePressed() {
		p.mouse();
		
		
		
	}
	

	

}
