package 线程.作业;

public class SayHello extends Thread{
    @Override
    public void run() {
        for (int i=1;i<=15;i++){
            System.out.println(Thread.currentThread().getName()+"你好");
        }
    }

    public static void main(String[] args) {
        SayHello m1=new SayHello();
        m1.start();
        for (int j=1;j<=20;j++){
            System.out.println(Thread.currentThread().getName()+"Hello");
        }
    }
}
