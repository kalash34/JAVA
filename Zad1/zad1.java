

import java.util.*;




public class Main {
	
	
	
	
	public static boolean isPrime(int n) {
		
		boolean t = true;
		 
		if(n <= 1) 
		{
		t = false;
		 
		return t;
		}
		else
		{
		for (int i = 2; i<= n/2; i++) 
		{
		if ((n % i) == 0)
		{
		t = false;
		 
		break;
		}
		}
		 
		return t;
		}
		
		
	}
	
	
	public static void Spirala(int X) {
		
			int plane[][] = new int[X][X];
			
					    
		    for(int i=0;i<X;i++) {
		    	for(int j=0;j<X;j++) {
		    		plane[i][j]=0;
		    			
		    	}

	    		
		    }
		    
		    
			
			
			
			int Px=X/2;
			int Py=Px;
			
			
		    int x=0, y=0, dx = 0, dy = -1;
		    int num=1;
		    
		    
		    int t = X;
		    int maxI = t*t;

		    for (int i=0; i < maxI; i++){
		    	
		        if ((-X/2 <= x) && (x <= X/2) && (-X/2 <= y) && (y <= X/2)) {
		        	
		            //System.out.println("Wektor wzgledem srodka "+x+","+y);	            
		            //System.out.println("Liczba na tej pozycji:  "+num);
		            if((Px+x)>=0 &&(Px+x)<X && (Py+y)<X && (Py+y)>=0) {
		            	
			            plane[Px+x][Py+y]=num;
			            num++;
			 
		            }	             
		        }

		        if( (x == y) || ((x < 0) && (x == -y)) || ((x > 0) && (x == 1-y))) {
		            t=dx; dx=-dy; dy=t;
		        }   
		        x+=dx; y+=dy;
		    }
		    
		    
		    
		    for(int i=0;i<X;i++) {
		    	for(int j=0;j<X;j++) {
            if(isPrime(plane[i][j])==false) {
            		
            	plane[i][j]=0;
            }
            
            
		    }
		    }
		    

    		System.out.println("\n");
    		System.out.println("\n");
		    
		    for(int i=0;i<X;i++) {
		    	for(int j=0;j<X;j++) {
		    		
		    		if(plane[i][j]!=0) {
		    			System.out.print("*");
		    		}else {

		    			System.out.print("  ");
		    		}
		    		
		    		
		    	}
	    		System.out.println();
		    }
		    
		    
		    
		    
		    
	}
		
		
		
		
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int buff;
		
	    for (int i = 0; i < args.length; i++) {
	        System.out.println("Argument wprowadzony: " + i + ": " + args[i]);
	        

			buff = Integer.parseInt(args[i]);
	        

			

	        if (buff<2 || buff>200) {
	        	throw new IllegalArgumentException(" Zle dane wejsciowe, poza zakresem[2, 200] ");
	        }
			
			Spirala(buff);
			
			
	        
	        
	        
	        
	        
	        
	    }
		
		
		
		
		

		//Scanner input = new Scanner(System.in);
		
		
		
		//System.out.println(" Podaj rozmiar tablicy kwadratowej \n");
		//String w = input.nextLine();
		
		
		
		
		
		
		
		
		
	}

}
