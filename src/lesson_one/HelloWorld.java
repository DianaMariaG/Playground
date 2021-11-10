package lesson_one;

/**
 *
 *
 */
public class HelloWorld {

    private static int static_field = 10;
    int non_static_field;
    Integer another_field;

    //public HelloWorld(){} //constructor implicit

    public HelloWorld(int nb) { //constructor explicit, singura met ce nu returneaza nimic si nu e nici void
        this.non_static_field = nb;
    }


    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(HelloWorld.static_field);

        HelloWorld hw = new HelloWorld(19); // hw e o instanta a clasei HelloWorld
        System.out.println(hw.non_static_field);
        System.out.println(hw.static_field);
        hw.another_field = hw.non_static_field;

        HelloWorld hw1 = new HelloWorld(44); //alta instanta pentru clasa HelloWorld
        System.out.println(hw1.non_static_field);
        System.out.println(hw1.static_field);
    }
}





