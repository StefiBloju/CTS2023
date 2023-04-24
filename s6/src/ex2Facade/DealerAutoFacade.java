package ex2Facade;

public class DealerAutoFacade {
    private MasinaElectrica masinaElectrica;
    private MasinaFamilie masinaFamilie;
    private MasinaSport masinaSport;

    public DealerAutoFacade() {
        masinaElectrica = new MasinaElectrica();
        masinaFamilie = new MasinaFamilie();
        masinaSport = new MasinaSport();
    }

    public void descriereMasinaElectrica() {
        masinaElectrica.descriere();
    }

    public void descriereMasinaFamilie() {
        masinaFamilie.descriere();
    }

    public void descriereMasinaSport() {
        masinaSport.descriere();
    }

}
