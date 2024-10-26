package app;

public class Solution {
    public static void main(String[] args) {
        Employee employee = new Employee("Kate", "Shevchuk", "Mechanic", "kate_shevchuk@gmail.com", "+3805678439", 32);
        System.out.println("Employee:"+employee.getName()+" "+employee.getSurname());

        Car car = new Car();
        car.start();
    }
}
