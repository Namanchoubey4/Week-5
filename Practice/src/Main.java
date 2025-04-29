import java.util.*;

public class Main{
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");
        list.add("Grapes");
        System.out.println("List : "+list);
        list.remove("Apple");
        list.remove("Apple");
        System.out.println("List : "+list);

        Stack<String> stack = new Stack<>();
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");

        System.out.println("Stack : "+stack);
        System.out.println("Top of stack : "+stack.peek());
        System.out.println("Popped from stack : "+stack.pop());
        System.out.println("Stack after pop : "+stack);

        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("A");
        System.out.println("Set : "+set);

    }
}