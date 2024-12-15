import java.util.*;
public class creatingthreadusinglambdaexp{
    public static void main(String[] args){
        Runnable r= ()->System.out.println("I am from java8 version");
        Thread t=new Thread(r);
        t.start();
    }
}