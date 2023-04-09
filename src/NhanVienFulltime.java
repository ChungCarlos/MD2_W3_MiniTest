public class NhanVienFulltime extends NhanVien{
private double thuongFull;
private double phatFull;
private double baoHiem;
private double luongCung;


    public NhanVienFulltime(String maNhanVien, String hoTen, int tuoi, int soDienThoai, String email, String diaChi,double luongCung,double thuongFull,double phatFull,double baoHiem) {
        super(maNhanVien, hoTen, tuoi, soDienThoai, email, diaChi);
        this.luongCung = luongCung;
        this.thuongFull = thuongFull;
        this.phatFull = phatFull;
        this.baoHiem = baoHiem;
    }

    @Override
    public double tongLuong() {
        return getLuongCung() + getThuongFull() - getPhatFull() - getBaoHiem();
    }

    public double getThuongFull() {
        return thuongFull;
    }

    public void setThuongFull(double thuongFull) {
        this.thuongFull = thuongFull;
    }

    public double getPhatFull() {
        return phatFull;
    }

    public void setPhatFull(double phatFull) {
        this.phatFull = phatFull;
    }

    public double getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(double luongCung) {
        this.luongCung = luongCung;
    }

    public double getBaoHiem() {
        return baoHiem;
    }

    public void setBaoHiem(double baoHiem) {
        this.baoHiem = baoHiem;
    }

    @Override
    public String toString() {
        return "NhanVienFulltime{" +
                "thuongFull=" + thuongFull +
                ", phatFull=" + phatFull +
                ", baoHiem=" + baoHiem +
                ", luongCung=" + luongCung +
                '}';
    }
}
