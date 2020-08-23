package com.aiguigu.java;

/**
 * @author liuzhenyu
 * @create 2020-08-2020/8/22-22:48
 */
public class a {
    /**
     * hhh
     */
    private int cc=99;
    public static void main(String[] args) {


        System.out.println("hhhhh");
        System.out.println("a.main");
        a.f();
        int num=10;
        System.out.println("num = " + num);

    }
    public void testUpdate(){

        System.out.println("111");
    }
    public static void f(){
        System.out.println("a.f");
        int a=20,b=30,c=40;
        System.out.println("b = " + b);
        System.out.println(a);

        String[] arr=new String[]{"zhangsan","lisi","wanger"};
        for (String s : arr) {
            System.out.println(s);
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
