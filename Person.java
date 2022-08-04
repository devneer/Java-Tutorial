public class Person {
   public Person(String name) { // A constructor with a single parametre 'name'
      System.out.println("Passed name is: " + name);
   }

   public static void main(String[] args) {
      Person individual = new Person("Fletcher"); // Creating an object
   }
}
