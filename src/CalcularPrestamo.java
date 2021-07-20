public class test {
  // Atributos
  private double pMonto;
  private double pInteres;
  private int pTiempo;
  private double diferencia;
  private double interesSimple;
  private double interesCompuesto;
  // Constructores
  public CalcularPrestamo() {
  this.pMonto = 0;
  this.pInteres = 0;
  this.pTiempo = 0;
  this.diferencia = 0;
  this.interesSimple = 0;
  this.interesCompuesto = 0;
  }
  public double getpMonto() {
    return pMonto;
  }
  public double getpInteres() {
    return pInteres;
  }
  public int getpTiempo() {
    return pTiempo;
  }
  public double getDiferencia() {
    return diferencia;
  }
  public void setDiferencia(double diferencia) {
    this.diferencia = diferencia;
  }
  // Métodos
  public double interesSimple(){
    return interesSimple;
  }
  public double interesCompuesto(){
    return interesCompuesto;
  }
  public double compararPrestamo(int pTiempo, double pMonto, double pInteres) {
    this.interesSimple = getpMonto()*getpInteres()*getpTiempo()/100;
    this.interesCompuesto = pMonto*((Math.pow((1+(pInteres/100)),pTiempo))-1);
    this.diferencia = (interesCompuesto-interesSimple);
    return this.diferencia;
  }
  public double compararPrestamo() {
    return Math.round(compararPrestamo(pTiempo, pMonto, pInteres));
  }