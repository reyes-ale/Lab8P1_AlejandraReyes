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
                nextGen();
                imprimirtab(coord);
                
                
        }
        
    }
    
    public void imprimirtab (ArrayList<String> coord){
       
        System.out.println("Coordenadas de celdas vivas: ");
        for (int k=0; k<coord.size(); k++){
            System.out.print(coord.get(k)+"  ");
        }
        
        
    }
    
    public void nextGen(){
         int[][] newactual = new int[10][10];
         ArrayList<String> newcoord = new ArrayList<>();
        for (int k=0; k<coord.size(); k++){
           char x = (coord.get(0)).charAt(0);
           char y = (coord.get(0)).charAt(2);
            int numx = x -'0';
            int numy = y -'1';
        
                int vecinos = contveci(x,y);
                if ((actual [numx][numy]==1 && vecinos<2) || (actual [numx][numy]==1 && vecinos>3)){
                    newactual[x][y] = 0;
                    //coord.remove(actual [numx][numy]);
                }
                else if (actual [numx][numy]==0 && vecinos==3){
                    newactual[x][y] = 1;
                    newcoord.add(x + ":" + y);
                    //coord.add(numx+":"+numy);
                  
              }
                else if (actual [numx][numy]==0 && vecinos==2){
                    newactual[x][y] = 1;
                    newcoord.add(x + ":" + y);
                    //actual[numx][numy]=1;
                  
                }
                    
            
         
        }
        coord=newcoord;
        actual=newactual;
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
    
    
    
    
    

    
    

