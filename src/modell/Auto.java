
package modell;

public class Auto extends Jarmu{
    
    private boolean defekt;

    public Auto(boolean defekt, boolean beinditva, boolean uzemanyag, boolean megerkezett) {
        super(beinditva, uzemanyag, megerkezett);
        this.defekt = false;
    } 

    @Override
    public void leallit() {
        super.leallit();
    }
    
    
    public void kereketCserel(){
        leallit();
    }
    
    public boolean halad(){
        if(defekt==true){
            kereketCserel();
        }
        return false;
    }
}
