package ru.skypro;

public class Main {

    public static void main(String[] args) {
	//Задание 1
        String firstName = "Иван";
        String lastName = "Иванов";
        String middleName = "Иванович";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("ФИО сотрудника - " + fullName);
    }

    public static void task2() {
        String fullName = "Ivanov Ivan Ivanovich";
        String upperFullName = fullName.toUpperCase();
        System.out.println(upperFullName);
    }

    public static void task3() {
        String fullName = "Дмитрий Арсений Алексей";
        String fixedFullName = fullName.replace("й", "и");
        System.out.println(fixedFullName);
    }
}


