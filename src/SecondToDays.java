public class SecondToDays {
    public static void main(String[] args) {
        int second = 86400;
        int minutes = second / 60 ;
        int hours = minutes / 60;
        int days = hours / 24;

        System.out.println("Дней: " + days);
        System.out.println("Часов: " + hours);
        System.out.println("Минут: " + minutes);
        System.out.println("Секунд: " + second);

    }
}
