
package modell;

public class Auto extends Jarmu{
    
    private boolean defekt;

    public Auto() {
        super();
        defekt = false;
    } 

    
    public boolean kereketCserel(){
        boolean kerekCsere = false;
        if(defekt==true){
            kerekCsere=true;
        }
        return kerekCsere;
    }
    
    @Override
    public boolean halad(){
        boolean haladE = false;
        if(this.isBeinditva()){
            haladE= false;
        }
        return haladE;
    }
}
