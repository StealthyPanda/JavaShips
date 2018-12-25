import java.util.*;
import java.io.*;

class Main {

  public static void init(){

    Random rand = new Random();
    int x1 = rand.nextInt(1000)%5+1, y1 = rand.nextInt(1000)%5+1, x2 = rand.nextInt(1000)%5+1, y2 = rand.nextInt(1000)%5+1, x3 = rand.nextInt(1000)%5+1, y3 = rand.nextInt(1000)%5+1;
    System.out.println(""+x1+y1+"\n"+x2+y2+"\n"+x3+y3);

  }

  //temp
  public static void main(String[] args){

    init();

  }


}
