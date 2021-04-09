public class BmiService {
    public double calculate(int weight, double height) {

        // принимает параметры: weight типа int и height типа double

        return weight / (height * height);
    }
}