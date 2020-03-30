
import java.util.Random;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class PC {
     Random randomValue = new Random();
       int valorAleatorio;
    Random op = new Random();
     int PC(){
   switch(valorAleatorio){
       case 0: Pedra();
       break;
       case 1: Tesoura();
       break;
       case 2: Papel();
       break;
       case 3: Lagarto();
       break;
       case 4: Spock();
       break;
      
       
}
   return valorAleatorio;
 }
    public void Pedra(){}
    public void Tesoura(){}
    public void Papel(){}
    public void Lagarto(){}
    public void Spock(){}
public int Printando(){
    switch(valorAleatorio){
        case 0: System.out.println("O computador escolheu Pedra!");
        break;
        case 1: System.out.println("O computador escolheu Tesoura");
        break;
        case 2: System.out.println("O computador escolheu Papel!");
        break;
        case 3: System.out.println("O computador escolheu Lagarto!");
        break;
        case 4: System.out.println("O computador escolheu Spock!");
        break;
    }
    return valorAleatorio;
}
}
    

