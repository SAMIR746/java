public class multilevel_inheritence {
    class main_class1 { // parent class (super class)
        int a, b;

        void showtime() {
            System.out.println("A and B : " + a + " " + b);
        }
    }

    class main_class2 extends main_class1 { // child class (sub class) inner class
        int c;

        void showtime2() {
            System.out.println("C : " + c);

        }
    }

    class main_class3 extends main_class2 { // inner class with m
        float d, e;

        void showtime3() {
            System.out.println("D and E : " + d + "" + e);
        }
    }

    class sum extends main_class3 {
        void sum() {
            System.out.println("A + B + C : " + (a + b + c) + (d + e));

        }
    }

    class inheritence { // main functions of extending main_class1 & main_class2
        public void main(String[] args) {
            main_class1 i = new main_class1();
            main_class2 j = new main_class2();
            main_class3 k = new main_class3();
            sum s = new sum();
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
            System.out.println("contents of class3 ");
            k.d = 10.333f;
            k.e = 15.55f;
            System.out.println("Sum of A B and C in main_class2 ");
            s.sum();

        }
    }

}
