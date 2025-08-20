package instancia;

public class CuentaBancaria {
    private int saldo;

    public CuentaBancaria(int saldoInicial) {
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
            System.out.println("El saldo inicial no puede ser negativo. Se ha establecido en 0.");
        }
    }

    public int getSaldo() {
        return saldo;
    }

    public void depositar(int monto) {
        if (monto > 0) {
            this.saldo += monto;
            System.out.println("Depósito de " + monto + " realizado. Nuevo saldo: " + this.saldo);
        } else {
            System.out.println("El monto a depositar debe ser positivo.");
        }
    }

    public void retirar(int monto) {
        if (monto > 0) {
            if (this.saldo >= monto) { // Verifica si hay suficiente saldo
                this.saldo -= monto; // Resta el monto del saldo existente
                System.out.println("Retiro de " + monto + " realizado. Nuevo saldo: " + this.saldo);
            } else {
                System.out.println("Saldo insuficiente. No se pudo realizar el retiro de " + monto + ". Saldo actual: " + this.saldo);
            }
        } else {
            System.out.println("El monto a retirar debe ser positivo.");
        }
    }

    @Override
    public String toString() {
        return "CuentaBancaria con " +
                "saldo: " + saldo;
    }
}
