// HeartProfileTest.java

import javax.swing.JOptionPane;

public class HealthProfileTest
{
  public static void main(String[] args)
  {

    int mm, dd, yyyy;
    double h, wt;

    String fName = JOptionPane.showInputDialog("Enter Your First Name ");
    String lName = JOptionPane.showInputDialog("Enter Your Last Name ");
    String gender = JOptionPane.showInputDialog("Enter Your Gender ");
    mm = Integer.parseInt( JOptionPane.showInputDialog("Enter Your Month Of Birth (In Digits)") );
    dd = Integer.parseInt( JOptionPane.showInputDialog("Enter Your Day Of Birth (Same As Above)") );
    yyyy = Integer.parseInt( JOptionPane.showInputDialog("Enter Your Year Of Birth (As Above)"));
    h = Double.parseDouble( JOptionPane.showInputDialog("Enter Your Height ( In Metres ) "));
    wt = Double.parseDouble( JOptionPane.showInputDialog("Enter Your Weight ( In Kilograms ) "));

    HealthProfile health = new HealthProfile( fName, lName, gender, mm, dd, yyyy, h, wt );

    String message = String.format("First Name:%s\nLast Name:%s\nGender:%s\nDOB:%d/%d/%d\nAge:%d\nMax Heart Rate:%d\nTarget Heart Rate:[%.2f,%.2f]\nBMI:%.2f",health.getFirstName(),health.getLastName(),health.getGenderMF(),health.getMonth(),health.getDay(),health.getYear(),health.ageInYears(),health.maximumHeartRate(),health.lowerTargetHeartRate(),health.higherTargetHeartRate(),health.getBodyMassIndex());

    JOptionPane.showMessageDialog(null , message );
  }

}
