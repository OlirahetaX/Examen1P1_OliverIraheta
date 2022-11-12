package examen1p1_oliveriraheta;

import java.util.Scanner;

public class Examen1P1_OliverIraheta {

public static Scanner vini = new Scanner(System.in);    
public static Scanner rm = new Scanner(System.in); //para strings 
    
    public static void main(String[] args) {
       menu();
    }
    
    public static void menu(){
        try{
            int opc = 0;
            while(opc!=4){
                System.out.println("____________________________________");
                System.out.println("Ingrese Una opcion");
                System.out.println("1. Conjuntos        2. Cifrado por substitución     3. Sobre    4. Salir");
                opc = vini.nextInt();
                switch(opc){
                    case 1:conjuntos();break;
                    
                    case 2:
                        System.out.println("ingrese Texto");
                        String text = rm.nextLine();
                        System.out.println("Texto cifrado: "+cifrado(text));break;
                        
                    case 3:
                        int num2=0;
                        char car=' ';
                        do{
                            System.out.println("Ingrese numero entero positivo");
                            num2 = vini.nextInt();
                            System.out.println("Ingrese el contorno");
                            car = rm.next().charAt(0);
                        }while(num2%2 !=0);
                        
                        sobre(num2, car); break;
                    
                    default: System.out.println("Opcion no valida"); break;
                }
            }
        }catch(Exception e){System.out.println("Usted ha ingresado un dato erroneo");}
    }
    
    public static void conjuntos(){
        String con1 = "";
        String con2 = "";
        int w = 0;
        int t = 0;
        int h = 0;
        do{
            System.out.println("Ingrese conjunto 1");
            con1 = rm.nextLine();
            System.out.println("Ingrese conjunto 2");
            con2 = rm.nextLine();
            for (int i = 0; i <= con1.length()-1; i++) {
                char g = con1.charAt(i);
                int gg = (int) g;
                if(g== 123 || g== 125 || g== 44 || g>=65 && g<=90){   
                    w+=1;
                }
            }
            for (int i = 0; i <= con2.length()-1; i++) {
                char g = con2.charAt(i);
                int gg = (int) g;
                if(g== 123 || g== 125 || g== 44 || g>=65 && g<=90){   
                    t+=1;
                }
            }
        }while(con1.length()!=w && con2.length()!=t);
        
        if(con1.length()==con2.length()){
            for (int i = 0; i <= con1.length()-1; i++) {
               char d = con1.charAt(i);
                for (int j = 0; j <= con2.length()-1; j++) {
                    char e = con2.charAt(j);
                    if(d==e){
                        h+=1;
                    }
                }
            }
            if(h>=con2.length()){System.out.println("Ambos conjuntos son iguales");}
        }
         
       
}
    public static String cifrado(String text){
        String le_tra = "";
        String palabra = "";
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            char _letra = text.charAt(i);
            int letra = (int) _letra;
            int num = 122-letra+97;
            char let = (char) num;
            palabra+= let;
        }
        return palabra;
    }
    public static void sobre(int n, char car){
        
       for(int i = 0; i <= 2*n; i++) {
            System.out.print(car+" ");
            }
        System.out.println();
           
        for(int i = 0; i <= 2*n-2; i++) {
            System.out.print(car+" ");
                for(int j = 0; j <= 2*n; j++) {
                    System.out.print(" ");
        
                }
                System.out.println(car);
            }
           
            for(int i = 0; i <= 2*n; i++) {
                System.out.print(car+" ");
    }
}
}
    
