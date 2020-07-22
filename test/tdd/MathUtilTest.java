/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;
//E:\Netbeans\NetBeans-12.0\netbeans\platform\modules\ext hamcrest + junit

import com.ha.util.MathUtil;
import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author USER
 */
public class MathUtilTest {

    @Test
    public void testSuccessfulCases() {
        // đây là hàm dùng test các đầu vào hợp lệ của hàm cF()
        // vi dụ cF(5) cF(6), mình sẽ gọi ở đây, coi actual của chúng trả về 
        // có khớp với expected hay không
        // tuy nhiên mình không chơi sout
        // mà để cho .jar vừa add vào tự luận kết quả so sánh
        //in ra xanh đỏ cho mình xem
        Assert.assertEquals(1, MathUtil.computeFactorial(0));
        Assert.assertEquals(1, MathUtil.computeFactorial(1));
        Assert.assertEquals(2, MathUtil.computeFactorial(2));
        Assert.assertEquals(6, MathUtil.computeFactorial(3));
        Assert.assertEquals(24, MathUtil.computeFactorial(4));
        Assert.assertEquals(120, MathUtil.computeFactorial(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFailedCases() {
        //hàm dùng tính trường hợp data cà chớn
        // ví dụ -5! cF(-5) tính thế đéo nào được
        // không tính được, chứ ko đc trả về -1 rồi nói rằng đầu vào vô lí
        // vì xét cho cùng -1 xem là 1 value
        // tình huống đầu vào cà chớn, ta sẽ tung ra, ném exception ngọi lệ nào đó
        // mà exception nói chung không phải 1 value
        //nói đại diện cho 1 cái bất thường nào đó 
        // bất thường không thể nào so sánh được
        //vậy tình huống hàm trả exception, không là return nên không xài được hàm 
        //assert Equals(value,value)
        // ta xài chiêu hứng ngoại lệ, coi nó có đúng ngoại lệ không?
        MathUtil.computeFactorial(-5);

    }
}
// màu xành chỉ xảy ra neessu tất ca là xanh
// màu đỏ : chỉ cần 1 thằng đỏ, coi như toang hết 
// màu xanh : hàm phải chạy đúng cho mọi trường hợp thử nghiệm đầu vào và xử lí
// màu đỏ : xin lỗi, bạn đã đúng gần hết , chỉ còn 1 case bị sai
// hàm bạn chạy đâu có đúng hết, hoặc bạn kì vọng sai gì đó
//túm lại , có 1 chút error, coi như là error

// dù code đỏ hay xành , do mình chơi kiểu test app qua JUnit, thì
//Cleaan & Build luôn chạy. 
//Nhiệm vụ gốc ban đầu : Code không có error cú pháp, phải ra.jar .war
// mình sẽ nâng cấp : code bạn còn màu đỏ tức là chạy ko như kỳ vọng 
// tớ disable nút clean and build để 
// hoặc code bạn màu xanh
// hoặc bạn xóa JUnit Test đi thì mới ra .JAR .WAR
// Nhớ 2 con số đặc biệt trong cuộc đời 
// NETBEANS 8 : 1005
// NETBEANS 10 TRỞ LÊN : 1204
