
public class Main {

	public static void main(String[] args) {
		
		System.out.println("Program testowy ");
		System.out.println();
		
		
		Punkt p1, p2;
		

		System.out.println("Prosta pr: ");
		Prosta pr = new Prosta(1.0, -1.0, 2.0);

		System.out.println(pr.getA()+"x"+" + "+pr.getB()+"y"+" + "+pr.getC()+"= 0");

		System.out.println();
		
		
		
		
		
		System.out.println("Wektor w[-4,8] ");
		Wektor w = new Wektor(-4, 8);

		System.out.println("x= "+w.getDx());

		System.out.println("y= "+w.getDy());
		
		
		Punkt p3= new Punkt(1.0, 10.0);
		
		Punkt a= new Punkt(3, 2);
		Punkt b = new Punkt(3, -3);
		Punkt c = new Punkt(-3, 3);

		Trojkat tr = new Trojkat(a,b,c);
		System.out.println("Dane trojkata: ");

		System.out.println("Pkt A= "+tr.Ax+","+tr.Ay);

		System.out.println("Pkt B= "+tr.Bx+","+tr.By);

		System.out.println("Pkt C= "+tr.Cx+","+tr.Cy);
		

		System.out.println("Dane trojkata przesunietego o wektor w : ");
		tr.przesun(w);
		

		System.out.println("\nDane trojkata: ");

		System.out.println("Pkt A= "+tr.Ax+","+tr.Ay);

		System.out.println("Pkt B= "+tr.Bx+","+tr.By);

		System.out.println("Pkt C= "+tr.Cx+","+tr.Cy);
		

		System.out.println(" Dane trojkata przesunietego odbitego wzgledem prostej pr : ");
		tr.odbij(pr);
		


		System.out.println("\nDane trojkata: ");

		System.out.println("Pkt A= "+tr.Ax+","+tr.Ay);

		System.out.println("Pkt B= "+tr.Bx+","+tr.By);

		System.out.println("Pkt C= "+tr.Cx+","+tr.Cy);
		
		
		
		
		
	}

}
