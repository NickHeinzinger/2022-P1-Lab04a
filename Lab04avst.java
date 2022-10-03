// Lab04avst.java
// The Mortgage Payment Program
// This the student, starting version of the Lab04a assignment.


public class Lab04avst
{
    public static void main(String[] args)
    {
        System.out.println("Lab04a, 100 Point Version");

        double principle  = 250000;
        double annRate = 4.85;
        double years   = 30;

        System.out.println("Principle:          " +principle);
        System.out.println("Annual Rate:        %" +annRate);
        System.out.println("Number of Years:    " +years);

        double decRate = annRate/100;
        double rateMonth = decRate/12;
        double ratePlus = 1 + rateMonth;

        double numMonths = years * 12;

        double monthPayTop  = (rateMonth * Math.pow(ratePlus,numMonths));
        double monthPayBottom  = (Math.pow(ratePlus,numMonths)-1);
        double monthPayPercent = monthPayTop/monthPayBottom;
        double monthPay = monthPayPercent * principle;

        double monthPayTimes = Math.round (monthPay * 100);
        monthPayTimes /= 100;

        System.out.println("Monthly Payment:    $" +monthPayTimes);

        double totalPay = monthPayTimes * numMonths;

        System.out.println("Total Payments      $" +totalPay);

        double totalIntrest = totalPay - principle;

        System.out.println("Total Interest:     $" + totalIntrest);

    }
}

