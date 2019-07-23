package Abstractiondemo;

public  class Usa extends India {


    public static void main(String[] args) {
        Usa obj = new Usa();
        obj.tourist(500);
        obj.hot(40);
        obj.minbalance(1000);


    }


    @Override
    public void tourist(int number) {
        System.out.println(number);

    }

    @Override
    public void hot(int temp) {
        System.out.println(temp);

    }


    @Override
    public void minbalance(int balance) {
        System.out.println(balance);
    }
}

