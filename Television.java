public class Television {
  private int volume;
  private int currentProgram;
  private boolean power;

  public void setVolume(int volumeLevel){
    if (this.isOn()){
      this.volume = volumeLevel;
    }else{
      System.out.println("TV is off. Can't set volume");
    }
  }
  public int getVolume(){
    return this.volume;
  }

  public void setProgram(int programNumber){
   if (this.isOn()){
        this.currentProgram = programNumber;
   }else{
     System.out.println("TV is off.Can't set program");
   }
    
  }
  public int getProgram(){
    return this.currentProgram;
  }

  public void setPower(boolean tvPower){
    this.power = tvPower;
  }
  public boolean getPower(){
    return this.power;
  }

  public void turnOn() {
    this.power = true;
  }

  public void turnOff() {
    this.power = false;
  }

  public boolean isOn() {
    return this.power;
  }

  public void printInConsole(){
    System.out.println("Volume is: " + this.getVolume());
    System.out.println("Current program is: " + this.getProgram());
    System.out.println("The TV power: " + this.isOn());
    System.out.println();
  }
}
