import java.util.Scanner;
import ru.netology.service.CustomsService;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в программу расчета пошлины для провоза товара!");

        System.out.print("Введите цену товара (в руб.):");
        int price = scanner.nextInt();

        System.out.print("Введите вес товара (в кг.):");
        int weight = scanner.nextInt();

        int customs = calculateCustoms(price, weight);
        System.out.print("Размер пошлины (в руб.) составит: "+customs);
    }

    public static int calculateCustoms(int a, int b) {
        return (a/100) + b * CustomsService.DUTY_RATE();
    }
}