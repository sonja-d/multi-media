public class Radio {
  private float fmFrequency;
  private int amFrequency;
  private char band;

  public void setFm(float radioFm){
    this.fmFrequency = radioFm;
  }
  public float getFm(){
    return this.fmFrequency;
  }

  public void setAm(int radioAm){
    this.amFrequency = radioAm;
  }
  public int getAm(){
    return this.amFrequency;
  }

  public void setBand(char radioBand){
    this.band = radioBand;
  }
  public char getBand(){
    return this.band;
  }
  public void printInConsole(){
    System.out.println("Radio fm frequency: " + this.fmFrequency);
    System.out.println("Radio am frequency: " + this.amFrequency);
    System.out.println("Radio band: " + this.amFrequency);
    System.out.println();
  }
}
