package modell;

public abstract class Jarmu {

    private boolean beinditva, uzemanyag, megerkezett;

    public Jarmu() {
        this.beinditva = false;
        this.uzemanyag = true;
        this.megerkezett = false;
    }
    
    public void beindit(){
           beinditva = true;
    }
    
    public void leallit(){
        beinditva = false;
    }
    
    public boolean tankol(){
        boolean tankolva = false;
        return tankolva;
    }
    
    public boolean halad(){
        boolean haladE = false;
        return haladE;
    }

    public boolean isBeinditva() {
        return beinditva;
    }
    
    
}
