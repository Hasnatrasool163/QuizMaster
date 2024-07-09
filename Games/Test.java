
package Games;

/**
 *
 * @author Home
 */
public class Test {
    
   public static void main(String[]args){
 

int userSolvedQuestions = 100;
int totalQuestions = 10000;
int percentage = (int) Math.round((userSolvedQuestions * 100.0) / totalQuestions);
System.out.println(percentage);

   }
}
