import java.util.Scanner;
import java.util.concurrent.Callable;


interface Shape
{
    void draw();
}


class Circle implements Shape
{
    @Override
    public void draw()
    {
        System.out.println("a circle drawn");
    }
}


class Square implements Shape
{
    @Override
    public void draw()
    {
        System.out.println("a square drawn");
    }
}

class Rectangle implements Shape
{
    @Override
    public void draw()
    {
        System.out.println("a rectangle drawn");
    }
}


class Sample {


     public static  void main(String[] args) {


             Scanner sc= new Scanner(System.in);
          //  Stirng a = sc.nextString();

          String a= sc.nextLine();



            if(a=="Circle")

             {

                Circle c = new Circle();

                c.draw();

             }


             else if(a=="Square")
             {
                 Square s = new Square();
                 s.draw();
             }

             else if (a=="Rectangle")
             {
                 Rectangle r = new Rectangle();
                 r.draw();
             }

             else{
                 System.out.println("Sorry!");
             }


         }
     }
