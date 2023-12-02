package lab8p1_alejandrareyes;
import java.util.ArrayList;

/**
 *
 * @author aleja
 */
public class Game {
    int [][] actual = new int [10][10];
    int [][] nextgen = new int [10][10];
    ArrayList<String> coord = new ArrayList<>();
    int rondas;
    
    
    
    public Game(int rondas, int[][] actual, int[][]nextgen, ArrayList<String> coord){
        
    }

    public int[][] getActual() {
        return actual;
    }

    public void setActual(int[][] actual) {
        this.actual = actual;
    }

    public int[][] getNextgen() {
        return nextgen;
    }

    public void setNextgen(int[][] nextgen) {
        this.nextgen = nextgen;
    }

    public ArrayList<String> getCoord() {
        return coord;
    }

    public void setCoord(ArrayList<String> coord) {
        this.coord = coord;
    }

    public int getRondas() {
        return rondas;
    }

    public void setRondas(int rondas) {
        this.rondas = rondas;
    }

    
    public void jugar (int rondas){
        
        for (int i=0; i<rondas;i++){
                System.out.println("Ronda " + i);
                imprimirarraylist(actual);
                
                
        }
        
    }
    
    public static ArrayList<String> imprimirarraylist (int[][]actual){
        ArrayList<String> coord = new ArrayList();
        for (int i=0; i<10; i++){
            for (int j=0; j<10;j++){
                if (actual[i][j]==1){
                    coord.add(i +":"+j);
                }
            }
        }
        
        System.out.println("Coordenadas de celdas vivas: ");
        for (int k=0; k<coord.size(); k++){
            System.out.print(coord.get(k)+"  ");
        }
        return coord;
        
    }
    
    public static int [][] nextGen(int[][]actual, ArrayList<String> coord){
        
        for (int i=0; i<10; i++){
            for (int j=0; j<10;j++){
                int vecinos = contveci(i,j);
                if ((actual [i][j]==1 && vecinos<2) || (actual [i][j]==1 && vecinos>3)){
                   coord.remove(actual [i][j]);
                }
                else if (actual [i][j]==0 && vecinos==3){
                    coord.add(i+":"+j);
                  
              }
                else if (actual [i][j]==0 && vecinos==2){
                    actual[i][j]=1;
                  
                }
               
                
            }
        }
         return actual;
        }
       
        public static int contveci (int po1, int po2){
            int cont=0;
            int [][] mat = new int [po1][po2];
            
            for (int i=po1-1; i<=po1+1; i++){
                for (int j = po2-1; j<=po2+1;j++){
                     if (mat[i][j]==1){
                         cont++;
                    }
            }
            }
            return cont;
        }
           
            

            
    
}
    
    
    
    
    

    
    

