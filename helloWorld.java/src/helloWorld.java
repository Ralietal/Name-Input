import java.util.*;
public class helloWorld {
    public static void main(String[] args) {
        System.out.println("Git is awesome");
        Scanner userI = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = userI.nextLine();
        System.out.println(name);
        System.out.println("Enter your surname");
        String surname = userI.nextLine();
        String fullName = name + " " + surname;
        System.out.println(fullName);
        
    }
}
