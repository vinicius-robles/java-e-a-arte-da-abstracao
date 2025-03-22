
public class Main {
    public static void main(String[] args) {
        var male = new Person("João", 12);
        var female = new Person("Maria", 10);

        System.out.println("Male name: " + male.getName() + " age: " + male.getAge());
        System.out.println("Female name: " + female.getName() + " age: " + female.getAge());
    }
}
