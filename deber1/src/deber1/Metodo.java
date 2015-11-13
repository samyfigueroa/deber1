package deber1;

import java.util.Scanner;

public class Metodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calif();
	    prome();
		descu();
			}
		private static int calif(){
		int repro=0,i=1;
		while(i<=50){
			System.out.println("INGRESE LAS CALIFICACIONES");
			Scanner calificaciones=new Scanner(System.in);
			int calif=calificaciones.nextInt();
			   if(calif<7){
				   repro=repro+1;
			   }
			   i=i+1;
		       }
		   int porcentaje=(repro*100)/50;
		   System.out.println("EL PORCENTAJE DE REPROBADOS ES:"+porcentaje+"%");
		   return(0);
		}

		private static int prome(){
			int acum=0;
			for(int i=1;i<=10;i++){
				System.out.println("INGRESE LAS NOTAS DE LOS ALUMNOS");
				Scanner notas=new Scanner (System.in);
				int no=notas.nextInt();
				acum=acum+no;
			}
			int promedio=acum/10;
			System.out.println("EL PROMEDIO DE CALIFICACIONES ES:"+promedio);
			return(0);
		}


		private static int descu(){
			
			System.out.println("MENÚ DE DESCUENTO");
			System.out.println("1. BOLITA ROJA");
			System.out.println("2. BOLITA AMARILLA");
			System.out.println("3. BOLITA BLANCA");
			System.out.println("4. SALIR");
			System.out.println("SELECCIONE UNA BOLITA");
			Scanner opcion=new Scanner (System.in);
			int op=opcion.nextInt();

			if(op<4){
				System.out.println("INGRESE EL VALOR DE SU COMPRA");
				Scanner compras=new Scanner (System.in);
				int co=compras.nextInt();
				
				switch(op){
				case 1:
					System.out.println("USTED TIENE UN DESCUENTO DEL 40%");
					double desc=co-(co*0.40);
					double iva=desc*0.12;
					double to_pagar=desc+iva;
					System.out.println("SU DESCUENTO ES:"+desc);
					System.out.println("EL TOTAL A PAGAR CON IVA ES:"+to_pagar);
					break;
				case 2:
					System.out.println("USTED TIENE UN DESCUENTO DEL 25%");
					double desc1=co-(co*0.25);
					double iva1=desc1*0.12;
					double to_pagar1=desc1+iva1;
					System.out.println("SU DESCUENTO ES:"+desc1);
					System.out.println("EL TOTAL A PAGAR CON IVA ES:"+to_pagar1);
					break;
				case 3:
					System.out.println("USTED TIENE NO UN DESCUENTO ");
					double iva2=co*0.12;
					double to_pagar2=iva2+co;
					System.out.println("EL TOTAL A PAGAR CON IVA ES:"+to_pagar2);
					break;		
				}
		}
			return descu();
			}
	}


