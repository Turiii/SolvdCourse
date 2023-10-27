package JavaBasics;

public class UserInfo {
    public static void main(String[] args) {
        String firstname = args[0];
        String lastname = args[1];
        int age = Integer.parseInt(args[2]);

        System.out.println("Firstname: " + firstname);
        System.out.println("Lastname: " + lastname);
        System.out.println("Age: " + age);
    }
}
