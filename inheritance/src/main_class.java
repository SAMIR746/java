
class main_class1 { // parent class (super class)
    int a, b;

    void showtime() {
        System.out.println("A and B : " + a + " " + b);
    }
}

class main_class2 extends main_class1 { // child class (sub class)
    int c;

    void showtime2() {
        System.out.println("C : " + c);
    }

    void sum() {
        System.out.println("A + B + C : " + (a + b + c));
    }

    static class inheritance { // main functions of extending main_class1 & main_class2
        public static void main(String[] args) {
            main_class1 i = new main_class1();
            main_class2 j = new main_class2();
            i.a = 10;
            i.b = 20;
            System.out.println(" Contents Of Main_class1 ");
            i.showtime();
            System.out.println("\n");
            j.a = 5;
            j.b = 15;
            j.c = 10;
            System.out.println("contens of main_class2 ");
            j.showtime();
            j.showtime2();
            System.out.println("\n");
            System.out.println("Sum of A B and C in main_class2 ");
            j.sum();
        }
    }
}
/**
 * as i can see, the sub class is main_class2 includes all of the members of its
 * main_class1 (superclass) this is why main_class2 can access i and j can call
 * shoetime().also inside sum(). i and j can be refferd to directly,as if they
 * were part of main_class2
 */