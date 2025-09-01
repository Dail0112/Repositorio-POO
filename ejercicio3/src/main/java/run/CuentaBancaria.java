package run;
//Crear la clase CuentaBancaria con
// atributos titular (String) y saldo (double). Añadir métodos para depositar y retirar dinero.
public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("La cantidad a depositar debe ser mayor a 0.");
        }
    }

    // Método para retirar dinero
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Fondos insuficientes o cantidad inválida.");
        }
    }

    // Método para consultar saldo
    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    // Método de prueba
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Ana Pérez", 500.0);
        cuenta.depositar(200);
        cuenta.retirar(100);
        cuenta.retirar(700); // ejemplo de fondos insuficientes
    }


}


