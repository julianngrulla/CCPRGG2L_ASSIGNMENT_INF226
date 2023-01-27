public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("hahaha");

        Person Me = new Person("juliann", 19);

        Person Friend = new Person ("kent", 18);

        Person Classmate = new Person("anry", 19);
        Person Classmate1 = new Person("christian", 19);
        Person Classmate2 = new Person("kayla", 19);

        Me.addFriend(Friend);
        Me.addClassmate(Classmate);
        Me.addClassmate(Classmate1);
        Me.addClassmate(Classmate2);


        Pet Dog = new Pet("Soju", 1, Me);
        Dog.showOWner();

        Car sportsCar = new Car("BMW",Me);
        sportsCar.showOWner();
    }
}
