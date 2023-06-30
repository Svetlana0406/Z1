package Z1;

import java.time.LocalDate;

public class CactusTest {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2023, 7, 20);
        int month = date.getMonthValue();
        int rand = random.generateRandomIntRange(29, 33);

        if (month == 1 || month == 2 || month == 12) {
            System.out.println("Дата следующего полива:  " + date.plusMonths(1));
        } else if ((month == 9) || (month == 10) || (month == 11) || (month == 3) || (month == 4) || (month == 5)) {
            System.out.println("Дата следующего полива:  " + date.plusDays(7));
        } else if (rand <= 30 & month == 6 & month == 7 & month == 8) {
            System.out.println("Дата следующего полива:  " + date.plusDays(1) + " влажность воздуха:" + rand);
        } else
        System.out.println("Дата следующего полива:  " + date.plusDays(2) + " влажность воздуха:" + rand);

        }
    }








