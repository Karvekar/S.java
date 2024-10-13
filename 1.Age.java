import java.util.Arrays;


class Date
{
    private int day;
    private int month;
    private int year;


    public Date(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int getDay()
    {
        return day;
    }
    public int getMonth()
    {
        return month;
    }
    public int getYear()
    {
        return year;
    }
}


class Month
{
    private String name;
    private int days;


    public Month(String name, int days)
    {
        this.name = name;
        this.days = days;
    }
    public String getName()
    {
        return name;
    }
    public int getDays()
    {
        return days;
    }
}


class Year
{
    private int year;
    private Month[] months;


    public Year(int year, Month[] months)
    {
        this.year = year;
        this.months = months;
    }
    public Month getMonth(int monthIndex)
    {
        return months[monthIndex];
    }
}


public class Age {
    public static void main(String[] args)
    {
        Month[] monthsArray = { new Month("January", 31), new Month("February", 28), new Month("March", 31), new Month("April", 30), new Month("May", 31), new Month("June", 30), new Month("July", 31), new Month("August", 31), new Month("September", 30), new Month("Octomber", 31), new Month("November", 31), new Month("December", 31) };
        Year currentYear = new Year(2023, monthsArray);
        Date birthDate = new Date(8, 9, 2002);
        Date currentDate = new Date(17, 8, 2023);
        int ageInYears = currentDate.getYear() - birthDate.getYear();
        int ageInMonths = currentDate.getMonth() - birthDate.getMonth();
        int ageInDays = currentDate.getDay() - birthDate.getDay();
        if (ageInDays < 0)
        {
            ageInMonths--;
            ageInDays += currentYear.getMonth(birthDate.getMonth() - 1).getDays();
        }
        if (ageInMonths < 0)
        {
            ageInYears--;
            ageInMonths += 12;
        }
        System.out.println("Age: " + ageInYears + " years, " + ageInMonths + " months, " + ageInDays + " days");
    }
}


