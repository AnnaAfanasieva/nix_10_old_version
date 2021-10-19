public class SomeClass {
    public static void main(String[] args) {
        System.out.println("something");
        Person person = new Person("",0);
        person.setName("John");
        person.setAge(134);
        System.out.println(person.toString());
        Person person2 = person;
        person2.setAge(34);
        System.out.println(person.toString());

    }
}
