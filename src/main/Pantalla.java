package main;
import static processing.core.PConstants.RIGHT;

import processing.core.PApplet;
import processing.core.PImage;

public class Pantalla {
	
	PImage cargando, login1, login2, inicio, per, singIn, singInB,histo;
	//CARROS
	PImage teslaS, teslaSP, teslaX, teslaXP, tesla3, tesla3P, teslaY, teslaYP;
    //COMPRA
	PImage teslaXCompra, teslaYCompra, teslaSCompra, tesla3Compra;
	//comparado con otro carro
	PImage compa;
	
	
	PApplet app;
	
	int window;
	
	
	int log;
	int sin;
	int car;
	int pag;
	
	public Pantalla( PApplet app) {
		this.window = 0;
		
		
		this.log = 0;
		this.sin = 0;
		this.car = 0;
		this.pag =0;
		this.app=app;
	
		
	}
	public void preload(){
		cargando = app.loadImage("Images/logo.png");
		login1 = app.loadImage("Images/Login/iPhone 11 Pro Max - 2.png");
		login2 = app.loadImage("Images/Login/loginboton.png");
		inicio = app.loadImage("Images/Inicio/inicio.png");
		singIn = app.loadImage("Images/Login/singIn.png");
		singInB = app.loadImage("Images/Login/singInboton.png");
		histo = app.loadImage("Images/Histo.png");
		//carros
		teslaSP  = app.loadImage("Images/cars/tesla S p.png");
		teslaS  = app.loadImage("Images/cars/tesla S.png");
		teslaX  = app.loadImage("Images/cars/tesla x.png");
		teslaXP  = app.loadImage("Images/cars/tesla x p.png");
		tesla3   = app.loadImage("Images/cars/tesla3.png");
		tesla3P  = app.loadImage("Images/cars/Tesla3t.png");
		teslaY = app.loadImage("Images/cars/tesla y.png");
		teslaYP = app.loadImage("Images/cars/tesla y p.png");
		
		//compra 
		
		 teslaXCompra = app.loadImage("Images/compra/teslaXcompra.png");
		 teslaYCompra = app.loadImage("Images/compra/teslaYcompra-1.png");
		 teslaSCompra  = app.loadImage("Images/compra/teslaScompra.png");
		 tesla3Compra  = app.loadImage("Images/compra/tesla3compra.png");
		 
		 //PERFIL
		 per = app.loadImage("Images/perfil-1.png");
		 
		 //comparar 
		 compa = app.loadImage("Images/comparacion/comparación.png");
		 
		
	}
	
	
	
	public void pintar() {
		switch(window) {
		case 0:
			app.image(cargando,0,0);
			break;
		case 1: switch(log) {
				case 0: app.image(login1,0,0);
				break;
				case 1: app.image(login2,0,0);
				break;}
			
			break;
		case 2: switch(sin) {
		case 0: app.image(singIn,0,0);
		break;
		case 1: app.image(singInB,0,0);
		break;}
			
			
			
			break;
		case 3:
			app.image(inicio,0,0);
			
			break;
		case 4: switch(car) {
			case 0: app.image(teslaS,0,0);break;
			case 1: app.image(teslaSP,0,0); break;
			case 2:  app.image(teslaX ,0,0); break;
			case 3:  app.image(teslaXP ,0,0); break;
			case 4:  app.image(tesla3 ,0,0); break;
			case 5:  app.image(tesla3P ,0,0); break;
			case 6:  app.image(teslaY ,0,0); break;
			case 7:  app.image(teslaYP ,0,0); break;
		}
			
		break;
		case 5: switch(pag) {
					case 0: app.image(teslaXCompra,0,0);break;
					case 1: app.image( teslaYCompra,0,0);break;
					case 2: app.image( teslaSCompra,0,0);break;
					case 3: app.image(tesla3Compra,0,0);break;
		}
		
		
		case 6:  app.image(histo,0,0);break;
		case 7:  app.image(compa,0,0);break;
			
			
			
			
			
			
		}
	}
		
		public void mouse() {
			if (app.mousePressed) {
				window +=1;
			}
			}

			
		
		
		
		
		
		
		
	
	
	//gettes y setters
	public PApplet getApp() {
		return app;
	}
	public void setApp(PApplet app) {
		this.app = app;
	

	}
	public int getWindow() {
		return window;
	}
	public void setWindow(int window) {
		this.window = window;
	}




	
	

}
