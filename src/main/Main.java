package main;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet {
	
	PImage cargando, login1, login2, inicio, per, singIn, singInB,histo,gracias;
	//CARROS
	PImage teslaS, teslaSP, teslaX, teslaXP, tesla3, tesla3P, teslaY, teslaYP;
    //COMPRA
	PImage teslaXCompra, teslaYCompra, teslaSCompra, tesla3Compra;
	//comparado con otro carro
	PImage compa;
	
	
	//validaciones
	boolean login1v, login2v,iniciov, perv, singInv, singInBv,histov, graciasv;
	boolean teslaSv, teslaSPv, teslaXv, teslaXPv, tesla3v, tesla3Pv, teslaYv, teslaYPv;
	boolean  teslaXComprav, teslaYComprav, teslaSComprav, tesla3Comprav,compav;
	boolean txv;
	
int window;
	
	
	int log;
	int sin;
	int car;
	int pag;
	Tx tx;
	Otro otroM;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("main.Main");

	}
	public void settings() {
		size(414,896);
	}
	public void setup() {
		background(255);
		tx = new Tx(38500,0,0,this);
		otroM= new Otro(0,0,0,this);
	this.window = 0;
		
		
		this.log = 0;
		this.sin = 0;
		this.car = 0;
		this.pag =0;
		
	
		
		
		
		
		
		
		cargando =loadImage("Images/logo.png");
		login1 = loadImage("Images/Login/iPhone 11 Pro Max - 2.png");
		login2 = loadImage("Images/Login/loginboton.png");
		inicio = loadImage("Images/Inicio/inicio.png");
		singIn = loadImage("Images/Login/singIn.png");
		singInB =loadImage("Images/Login/singInboton.png");
		histo =loadImage("Images/Histo.png");
		gracias = loadImage("Images/gracias.png");
		//carros
		teslaSP  = loadImage("Images/cars/tesla S p.png");
		teslaS  = loadImage("Images/cars/tesla S.png");
		teslaX  =loadImage("Images/cars/tesla x.png");
		teslaXP  = loadImage("Images/cars/tesla x p.png");
		tesla3   = loadImage("Images/cars/tesla3.png");
		tesla3P  = loadImage("Images/cars/Tesla3t.png");
		teslaY =loadImage("Images/cars/tesla y.png");
		teslaYP = loadImage("Images/cars/tesla y p.png");
		
		//compra 
		
		 teslaXCompra =loadImage("Images/compra/teslaXcompra.png");
		 teslaYCompra = loadImage("Images/compra/teslaYcompra-1.png");
		 teslaSCompra  =loadImage("Images/compra/teslaScompra.png");
		 tesla3Compra  = loadImage("Images/compra/tesla3compra.png");
		 
		 //PERFIL
		 per = loadImage("Images/perfil-1.png");
		 
		 //comparar 
		 compa = loadImage("Images/comparacion/comparación.png");
		 
		 
	}
	public void draw() {
		background(255);
	
		
		
			switch(window) {
			case 0:
				image(cargando,0,0);
				
				break;
			case 1: switch(log) {
					case 0: image(login1,0,0); 
				
					
					login1v = true;
					break;
					case 1: image(login2,0,0);
					
					
				
					login2v = true;
					break;}
				
				break;
			case 2: switch(sin) {
			      case 0: image(singIn,0,0);
			      singInv = true;
			       break;
			       case 1: image(singInB,0,0);
			       singInBv = true;
			break;}
				
				break;
			case 3:
			image(inicio,0,0);
				iniciov = true;
				
				break;
			case 4: switch(car) {
				case 0: image(teslaSP,0,0);  
				teslaSv =true; break;
			
				case 1: image(teslaSP,0,0); 
				teslaSPv = true; break;
				
				case 2:  image(teslaX ,0,0);
				teslaXv = true; 
				break;
				case 3:  image(teslaXP ,0,0);
				
				teslaXPv = true; break;
				case 4: image(tesla3 ,0,0);
				tesla3v= true; break;
				case 5:  image(tesla3P ,0,0);
				tesla3Pv = true; break;
				case 6:  image(teslaY ,0,0); teslaYv = true; break;
				case 7:  image(teslaYP ,0,0); 
				teslaYPv= true ;break;
			}
				
			break;
			case 5: switch(pag) {
						case 0: image(teslaXCompra,0,0);
						teslaXComprav= true; break;
						case 1: image( teslaYCompra,0,0);
						teslaYComprav= true; 
						break;
						case 2: image( teslaSCompra,0,0);
						teslaSComprav= true; break;
						case 3: image(tesla3Compra,0,0);
						tesla3Comprav=true; break;
			}
						break;
			

			case 6:  image(histo,0,0);
			histov= true; break;
			case 7:  image(compa,0,0);
			noStroke();
    		fill(250,0,0);
			tx.comparaVel();
			tx.comparaAuto();
			noStroke();
    		fill(250,0,0);
    		otroM.comparaVel();
    		otroM.comparaAuto();

			
			compav= true;
			
			break;
			
			case 8:  image(gracias,0,0); 
			graciasv= true;  break;
		
				
			}
		
	
		
		
		
		
		System.out.println("X:" + mouseX + ",Y;" + mouseY);
		fill(255,0,0);
		  textSize(30);
		 text("X:" + mouseX + ", Y:" + mouseY, mouseX, mouseY);
		 
		 
		 
	}
	
	public void mouse() {
		
		//correo login 1
			if(mouseX <350 && mouseX >50 && mouseY <543 && mouseY > 494 && window == 0) {
				window =1;
				pag = 0;
				
			}
			//esto es lo de los botones de inicio pero aun no sirve  :v 
			if(mouseX < 350 && mouseX >50 && mouseY <543 && mouseY > 494 && window == 1 && log == 0 && login1v == true) {
				//window +=1;
			}
			if(mouseX < 350 && mouseX >50 && mouseY <501 && mouseY >555 && window == 1 && log == 0 && login1v == true) {
				//window +=1;
			}
			if(mouseX < 350 && mouseX >50 && mouseY < 665 && mouseY >618 && window == 1 && log == 0 && login1v == true) {
				
				log = 1;
				window= 3;
				iniciov =true;
			} 
			
			//inicio 
			if(mouseX < 350 && mouseX >214 && mouseY < 270 && mouseY >240 && window == 3 && iniciov == true) {
				teslaXv = true; 
				
				window = 4;
				car = 3;
				
			}
			if(mouseX < 350 && mouseX >214 && mouseY < 480 && mouseY >450 && window == 3 && iniciov == true) {
				tesla3Comprav=true;
				window = 4;
				car = 4;
				
			}
			if(mouseX < 360 && mouseX >208 && mouseY < 700 && mouseY >550 && car == 3 ) {
				
				window = 4;
				car = 2;
				
			}
			
			if(mouseX < 200 && mouseX >40 && mouseY < 580 && mouseY >550 && car == 2) {
				tesla3Comprav=true;
				window = 4;
				car = 3;
				
			}
						if(mouseX < 200 && mouseX >40 && mouseY < 580 && mouseY >550 && car == 5) {
				
									window = 4;
										car = 4;
				
			}
						if(mouseX < 360 && mouseX >208 && mouseY < 700 && mouseY >550 && car == 4 ) {
							
							window = 4;
							car = 5;
							
						}
			
			if(mouseX < 350 && mouseX >214 && mouseY < 650 && mouseY >620 && window == 3 && iniciov == true) {
				tesla3Comprav=true;
				window = 4;
				car = 0;
				
			}				
							if(mouseX < 200 && mouseX >40 && mouseY < 580 && mouseY >550 && car == 1) {
				
									window = 4;
									car = 0;

}
								if(mouseX < 360 && mouseX >208 && mouseY < 700 && mouseY >550 && car == 0) {
		
											window = 4;
											car = 1;
		
	}
			
			if(mouseX < 350 && mouseX >214 && mouseY < 837 && mouseY >812 && window == 3 && iniciov == true) {
				tesla3Comprav=true;
				window = 4;
				car = 6;
				teslaYv = true;
				
			}
			
						if(mouseX < 200 && mouseX >40 && mouseY < 580 && mouseY >550 && car == 6) {
				
								window = 4;
									car = 7;

}
							if(mouseX < 360 && mouseX >208 && mouseY < 700 && mouseY >550 && car == 7) {

								window = 4;
								car = 6;

}
			if(mouseX < 60 && mouseX >0 && mouseY < 50 && mouseY >16  ) {
				window = 3;
			}
			//estadisticas de comparación
			if(mouseX < 414 && mouseX >350 && mouseY <40 && mouseY >0 && car == 0 && teslaSv ==true ) {
			
				window = 7;		
			}
			if(mouseX <414 && mouseX >350 && mouseY <40 && mouseY >0 && car == 2 && teslaXv == true) {
				window = 7;	
			}
			if(mouseX < 414 && mouseX >350 && mouseY <40 && mouseY >0 && car == 4 && tesla3v == true) {
				window = 7;	
			}
			if(mouseX < 414 && mouseX >350 && mouseY <40 && mouseY >0 && car == 6 && teslaYv == true) {
				window = 7;	
		
			}
			//compra
			
			if(mouseX < 414 && mouseX >0 && mouseY <895 && mouseY >840 && car == 3 && teslaXv == true ) {
				window = 5;
				pag = 0;
			}
			if(mouseX < 414 && mouseX >0 && mouseY <895 && mouseY >840 && car == 4 && tesla3v == true ) {
				window = 5;
				pag = 3;
			}
			if(mouseX < 414 && mouseX >0 && mouseY <895 && mouseY >840 && car == 0 && teslaSv == true ) {
				window = 5;
				pag = 2;
			}
			if(mouseX < 414 && mouseX >0 && mouseY <895 && mouseY >840 && car == 7 && teslaYv == true ) {
				window = 5;
				pag = 1;
			}
			
			
			
			}
	
	public void mousePressed() {
		
		mouse();
		
		
		
	}
	

	

}
