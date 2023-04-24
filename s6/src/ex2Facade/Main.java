package ex2Facade;

public class Main {
    public static void main(String[] args) {
        DealerAutoFacade dealerAutoFacade = new DealerAutoFacade();

        dealerAutoFacade.descriereMasinaSport();
        dealerAutoFacade.descriereMasinaElectrica();
        dealerAutoFacade.descriereMasinaFamilie();
    }
}
