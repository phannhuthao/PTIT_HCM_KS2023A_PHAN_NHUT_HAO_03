package ra.presentation;

import ra.entity.Employee;

import java.util.ArrayList;
import java.util.Scanner;

import static ra.bussiness.EmployeeBusiness.*;

public class EmployeeApplication extends Employee {
    public static ArrayList<Employee> employeeList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        while (true) {
            System.out.println("|----------------------------Employee Menu----------------------------|");
            System.out.println("|1. Hiển thị danh sách nhân viên                                      |");
            System.out.println("|2. Thêm mới nhân viên                                                |");
            System.out.println("|3. Chỉnh sửa thông tin nhân viên                                     |");
            System.out.println("|4. Xóa nhân viên                                                     |");
            System.out.println("|5. Tìm kiếm nhân viên                                                |");
            System.out.println("|6. Sắp xếp                                                           |");
            System.out.println("|0. Thoát chương trình                                                |");
            System.out.println("|---------------------------------------------------------------------|");
            System.out.println();
            System.out.print("Nhập lựa chọn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    showInfoEmployee();
                    break;
                case 2:
                    addNewEmployee();
                    break;
                case 3:
                    updateInfoEmployee();
                    break;
                case 4:
                    deleteEmployee();
                    break;
                case 5:
                    searchEmployee();
                    break;
                case 6:
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }
    }


}
