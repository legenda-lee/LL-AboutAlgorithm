package com.legenda.lee.algorithmcollection.algorithms;

/**
 * Author: Legenda-Lee()
 * Date: 2019-10-25 17:03
 * Description: 等差数列求和
 */
public class AboutDengChaShuLie {

    public static void main(String[] args) {
        // 到100求和

        // 方式一、通过循环遍历累加的方式
        int end = 100;
        int total = 0;
        for (int i = 1; i <= end; i++) {
            total += i;
        }
        System.out.println(total);


        // 方式二、通过等差数列求和公式的方式
        // Sn = n*a1 + (n(n-1)/2)*d
        // 公式中首项为a1，末项为an，项数为n，公差为d，前n项和为Sn。
        // 所以1-100为：a1 = 1，an = 100，项数为100，公差为1
        // 前一百项和Sn为：
        int Sn = 100*1 + (100*(100-1)/2)*1;
        System.out.println(Sn);
    }
}
