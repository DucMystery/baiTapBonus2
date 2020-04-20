import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

import static java.util.GregorianCalendar.*;

public class BotChienGion extends Material implements Discount {
    private double quantity;

    protected int day;
    protected int month;
    protected int year;

    public BotChienGion(){

    }

    public BotChienGion(String id, String name, double quantity, double cost, int day, int month, int year){
        this.id =id;
        this.name =name;
        this.cost =cost;
        this.quantity =quantity;
        this.day =day;
        this.month =month;
        this.year =year;

    }

    @Override
    protected double calculatorMoney() {
        return this.cost*this.quantity;
    }

    @Override
    protected String dateOfManufacture() {
        year =year+1;
        return day+"/"+month+"/"+year;
    }



    @Override
    public double CalculatorDiscount( double percent) {
        return calculatorMoney()*percent/100;
    }
}
