import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        //padrão de leitura do dia e horario ISO 8601
        LocalDate data1 = LocalDate.now();
        LocalDateTime data2 = LocalDateTime.now();
        Instant data3 = Instant.now();

        LocalDate data4 = LocalDate.parse("2024-07-30");
        LocalDateTime data5 = LocalDateTime.parse("2024-07-30T23:13:00.00");
        Instant data6 = Instant.parse("2024-07-30T23:13:00Z");

        //https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDate data7 = LocalDate.parse("30/07/2024", formatter);
        LocalDateTime data8 = LocalDateTime.parse("30/07/2024 23:35", formatter2);
        LocalDate data9 = LocalDate.of(2024, 7, 30);
        LocalDateTime data10 = LocalDateTime.of(2024, 7, 30,23,40);

        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter formatter6 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter formatter7 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("Data local data1 = " + data1);
        System.out.println("Data e tempo local data2 = " + data2);
        System.out.println("Data e tempo global data3 = " + data3);
        System.out.println("Data local data4 = " + data4);
        System.out.println("Data e tempo local data5 = " + data5);
        System.out.println("Texto para data e tempo global data6 = " + data6);
        System.out.println("Passando data de um formato diferente para ISO data7 = " + data7);
        System.out.println("Passando data e hora de um formato diferente para ISO data8 = " + data8);
        System.out.println("Forma diferente de instanciar data ISO data9 = " + data9);
        System.out.println("Forma diferente de instanciar data hora ISO data10 = " + data10);

        System.out.println("Formatando data local em formato personalizado data5 = " + data5.format(formatter3));
        System.out.println("Formatando data e hora local em formato personalizado data5 = " + data5.format(formatter4));
        System.out.println("Formatando data e hora global em formato personalizado no horario do sistema data6 = " + formatter5.format(data6));
        System.out.println("Formatando data e hora global em iso date time data5 = " + formatter6.format(data5));
        System.out.println("Formatando data e hora global em iso date time data6 = " + formatter7.format(data6));
    }
}