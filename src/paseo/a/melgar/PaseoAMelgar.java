 /* EJERCICIO 4 Paseo Melgar
 * YEISSON ROMERO
 * UNIVERSIDAD EAN
 * CONSTRUCCION DE SOFTWARE GUIA 2
 */
package paseo.a.melgar;

/**
 *Ejercicio 4
 * @author YROMERO
 */
import java.util.Scanner;

public class PaseoAMelgar {
    //Proceso Inicial
    
    //ingreso de Datos 
    
    static double buses(double f, double g, double Si){
     
        double B=0;
        double N=(f+g*2)/Si;
        B=Math.ceil(N);      
        return B;
        
    }
    
    static double transp(double Nb, double Vb){
     
        double D=0;
        D=Nb*Vb*2;      
        return D;
        
    }
    
    static double pcomida(double plato, double f, double g, double dia){
     
        double C=0;
        C=dia*((plato*g*5)+(plato*f*3));      
        return C;
        
    }
    
    static double nhabita(double g, double f, double Nh){
     
        double P=0;
        double N= (g+f)/Nh;
        P=Math.ceil(N);      
        
        return P;
        
    }
    
    static double vhabita(double n, double v){
     
        double V=0;
        V= n*v;
        
        return V;
        
    }
       
    public static void main(String[] args) {
        
        
       double fl;
       double gd;
       double sillas;
       double comida;
       double hotel;
       double Phab;
       double bus;
       double dias;
       
       //Proceso Final
       
       Scanner Teclado= new Scanner (System.in);
        
       //Entrada inicial
       
       System.out.println("Personas flacas: ");
       fl = Teclado.nextFloat();
       System.out.println("Personas gordas: ");
       gd = Teclado.nextFloat();
       System.out.println("Sillas del bus: ");
       sillas = Teclado.nextFloat();
       System.out.println("Valor por trayecto en bus: ");
       bus = Teclado.nextFloat();
       System.out.println("Valor por palto de comida: ");
       comida = Teclado.nextFloat();
       System.out.println("Numero de dias: ");
       dias = Teclado.nextFloat();
       System.out.println("Numero de personas por habitación: ");
       Phab = Teclado.nextFloat();
       System.out.println("Valor por habitación: ");
       hotel = Teclado.nextFloat();
       
       //Entrada Final
       
       
       //Salida Inicial 
       
       double Nbuses=buses(fl,gd,sillas);  
       System.out.println("No Buses: " +Nbuses);
       double Dtrans=transp(Nbuses,bus);
       System.out.println("Dinero Transporte: " +Dtrans);
       double Dcomi=pcomida(comida,fl,gd,dias);
       System.out.println("Dinero Comida: " +Dcomi);
       double Nhab=nhabita(fl,gd,Phab);
       System.out.println("Numero de habitaciones: " +Nhab);
       double Vhab=vhabita(Nhab,hotel);
       System.out.println("Dinero Habitación por dia: " +Vhab);
       System.out.println("Dinero Habitación total: " +Vhab*dias);
       
       
       //Salida Final
    }    
    
}
