public class BmiService {
    public double  calculate (double height, double weight) {

        double bmi;
        bmi = weight/(height*height);
        return bmi;
    }
}
