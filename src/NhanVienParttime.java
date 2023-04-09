public class NhanVienParttime extends NhanVien{
    private double soGioLam;
    private double thuongPart;
    private double phatPart;


    public NhanVienParttime(String maNhanVien, String hoTen, int tuoi, int soDienThoai, String email, String diaChi,double soGioLam, double thuongPart,double phatPart) {
        super(maNhanVien, hoTen, tuoi, soDienThoai, email, diaChi);
        this.soGioLam = soGioLam;
        this.thuongPart = thuongPart;
        this.phatPart = phatPart;
    }

    @Override
    public double tongLuong() {
        return (getSoGioLam() * 100000) + getThuongPart() - getPhatPart();
    }


    public double getSoGioLam() {
        return soGioLam;
    }

    public double getThuongPart() {
        return thuongPart;
    }

    public void setThuongPart(double thuongPart) {
        this.thuongPart = thuongPart;
    }

    public double getPhatPart() {
        return phatPart;
    }

    public void setPhatPart(double phatPart) {
        this.phatPart = phatPart;
    }

    public void setSoGioLam(double soGioLam) {
        this.soGioLam = soGioLam;
    }

    @Override
    public String toString() {
        return "NhanVienParttime{" +
                "soGioLam=" + soGioLam +
                ", thuongPart=" + thuongPart +
                ", phatPart=" + phatPart +
                '}';
    }
}
