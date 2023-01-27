public class Car {
    String name;
    Person owner;

    Car(String carName, Person ownerName){
        this.name = carName;
        this.owner = ownerName;
    }

    void showOWner(){
        System.out.println("The Car brand is " + this.name + " and The Owner of this Car is " + owner.name);
    }
    
}
