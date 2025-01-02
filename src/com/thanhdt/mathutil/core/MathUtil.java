/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thanhdt.mathutil.core;

/**
 *
 * @author LENOVO
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static long getFactorial(int n) {
        // viết hàm tính giai thừa n! = 1.2.3.4.5...n
        // Quy ước: 0! = 1! = 1
        // 21! tràn kiểu long
        // <0! thì ko tính được, ko có giai thừa cho số âm
        // túm lại: hàm tính giai thừa n = 0...20
        // Ta xài luôn kĩ thuật lập trình TDD - Test Driven Development
        //                                      Test First Development
        // ta nghĩ về test, kịch bản test, bộ dữ liệu test trước khi viết code
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be 0..20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        } 
        return product;
    }
    // sure, getF(5) -> 120
    //       getF(6) -> 720
}
        // TDD - Test Driven Development
        // Test First Development
        // Khi ta viết code ta phải lưu ý ngay việc viết test cases/tình huống test app/hàm phải được đề
        // cập ngay
        // test ngay những gì ta sẽ viết ra, test trước khi ta viết hoàn thiện code!!!!
