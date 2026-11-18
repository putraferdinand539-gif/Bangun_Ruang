package bangunruang;

// Kelas Utama / Abstraksi
public abstract class BangunRuang {
    protected String nama;

    public BangunRuang(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract double hitungVolume();
    public abstract double hitungLuasPermukaan();
}

// Subclass 1: Kubus
class Kubus extends BangunRuang {
    private double sisi;

    public Kubus(double sisi) {
        super("Kubus");
        this.sisi = sisi;
    }

    @Override
    public double hitungVolume() {
        return Math.pow(sisi, 3);
    }

    @Override
    public double hitungLuasPermukaan() {
        return 6 * Math.pow(sisi, 2);
    }
}

// Subclass 2: Balok
class Balok extends BangunRuang {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        super("Balok");
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }
}

// Subclass 3: Tabung
class Tabung extends BangunRuang {
    private double jariJari;
    private double tinggi;

    public Tabung(double jariJari, double tinggi) {
        super("Tabung");
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return Math.PI * Math.pow(jariJari, 2) * tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 2 * Math.PI * jariJari * (jariJari + tinggi);
    }
}