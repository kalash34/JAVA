
public class Punkt {

	
	private double x, y;
	
	
	
	public double getX() {
		return x;
	}
	

	public double getY() {
		return y;
	}
	
	
	public Punkt() {
		x=0;
		y=0;
		
		
	}
	

	public Punkt(double x, double y) {
		this.y=y;
		this.x=x;
		
		
	}
	
	

	public void przesun(Wektor w) {
		this.x+=w.getDx();
		this.y+=w.getDy();
		
		
	}
	

	
	public void odbij(Prosta p) {
		//zmieniamy postac na y= ax+b
		double a= - (p.getA()/ p.getB());
		double b= - (p.getC()/ p.getB());
		
		
		x=2*(b-y-(x/a))  / (-(1/a)- a);
		y=2*(-(b/a)- a*y - x) /  (-(1/a)- a);
		

		
		
	}
	
	
	
	
	
	
	
}
