public class App {
    public static void main(String[] args) throws Exception {

       Person me = new Person();

       //System.out.print(me.name);

       // set method
       me.setName("abcd");
    
       //get method
       System.out.println(me.getName());
       
       // Son object    
       Son myself = new Son();

       System.out.println(myself.surname);

       myself.showSurname();
    }
}
