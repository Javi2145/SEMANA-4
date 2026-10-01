package edu.uta.tarea3.refactorizado; 

  

/** 

 * Contrato que deben cumplir todas las políticas de cuentas bancarias. 

 */ 

public interface PoliticaCuenta { 

  

    String obtenerTipo(); 

  

    double calcularComisionTransferencia(double monto); 

  

    double calcularInteresMensual(double saldo); 

} 

  

package edu.uta.tarea3.refactorizado; 

  

/** 

 * Ejemplo de extensión OCP: se agregó esta cuenta sin modificar CuentaBancaria. 

 */ 

public class PoliticaEstudiantil implements PoliticaCuenta { 

  

    @Override 

    public String obtenerTipo() { 

        return "Estudiantil"; 

    } 

  

    @Override 

    public double calcularComisionTransferencia(double monto) { 

        return 0; 

    } 

  

    @Override 

    public double calcularInteresMensual(double saldo) { 

        return saldo * 0.0025; 

    } 

} 

public double transferir(CuentaBancaria destino, double monto) { 

    if (destino == null) { 

        throw new IllegalArgumentException("La cuenta destino es obligatoria"); 

    } 

    validarMontoPositivo(monto); 

  

    double comision = politica.calcularComisionTransferencia(monto); 

    double totalDebitar = monto + comision; 

  

    if (saldo < totalDebitar) { 

        throw new IllegalStateException("Saldo insuficiente"); 

    } 

  

    saldo -= totalDebitar; 

    destino.depositar(monto); 

    return comision; 

} 

  