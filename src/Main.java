public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double result = service.calculate(55, 1.65);
        System.out.println("Индекс массы тела равен " + result);
    }
}