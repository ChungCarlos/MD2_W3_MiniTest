public class DiaChi {
    public String tinh;
    public String huyen;
    public String xa;
    public String soNha;

    public DiaChi() {
    }

    public DiaChi(String tinh, String huyen, String xa, String soNha) {
        this.tinh = tinh;
        this.huyen = huyen;
        this.xa = xa;
        this.soNha = soNha;
    }

    public String getTinh() {
        return tinh;
    }

    public void setTinh(String tinh) {
        this.tinh = tinh;
    }

    public String getHuyen() {
        return huyen;
    }

    public void setHuyen(String huyen) {
        this.huyen = huyen;
    }

    public String getXa() {
        return xa;
    }

    public void setXa(String xa) {
        this.xa = xa;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    @Override
    public String toString() {
        return " Số nhà: " + getSoNha() +"\n"+
                " Xã: " + getXa() +"\n"+
                " Huyện: " + getHuyen() +"\n"+
                " Tỉnh: " + getTinh()
                ;
    }
}
