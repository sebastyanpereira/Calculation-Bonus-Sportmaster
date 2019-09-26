import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Введите общую стоимость всех предыдущих покупок в рублях: ");
        int totalSumOrders = keyboard.nextInt();
        System.out.println("Введите стоимость текущей покупки в рублях: ");
        int currentSumOrder = keyboard.nextInt();
        int bonusStepOrder = 1_000;
        int standartBonusCount = 50;
        int silverBonusCount = 70;
        int goldBonusCount = 100;
        int standartLevelLimit = 15_000;
        int silverLevelLimit = 150_000;
        int currentBonus;
        if (totalSumOrders > 0 && totalSumOrders < standartLevelLimit) {
            currentBonus = (currentSumOrder / bonusStepOrder) * standartBonusCount;
        } else if (totalSumOrders < silverLevelLimit) {
            currentBonus = (currentSumOrder / bonusStepOrder) * silverBonusCount;
        } else {
            currentBonus = (currentSumOrder / bonusStepOrder) * goldBonusCount;
        }
        System.out.println("Ваш бонус за текущую покупку составил " + currentBonus + " бонусов");
    }
}
