import java.util.*;
//Extending Thread Class
class a extends Thread{
    public void r()
    {
        System.out.println("Hello I'm Thread");
    }
}
public class extendingthread{
    public static void main(String[] args){
        a g=new a();
        g.start();
        g.r();
    }
}