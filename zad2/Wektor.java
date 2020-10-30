
public final class Wektor {
	
	
	public final double Dx;
	public final double Dy;
	
	
	public double getDx() {
		return Dx;
	}

	public double getDy() {
		return Dy;
	}
	
	
	
	
	static void compose(Wektor A, Wektor B) {
		

	    System.out.println("Zlozonenie Wektorow: ");
	    
	    System.out.println("["+A.getDx()+B.getDx()+","+B.getDy()+A.getDy()+" ]");
		
		
	}
	
	 
	 
	 
	

	public Wektor() {
		Dx=0;
		Dy=0;
		
		
	}
	
	public Wektor(double Dx, double Dy) {
		this.Dx = Dx;
		this.Dy = Dy;
		
		
	}
	
	
	

}
