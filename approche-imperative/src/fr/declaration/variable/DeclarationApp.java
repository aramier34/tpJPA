package fr.declaration.variable;

public class DeclarationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 byte a=1;
		 short b=2;
		 int c=3;
		 long d=4;
		 float e = 5;
		 double f = 6;
		 char g = 'e';
		 boolean h = false;
		 
		 int i=0;
		 if (i==0) {
			 System.out.println("i est nul");
		 }else if (i>0) {
			 System.out.println("i est positif");}
		 else {System.out.println("i est négatif");}
		 
		 switch(i) {
		 case 0:
			 System.out.println("i est nul");
			 break;
		 case i>0:
			 System.out.println("i est positif");
		 break;
		 default:
		 
			 
		 }
		
		
	}

}
