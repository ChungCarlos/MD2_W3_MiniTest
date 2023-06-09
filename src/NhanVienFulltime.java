public class NhanVienFulltime extends NhanVien{
private double thuongFull;
private double phatFull;
private double baoHiem;
private double luongCung;


    public NhanVienFulltime(String maNhanVien, String hoTen, int tuoi, int soDienThoai, String email, DiaChi diaChi,double luongCung,double thuongFull,double phatFull,double baoHiem) {
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
        return " Nhân viên toàn thời gian: \n"+
                " Mã nhân viên: " + getMaNhanVien() +"\n" +
                " Họ tên :" + getHoTen() +"\n" +
                " Tuổi: " + getTuoi() +"\n" +
                " Số điện thoại: " + getSoDienThoai() +"\n" +
                " Email: " + getEmail() +"\n" +
                " Địa chỉ: " + getDiaChi() +"\n" +
                " Lương cứng: " + getLuongCung() +"\n" +
                " Thưởng: " + getThuongFull() +"\n" +
                " Phạt: " + getPhatFull()+"\n" +
                " Bảo Hiểm: " + getBaoHiem()
                ;
    }
}
