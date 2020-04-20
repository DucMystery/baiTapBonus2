import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Meat extends Material implements Discount {

    protected double weight;
    protected double unit;
    protected int day;
    protected int month;
    protected int year;

    public Meat() {

    }

    public double getWeight() {
        return weight;
    }

    public Meat setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public double getUnit() {
        return unit;
    }

    public Meat setUnit(double unit) {
        this.unit = unit;
        return this;
    }

    public int getDay() {
        return day;
    }

    public Meat setDay(int day) {
        this.day = day;
        return this;
    }

    public int getMonth() {
        return month;
    }

    public Meat setMonth(int month) {
        this.month = month;
        return this;
    }

    public int getYear() {
        return year;
    }

    public Meat setYear(int year) {
        this.year = year;
        return this;
    }

    public Meat(String id, String name, double weight, double unit, double cost, int day, int month, int year) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.weight = weight;
        this.unit = unit;
        this.year =year;
        this.day =day;
        this.month =month;
    }


    @Override
    protected double calculatorMoney() {
        return getCost() * weight * unit;
    }

    @Override
    protected String dateOfManufacture() {
        if (day > 31 || month > 12) {
            System.out.println("ban check lai ngay thang nam !");
        } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (day>=16){
                        day = day - 17;
                        if (day ==0){
                            day=1;
                        }
                        if (month == 12) {
                            year++;
                        }
                        month = displayMonth(month);
                    }
                    break;
                case 4:
                case 6:
                case 9:
                    if (day>=15){
                        day = day - 16;
                        month = displayMonth(month);
                    }
                    break;
                case 2:
                    if (checkYear(year)) {
                        if (day>=14){
                            day = day - 15;
                            month = displayMonth(month);}
                    } else {
                        if (day>=13){
                        day = day - 14;
                        month = displayMonth(month);}
                    }
                    break;
            }
        }
        return day + "/" + month + "/" + year;
    }



        public static boolean checkYear ( int year){
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                return true;
            return false;
        }

        public static int displayMonth ( int month){
            if (month >= 12) {
                month = 1;
            } else {
                month =month+1;
            }
            return month;
        }

    @Override
    public double CalculatorDiscount(  double percent) {
        return calculatorMoney()*percent/ 100;

    }
}
