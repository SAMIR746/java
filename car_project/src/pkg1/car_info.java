package pkg1;

public class car_info extends car {
    @Override
    public void car_description() {
        System.out.println("Production  : 2013-2014\n------------------------");
        System.out.println("Colour      : sant'agata bolognese\n-----------------------------------");
        System.out.println("Body style  : 2-door roadster\n------------------------------");
        System.out.println("Doors       : scissor\n-----------------------");
        System.out.println("Engine      : 6.5L L539 v12\n--------------------------");
        System.out.println("Price       : 2 million $\n------------------------");

    }

    public static void main(String[] args) {
        car_info obj = new car_info();
        obj.car_brand();
        obj.car_description();
    }
}
