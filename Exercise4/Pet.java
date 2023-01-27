public class Pet {

    //Attributes
    int age;
    String name;
    Person owner;
    // Constructor
    Pet(String petName, int petAge, Person ownerName){
        this.name = petName;
        this.age = petAge;
        this.owner = ownerName;
    }

    void showOWner(){
        System.out.println("My Name is " + this.name + ". My owner name is " + owner.name);
    }
    
}
