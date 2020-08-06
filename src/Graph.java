import java.util.*;
public class Graph{

    int [][] v = new int[5][5];
    Random r = new Random();

    public void addVertex(){
        for(int p = 5; p>0; ){
            int x= r.nextInt(5);
            int y = r.nextInt(5);
            int z = r.nextInt(10);
            if (x == y)
            {p+=1;}
            else
            {v[x][y] = z;
                v[y][x] = z;
                p--;}
        }
    }


    public void printMatrix(){
        for (int [] a: v){
            for (int t : a){
                System.out.print(t+"  ");
            }
            System.out.println("\n");
        }


    }

}