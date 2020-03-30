/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jokenpo;

/**
 *
 * @author Aluno
 */
class Usuario {

    int pedra, papel, tesoura,lagarto,spock,n;
    public int User(int n){ //onde vou por o n2 no main
        this.n=n;
        switch(n){
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
        return n;
       }
    public void Pedra(){
        }
    public void Tesoura(){
    }
    public void Papel(){
    }
    public void Lagarto(){
        }
    public void Spock(){
        }
    public int Printando(){
        int n1 = 0;
        switch(n){
            case 0: System.out.println("Usuário escolheu Pedra!");
            break;
            case 1: System.out.println("Usuário escolheu Tesoura!");
            break;
            case 2: System.out.println("Usuário escolheu Papel!");
            break;
            case 3: System.out.println("Usuário escolheu Lagarto!");
            break;
            case 4: System.out.println("Usuario escolheu Spock!");
            break;
            
        }
       return n1;
    }
    
}
