
import java.lang.Math;

public class Odcinek {
	
	
	double dlugosc;
	double Ax, Ay, Bx, By;
	
	
	
	public Odcinek() {
		dlugosc=0;
		Ax=0; 
		Ay=0;
		Bx=0;
		By=0;
	}
	
	
	public Odcinek(Punkt A, Punkt B) {
		
		dlugosc=Math.sqrt(Math.pow(B.getX() - A.getX(), 2.0)- Math.pow(B.getY() - A.getY(), 2.0));
		
		Ax=A.getX();
		Ay=A.getY();
		Bx=B.getX();
		By=B.getY();
		
		
	}
	

	public Odcinek(double Ax, double Ay, double Bx, double By) {
		
		this.Ax=Ax;
		this.Ay=Ay;
		this.Bx=Bx;
		this.By=By;
		dlugosc=Math.sqrt(Math.pow(Bx - Ax, 2.0)- Math.pow(By - Ay, 2.0));
		
		
		
		
	}
	
	

}
