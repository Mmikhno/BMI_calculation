import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.8;
        double weight = 60;
        double bmi = service.calculate(height,weight);
        //вывод с двумя знаками после точки
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String result = decimalFormat.format(bmi);
        System.out.println("Ваш индекс массы тела составляет: " + result);
    }
}
