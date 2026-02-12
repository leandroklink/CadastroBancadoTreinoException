
package domain;


import java.io.IOException;

public class main{
    public static void main(String[] args){
        ContaBancaria conta1 = new ContaBancaria("Juninho", 2000);
        try {
            conta1.sacar(100);
            conta1.sacar(-50);
            conta1.sacar(200);
            System.out.println("Fim do try");
        } catch (RuntimeException e) {
            System.out.println("Runtime: " + e.getMessage());
        } catch (SaldoInsuficienteException e) {
            System.out.println("Saldo: " + e.getMessage());
        }finally{ 
            //o finally sempre executa não importa o que aconteça, você também pode utilizar o try e finally sem o catch.
            System.out.println("Fechando recurso de saque.");
        }


    }
}
