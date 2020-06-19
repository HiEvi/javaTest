package com.lulu;
import java.util.*;

public class A{
    static public boolean isPa(String f,int n){
        if(f.charAt(0)==f.charAt(f.length()-1)) { //第一个是不是和最后一个相同
            if(f.length()>2) {
                return isPa(f.substring(n+1,f.length()-1),0);  //递归调用
            }
            else {
                return true;
            }
        }
        else {
            return false;
        }

    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String f = scan.next();
        if(isPa(f,0)) {
            System.out.println("字符串： " + f + " 是回文串");
        }
        else {
            System.out.println("字符串： " + f + " 不是回文串");
        }


    }
}
