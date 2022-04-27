public class Main {

  public static void main(String[] args) {
    System.out.println("TV's current status");
    System.out.println();
  
  System.out.println("LG television");
  Television LG = new Television();
  LG.turnOff();
  LG.setVolume(0);
  LG.setProgram(1);
  LG.printInConsole();

  System.out.println("Samsung television");
  Television Samsung = new Television();
  Samsung.turnOn();
  Samsung.setVolume(55);
  Samsung.setProgram(12);
  Samsung.printInConsole();

  System.out.println("VOX television");
  Television VOX = new Television();
  VOX.turnOn();
  VOX.setVolume(55);
  VOX.setProgram(12);
  VOX.printInConsole();

  Radio TDI = new Radio();
  TDI.setFm(91.8f);
  TDI.setAm(330);
  TDI.setBand('A');
  TDI.printInConsole();

 }
}