package ra.entity;


import java.util.Scanner;

import static ra.presentation.EmployeeApplication.employeeList;

public class Employee implements IApp {
    public String employeeId;
    public String employeeName;
    public String birthday;
    public String phoneNumber;
    public boolean sex;
    public float coefficient;
    public int allowanceSalary;
    public String department;
    public byte status;

    public String getterEmployeeId() {
        return employeeId;
    }

    public String getterEmployeeName() {
        return employeeName;
    }

    public String getterBirthday() {
        return birthday;
    }

    public String getterPhoneNumber() {
        return phoneNumber;
    }

    public boolean getterSex() {
        return sex;
    }

    public float getterCoefficient() {
        return coefficient;
    }
    public int getterAllowanceSalary() {
        return allowanceSalary;
    }

    public String getterDepartment() {
        return department;
    }

    public byte getterStatus() {
        return status;
    }

    public void setterEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setterEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setterBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setterPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setterSex(boolean sex) {
        this.sex = sex;
    }

    public void setterCoefficient(float coefficient) {
        this.coefficient = coefficient;
    }

    public void setterAllowanceSalary(int allowanceSalary) {
        this.allowanceSalary = allowanceSalary;
    }

    public void setterDepartment(String department) {
        this.department = department;
    }

    public void setterStatus(byte status) {
        this.status = status;
    }


    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập id: ");
        this.employeeId = scanner.nextLine();

        System.out.print("Nhập tên: ");
        this.employeeName = scanner.nextLine();

        System.out.print("Nhập ngày sinh: ");
        this.birthday = scanner.nextLine();

        System.out.print("Nhập số điện thoại: ");
        this.phoneNumber = scanner.nextLine();

        System.out.print("Nhập giới tính: (true -> Nam / false -> Nữ) ");
        this.sex = scanner.nextBoolean();

        System.out.print("Nhập số lương: ");
        this.coefficient = scanner.nextFloat();

        System.out.print("Nhập phụ cấp: ");
        this.allowanceSalary = scanner.nextInt();

        System.out.println("Nhập phòng làm việc: ");
        this.department = scanner.nextLine();
    }
    @Override
    public void displayData() {
        System.out.println("ID    | Tên       | Ngày sinh        |SĐT   | Giới tính     | Số Lương | Phòng Làm Việc | ");
        System.out.println("---------------------------------------------------------------------------------");
        for (Employee e : employeeList) {
            String statusText = switch (e.getterStatus()) {
                case 1 -> "Đang Làm việc";
                case 2 -> "Đang nghỉ phép";
                case 3 -> "Đã nghỉ việc";
                default -> "";
            };
            System.out.printf("%-6s | %-20s | %-10s | %-10s | %-4s |2f | 5s | %-10s",
                    e.getterEmployeeId(), e.getterEmployeeName(), e.getterBirthday(),
                    e.getterPhoneNumber(),e.getterSex() ?"Nam" : "Nữ" ,  e.getterCoefficient(), e.getterAllowanceSalary(), e.getterDepartment());
        }
    }
}
