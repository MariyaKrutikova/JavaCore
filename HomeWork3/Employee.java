import lombok.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Period;
//@Getter
//@Setter
@AllArgsConstructor
//@EqualsAndHashCode
//@ToString
@Data
public class Employee {
    private String FIO;
    private String position;
    private String phone;
    private BigDecimal salary;
    private LocalDate birthDate;


    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }

//    @Override
//    public String toString() {
//
//        return String.format("%s - %s , phone - %s ,salary - %s, age - %s", FIO, position, phone, salary, this.getAge());
//    }

    public void printInfo() {
        System.out.println(this);
    }

    public void increaseSalary(int value) {
        float percent = (float) value /100;
        BigDecimal increase = salary.multiply(BigDecimal.valueOf(percent));
//        setScale(3, ROUND_DOWN)
        this.salary = salary.add(increase).setScale(0, RoundingMode.DOWN);
    }

 /**
  * Метод сравнения дат. Сравнение осуществляется через условия
  * @param date дата для сравения с заданной датой, в данном случае с датой рождения employee
  * @return  - 1, 0 или -1
  * */
     public  int compareDates (LocalDate date){
            return (birthDate.getYear() > date.getYear() || (birthDate.getYear() == date.getYear() && birthDate.getMonthValue() > date.getMonthValue()) || (birthDate.getYear() == date.getYear() && birthDate.getMonthValue() == date.getMonthValue() && birthDate.getDayOfMonth() > date.getDayOfMonth())) ? -1: ((birthDate.getYear() < date.getYear() || (birthDate.getYear() == date.getYear() && birthDate.getMonthValue() < date.getMonthValue()) || (birthDate.getYear() == date.getYear() && birthDate.getMonthValue() == date.getMonthValue() && birthDate.getDayOfMonth() < date.getDayOfMonth())) ? 1 : 0);
     }

    /**
     * Метод сравнения дат за счет разложения даты вида 20240101 на разряды в двоичной системе
     * @param dd день
     * @param mm месяц
     * @param yyyy год
     * @return  отрицательное число, ноль или положительное число
     * */
     public int compare(int dd, int mm, int yyyy) {
        int empl = birthDate.getDayOfMonth() + (birthDate.getMonthValue() << 6) + (birthDate.getYear() << 11);
        int income = dd + (mm << 6) + (yyyy << 11);
        System.out.println(empl);
        return empl - income;
    }
}