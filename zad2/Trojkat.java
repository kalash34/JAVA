
public class Trojkat {
	
	
	public boolean isTriangle(double Ax, double Ay, double Bx, double By, double Cx, double Cy) {
		
		double pom1=Math.pow((Bx - Ax), 2.0) + Math.pow((By - Ay), 2.0);
		double pom2=Math.pow((Cx - Bx), 2.0) + Math.pow((Cy - By), 2.0);
		double pom3=Math.pow((Ax - Cx), 2.0) + Math.pow((Ay - Cy), 2.0);
			


		double A=Math.sqrt(Math.abs(pom1)); //AB
		double B=Math.sqrt(Math.abs(pom2));	//BC														
		double C=Math.sqrt(Math.abs(pom3));	//CA
		
		if((A <  B+C) && (B < A+C) && (C < A+B) ) {
			return true;
			
		}else {
			return false;
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	

	double Ax, Ay, Bx, By, Cx, Cy;
	
	
	public Trojkat(){
		Ax=0;
		Ay=0;
		Bx=0;
		By=0;
		Cx=0;
		Cy=0;
		
	}
	
	public Trojkat(Punkt A, Punkt B, Punkt C) {
		
		Ax=A.getX();
		Ay=A.getY();
		Bx=B.getX();
		By=B.getY();
		Cx=C.getX();
		Cy=C.getY();
		
		if(isTriangle(Ax, Ay, Bx, By, Cx, Cy)==false) {
			throw new IllegalArgumentException("Nie da sie zbudowac trojkata, zle dane ");
		}
		
	}
	
	

	
	public Trojkat(double Ax, double Ay, double Bx, double By, double Cx, double Cy) {
		if(isTriangle(Ax, Ay, Bx, By, Cx, Cy)) {
			
		this.Ax=Ax;
		this.Ay=Ay;
		this.Bx=Bx;
		this.By=By;
		this.Cx=Cx;
		this.Cy=Cy;
		
		}else {
			throw new IllegalArgumentException("Nie da sie zbudowac trojkata, zle dane ");
		}
		
	}
	
	
	public void przesun(Wektor w) {
		this.Ax+=w.getDx();
		this.Ay+=w.getDy();
		

		this.Bx+=w.getDx();
		this.By+=w.getDy();
		

		this.Cx+=w.getDx();
		this.Cy+=w.getDy();
		
		
	
		
		
	}
	
	
	public void odbij(Prosta p) {
		//zmieniamy postac na y= ax+b
		double a= - (p.getA()/ p.getB());
		double b= - (p.getC()/ p.getB());
		
		
		Ax=2*(b-Ay-(Ax/a))  / (-(1/a)- a);
		Ay=2*(-(b/a)- a*Ay - Ax) /  (-(1/a)- a);
		

		Bx=2*(b-By-(Bx/a))  / (-(1/a)- a);
		By=2*(-(b/a)- a*By - Bx) /  (-(1/a)- a);
		

		Cx=2*(b-Cy-(Cx/a))  / (-(1/a)- a);
		Cy=2*(-(b/a)- a*Cy - Cx) /  (-(1/a)- a);
		
		
		
	}
	
	
	

}
