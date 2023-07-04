package review8;

public class SuperMarket {
    public static void main(String[] args) {

        Apple app=new Apple("Fuji","green");
        app.name="Fuji apple";
        app.makeJuice();// it is own method
        app.eat();// comes from parent
        // app.grow();// sibling classes do not share anything

        app.getClass();

    }
}
