/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class Vencedor {
    
    public Vencedor(){
 }
    public int Vencer(){ //a = user; b = pc
       PC b;
       b = new PC();
       Usuario a;
       a = new Usuario();
     if(a.n==1 && b.valorAleatorio==1){
         return 2;//2 é empate
     }
     if(a.n==0 && b.valorAleatorio==0){
     return 2;
     }
     if(a.n==2 && b.valorAleatorio==2){
         return 2;
     }
         // agora os casos onde somente o usuário pode ganhar
     if(a.n==2 && b.valorAleatorio==0){ 
         return 1; 
     }
     if(a.n==1 && b.valorAleatorio==2){ 
         return 1; 
     }
     if(a.n==0 &&b.valorAleatorio==1){ 
         return 1;
     }
    
     if(a.n==0 && b.valorAleatorio==2){
         return 0; 
     }
     if(a.n==2 && b.valorAleatorio==1){
         return 0;
     }
     if(a.n==1 && b.valorAleatorio==0){ 
         return 0; 
     }
     return 0; 
    }
}
    

