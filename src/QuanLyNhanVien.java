import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class QuanLyNhanVien {
    private ArrayList<NhanVien> danhSachNV;

    public QuanLyNhanVien() {
        this.danhSachNV = new ArrayList<>();
    }

    public QuanLyNhanVien(ArrayList<NhanVien> danhSachNV) {
        this.danhSachNV = danhSachNV;
    }

    //1 Thêm Nhân viên vào cuối danh sách...
    public void themNhanVien(NhanVien nv) {
        this.danhSachNV.add(nv);
    }

    //2. Hiển thị danh sách nhân viên và kiểm tra có rỗng hay không?
    public void inDanhSachNhanVien() {
        for (NhanVien nhanVien : danhSachNV)
            System.out.println(nhanVien);
        if (danhSachNV.isEmpty()) {
            // Kiểm tra danh sách có rỗng?
            System.out.println("Không có nhân viên nào trong danh sách...");
        }
    }

    //3. Số lượng nhân viên trong danh sách...
    public int soLuongNhanVien() {
        return danhSachNV.size();
    }

    // Xoá 1 nhân viên trong danh sách...
    public boolean xoaNhanVien(NhanVien nv) {
        return danhSachNV.remove(nv);
    }

    // Tìm kiếm Nhan viên theo tên từ bàn phím...
    public void timNhanVien(String ten) {
        for (NhanVien nhanVien : danhSachNV) {
            if (nhanVien.getHoTen().indexOf(ten) >= 0) {
                System.out.println(nhanVien);
            }
        }
    }

    // 9. Viết phương thức sắp xếp nhân viên toàn thời gian theo số lương tăng dần.
    public void sapXepLuongFulltimeTangDan() {
        ArrayList<NhanVienFulltime> fulltimes = new ArrayList<>();
        Collections.sort(fulltimes, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                if (o1.tongLuong() < o2.tongLuong()) {
                    return -1;
                } else if (o1.tongLuong() > o2.tongLuong()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }

    // 6. Tính lương trung bình cả công ty...
    public double trungBinhLuong() {
        double tbLuong = 0;
        double trungBinhLuongPart = 0;
        double trungBinhLuongFull = 0;
        int count = danhSachNV.size();
        for (NhanVien nv : danhSachNV
        ) {
            if (nv instanceof NhanVienParttime) {
                trungBinhLuongPart += ((NhanVienParttime) nv).tongLuong();
            }
            if (nv instanceof NhanVienFulltime) {
                trungBinhLuongFull += ((NhanVienFulltime) nv).tongLuong();
            }
        }
        return tbLuong = (trungBinhLuongFull + trungBinhLuongPart) / count;
    }

    // 7. Viết phương thức liệt kê danh sách nhân viên toàn thời gian có mức lương thấp hơn mức lương trung bình của các nhân viên trong công ty.
    public void danhsachLuongThap(){
        for (NhanVien nhanVien: danhSachNV
             ) {
            if (nhanVien instanceof NhanVienFulltime){
                if (nhanVien.tongLuong()<trungBinhLuong());
                System.out.println("Nhân viên toan thời gian lương thấp hơn trung bình lương toàn nhân viên:" + nhanVien);
            }

        }
    }

    public double luongNVPartTime() {
        double sum = 0;
        for (NhanVien nv : danhSachNV) {
            if (nv instanceof NhanVienParttime) {
                sum += ((NhanVienParttime) nv).tongLuong();
            }
        }
        return sum;
    }
}
