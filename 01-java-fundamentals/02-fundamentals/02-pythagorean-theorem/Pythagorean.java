public class Pythagorean{
    public double calculateHypotenuse(int A, int B){
        double hypotenuse = A*A + B*B;
        hypotenuse = Math.sqrt(hypotenuse);
        return hypotenuse;
    }
}
