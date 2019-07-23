package Abstractiondemo;

public class Abstract3a extends Abstract3 {
    public static void main ( String []args ){
        Abstract3a obj = new Abstract3a();
        obj.data(60, 5000);

    }

    @Override
    void data(int age, int balance) {
        System.out.println(age);
        System.out.println(balance);

    }
}
