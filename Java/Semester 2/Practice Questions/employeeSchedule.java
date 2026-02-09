public class employeeSchedule
{
   public String employeeName;
   public String shiftTime;
   public int hoursWorked;
   
   public employeeSchedule(String n, String s, int h)
   {
      this.employeeName = n;
      this.shiftTime = s;
      this.hoursWorked = h;
   }
   
   public void updateShiftTime(String newShift)
   {
      this.shiftTime = newShift;
   }
   
   public double calculateWeeklyPay(double hourlyRate)
   {
      double weeklyPay = hourlyRate * hoursWorked;
      return weeklyPay;
   }
   
  
}

class Main
{
public static void main(String[] args)
   {
        employeeSchedule Schedule = new employeeSchedule("Tim","8:00",32);
        Schedule.updateShiftTime("7:45");
        
        
        System.out.println("Name: " + Schedule.employeeName + "\n" + "Shift Time: " + Schedule.shiftTime + "\n" + "Hours Worked: " + Schedule.hoursWorked + "\n" + "Weekly Pay: R" + Schedule.calculateWeeklyPay(32.15));
   }
}        