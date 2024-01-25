import java.math.BigDecimal;
import java.time.LocalDate;

public class Manager extends Employee{
    public Manager(String FIO, String position, String phone, BigDecimal salary, LocalDate birthDate) {
        super(FIO, position, phone, salary, birthDate);
    }

    /**
     * Метод повышения менеджером зарплаты сотруднику
     * @param value процент повышения (10%, 25% и т.д.)
     * @param employee сотрудник, которому повышается зарплата
     * */
    public static void increaseSalaryForEmployee(int value, Employee employee) {
        if (!(employee instanceof Manager)) {
            employee.increaseSalary(value);
        }
    }
}
