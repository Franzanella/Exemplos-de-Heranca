/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jokenpo;

import static com.sun.javafx.css.SizeUnits.PC;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class JoKenPo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int resp=0;
        PC pc;
        Usuario user;
        Vencedor ven;
        ven = new Vencedor();
        user = new Usuario();
        pc= new PC();
        Scanner scan = new Scanner(System.in);
        System.out.println("**Que comece o jogo**\n\n");
        System.out.println("Qual o nuúmero de rodadas que terá o jogo?");
        int n = scan.nextInt(); //váriavel que possui a qtde de partidas
        System.out.println("O jogo terá: "+n+" rodada(s)!");
        System.out.println("Faça a sua escolha\n");
        System.out.println("0- Pedra");
        System.out.println("1-Tesoura");
        System.out.println("2-Papel");
        System.out.println("3-Lagarto");
        System.out.println("4-Spock");
        int n2= scan.nextInt(); //váriavel que possui a opção do user
        user.User(n2);
        //pc.PC();
        user.Printando();
        System.err.println("Quem venceu: "+ven.Vencer() );
        pc.Printando();
        resp = (ven.Vencer());
        switch(resp){
            case 0: System.out.println("O computador venceu!");
            break;
            case 1: System.out.println("Uhuuuuul, você venceu!");
            break;
            case 2: System.out.println("Você empatou!");
            break;
            case 3: System.out.println("Que pena, você errou!");
            break;
        }
 }
}
    
