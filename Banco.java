package BancoMD;

import java.util.ArrayList;

public class Banco {
    public ArrayList<Cuenta> cuentas;

    public Banco() {
        cuentas = new ArrayList<>();
    }

    public void adicionarCuenta(int numero, double saldoInicial, String titular, String tipoCuenta) {
        cuentas.add(new Cuenta(numero, saldoInicial, titular, tipoCuenta));
    }

    public double calcularTotalDinero() {
        double total = 0;
        for (Cuenta cuenta : cuentas) {
            total += cuenta.getSaldo();
        }
        return total;
    }

    public String consultarClienteConMayorSaldo() {
        double maxSaldo = Double.MIN_VALUE;
        String clienteConMayorSaldo = "";

        for (Cuenta cuenta : cuentas) {
            if (cuenta.getSaldo() > maxSaldo) {
                maxSaldo = cuenta.getSaldo();
                clienteConMayorSaldo = cuenta.getTitular() + " (" + cuenta.getTipoCuenta() + ")";
            }
        }

        return clienteConMayorSaldo;
    }

    public void mostrarListaDeCuentas() {
        System.out.println("Listado de cuentas:");
        for (Cuenta cuenta : cuentas) {
            System.out.println("Titular: " + cuenta.getTitular() + ", Tipo de cuenta: " + cuenta.getTipoCuenta() +
                    ", Saldo: $" + cuenta.getSaldo());
        }
    }
}