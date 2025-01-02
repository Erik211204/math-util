/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thanhdt.mathutil.core;

import org.junit.Assert;
import org.junit.Test; //Junit 4

/**
 *
 * @author LENOVO
 */
public class FactorialTest {

    @Test//biến 1 cái hàm đi kèm cái Annotation này thành hàm main()
        // ngầm phía sau là interface
    public void checkFactorialRightReturnsWell() {
        long expected = 120; //tui kì vọng 120 trả về
        long actual = MathUtil.getFactorial(5); //nếu tui tính 5!

        //compare giữa expected với actual
        Assert.assertEquals(expected, actual);

        Assert.assertEquals(6, MathUtil.getFactorial(3));

        Assert.assertEquals(120, MathUtil.getFactorial(5));

        Assert.assertEquals(720, MathUtil.getFactorial(6));

        Assert.assertEquals(1, MathUtil.getFactorial(1));

        Assert.assertEquals(1, MathUtil.getFactorial(0));

    }
    // check xem có xuất hiện ngoại lệ hay ko khi đưa data cà chớn!!!
    // bắt xem, test xem hàm có ném về ngoại lệ như kì vọng hay ko
    // ví dụ nếu ta tính getF(-5) -> thề, ném ra ngoại lệ
    // nếu đúng gọi hàm getF(-5) mà hàm ném ra ngoại lệ tương ứng -> hàm viết đúng, ta có màu xanh
    // hàm được thiết kế đưa âm ném ngoại lệ, thực sự khi chạy nó ném ra thật
    // có nghĩa là hàm đúng, như kì vọng, thì màu xanh
    // JUnit 4 coi ngoại lệ ko là giá trị, ko assertEquals(ngoại lệ, actual)

    @Test(expected = IllegalArgumentException.class)
    // đọc hàm này như sau khi tao chạy code bên trong này tao kì vọng bên trong này sẽ đập vào mặt
    // tao cái ngoại lệ IllegalArgumentException
    public void checkFactorialWrongThrowsException() {
        // ta ko dùng hàm assertEquals(2 value so sánh)
        // ngoại lệ chỉ có thể thấy nó xuất hiện hay ko???
        MathUtil.getFactorial(-5); //phải ném ngoại lệ mới là đúng

        MathUtil.getFactorial(-25); //phải ném ngoại lệ mới là đúng

        MathUtil.getFactorial(120); //phải ném ngoại lệ mới là đúng

        MathUtil.getFactorial(25); //phải ném ngoại lệ mới là đúng
    }
}
// QUY ƯỚC XANH ĐỎ:
// 1. Nếu XANH, tất cả tình huống so sánh xài hàm PHẢI CÙNG XANH
// 2. Nếu ĐỎ, CHỈ CẦN 1 TÌNH HUỐNG XÀI HÀM BỊ ĐỎ, COI NHƯ CẢ HÀM LÀ ĐỎ
// ĐỎ:
// HOẶC BẠN TÍNH TOÁN TRONG THUẬT TOÁN/HÀM SAI
// HOẶC BẠN KÌ VỌNG SAI

// LOGIC: HÀM ĐÃ ĐÚNG THÌ PHẢI ĐÚNG CHO MỌI TÌNH HUỐNG TEST
//        KO CHẤP NHẬN LÚC ĐÚNG LÚC SAI