package BancoMD;

public class Cuenta {
    public int numero;
    public double saldo;
    public String titular;
    public String tipoCuenta; 

    public Cuenta(int numero, double saldo, String titular, String tipoCuenta) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
        this.tipoCuenta = tipoCuenta;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    public void retirar(double cantidad) {
        saldo -= cantidad;
    }
}