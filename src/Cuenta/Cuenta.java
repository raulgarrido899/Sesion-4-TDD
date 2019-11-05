package Cuenta;


public class Cuenta {
    
    String n_cuenta;
    String Nombre;
    double saldo;
    
    public Cuenta(String n_cuenta, String Nombre){
        this.n_cuenta=n_cuenta;
        this.Nombre=Nombre;
        saldo=0.0;
    }
    
    public void ingresar(double x){
        saldo = 1000;
    }
    
    public void retirar(double x){
        saldo = 0;
    }
    
    
    public double getSaldo(){
        return saldo;
    }
    
}
