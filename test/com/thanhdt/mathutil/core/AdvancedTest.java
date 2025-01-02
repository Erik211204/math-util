/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thanhdt.mathutil.core;

import static com.thanhdt.mathutil.core.MathUtil.getFactorial;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author LENOVO
 */
// Ta sẽ dùng kĩ thuật Data Driven Testing/Parameterzed Testing
// tham số hóa bộ dữ liệu test
// là kĩ thuật tách bộ dữ liệu test ra hẳn câu lệnh kiểm thử hàm
// xét cho cái bài getF()
// Bộ data, đặt ở file txt, Excel, table/db
// 0 -> 1;
// 1 -> 1;
// 2 -> 2;
// 3 -> 6;
// 4 -> 24;
// 5 -> 120;
// nhồi/fill bộ data này vào trong lời gọi hàm getF() + assertEqual()
// kết quả thì như nhau nhưng nó tách bạch data và lời gọi hàm check kq
@RunWith(value = Parameterized.class)
// đây là kĩ thuật báo hiệu cho máy ảo lôi thằng Run with ra và tách data và nhồi vào
// máy ảo java bán cái cho Junit
// báo hiệu cho java biết là class này là chơi với cơ chế tham số đó heng!!!!!
public class AdvancedTest {
    // giờ ta phải chuẩn bị bộ data trước, ở txt, excel, database
    // nếu đềile ngoài, thì phải viết thêm đoạn code để đọc data vào....
    @Parameters //int a[] = {2, 4, 6, 8, 10}; 
    // Parameter nhiều tham số
    // DÙNG ĐỂ MAP CÁC THAM SỐ!
    // PARAMETERS LÀ KHAI BÁO CHỨA TẬP HỢP CÁC DỮ LIỆU
    // HÀM initData như result set
    public static Object[][] initData(){
        return new Integer[][]{
                               {0, 1},
                               {1, 1},
                               {2, 2},
                               {3, 6},
                               {4, 24},
                               {5, 120},
                               {6, 720}
                                };
    }
    // ta cần map 2 cột vào 2 biến để lát hồi nhồi/feed chúng vào
    // hàm checkFactoral, ta gọi là testing kiểu tham số hóa
    // parameterized testing
    @Parameter(value = 0) // value là tham số phụ để xác định lấy cột nào
                         // MAP CỘT 0 CỦA TẬP DATA
    public int n; //bạn muốn tính mấy giai thừa
    @Parameter(value = 1) // value là tham số phụ để xác định lấy cột nào
    public long expected; //bạn kì vọng giai thừa trả về mấy
    
     @Test
    public void checkFactorialRightReturnsWell() {
        
       //Assert.assertEquals(expected, MathUtil.getFactorial(n));
       assertEquals(expected,getFactorial(n));

    }
}
