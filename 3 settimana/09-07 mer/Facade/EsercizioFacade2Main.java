public class EsercizioFacade2Main {
    public static void main(String[] args) {
        RetediPc salaPc1 = new RetediPc();
        salaPc1.addRete(new ComputerFacade(new Bios(), new HardDisk(), new SistemaOperativo()));
        salaPc1.addRete(new ComputerFacade(new Bios(), new HardDisk(), new SistemaOperativo()));
        salaPc1.addRete(new ComputerFacade(new Bios(), new HardDisk(), new SistemaOperativo()));
        salaPc1.setPcOn(true);


    }
}
