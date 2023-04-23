package class12;

public class DogTester {
    public static void main(String[] args) {

        Dog actualDog= new Dog();
        actualDog.name="Jacky";
        actualDog.age=50;
        actualDog.breed="german";
        actualDog.color="Black";
        actualDog.weight=50;

        actualDog.bark();

        Dog obj =new Dog();
        obj.name="Laya";
        obj.age=40;
        obj.color="browne";
        obj.weight=54;

         obj.sleep();

    }

}
