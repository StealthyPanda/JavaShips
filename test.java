class test{

  public static void main(String[] args) {
    BattleBoard b = new BattleBoard('P');
    b.getcharAt(1, 1);
    b.setcharAt('T', 1, 2);
    b.display();
  }
}
