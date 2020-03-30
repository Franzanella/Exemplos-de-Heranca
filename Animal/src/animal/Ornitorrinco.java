/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author Aluno
 */
public class Ornitorrinco implements Mamifero,Ave,Corpo,Oviparo,Veneno,Nadar,Terrestre{
    String tipo,caract,estilo,tipos,carac,reprod,perigo,alerta,vene,tipv,pe,habitat,local,terra,noite;

    @Override
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String getCaract(){
        return this.caract;
    }
    public void setCaract(String caract){
        this.caract = caract;
    }
   
    @Override
    public String getEstilo(){
        return this.estilo;
    }
    public void setEstilo(String estilo){
        this.estilo = estilo;
    }

    @Override
    public String getTipos() {
        return this.tipos;
    }
    public void setTipos(String tipos){
        this.tipos = tipos;
    }

    @Override
    public String getCarac() {
        return this.carac;
        
    }
    public void setCarac(String carac){
        this.carac = carac;
    }

    @Override
    public String getReprod() {
        return this.reprod;
    }
    public void setReprod(String reprod){
        this.reprod = reprod;
    }

    @Override
    public String getPerigo() {
        return this.perigo;
    }
    public void setPerigo(String perigo){
        this.perigo = perigo;
    }

    @Override
    public String getAlerta() {
        return this.alerta;
    }
    public void setAlerta(String alerta){
        this.alerta = alerta;
    }
       
    @Override
    public String getVene() {
        return this.vene;
    }
    public void setVene(String vene){
        this.vene = vene;
    }

    @Override
    public String getTipV() {
        return this.tipv;
     
    }
    public void setTipV(String tipv){
        this.tipv = tipv;
    }

    @Override
    public String getLocal() {
       return this.local;
    }
    public void setLocal(String local){
        this.local = local;
    }

    @Override
    public String getHabitat() {
       return this.habitat;
    }
    public void setHabitat(String habitat){
        this.habitat = habitat;
    }

    @Override
    public String getPe() {
       return this.pe;
    }
    public void setPe(String pe){
        this.pe = pe;
    }

    @Override
    public String getTerra() {
        return this.terra;
    }
    public void setTerra(String terra){
        this.terra = terra;
    }

    @Override
    public String getNoite() {
       return this.noite;
    }
    public void setNoite(String noite){
        this.noite = noite;
    }
    
    
}
    
    
    
