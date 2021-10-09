public class Main {
    public static void main(String[] args) {
        System.out.println("Задача Калькулятор");

        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(2, 2));
        System.out.println(intsCalc.sum(10, 22));
        System.out.println(intsCalc.pow(2, 10));
            //демонстрация
    }
}
