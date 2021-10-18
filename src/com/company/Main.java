package com.company;

import java.util.Scanner;

public class Main {

    public static int tinhTienLai (int soTienGui, int kyHanGui) {
        double laiSuat = 0;

        // lãi suất tăng theo số tiền gửi
        if (soTienGui <= 0) {
            return -1;
        } else if (0 < soTienGui && soTienGui <= 50000000) {
            laiSuat += 0;
        } else if (50000000 < soTienGui && soTienGui <= 300000000) {
            laiSuat += 0.3;
        } else if (soTienGui > 300000000) {
            laiSuat += 0.7;
        }

        // lãi suất tăng theo kỳ hạn gửi
        if (kyHanGui <= 0) {
            return -1;
        } else if (0 < kyHanGui && kyHanGui <= 6) {
            laiSuat += 3.1;
        } else if (6 < kyHanGui && kyHanGui <= 12) {
            laiSuat += 4;
        } else if (kyHanGui > 12) {
            laiSuat += 5.6;
        }

        // tính tiền lãi
        int tienLai = (int) (soTienGui * (laiSuat / 100 / 12) * kyHanGui);
        return tienLai;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền gửi (VND): ");
        int soTienGui = scanner.nextInt();
        System.out.print("Nhập kỳ hạn gửi (tháng): ");
        int kyHanGui = scanner.nextInt();

        int result = tinhTienLai(soTienGui, kyHanGui);
        if (result == -1) {
            System.out.println("Số tiền gửi hoặc kỳ hạn gửi không hợp lệ!");
        } else {
            System.out.println("Số tiền lãi khi kết thúc kỳ hạn gửi tiết kiệm là: " + result + " đồng");
        }
    }
}
