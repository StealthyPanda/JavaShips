package JavaShips.res.p1;

import java.util.*;
import java.io.*;
import JavaShips.ImpClasses.*;

class Main {

  public static void init(){

    Random rand = new Random();
    int x1 = rand.nextInt(1000)%5+1, y1 = rand.nextInt(1000)%5+1, x2 = rand.nextInt(1000)%5+1, y2 = rand.nextInt(1000)%5+1, x3 = rand.nextInt(1000)%5+1, y3 = rand.nextInt(1000)%5+1;
	BattleBoard b = new BattleBoard('O');
	b.display();

  }

  //temp
  public static void main(String[] args){

    init();

  }


}
