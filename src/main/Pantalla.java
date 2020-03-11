package main;


import processing.core.PApplet;
import processing.core.PImage;
import view.UserRegisterView;

public class Pantalla {
	
	
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
		gracias = app.loadImage("Images/gracias.png");
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
				
				login1v = true;
				break;
				case 1: app.image(login2,0,0);
				login2v = true;
				break;}
			
			break;
		case 2: switch(sin) {
		      case 0: app.image(singIn,0,0);
		      singInv = true;
		       break;
		       case 1: app.image(singInB,0,0);
		       singInBv = true;
		break;}
			
			break;
		case 3:
			app.image(inicio,0,0);
			iniciov = true;
			
			break;
		case 4: switch(car) {
			case 0: app.image(teslaSP,0,0);  
			teslaSv =true; break;
		
			case 1: app.image(teslaSP,0,0); 
			teslaSPv = true; break;
			
			case 2:  app.image(teslaX ,0,0);
			teslaXv = true; 
			break;
			case 3:  app.image(teslaXP ,0,0);
			
			teslaXPv = true; break;
			case 4:  app.image(tesla3 ,0,0);
			tesla3v= true; break;
			case 5:  app.image(tesla3P ,0,0);
			tesla3Pv = true; break;
			case 6:  app.image(teslaY ,0,0); teslaYv = true; break;
			case 7:  app.image(teslaYP ,0,0); 
			teslaYPv= true ;break;
		}
			
		break;
		case 5: switch(pag) {
					case 0: app.image(teslaXCompra,0,0);
					teslaXComprav= true; break;
					case 1: app.image( teslaYCompra,0,0);
					teslaYComprav= true; 
					break;
					case 2: app.image( teslaSCompra,0,0);
					teslaSComprav= true; break;
					case 3: app.image(tesla3Compra,0,0);
					tesla3Comprav=true; break;
		}
					break;
		
		
		
		case 6:  app.image(histo,0,0);
		histov= true; break;
		case 7:  app.image(compa,0,0); 
		compav= true;  break;
		
		case 8:  app.image(gracias,0,0); 
		graciasv= true;  break;
	
			
		}
	}  
	
	/*public void clicked() {
		if(app.mouseX < 350 && app.mouseX >50 && app.mouseY < 665 && app.mouseY >618 && window == 1 && log == 0 && login1v == true) {
			log = 1;
		}
		
	}*/
		
		public void mouse() {
			
		//correo login 1
			if(app.mouseX <350 && app.mouseX >50 && app.mouseY <543 && app.mouseY > 494 && window == 0) {
				window =1;
				pag = 0;
				
			}
			//esto es lo de los botones de inicio pero aun no sirve  :v 
			if(app.mouseX < 350 && app.mouseX >50 && app.mouseY <543 && app.mouseY > 494 && window == 1 && log == 0 && login1v == true) {
				//window +=1;
			}
			if(app.mouseX < 350 && app.mouseX >50 && app.mouseY <501 && app.mouseY >555 && window == 1 && log == 0 && login1v == true) {
				//window +=1;
			}
			if(app.mouseX < 350 && app.mouseX >50 && app.mouseY < 665 && app.mouseY >618 && window == 1 && log == 0 && login1v == true) {
				
				log = 1;
				window= 3;
				iniciov =true;
			} 
			
			//inicio 
			if(app.mouseX < 350 && app.mouseX >214 && app.mouseY < 270 && app.mouseY >240 && window == 3 && iniciov == true) {
				teslaXv = true; 
				
				window = 4;
				car = 3;
				
			}
			if(app.mouseX < 350 && app.mouseX >214 && app.mouseY < 480 && app.mouseY >450 && window == 3 && iniciov == true) {
				tesla3Comprav=true;
				window = 4;
				car = 4;
				
			}
			if(app.mouseX < 360 && app.mouseX >208 && app.mouseY < 700 && app.mouseY >550 && car == 3 ) {
				
				window = 4;
				car = 2;
				
			}
			
			if(app.mouseX < 200 && app.mouseX >40 && app.mouseY < 580 && app.mouseY >550 && car == 2) {
				tesla3Comprav=true;
				window = 4;
				car = 3;
				
			}
						if(app.mouseX < 200 && app.mouseX >40 && app.mouseY < 580 && app.mouseY >550 && car == 5) {
				
									window = 4;
										car = 4;
				
			}
						if(app.mouseX < 360 && app.mouseX >208 && app.mouseY < 700 && app.mouseY >550 && car == 4 ) {
							
							window = 4;
							car = 5;
							
						}
			
			if(app.mouseX < 350 && app.mouseX >214 && app.mouseY < 650 && app.mouseY >620 && window == 3 && iniciov == true) {
				tesla3Comprav=true;
				window = 4;
				car = 0;
				
			}				
							if(app.mouseX < 200 && app.mouseX >40 && app.mouseY < 580 && app.mouseY >550 && car == 1) {
				
									window = 4;
									car = 0;

}
								if(app.mouseX < 360 && app.mouseX >208 && app.mouseY < 700 && app.mouseY >550 && car == 0) {
		
											window = 4;
											car = 1;
		
	}
			
			if(app.mouseX < 350 && app.mouseX >214 && app.mouseY < 837 && app.mouseY >812 && window == 3 && iniciov == true) {
				tesla3Comprav=true;
				window = 4;
				car = 6;
				teslaYv = true;
				
			}
			
						if(app.mouseX < 200 && app.mouseX >40 && app.mouseY < 580 && app.mouseY >550 && car == 6) {
				
								window = 4;
									car = 7;

}
							if(app.mouseX < 360 && app.mouseX >208 && app.mouseY < 700 && app.mouseY >550 && car == 7) {

								window = 4;
								car = 6;

}
			if(app.mouseX < 60 && app.mouseX >0 && app.mouseY < 50 && app.mouseY >16  ) {
				window = 3;
			}
			//estadisticas de comparación
			if(app.mouseX < 414 && app.mouseX >350 && app.mouseY <40 && app.mouseY >0 && car == 0 && teslaSv ==true ) {
				window = 7;		
			}
			if(app.mouseX <414 && app.mouseX >350 && app.mouseY <40 && app.mouseY >0 && car == 2 && teslaXv == true) {
				window = 7;	
			}
			if(app.mouseX < 414 && app.mouseX >350 && app.mouseY <40 && app.mouseY >0 && car == 4 && tesla3v == true) {
				window = 7;	
			}
			if(app.mouseX < 414 && app.mouseX >350 && app.mouseY <40 && app.mouseY >0 && car == 6 && teslaYv == true) {
				window = 7;	
		
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
