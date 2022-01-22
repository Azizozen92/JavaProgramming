package day_24_CustomMethodsReturn;

public class BreakfastTasks {

    public static class BreakfastTaskInitials {
        public static void main(String[] args) {

            initials("aziz", "ozen");
            System.out.println();

            emailDomain("azizozen@yahoo.com");
            System.out.println();

            System.out.println("-----------------------");
            String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "ELminur@cydeo.com", "Gulsen@gmail.com"};
            for (String email : emails) {
                emailDomain(email);
            }
            System.out.println();

            monthOfTheYear(2);
            System.out.println();

            dayOfTheWeek(4);
            System.out.println();

            numberOfDaysIn("January");
            System.out.println();




        }

        public static void initials(String firstName, String lastName) {
            firstName = firstName.substring(0, 1).toUpperCase();
            lastName = lastName.substring(0, 1).toUpperCase();
            String initial = firstName + "." + lastName;
            System.out.println(initial);
        }

        public static void emailDomain(String email) {
            email = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
            System.out.println(email);
        }

        public static void monthOfTheYear(int numberOfMonth) {

            String result = "";
            switch (numberOfMonth) {
                case 1:
                    result = "January";
                    break;
                case 2:
                    result = "February";
                    break;
                case 3:
                    result = "March";
                    break;
                case 4:
                    result = "April";
                    break;
                case 5:
                    result = "May";
                    break;
                case 6:
                    result = "June";
                    break;
                case 7:
                    result = "July";
                    break;
                case 8:
                    result = "August";
                    break;
                case 9:
                    result = "September";
                    break;
                case 10:
                    result = "October";
                    break;
                case 11:
                    result = "November";
                    break;
                case 12:
                    result = "December";
                    break;
                default:
                    result = "Invalid Month";
                    break;
            }
            System.out.println(result);
        }

        public static void dayOfTheWeek(int day) {
            String result = "";
            switch (day) {
                case 1:
                    result = "Monday";
                    break;
                case 2:
                    result = "Tuesday";
                    break;
                case 3:
                    result = "Wednesday";
                    break;
                case 4:
                    result = "Thursday";
                    break;
                case 5:
                    result = "Friday";
                    break;
                case 6:
                    result = "Saturday";
                    break;
                case 7:
                    result = "Sunday";
                    break;
                default:
                    result = "Invalid Day";
                    break;


            }
            System.out.println(result);
        }

        public static void numberOfDaysIn(String month){
            String result="";
            switch (month){
                case "January":
                case "March":
                case "May":
                case "July":
                case "August":
                case "October":
                case "December":
                result=""+31;
                break;
                case "April":
                case "June":
                case "September":
                case "November":
                result=""+30;
                break;
                case "February":
                result=""+28;
                break;
                default:
                result="Invalid Month";
                break;
            }
            System.out.println(result);
        }

        public static void ageGroup(int age){
            String result="";
            switch ( (age >= 1 && age <= 2)?1:
                    (age >= 3 && age <= 5)?2:
                    (age >= 10 && age <= 12)?4:
                    (age >= 13 && age <= 17)?5:
                    (age >= 18 && age <= 20)?6:
                    (age >= 21 && age <= 39)?7:
                    (age >= 40 && age <= 49)?8:
                    (age >= 50 && age <= 54)?9:
                    (age >= 55 && age <= 64)?10:
                    (age >= 65 && age <= 74)?11:
                    (age >= 75 && age <= 84)?12:13 ) {
                case 1:
                    result="Infant";
                    break;
                case 2:
                    result="Toddler";
                    break;
                case 3:
                    result="Kid";
                    break;
                case 4:
                    result="Pre-Teen";
                    break;
                case 5:
                    result="Teenager";
                    break;
                case 6:
                    result="Young Adult";
                    break;
                case 7:
                    result="Adult";
                    break;
                case 8:
                    result="Young Middle-Aged Adult";
                    break;
                case 9:
                    result="Middle-Aged Adult";
                    break;
                case 10:
                    result="Very Young Senior Citizen";
                    break;
                case 11:
                    result="Young Senior Citizen";
                    break;
                case 12:
                    result="Senior Citizen";
                    break;
                default:
                    result="Old Senior Citizen";
            }
            System.out.println(result);
        }
    }
}