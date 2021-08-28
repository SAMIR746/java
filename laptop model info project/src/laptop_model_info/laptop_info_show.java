package laptop_model_info;

interface model1 {
    void m1();
}

interface model2 {
    void m2();
}

class model3 implements model1, model2 {
    public void m1() {
        System.out.println("\nModel 1\n");
        System.out.println("Size : 15.60 inch");
        System.out.println("proccessor : intel core i3 6th gen 6006u");
        System.out.println("Ram : 8GB");
        System.out.println("Cache : 3MB");
    }

    public void m2() {
        System.out.println("\nModel 2\n");
        System.out.println("Size : 15.60_inch");
        System.out.println("processor : intel core i5 8250u");
        System.out.println("Ram : 8GB");
        System.out.println("cache : 6MB");
    }

    public void m3() {
        System.out.println("\nModel\n");
        System.out.println("Size : 14.00_inch");
        System.out.println("processor : intel core i7 6600u");
        System.out.println("12GB");
        System.out.println("Cache : 4MB");
    }
}

public class laptop_info_show {
    public static void main(String args[]) {
        model3 a = new model3();
        a.m1();
        a.m2();
        a.m3();
    }
}