package com.lesson2.homework;

import java.util.Scanner;

public class HWTask1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter current day");
        int day = scan.nextInt();

        System.out.println("Enter current month");
        int month = scan.nextInt();

        System.out.println("Enter current year");
        int year = scan.nextInt();

        dateDisplay(day,month,year);

    }

    public static void dateDisplay(int day, int month, int year) {
        if (isDateValid(day, month, year)) {
            switch (month) {
                case 1:
                    if (day == 31) {
                        month++;
                        day = 1;
                        break;
                    } else {
                        day++;
                        break;
                    }

                case 2:
                    if (isTemporal(year)&& day == 28) {
                        day++;
                        break;
                    }
                    if (!isTemporal(year) && day == 28) {
                        month++;
                        day = 1;
                        break;
                    } else {
                        if (isTemporal(year) && day == 29) {
                            month++;
                            day = 1;
                            break;
                        }
                    }
                case 3:

                    if (day == 31) {
                        month++;
                        day = 1;
                        break;
                    } else {
                        day++;
                        break;
                    }
                case 4:
                    if (day == 31) {
                        month++;
                        day = 1;
                    } else {
                        day++;
                        break;
                    }

                case 5:
                    if (day == 31) {
                        month++;
                        day = 1;
                    } else {
                        day++;
                        break;
                    }

                case 6:
                    if (day == 31) {
                        month++;
                        day = 1;
                    } else {
                        day++;
                        break;
                    }

                case 7:
                    if (day == 31) {
                        month++;
                        day = 1;
                    } else {
                        day++;
                        break;
                    }

                case 8:
                    if (day == 31) {
                        month++;
                        day = 1;
                    } else {
                        day++;
                        break;
                    }

                case 9:
                    if (day == 31) {
                        month++;
                        day = 1;
                    } else {
                        day++;
                        break;
                    }

                case 10:
                    if (day == 31) {
                        month++;
                        day = 1;
                    } else {
                        day++;
                        break;
                    }

                case 11:
                    if (day == 30) {
                        month++;
                        day = 1;
                    } else {
                        day++;
                        break;
                    }
                case 12:
                    if (day == 31) {
                        month = 1;
                        day = 1;
                        year++;
                    } else {
                        day++;
                        break;
                    }
            }
        }
        System.out.println(day + "." + month + "." + year);
    }

    public static boolean isDateValid(int day, int month, int year) {
        if (day <= 0 || day > 31) {
            return false;
        }
        if (month <= 0 || month > 12) {
            return false;
        }
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                if (day == 31) {
                    return false;
                }
                break;
            case 2:
                if (isTemporal(year)) {
                    if (day > 29) {
                        return false;
                    }
                } else {
                    if (day > 28) {
                        return false;
                    }
                }
                break;
        }

        return true;
    }

    public static boolean isTemporal(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }
}
