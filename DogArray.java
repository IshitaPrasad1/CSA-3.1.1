/*
 * Activity 3.1.1
 */
public class DogArray
{
  public static void main(String[] args)
  {
    // Your dogs
    Dog[] myDogs = new Dog[3];
    myDogs[0] = new Dog();
    myDogs[0].setName("Lady");

    myDogs[1] = new Dog();
    myDogs[1].setName("Tramp");

    myDogs[2] = new Dog();
    myDogs[2].setName("Trusty");

    System.out.println("My Dogs:");
    System.out.println(myDogs[0].getName());
    System.out.println(myDogs[1].getName());
    System.out.println(myDogs[2].getName());

    Dog[] neighborsDogs = new Dog[2];



    neighborsDogs[0] = new Dog();
    neighborsDogs[0].setName("daisy");

    neighborsDogs[1] = new Dog();
    neighborsDogs[1].setName("honey");

    System.out.println("\nNeighbor's Dogs:");
    System.out.println(neighborsDogs[0].getName());
    System.out.println(neighborsDogs[1].getName());
  }
}
