package model;


public class Mahasiswa {
    private String nim;
    private String nama;
    private int idProdi; 

    public Mahasiswa(String nim, String nama, int idProdi) {
        this.nim = nim;
        this.nama = nama;
        this.idProdi = idProdi;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public int getidProdi() {
        return idProdi;
    }

    public void setIdProdi(int idProdi) {
        this.idProdi = idProdi;
    }
}
