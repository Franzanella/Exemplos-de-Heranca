/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ornitorrinco;

/**
 *
 * @author Aluno
 */
public class Ornitorrinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ornitorrinco2 e = new Ornitorrinco2();
       
       e.setNome("ORNITORRINCO");
       e.setTipo("Mamifero,réptil e oviparo");
       e.setGenero("Ornithorhynchus");
       e.setFamilia("Ornithorhynchidae");
       e.setClasse("Mammalia");
       e.setCaract ("Pelos, bico de pato, noturno");
       e.setReino ("Animalia");
       e.setDef ("Veneno só para o macho");
       
       System.out.println(e.getNome());
       System.out.println(e.getTipo());
       System.out.println(e.getGenero());
       System.out.println(e.getFamilia());
       System.out.println(e.getClasse());
       System.out.println(e.getCaract());
       System.out.println(e.getReino());
       System.out.println(e.getDef());
       
       Oviparo f = new Oviparo();
       System.out.println(f.getNome());
       System.out.println(f.getTipo());
       System.out.println(f.getClasse());
       
       Mamifero m = new Mamifero();
       System.out.println(m.getTipo());
       
       Terrestre t = new Terrestre();
       System.out.println(t.getNome());
       System.out.println(t.getTipo());
       System.out.println(t.getClasse());
       
       Nadar n = new Nadar();
       System.out.println(n.getNome());
       System.out.println(n.getTipo());
       System.out.println(n.getClasse());
       
       Veneno v = new Veneno();
       System.out.println(v.getNome());
       System.out.println(v.getTipo());
       System.out.println(v.getClasse());
       
       Corpo c = new Corpo ();
       System.out.println(c.getNome());
       System.out.println(c.getTipo());
       System.out.println(c.getClasse());
       
       Ave a = new Ave ();
       System.out.println(a.getNome());
       
       
       
        
    }
    
}
