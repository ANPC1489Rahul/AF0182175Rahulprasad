public class Main{

    public static double salaryCalculator(double hoursPerWeek, double amountPerHour, int vacationDays){
        
        if(hoursPerWeek < 0){
            return -1;
        }

        if(amountPerHour < 0){
            return -1;
        }

        double weeklypaycheck = hoursPerWeek * amountPerHour;
        double unpaidTime = vacationDays * amountPerHour * 8;
        return (weeklypaycheck * 52) - unpaidTime;
    }
    
    public static void main(String[] args) {
        int hoursPerWeek;
        int amountPerHour;
        int vacationDays;
        double salary = salaryCalculator(hoursPerWeek: 40, amountPerHour: 15, vacationDays: 8);
        System.out.println(salary);
    }
}

output:
30240
