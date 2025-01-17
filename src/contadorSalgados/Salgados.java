/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contadorSalgados;

public class Salgados {
    private int coxinha;
    private int kibe;
    private int pastel;
    private int salgados;
    private static final double PRECO_COXINHA  = 5.00;
    private static final double PRECO_KIBE = 6.00;
    private static final double PRECO_PASTEL =5.00;
    
    public Salgados (int coxinha ,int kibe, int pastel){
        this.coxinha=coxinha;
        this.kibe=kibe;
        this.pastel= pastel;  
    }
    public  void adicionarCoxinha(){
         this.coxinha +=1 ;
    }
    public  void adicionarKibe(){
        this.kibe +=1;
    }
    public  void adicionarPastel(){
        this.pastel +=1;   
    }
    public  double calcularTotal(){
      return (coxinha * PRECO_COXINHA) + (kibe * PRECO_KIBE) + (pastel * PRECO_PASTEL);
    
     }
    public void removerCoxinha(){
           this.coxinha -=1 ;
           if (this.coxinha < 0){
           this.coxinha = 0;
           }
    }
    public void removerKibe() {
            this.kibe -=1 ;
            if(this.kibe < 0){
            this.kibe = 0;
            }
    }
    public void removerPastel(){
           this.pastel -=1;
           if(this.pastel < 0){
           this.pastel = 0;
           }
    }

    public int getCoxinha() {
        return coxinha;
    }

    public void setCoxinha(int coxinha) {
        this.coxinha = coxinha;
    }

    public int getKibe() {
        return kibe;
    }

    public void setKibe(int kibe) {
        this.kibe = kibe;
    }

    public int getPastel() {
        return pastel;
    }

    public void setPastel(int pastel) {
        this.pastel = pastel;
    }

    public int getSalgados() {
        return salgados;
    }

    public void setSalgados(int salgados) {
        this.salgados = salgados;
    }
    
    }







