package teszt;

import modell.Auto;

public class JarmuvekTeszt {
    public static void main(String[] args) {
        new JarmuvekTeszt();
    }
    
    public JarmuvekTeszt(){
//        mintaTeszt();
//        haladBeinditasTeszt();
//        haladTeszt();
//        tankolvaVanE(); //hibás
//        tankolvaVan(); //jó
//        defektesE(); //jó
//        defektes(); //hibás
    }
    
    public void mintaTeszt(){
        int kapott = 7;
        int vart = 4;
        assert kapott == vart : "nem egyeznek";
    }

    private void haladTeszt() {
        Auto auto = new Auto();
        boolean kapott = auto.halad();
        boolean vart = false;
        assert kapott == vart : "tud haladni, de nincs beindítva";
    }
    
    private void haladBeinditasTeszt() {
        Auto auto = new Auto();
        auto.beindit();
        boolean kapott = auto.halad();
        boolean vart = true;
        assert kapott == vart : "nem tud haladni, beindítva sem";
    }

    private void tankolvaVanE() {
        Auto auto = new Auto();
        boolean kapott = auto.tankol();
        boolean vart = true;
        assert kapott == vart : "nincsen tankolva";
    }
    
     private void tankolvaVan() {
        Auto auto = new Auto();
        boolean kapott = auto.tankol();
        boolean vart = false;
        assert kapott == vart : "tankolva van, de mégse";
    }
     
     private void defektesE(){
         Auto auto = new Auto();
         boolean kapott = auto.kereketCserel();
         boolean vart = false;
         assert kapott == vart : "kicserélt kerekekkel is defektes";
     }
     private void defektes(){
         Auto auto = new Auto();
         boolean kapott = auto.kereketCserel();
         boolean vart = true;
         assert kapott == vart : "nincsen kerék csere";
     }
}
