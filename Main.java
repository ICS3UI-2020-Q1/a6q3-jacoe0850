import java.util.Scanner;
/**
 *Asks user for 10 integers and finds the largest
 * @jacoe0850
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // make scanner for input
    Scanner input = new Scanner(System.in);
    // ask for 10 integers
    System.out.println("Please enter in 10 integers to put into the array");
    // make array variable with 10 numbers
    int[] nums = new int[10];
    // for loop so they can enter 10 nums
    for(int i = 0; i < nums.length; i++){
       nums[i] = input.nextInt();
  }
  // variable for the largest num
  int largeNum = nums[0];
  // for loop that finds the largest number in the array
  for(int i = 0; i < 10; i++){
    if(nums[i] > largeNum){
    largeNum = nums[i];
  }
   
}
// telling user the biggest number
System.out.println("The largest number is " + largeNum);
}
}