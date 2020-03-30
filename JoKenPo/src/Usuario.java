/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class Usuario {
    
    int pedra, papel, tesoura,n;
    public int User(int n){ //onde vou por o n2 no main
        this.n=n;
        switch(n){
            case 0: Pedra();
            break;
            case 1: Tesoura();
            break;
            case 2: Papel();
            break;
        }
        return n;
       }
    public void Pedra(){
        }
    public void Tesoura(){
    }
    public void Papel(){
    }
    public void Printando(){
        switch(n){
            case 0: System.out.println("Usuário escolheu Pedra!");
            break;
            case 1: System.out.println("Usuário escolheu Tesoura!");
            break;
            case 2: System.out.println("Usuário escolheu Papel!");
            break;
        }
    }
}
