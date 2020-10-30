
public final class Prosta {


    public final double A;
    public final double B;
    public final double C;
	
	
    
    public double getA() {
    	return A;
    	
    }
    

    public double getB() {
    	return B;
    	
    }
	

    public double getC() {
    	return C;
    	
    }
	public Prosta() {
		A=0;
		B=0;
		C=0;
		
	}
	

	public Prosta(double A, double B, double C) {
		this.A=A;
		this.B=B;
		this.C=C;
		
	}
	
	
	

	public static void przesun(Prosta p, Wektor w) {
		double Bn = p.getB();
		double An=p.getA();
		double Cn=p.getC() - (p.getA()*w.getDx()) - (p.getB()*w.getDy());
		
		System.out.println("Prosta przesunieta o wektor: ");
		System.out.println(An+"x"+" + "+Bn+"y"+" + "+Cn+"= 0 ");		
		System.out.println();
		
		
		
	}
	
	 public static boolean rownolegle(Prosta p1, Prosta p2) {
		 

		    if((-p1.getA()/p1.getB())==(-p2.getA()/p2.getB())){

		        return true;
		    }else{
		        return false;

		    }
		 
	 }
	 

	 public static boolean prostopadle(Prosta p1, Prosta p2) {
		 

		    if((-p1.getA()/p1.getB())==(-1/(-p2.getA()/p2.getB()))){
		        return true;
		    }else{
		        return false;
		    }
	 }
	 

	 public static void Pprzeciecia(Prosta p1, Prosta p2) {
		 if(rownolegle(p1, p2)) {
			 System.out.println("Brak pkt przeciecia, proste rownolegle");
			 
		 }else {
			 double D=p1.getA()*p2.getB() - p2.getA()*p1.getB();
			 
			 double x=(p1.getA()*p2.getC() - p2.getB()*p1.getC())/D;
			 double y=-(p1.getA()*p2.getC() - p2.getA()*p1.getC())/D;
			 
			 

			 System.out.println("Pkt przeciecia: ");
			 System.out.println("P=("+x+","+y+") ");
			 
			 
			 
		 }
		 
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
