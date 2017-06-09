// HeartRatesTest.java

import java.util.Scanner;
import javax.swing.JOptionPane;

public class HeartRatesTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner( System.in );

    int month, day, year;

    String fName = JOptionPane.showInputDialog("Enter Your First Name ");
    String lName = JOptionPane.showInputDialog("Enter Your Last Name ");
    month = Integer.parseInt( JOptionPane.showInputDialog("Enter Your Month Of Birth ") );
    day = Integer.parseInt( JOptionPane.showInputDialog("Enter Your Day Of Birth ") );
    year = Integer.parseInt( JOptionPane.showInputDialog("Enter Your Year Of Birth "));

    HeartRates heart = new HeartRates( fName, lName, month, day, year );

    String message = String.format("First Name : %s\nLast Name :%s\nDate of Birth %d / %d / %d\nAge In Years : %d\nMaximum Heart Rate : %d\nTarget Heart Rate : [%.2f, %.2f]\n",heart.getFirstName(), heart.getLastName(), heart.getMonthOfBirth(), heart.getDayOfBirth(), heart.getYearOfBirth(), heart.ageInYears(), heart.maximumHeartRate(), heart.lowerTargetHeartRate(), heart.higherTargetHeartRate());

    JOptionPane.showMessageDialog(null , message );
  }

}
