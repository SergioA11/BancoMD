import BancoMD.Banco;
import BancoMD.Cuenta;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        banco.adicionarCuenta(001, 543000, "Mariana Serna", "Corriente");
        banco.adicionarCuenta(002, 150000, "Sergio Amaya", "Corriente");
        banco.adicionarCuenta(003, 3000000, "Cristian Ruiz ", "Ahorros");
        banco.adicionarCuenta(004, 0, "pedro Sanchez", "Corriente");

        banco.mostrarListaDeCuentas();

        System.out.println("Total dinero en el banco: $" + banco.calcularTotalDinero());

        System.out.println("Cliente con mayor saldo: " + banco.consultarClienteConMayorSaldo());
    }
}

