package Assignment;
// import java.lang.Math;

class Complex{
    int real;
    int imaginary;

    //DEFAULT CONSTRUCTOR
    Complex(){
        System.out.println("-----------------IGNORE ME------------------");
    }

    //PARAMETERIZED CONSTRUCTOR
    Complex(int a, int b){
        this.real = a;
        this.imaginary = b;
    }

    /*(public void setvar(int a,int b){
        this.real = a;
        this.imaginary = b;
    }*/

    //ADDING COMPLEX NUMBERS
    Complex sumOfComplex(Complex X1, Complex X2){
        Complex c1 = new Complex();
        c1.real = X1.real + X2.real;
        c1.imaginary = X1.imaginary + X2.imaginary;
        return c1;
    }

    //SUBSTRACTING COMPLEX NUMBERS
    Complex DiffOfComplex(Complex Y1, Complex Y2){
        Complex c2 = new Complex();
        /*if(Y1.real > Y2.real){
            c2.real = Y1.real - Y2.real;
        }
        if(Y2.real > Y1.real){
            c2.real = Y2.real - Y1.real;
        }
        if(Y1.imaginary > Y2.imaginary){
            c2.imaginary = Y1.imaginary-Y2.imaginary;
        }
        if(Y2.imaginary > Y1.imaginary){
            c2.imaginary = Y2.imaginary-Y1.imaginary;
        }*/
        c2.real = Y1.real - Y2.real;
        c2.imaginary = Y1.imaginary-Y2.imaginary;
        return (c2);
    }

    Complex ProductOfComplex(Complex Z1, Complex Z2){
        Complex c3 = new Complex();
        c3.real = Z1.real * Z2.real;
        c3.imaginary = Z1.imaginary*Z2.imaginary;
        return c3;
    }

}

public class A1Q3 {
    public static void main(String[] args){
        Complex c1 = new Complex(1, 2);
        Complex c2 = new Complex(2, 1);
        Complex c3 = new Complex();
        System.out.println("-------FIRST COMPLEX NUMBER-------");
        System.out.println("Complex Number:1 is: " + c1.real + " + i" + c1.imaginary);
        System.out.println("-------SECOND COMPLEX NUMBER-------");
        System.out.println("Complex Number:2 is: " + c2.real + " + i" + c2.imaginary);
        c3 = c3.sumOfComplex(c1,c2);
        System.out.println("-------SUM OF TWO COMPLEX NUMBERS-------");
        System.out.println("Sum of Complex Numbers is: " + c3.real + " + i" + c3.imaginary);
        c3 = c3.DiffOfComplex(c1,c2);
        System.out.println("-------DIFFERENCE OF TWO COMPLEX NUMBER-------");
        System.out.println("Difference of Complex Numbers is: " + c3.real + " + i" + c3.imaginary);
        c3 = c3.ProductOfComplex(c1, c2);
        System.out.println("-------PRODUCT OF TWO COMPLEX NUMBER-------");
        System.out.println("Product of Complex Numbers is: " + c3.real + " + i" + c3.imaginary);
    }
}
