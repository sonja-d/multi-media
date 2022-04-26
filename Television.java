public class Television {
  private int volume;
  private int currentProgram;
  private boolean turnedOn;

  public void setVolume(int volumeLevel){
    if (this.getTurnedOn()){
      this.volume = volumeLevel;
    }else{
      System.out.println("TV is off. Can't set volume");
    }
  }
  public int getVolume(){
    return this.volume;
  }

  public void setProgram(int programNumber){
   if (this.getTurnedOn()){
        this.currentProgram = programNumber;
   }else{
     System.out.println("TV is off.Can't set program");
   }
    
  }
  public int getProgram(){
    return this.currentProgram;
  }

  public void setTurnedOn(boolean tvOn){
    this.turnedOn = tvOn;
  }
  public boolean getTurnedOn(){
    return this.turnedOn;
  }
  public void printInConsole(){
    System.out.println("Volume is: " + this.getVolume());
    System.out.println("Current program is: " + this.getProgram());
    System.out.println("The TV is turned on: " + this.getTurnedOn());
    System.out.println();
  }
}
