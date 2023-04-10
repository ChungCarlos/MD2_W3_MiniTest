import java.util.Scanner;

public class Main {
    private static QuanLyNhanVien quanLyNhanVien = new QuanLyNhanVien();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int luaChon = -1;
        while (luaChon != 0) {
            System.out.println("MENU ---------------");
            System.out.println("1.  Thêm nhân viên vào danh sách.\n" +
                    " 2.  Hiển thị danh sách nhân viên.\n" +
                    " 3.  Số lượng nhân viên trong danh sách.\n" +
                    " 4.  Xoá 1 sinh viên ra khỏi danh sách theo mã sinh viên.\n" +
                    " 5.  Tìm kiếm tất cả nhân viên dựa theo mã nhân viên nhập từ bàn phím.\n" +
                    " 6.  Tính lương trung bình cả công ty..\n" +
                    " 7.  Danh sách nhân viên lương thấp hơn trung bình..\n" +
                    " 8.  Tổng lương của toàn bộ nhân viên tời vụ..\n" +
                    " 9.  Danh sách nhân viên toàn thời gian có lương tăng dần..\n" +
                    " 0.  Thoát...");
            System.out.println("Vui lòng chọn chức năng: ");
            luaChon = Integer.parseInt(scanner.nextLine());
            switch (luaChon) {
                case 1: {
                    System.out.println("Bạn muốn tạo nhân viên hình thức: \n"
                            + "1. Toàn thời gian. \n"
                            + "2. Thời vụ.");
                    System.out.println("Vui lòng chọn số tương ứng...");
                    int num = Integer.parseInt(scanner.nextLine());
                    if (num == 1) {
                        System.out.println("Nhập mã nhân viên: ");
                        String maNhanVien = scanner.nextLine();
                        System.out.println("Nhập họ tên nhân viên: ");
                        String hoTen = scanner.nextLine();
                        System.out.println("Nhập tuổi: ");
                        int tuoi = Integer.parseInt(scanner.nextLine());
                        System.out.println("Nhập số điện thoại: ");
                        int soDienThoai = Integer.parseInt(scanner.nextLine());
                        System.out.println("Nhập email: ");
                        String email = scanner.nextLine();
                        System.out.println("Nhập địa chỉ: ");
                        String diaChi = scanner.nextLine();
                        System.out.println("Nhập lương cứng: ");
                        double luongCung = Double.parseDouble(scanner.nextLine());
                        System.out.println("Nhập tiền thưởng: ");
                        double thuongFull = Double.parseDouble(scanner.nextLine());
                        System.out.println("Nhập tiền phạt: ");
                        double phatFull =  Double.parseDouble(scanner.nextLine());
                        System.out.println("Nhập tiền bảo hiểm: ");
                        double baoHiem = Double.parseDouble(scanner.nextLine());
                        NhanVienFulltime nhanVienFulltime = new NhanVienFulltime(maNhanVien, hoTen, tuoi, soDienThoai, email, diaChi, luongCung, thuongFull, phatFull, baoHiem);
                        quanLyNhanVien.themNhanVien(nhanVienFulltime);
                    } else if (num == 2) {
                        System.out.println("Nhập mã nhân viên: ");
                        String maNhanVien = scanner.nextLine();
                        System.out.println("Nhập họ tên nhân viên: ");
                        String hoTen = scanner.nextLine();
                        System.out.println("Nhập tuổi: ");
                        int tuoi = Integer.parseInt(scanner.nextLine());
                        System.out.println("Nhập số điện thoại: ");
                        int soDienThoai = Integer.parseInt(scanner.nextLine());
                        System.out.println("Nhập email: ");
                        String email = scanner.nextLine();
                        System.out.println("Nhập địa chỉ: ");
                        String diaChi = scanner.nextLine();
                        System.out.println("Nhập số giờ làm trong tháng: ");
                        double soGio = Double.parseDouble(scanner.nextLine());
                        System.out.println("Nhập số tiền thưởng trong tháng: ");
                        double thuongPart = Double.parseDouble(scanner.nextLine());
                        System.out.println("Nhập số tiền phạt trong tháng: ");
                        double phatPart = Double.parseDouble(scanner.nextLine());
                        NhanVienParttime nhanVienParttime = new NhanVienParttime(maNhanVien, hoTen, tuoi, soDienThoai, email, diaChi, soGio, thuongPart, phatPart);
                        quanLyNhanVien.themNhanVien(nhanVienParttime);
                    }
                    break;
                }
                case 2: {
                    System.out.println("Danh sách nhân viên:");
                    quanLyNhanVien.inDanhSachNhanVien();
                    break;
                }
                case 3: {
                    System.out.println(" Số lượng nhân viên trong công ty: ");
                    System.out.println(quanLyNhanVien.soLuongNhanVien());
                    break;
                }
                case 4: {
                    System.out.println("Nhập mã nhân viên: ");
                    String maNhanVien = scanner.nextLine();
                    NhanVien nhanVien = new NhanVien(maNhanVien);
                    System.out.println("Xoá sinh viên trong danh sách: " + quanLyNhanVien.xoaNhanVien(nhanVien));
                }
                break;
                case 5:
                    System.out.println("Nhập mã nhân viên cần tìm: ");
                    String maNhanVien = new Scanner(System.in).nextLine();
                    System.out.println("Kết quả tìm kiếm: ");
                    quanLyNhanVien.timNhanVien(maNhanVien);
                    break;
                case 6:
                    System.out.println("Trung bình lương của nhân toàn công ty: " + quanLyNhanVien.trungBinhLuong());
                    break;
                case 7:
                    quanLyNhanVien.danhsachLuongThap();
                    break;
                case 8:
                    tongLuongThoiVu();
                    break;
                case 9:
                    System.out.println("Danh sách nhân viên lương tăng dần: ");
                    quanLyNhanVien.sapXepLuongFulltimeTangDan();
                    break;
                case 0:
                    scanner.close();
                    System.out.println("Tạm biệt cưng...Mãi yêu cưng +_*");
                    break;
                default:
                    System.out.println("Vui lòng chọn đúng dãy số chức năng ở trên!");
            }
        }
    }
    private static void tongLuongThoiVu() {
        double tongLuong = quanLyNhanVien.luongNVPartTime();
        System.out.println("Tổng lương của các nhân viên thời vụ: " + tongLuong);
    }
}