public class Circle {
    final private double radius;

    public Circle(double radius){
        this.radius=radius;
    }
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
    public double calculateCircumference(){
        return 2*Math.PI*radius;
    }

    public void displayDetails(){
        System.out.println("Radius: "+radius);
        System.out.println("Area: "+calculateArea());
        System.out.println("Circumference: "+calculateCircumference());
    }

    public static void main(String[] args) {
        Circle circle1=new Circle(14);
        Circle circle2=new Circle(12);
        System.out.println("The details of circle1 is: ");
        circle1.displayDetails();
        System.out.println("The details of circle2 is: ");
        circle2.displayDetails();
    }
}