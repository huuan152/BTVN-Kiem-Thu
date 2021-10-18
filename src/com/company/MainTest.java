package com.company;

import org.junit.jupiter.api.Test;

import static com.company.Main.tinhTienLai;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    // Phương pháp kiểm thử: Kiểm thử biên - kiểm thử lớp tương đương yếu

    // Test case 1 ~ R1
    @Test
    void TestCase1() {
        assertEquals(-1, tinhTienLai(0, 3));
    }

    // Test case 2 ~ R2
    @Test
    void TestCase2() {
        assertEquals(-1, tinhTienLai(20000000, 0));
    }

    // Test case 3 ~ R3
    @Test
    void TestCase3() {
        assertEquals(155000, tinhTienLai(20000000, 3));
    }

    // Test case 4 ~ R7
    @Test
    void TestCase4() {
        assertEquals(3225000, tinhTienLai(100000000, 9));
    }

    // Test case 5 ~ R11
    @Test
    void TestCase5() {
        assertEquals(31500000, tinhTienLai(400000000, 15));
    }
}