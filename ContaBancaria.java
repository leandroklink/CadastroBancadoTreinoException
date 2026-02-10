/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Leandro
 */
public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    public void sacar(double valor) throws SaldoInsuficienteException{
        if(valor <= 0){
            throw new RuntimeException("O valor do saque não pode ser igual ou menor que 0");
        }
        if (valor > saldo){
            throw new SaldoInsuficienteException("O valor que você deseja sacar é maior que o saldo da conta.");
        }
        this.saldo -= valor;
    }
    public double getSaldo(){
        return saldo;
    }
    public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}

}
