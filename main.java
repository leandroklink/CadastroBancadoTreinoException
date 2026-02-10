/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import domain.ContaBancaria.SaldoInsuficienteException;
import java.io.IOException;

/**
 *
 * @author Leandro
 */
public class main{
    public static void main(String[] args) throws IOException, ContaBancaria.SaldoInsuficienteException{
        ContaBancaria conta1 = new ContaBancaria("Juninho", 2000);
        try{
            conta1.sacar(3000);
            System.out.println("Operação de saque finalizada");
        }catch(SaldoInsuficienteException e){
            System.out.println("Operação não ralizada: "+ e.getMessage());

        }

    }
}
