package modell;

public abstract class Jarmu {

    private boolean beinditva, uzemanyag, megerkezett;

    public Jarmu(boolean beinditva, boolean uzemanyag, boolean megerkezett) {
        this.beinditva = beinditva;
        this.uzemanyag = uzemanyag;
        this.megerkezett = megerkezett;
    }
    
    public void beindit(){
        
    }
    
    public void leallit(){
        
    }
    
    public boolean tankol(){
        return false;
    }
    
    public boolean halad(){
        return false;
    }
    
}
