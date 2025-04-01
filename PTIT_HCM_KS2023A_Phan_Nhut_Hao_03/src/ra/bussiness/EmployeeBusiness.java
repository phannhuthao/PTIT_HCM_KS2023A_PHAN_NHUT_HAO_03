package ra.bussiness;

import ra.entity.Employee;
import ra.presentation.EmployeeApplication;

import java.util.Scanner;

public class EmployeeBusiness extends EmployeeApplication {
    static Scanner sc = new Scanner(System.in);

    // hiển thị
    public static void showInfoEmployee() {
        if (employeeList.isEmpty()) {
            System.out.println("Danh sách nhân viên trống");
        }
        for (Employee e : employeeList) {
            e.displayData();
        }
    }

    // thêm mới nhân viên
    public static void addNewEmployee() {
        System.out.print("Nhập số lượng nhân viên: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin nhân viên thứ: " + (i + 1));
            Employee e = new Employee();
            e.inputData();
            employeeList.add(e);
        }
    }

    // chỉnh sửa thông tin nhân viên
    public static void updateInfoEmployee() {
        System.out.print("Nhập ID nhân viên cần cập nhật: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Employee e : employeeList) {
            if (e.employeeId != null) {
                e.inputData();
                System.out.println("Cập nhật thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy nhân viên");
    }

    // xóa nhân viên
    public static void deleteEmployee() {
        System.out.print("Nhập mã sản phẩm cần xóa: ");
        int Id = sc.nextInt();
        sc.nextLine();

        boolean found = false;

        for (Employee e : employeeList) {
            if (e.getterEmployeeId() != null) {
                employeeList.remove(e);
                found = true;
                System.out.println("Sản phẩm đã được xóa");
                break;
            }
        }

        if (!found) {
            System.out.println("Mã sản phẩm này không có trong danh sách.");
        }
    }

    // tìm kiếm nhân viên
    public static void searchEmployee() {
        System.out.print("Nhập tên nhân viên cần tìm: ");
        String name = sc.nextLine();
        for (Employee e : employeeList) {
            if (e.employeeName.equalsIgnoreCase(name)) {
                e.displayData();
                return;
            }
        }
        System.out.println("Không tìm thấy nhân viên");
    }

    // sắp xếp nhân viên
    public static void sortEmployee() {

    }


}
