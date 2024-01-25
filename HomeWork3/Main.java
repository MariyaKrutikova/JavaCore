import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivan Petrov",
                "devops",
                "+79765463452",
                BigDecimal.valueOf(100000),
                LocalDate.of(1990, 1, 1));

        Employee employee2 = new Employee("Vasiliy Petrov",
                "programmer",
                "+79765463452",
                BigDecimal.valueOf(200000),
                LocalDate.of(1990, 1, 1));

        Employee employee3 = new Employee("Ivan Ivanov",
                "engineer",
                "+79765463452",
                BigDecimal.valueOf(60000),
                LocalDate.of(1990, 1, 1));

        Employee employee4 = new Employee("Ivan Sidorov",
                "analyst",
                "+79765463452",
                BigDecimal.valueOf(50000),
                LocalDate.of(1990, 1, 1));

        Employee employee5 = new Employee("Petr Petrov",
                "team lead",
                "+79765463452",
                BigDecimal.valueOf(300000),
                LocalDate.of(1975, 1, 1));

        Manager manager = new Manager("Кузьма Кузин",
                "manager",
                "+7976111111",
                BigDecimal.valueOf(500000),
                LocalDate.of(1981, 1, 7));


        List<Employee> employees = new ArrayList<>(Arrays.asList(employee1, employee2, employee3, employee4, employee5, manager));

//        for (Employee employee : employees) {
//            employee.printInfo();
//        }
//
//        salaryIncreaseForEmployees(employees, 45, 30000);
//        System.out.println();
//
//        for (Employee employee : employees) {
//            employee.printInfo();
//        }
//
//        System.out.println(getAverageSalaryAndAge(employees));

    /*Тестированием метода compareDates (сравнение дат с использованием условий)*/
        LocalDate date = LocalDate.of(1986, 7, 28);
        System.out.println(employee3.compareDates(date));

    /*Тестированием метода increaseSalaryForEmployee (увеличение менеждером зарплаты сотруднику)*/
        for (Employee employee : employees) {
            employee.printInfo();
            Manager.increaseSalaryForEmployee(10, employee);
            employee.printInfo();
        }

    /*Тестированием метода compare (сравнения двух дат с использованием бинарного сдвига)*/
        employee1.printInfo();
        System.out.println(employee1.compare(7,1,1995));
    }

    public static void salaryIncreaseForEmployees(List<Employee> employees, int ageOlder, int bonusValue) {
        for (Employee employee : employees) {
            if (employee.getAge() > ageOlder) {
                employee.increaseSalary(bonusValue);
            }
        }
    }

    public static String getAverageSalaryAndAge(List<Employee> employees) {
        double averageSalaries = employees.stream().mapToDouble(x -> x.getSalary().doubleValue()).average().orElseThrow();
        double averageAge = employees.stream().mapToDouble(x -> (double) x.getAge()).average().orElseThrow();

        return String.format("Average salary - %s, age - %s", averageSalaries, averageAge);

    }

    public static AverageResponseDTO getAverage(List<Employee> employees) {
        return AverageResponseDTO.builder()
                .averageAge(employees.stream().mapToDouble(x -> (double) x.getAge()).average().orElseThrow())
                .averageSalary(employees.stream().mapToDouble(x -> x.getSalary().doubleValue()).average().orElseThrow())
                .averageLettersInFIO((int) employees.stream().mapToInt(x -> x.getFIO().length()).average().orElseThrow())
                .build();
    }
}