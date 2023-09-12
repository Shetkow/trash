public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void getInfo(){
        System.out.println(name + ": he is " + age + " old.");
    }
}
