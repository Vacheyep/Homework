package HOMEWORK.Day18;
//ex3
public class Triangle {
    int sideA;
    int sideB;
    int sideC;
    public void triangle(){}

    public void triangle(int sideA, int sideB, int sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public boolean getSideA() {
        return numInRange(sideA);
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public boolean getSideB() {
        return numInRange(sideB);
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public boolean getSideC() {
        return numInRange(sideC);
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    // method for range
    public boolean numInRange(int a){
        return a > 1 && a < 20;
    }

    // method is triangle valid
    public boolean isTriangleValid(int a ,int b, int c){
        return a + b > c && a + c > b && b + c > a;
    }

    //method which will check if your triangle is right or not.
    public boolean isRightAngle(int a, int b ,int c) {
        return a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b;
    }

    //overloading
    public int triangleCheck(int a, int b){
        return  a * b / 2;
    }
    public int triangleCheck(int a, int b, int c){
        return a + b + c;
    }
}
