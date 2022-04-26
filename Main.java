public class Main {

  public static void main(String[] args) {
    System.out.println("TV's current status");
    System.out.println();
  
  Television LG = new Television();
  LG.setVolume(0);
  LG.setProgram(1);
  LG.setTurnedOn(false);
  LG.printInConsole();

  Television Samsung = new Television();
  Samsung.setVolume(55);
  Samsung.setProgram(12);
  Samsung.setTurnedOn(true);
  Samsung.printInConsole();

  Radio TDI = new Radio();
  TDI.setFm(91.8f);
  TDI.setAm(330);
  TDI.setBand('A');
  TDI.printInConsole();

 }
}