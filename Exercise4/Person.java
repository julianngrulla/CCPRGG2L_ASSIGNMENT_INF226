public class Person {
    int age;
    String name;

    Person(String personName, int personAge){
        this.name = personName;
        this.age = personAge;
    }

    void addFriend(Person friend){
        System.out.println(this.name + " is friends with " + friend.name);

    }

    void addClassmate(Person Classmate){
        System.out.println(this.name + " is classmates with " + Classmate.name);
    }
}