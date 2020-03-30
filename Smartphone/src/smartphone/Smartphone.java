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
public class Smartphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hyphone6 six = new Hyphone6();
        
        six.ligar();
        six.processar();
        six.fotografar();
        six.ouvir();
        six.sincronizar();
    }
    
}
