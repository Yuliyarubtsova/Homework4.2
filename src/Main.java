public class Main {
    public static void main(String[] args) {
      BmiService service = new BmiService();

      double bmi = service.calculate(51, 1.71);
      System.out.println(bmi);
        }
}