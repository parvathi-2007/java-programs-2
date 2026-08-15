package module2;
 class Car {

    private String model = "Toyota";

    public void showModel() {
        System.out.println("Model: " + model);
    }
};

public class ErrorAndNoError {

    public static void main(String[] args) {

        Car car = new Car();
        car.showModel();
        
       // System.out.println(car.model);    }
}
}