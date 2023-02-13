package modell;

public abstract class Jarmu {

    private boolean beinditva, uzemanyag, megerkezett;

    public Jarmu(boolean beinditva, boolean uzemanyag, boolean megerkezett) {
        this.beinditva = false;
        this.uzemanyag = true;
        this.megerkezett = false;
    }
    
    public void beindit(){
        if(uzemanyag == false){
            leallit();
        }else{
           beinditva = true;
           halad();
           uzemanyag = false;
        }
    }
    
    public void leallit(){
        beinditva = false;
    }
    
    public boolean tankol(){
        if(beinditva==false){
           uzemanyag=true;
        }
        return uzemanyag;
    }
    
    public boolean halad(){
        if(uzemanyag==false){
            megerkezett=true;
        }else{
            megerkezett=false;
        }
        return megerkezett;
    }
    
}
