/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartphone;

/**
 *
 * @author Aluno
 */
public class Hyphone6 implements Telefone,Computador,Camera,MP3,Radio {

    @Override
    public boolean ligar() {
        System.out.println("Ligando...");
        return true;
    }

    @Override
    public boolean processar() {
        System.out.println("Processando os dados do Smartphone...");
        return true;
    }

    @Override
    public boolean fotografar() {
       System.out.println("Tirando fotos...");
       return true;
    }

    @Override
    public boolean ouvir() {
        System.out.println("Ouvindo música em formato mp3...");
        return true;
    }

    @Override
    public boolean sincronizar() {
        System.out.println("Sincronizando na Rádio FM...98.1");
        return true;
    }
    
}
