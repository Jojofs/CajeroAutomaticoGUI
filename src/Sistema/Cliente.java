package Sistema;

public class Cliente {
    //-- Atributos
    private String nombre;
    private double saldo;
    private int numeroCuenta;
    private int pin;
    //-- Métodos
    
    //Constructores
    public Cliente() {
        this.saldo=0.00;
    }

    public Cliente(String nombre, double saldo, int numeroCuenta, int pin) {
        this.nombre = nombre;
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
        this.pin = pin;
    }
    
    //Setter y Getter de nombre
    public String getNombre() { //Esta funcion muestra el nombre (Para mostrarlo en el cajero)
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Setter y Getter de saldo
    public double getSaldo() { //Esta funcion muestra el saldo (Para consultar el dinero guardado)
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    //Setter y Getter de numero de cuenta
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    
    //Setter y Getter de pin
    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
    
    //Funciones para deposito
    public boolean depositar(double ingreso){
        //Si la cantidad a depositar es mayor a 0 procede
        if (ingreso>0) {
            this.setSaldo(this.getSaldo()+ingreso);
            return true;
        } else {
            return false;
        }
    }
    
    //Funcion para retiro
    public boolean retirar(double egreso){
        //Si la cantidad a retirar es menor o igual al saldo actual procede
        if (egreso<=this.getSaldo()) {
            this.setSaldo(this.getSaldo()-egreso);
            return true;
        } else {
            return false;
        }
    }
}