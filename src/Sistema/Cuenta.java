package Sistema;

public class Cuenta {
    //-- Atributos
    private String nombre;
    private double saldo;
    //private int numeroCuenta; para hacer transferencias entre las cuentas
    //-- Métodos
    //Constructor
    public Cuenta() {
        saldo=0.00;
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