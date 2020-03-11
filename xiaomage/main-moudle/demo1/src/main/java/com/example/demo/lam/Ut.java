package com.example.demo.lam;

public class Ut {
    private  jisuan j;

    public Ut() {
    }

    public Ut(jisuan j) {
        this.j=j;
    }
    public void jiaa1(int a){
        System.out.println(j.jia1(a));
    }
    public void jiaa(){
//        System.out.println(j.jia(2,3));
    }

    public static void main(String[] args) {
//        Ut ut=new Ut((int a) -> a+1);
        Ut ut=new Ut((a) -> a+1);
         ut.jiaa1(8);
    }
}
