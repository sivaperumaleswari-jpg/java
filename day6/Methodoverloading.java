package compile1;

class Mathoperation
{
    static int multiply(int a,int b)
    {
        return a*b;
    }
    static double multiply(double x,double y)
    {
        return x*y;
    }
    static int multiply(int r)
    {
        return r*r;
    }
   
}
class Methodoverloading {
    public static void main(String[] args) {
        System.out.println("\nMulti of 2 integers=" +Mathoperation.multiply(25,10));

        System.out.println("\nMulti of 2 float values=" +Mathoperation.multiply(2.5357,8.5786));

        System.out.println("\nMulti of same integer value=" +Mathoperation.multiply(6));
    }
}