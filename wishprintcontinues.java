import java.util.*;
class wishprintcontinues{
    public static void main(String args[])
    {
        while(true)
        {
            System.out.println("Good Morning");
            try{
                Thread.sleep(5000);
            }catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println("Good Afternoon");
            try{
                Thread.sleep(5000);
            }catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println("Good Evening");
            try{
                Thread.sleep(5000);
            }catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println("Good Night");
            try{
                Thread.sleep(5000);
            }catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}