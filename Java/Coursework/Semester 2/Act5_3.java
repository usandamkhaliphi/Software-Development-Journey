import java.util.LinkedList;
import java.util.Queue;

public class Act5_3 
{
    public static void main(String[] args) 
    {
        
        Queue q1 = new LinkedList();

        
        q1.add(9 + 5);      
        q1.add(5 * 3);      
        q1.add(7 + 3);      
        q1.remove();        
        q1.add(8 / 2);      
        q1.add(8 + 5);      
        System.out.println("Peek: " + q1.peek()); 
        q1.remove();        
        q1.remove();        
        q1.add(5 + 4);      

        
        System.out.println("Queue: " + q1);
    }
}
