import java.util.ArrayList;

public class MainWindwos {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.setName("car1");
        car1.setNumber(10);
        StringBuilder sb=new StringBuilder();
        sb.append("hello");
        sb.append("java");
        System.out.println(sb);
        System.out.println("----------");
        sb.reverse();
        StringBuilder sb1=new StringBuilder(sb.toString());
        System.out.println(sb1);
        System.out.println(car1.getName()+" "+car1.getNumber());
        car1.show();
        System.out.println("---------------");
        ArrayList<String> arry= new ArrayList<>();
        arry.add("hello");
        arry.add("world");
        arry.add("java");
        System.out.println(arry);
        arry.remove("world");
        System.out.println(arry);
        arry.remove(1);
        System.out.println(arry);
        arry.set(0,"javaee");
        System.out.println(arry);
    }
}
