public abstract class Sorum {
    public String namaCustomer;
    public String namaMobil;
    public String jenisMesin;
    public String tipeMobil;

    public abstract void caraMemesanOffline();

    {
        System.out.println("pesan Offline");
    }

    public abstract void caraMemesanOnline();

    {
        System.out.println("pesan Online");
    }

}
