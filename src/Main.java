public class Main {
    public static void main(String[] args) {

        // Задание 1

        String firstName = "Ivan";
        String lastName = "Ivanov";
        String middleName = "Ivanovich";
        String fullName = "";
        fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        // Задание 2

        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для административного отчета - " + fullName);

        // Задание 3

        fullName = "Ivanov Ivan Ivanovich";
        fullName = fullName.replace(' ', ';');
        System.out.println("Данные ФИО сотрудника для административного отдела - " + fullName);

        // Задание 4

        fullName = "Иванов Семен Семёнович";
        fullName = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника - " + fullName);
    }
}