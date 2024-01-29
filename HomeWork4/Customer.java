import lombok.Data;
import lombok.Getter;

import java.time.LocalDate;
    @Data
    public class Customer {
        @Getter
        private String FIO;
        private LocalDate dateOfBirth;
        private String phone;
        private Sex sex;

        public Customer(String FIO, LocalDate dateOfBirth, String phone, Sex sex) {
            this.FIO = FIO;
            this.dateOfBirth = dateOfBirth;
            this.phone = phone;
            this.sex = sex;
        }

        public void setFIO(String FIO) {
            this.FIO = FIO;
        }

        public String getFIO() {
            return FIO;
        }

        public LocalDate getDateOfBirth() {
            return dateOfBirth;
        }

        public String getPhone() {
            return phone;
        }

        public Sex getSex() {
            return sex;
        }

        public enum Sex{MALE, FEMALE}
    }

