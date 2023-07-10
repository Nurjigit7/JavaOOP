import java.security.cert.CertPathValidatorException;

public class Main {
    public static void main(String[] args) {
        // Тип аты  обьект

//    Phone phone=new Phone();
//    phone.model="iphone ";
//    phone.price =50000;
//    phone.color ="While";
//
//       System.out.println("model: "+phone.model);
//       System.out.println("price: "+phone.price);
//      System.out.println("color: "+phone.color);
//
//        Phone telefon = new Phone();
//        telefon.model ="Xiomi";
//        telefon.price = 30000;
//        telefon.color ="Black";
//
//     //    System.out.println("Model : "+telefon.model+" :Price: "+telefon.price+" Color: "+telefon.color);
//        telefon.call();
//        Car car = new Car();
//        car.model="Lexsus";
//        car.price=20000;
//        car.color="Black";
//        System.out.println("Model :"+car.model+" : price :"+car.price+" :color :"+car.color);
//        car.trak();
//        Car car1 =new Car();
//        car1.model="Camry";
//        car1.price=10000;
//        car1.color="Whille";
//        System.out.println("Model: "+car1.model+" :price:"+car1.price+" :color:"+car1.color);
//        car1.trak();
//
//        Car car2 =new Car();
//        car2.model ="fit";
//        car2.price=7000;
//        car2.color="blue";
//        System.out.println("Model:" +car2.model+":price:"+car2.price+":calor:"+car2.color);
//        car2.trak();

        Triangle triangle = new Triangle();
        triangle.a = 4.5;
        triangle.b = 7.3;
        triangle.c = 3.3;
        System.out.println(triangle.area(triangle.a, triangle.b, triangle.c));
    }
}