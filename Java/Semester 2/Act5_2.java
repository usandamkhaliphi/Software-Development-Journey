import java.util.Stack;

public class Act5_2 
{
    public static void main(String[] args) 
    {
        Stack s1 = new Stack();

        s1.push(45);
        s1.push(23 - 12);
        s1.pop();
        s1.push(56 + 5);
        System.out.println("Peek: " + s1.peek());
        s1.push(5 * 7);
        s1.pop();
        s1.push(8 * 2 + 6);
        s1.push(6 * 12);
        System.out.println("Peek: " + s1.peek());
        s1.pop();
        s1.pop();

        System.out.println("Stack: " + s1);
    }
}
