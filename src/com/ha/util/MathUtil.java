/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ha.util;

/**
 *
 * @author Ha
 */
//class nay chua nhung ham toan hoc, tinh toan , giup cho moi noi khac
//pham cai gi mang tiunh chat xai chung cho moi noi , ta se dung ki thuat
// STATIC
public class MathUtil {

    //tinh n!=1.2.3...n -> vi n! tang ket qua rat nhanh, se tran kieu int som
    // do int chi toi da 2b1, do do xai long an toan hon
    // tuy the 15! to lam, chi han che 15! tro lai
    public static long computeFactorial(int n) {

        // hàm sẽ ném ngoại lệ nếu đưua n sai
        if (n < 0 || n > 15) {
            throw new IllegalArgumentException("Invalid arguement. n must be >=0 or <=15");
        }
//        long result = 1;
//        for (int i = 1; i <= n; i++) {
//            result *= i;
//        }
//        return result;
    // use recursion
    if(n==0 || n==1)
        return 1;
    //remain code
    return n * computeFactorial(n-1);
    
    }
}

// nhờ Jenkins xác nhận code chỉnh sửa code xanh như ban đầu
// => Regression được thực thi bởi Jenkins, test lại những gì đã được test để confirm chất lượng sau khi bị thay đổi
