/**
 * Exercise 9.15
 */
public class HourlyEmployee extends Employee {

    private double hoursWorked;
    private double hourlyWage;

    public HourlyEmployee( String firstName, String lastName, String socialSecuritynumber, double hoursWorked, double hourlyWage )
    {
        super(firstName, lastName, socialSecuritynumber);
        setHoursWorked(hoursWorked);
        setHourlyWage(hourlyWage);
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {

        if ( hoursWorked < 0.0 || hoursWorked > 168.0 )
            throw new IllegalArgumentException("Hours Worked Must Be In [0,168]");

        this.hoursWorked = hoursWorked;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {

        if ( hourlyWage < 0.0 )
            throw new IllegalArgumentException("Hours Worked Must Be Positive");

        this.hourlyWage = hourlyWage;
    }

    public double earnings()
    {
        return getHourlyWage() * getHoursWorked();
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" + super.toString() +
                "hoursWorked=" + hoursWorked +
                ", hourlyWage=" + hourlyWage +
                " }";
    }
}
