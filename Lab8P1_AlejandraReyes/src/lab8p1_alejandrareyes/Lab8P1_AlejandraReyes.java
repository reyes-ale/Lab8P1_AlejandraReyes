package lab8p1_alejandrareyes;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author aleja
 */
public class Lab8P1_AlejandraReyes {
    static Scanner leer = new Scanner (System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        ArrayList<String> coord = new ArrayList<>();
        System.out.println("* * * * * M E N U * * * * * ");
        System.out.println("1. Game of Life");
        System.out.println("2. Salir del programa");
        int opcion = leer.nextInt();
        
        while (opcion>0&& opcion<2){
             int [][] actual= new int [10][10];
            int [][] nextgen = new int [10][10];
            System.out.println("Ingrese el numero de rondas: ");
            int rondas = leer.nextInt();
            llenar(actual);
            imprimir(actual);
            Game g = new Game(rondas,actual, nextgen,coord);
            g.jugar(rondas);
            
         
        break;
            
        }
        
    }
    
   
       
        
   public static int [][] llenar (int[][]actual){
       
        for (int i=0; i<10; i++){
            for (int j=0; j<10;j++){
                if (i==0 || i==9 || j==0 || j==9){
                     actual[i][j]=0;
                }
                else{
                    actual[i][j]=rand.nextInt(2);
                    
                }
               
                
            }
        }
        return actual;
   }
   
   
   
   public static void imprimir(int [][]matriz){
       for (int i=0; i<10; i++){
            for (int j=0; j<10;j++){
                System.out.print("[" +matriz[i][j]+"]");
              
                
            }
            System.out.println();
        }
   }
   
    
    
    
    
}
