/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathutil;

import static com.ha.util.MathUtil.computeFactorial;

/**
 *
 * @author Ha
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("5!= "+ computeFactorial(5));
        // đoạn code trên chính là test hàm bằng tay, manual test
        //tức là : chuản bị data để test, chính là 5, đầu vào
        //ta gọi hàm cf(5)
        //ta chạy hàm, xem no in ra số mấy (actual value)
        //trước đó, ta phải tự tính tay 5!, cái ta kỳ vọng hàm phải trả về con số 120 
        //gọi là expected velue
        // hàm chạy xong ta so kết quả giữa expected và actual
        //if khớp, thì hàm chạy đúng
        //else, hoặc hàm sai, hoặc mình kỳ vọng sai
        
        // làm bằng tay, phải so sánh bằng mắt , expected vs actual= mắt để luận
        // kết quả đúng sai của hàm
        //expected value : 720
        System.out.println("6!= "+ computeFactorial(6));
        // expected : 1
        System.out.println("1!= "+ computeFactorial(1));
        //expected : cà chớn
        //expected : đưa đầu vào cà chớn => ném ra ngoại lệ Exception, vì không tính được do đầu vào cà chớn
        System.out.println("-5!= "+ computeFactorial(-5));
    }
    
}
// nhìn bằng mắt nhìn kết quả ổn nhưng chưa hay
// giang hồ có hỗ trợ thêm các bộ thư viện giúp test hafmta viết 1 cách hiệu quả hơn 
// qua hiệu ứng màu sắc, và chúng tự so sánh giúp ta
// ta ko cần sout() nhìn kết quả, so bằng mắt so với kì vọng
// tool này sẽ so giúp ta báo ta 2 trạng thái duy nhất 
// xanh : code chạy khớp với expected
// đỏ : toang, actual không khớp với expected
// thư viện này mang tên chung : Unit Testing,
// tên riêng : JUnit, TestNG,xUnit,MSTest,NUnit,PHPUnit,CppUnit,...