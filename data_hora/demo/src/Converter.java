import java.time.*;
import java.time.temporal.ChronoUnit;

public class Converter {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:20:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);

        LocalDate pastWeekLocalDateTime = d04.minusDays(7);
        LocalDate nextWeekLocalDateTime = d04.plusDays(7);

        Instant pastFiveHoursInstant = d06.minus(5, ChronoUnit.HOURS);
        Instant nextFiveHoursInstant = d06.plus(5, ChronoUnit.HOURS);

        Duration t1 = Duration.between(pastFiveHoursInstant, nextFiveHoursInstant);
        Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atTime(0,0));
        Duration t3 = Duration.between(d06, pastFiveHoursInstant);

        //convertendo o instante d06 para um horario no timezone da maquina.
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        //convertendo o instante d06 para um horário no itmezone de portugal
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        //convertendo o local date time de um isntante Zulu para o timezone da maquina.
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        //convertendo o local date time de um isntante Zulu para o timezone de portugal.
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));


        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 dia = " + d04.getDayOfWeek());

        System.out.println("d05 hora = " + d05.getHour());

        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);

        System.out.println("pastFiveHoursInstant = " + pastFiveHoursInstant);
        System.out.println("nextFiveHoursInstant = " + nextFiveHoursInstant);

        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2.toDays());
        System.out.println("t3 = " + t3);
    }
}
