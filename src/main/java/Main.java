public class Main {
    public static void main(String[] args) {
        Temperature temp = new Temperature(90, Temperature.TempScale.FAHRENHEIT);
        System.out.println(temp.getDegrees());
        System.out.println(temp.getScale());
        System.out.println(temp);
        System.out.println(temp.toCelsius());
        System.out.println("=".repeat(15));

        Temperature tempTwo = new Temperature(24, Temperature.TempScale.CELSIUS);
        System.out.println(tempTwo.getDegrees());
        System.out.println(tempTwo.getScale());
        System.out.println(tempTwo);
        System.out.println(tempTwo.toCelsius());
        System.out.println("=".repeat(15));

        Temperature tempThree = new Temperature(300, Temperature.TempScale.KELVIN);
        System.out.println(tempThree.getDegrees());
        System.out.println(tempThree.getScale());
        System.out.println(tempThree);
        System.out.println(tempThree.toCelsius());
        System.out.println("=".repeat(15));

    }
}
