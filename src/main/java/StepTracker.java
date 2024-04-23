import java.util.ArrayList;
public class StepTracker
{
 /* to be implemented here */
 private int min, sum, days;
 private  double aDays;
 public StepTracker(int num){
  min = num;
  sum = 0;
  days = 0;
  aDays = 0;
 }

 public void addDailySteps(int steps){
  sum += steps;
  days++;
  if(steps >= min){
    aDays++;
  }
 }

 public int activeDays(){
  return aDays;
 }

 public double averageSteps(){
  if(days == 0)
   return 0.0;
  return (double)sum/days;
 }
} 
