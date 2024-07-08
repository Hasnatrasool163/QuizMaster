package CodingQuestionsFrames;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MuhammadHasnatRasool
 */
public class Java_Coding_Questions_Frame extends Coding_Questions_Frame {

    @Override
    public void loadQuestions(JPanel panel) {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("Write a Program to print: Hello World", "public class HelloWorld { public static void main(String[] args) { System.out.println(\"Hello, World!\"); } }"));
        questions.add(new Question("Write a Program to print numbers from 1 to 10", "public class PrintNumbers { public static void main(String[] args) { for (int i = 1; i <= 10; i++) { System.out.println(i); } } }"));
        questions.add(new Question("Write a Program to find the area of a rectangle", "public class RectangleArea { public static void main(String[] args) { int length = 5; int width = 3; int area = length * width; System.out.println(\"Area: \" + area); } }"));
        questions.add(new Question("Write a Program to check if a number is even or odd", "public class EvenOdd { public static void main(String[] args) { int num = 7; if (num % 2 == 0) { System.out.println(\"Even\"); } else { System.out.println(\"Odd\"); } } }"));
        questions.add(new Question("Write a Program to find the maximum of two numbers", "public class MaxOfTwo { public static void main(String[] args) { int a = 5; int b = 3; int max = (a > b) ? a : b; System.out.println(\"Max: \" + max); } }"));
        questions.add(new Question("Write a Program to find the sum of an array", "public class SumArray { public static void main(String[] args) { int[] arr = {1, 2, 3, 4, 5}; int sum = 0; for (int i : arr) { sum += i; } System.out.println(\"Sum: \" + sum); } }"));
        questions.add(new Question("Write a Program to find the average of an array", "public class AverageArray { public static void main(String[] args) { int[] arr = {1, 2, 3, 4, 5}; int sum = 0; for (int i : arr) { sum += i; } double avg = (double) sum / arr.length; System.out.println(\"Average: \" + avg); } }"));
        questions.add(new Question("Write a Program to find the factorial of a number", "public class Factorial { public static void main(String[] args) { int num = 5; int fact = 1; for (int i = 1; i <= num; i++) { fact *= i; } System.out.println(\"Factorial: \" + fact); } }"));
        questions.add(new Question("Write a Program to check if a string is a palindrome", "public class Palindrome { public static void main(String[] args) { String str = \"madam\"; String rev = \"\"; for (int i = str.length() - 1; i >= 0; i--) { rev += str.charAt(i); } if (str.equals(rev)) { System.out.println(\"Palindrome\"); } else { System.out.println(\"Not a palindrome\"); } } }"));
        questions.add(new Question("Write a Program to find the maximum of three numbers", "public class MaxOfThree { public static void main(String[] args) { int a = 5; int b = 3; int c = 2; int max = (a > b) ? a : b; max = (max > c) ? max : c; System.out.println(\"Max: \" + max); } }"));
        questions.add(new Question("Write a Program to find the minimum of three numbers", "public class MinOfThree { public static void main(String[] args) { int a = 5; int b = 3; int c = 2; int min = (a < b) ? a : b; min = (min < c) ? min : c; System.out.println(\"Min: \" + min); } }"));
        questions.add(new Question("Write a Program to find the sum of digits of a number", "public class SumDigits { public static void main(String[] args) { int num = 123; int sum = 0; while (num > 0) { sum += num % 10; num /= 10; } System.out.println(\"Sum of digits: \" + sum); } }"));
        questions.add(new Question("Write a Program to find the reverse of a number", "public class ReverseNumber { public static void main(String[] args) { int num = 123; int rev = 0; while (num > 0) { rev = rev * 10 + num % 10; num /= 10; } System.out.println(\"Reverse: \" + rev); } }"));
        questions.add(new Question("Write a Program to check if a number is a prime number", "public class PrimeNumber { public static void main(String[] args) { int num = 7; boolean isPrime = true; for (int i = 2; i <= num / 2; i++) { if (num % i == 0) { isPrime = false; break; } } System.out.println(isPrime ? \"Prime\" : \"Not Prime\"); } }"));
        questions.add(new Question("Write a Program to find the LCM of two numbers", "public class LCM { public static void main(String[] args) { int a = 12; int b = 15; int lcm = (a > b) ? a : b; while (true) { if (lcm % a == 0 && lcm % b == 0) { System.out.println(\"LCM: \" + lcm); break; } ++lcm; } } }"));
        questions.add(new Question("Write a Program to find the GCD of two numbers", "public class GCD { public static void main(String[] args) { int a = 12; int b = 15; int gcd = 1; for (int i = 1; i <= a && i <= b; ++i) { if (a % i == 0 && b % i == 0) { gcd = i; } } System.out.println(\"GCD: \" + gcd); } }"));
        questions.add(new Question("Write a Program to check if a number is a perfect number", "public class PerfectNumber { public static void main(String[] args) { int num = 6; int sum = 0; for (int i = 1; i < num; ++i) { if (num % i == 0) { sum += i; } } System.out.println(sum == num ? \"Perfect\" : \"Not Perfect\"); } }"));
        questions.add(new Question("Write a Program to find the sum of all prime numbers up to N", "public class SumPrime { public static void main(String[] args) { int n = 20; int sum = 0; for (int i = 2; i <= n; ++i) { boolean isPrime = true; for (int j = 2; j <= i / 2; ++j) { if (i % j == 0) { isPrime = false; break; } } if (isPrime) { sum += i; } } System.out.println(\"Sum: \" + sum); } }"));
        questions.add(new Question("Write a Program to find the sum of all even numbers up to N", "public class SumEven { public static void main(String[] args) { int n = 20; int sum = 0; for (int i = 2; i <= n; i += 2) { sum += i; } System.out.println(\"Sum: \" + sum); } }"));
        questions.add(new Question("Write a Program to find the sum of all odd numbers up to N", "public class SumOdd { public static void main(String[] args) { int n = 20; int sum = 0; for (int i = 1; i <= n; i += 2) { sum += i; } System.out.println(\"Sum: \" + sum); } }"));
        questions.add(new Question("Write a Program to find the sum of all numbers in an array", "public class SumArray { public static void main(String[] args) { int[] arr = {1, 2, 3, 4, 5}; int sum = 0; for (int i : arr) { sum += i; } System.out.println(\"Sum: \" + sum); } }"));
        questions.add(new Question("Write a Program to find the average of all numbers in an array", "public class AverageArray { public static void main(String[] args) { int[] arr = {1, 2, 3, 4, 5}; int sum = 0; for (int i : arr) { sum += i; } double avg = (double) sum / arr.length; System.out.println(\"Average: \" + avg); } }"));
        questions.add(new Question("Write a Program to find the maximum element in an array", "public class MaxArray { public static void main(String[] args) { int[] arr = {1, 2, 3, 4, 5}; int max = arr[0]; for (int i = 1; i < arr.length; ++i) { if (arr[i] > max) { max = arr[i]; } } System.out.println(\"Max: \" + max); } }"));
        questions.add(new Question("Write a Program to find the minimum element in an array", "public class MinArray { public static void main(String[] args) { int[] arr = {5, 2, 8, 3, 1}; int min = arr[0]; for (int i = 1; i < arr.length; ++i) { if (arr[i] < min) { min = arr[i]; } } System.out.println(\"Min: \" + min); } }"));
        questions.add(new Question("Write a Program to find the second largest element in an array", "public class SecondLargest { public static void main(String[] args) { int[] arr = {5, 2, 8, 3, 1}; int max = Integer.MIN_VALUE; int secondMax = Integer.MIN_VALUE; for (int i : arr) { if (i > max) { secondMax = max; max = i; } else if (i > secondMax && i != max) { secondMax = i; } } System.out.println(\"Second Largest: \" + secondMax); } }"));
        questions.add(new Question("Write a Program to find the first duplicate in an array", "public class FirstDuplicate { public static void main(String[] args) { int[] arr = {2, 1, 3, 5, 3, 2}; int duplicate = -1; for (int i = 0; i < arr.length; ++i) { for (int j = i + 1; j < arr.length; ++j) { if (arr[i] == arr[j]) { duplicate = arr[i]; break; } } if (duplicate != -1) { break; } } System.out.println(\"First Duplicate: \" + duplicate); } }"));
        questions.add(new Question("Write a Program to find the first missing positive integer in an array", "public class FirstMissingPositive { public static void main(String[] args) { int[] arr = {3, 4, -1, 1}; int missing = 1; while (true) { boolean found = false; for (int i : arr) { if (i == missing) { found = true; break; } } if (!found) { System.out.println(\"First Missing Positive: \" + missing); break; } ++missing; } } }"));
        questions.add(new Question("Write a Program to find the maximum sum of a subarray", "public class MaxSubarraySum { public static void main(String[] args) { int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3}; int maxSum = Integer.MIN_VALUE; int currentSum = 0; for (int i : arr) { currentSum += i; if (currentSum > maxSum) { maxSum = currentSum; } if (currentSum < 0) { currentSum = 0; } } System.out.println(\"Max Subarray Sum: \" + maxSum); } }"));
        questions.add(new Question("Write a Program to find the minimum window that contains all elements of a given array", "public class MinWindow { public static void main(String[] args) { int[] arr = {4, 2, 2, 3, 1, 3, 2}; int[] window = new int[arr.length]; int minWindowSize = Integer.MAX_VALUE; int minWindowStart = 0; for (int i = 0; i < arr.length; ++i) { int count = 0; for (int j = i; j < arr.length; ++j) { if (arr[j] == arr[i]) { count++; } } window[i] = count; if (count > 0 && window[i] < minWindowSize) { minWindowSize = window[i]; minWindowStart = i; } } System.out.println(\"Min Window Size: \" + minWindowSize); System.out.println(\"Min Window Start: \" + minWindowStart); } }"));
        questions.add(new Question("Write a Program to find the maximum frequency of an element in an array", "public class MaxFrequency { public static void main(String[] args) { int[] arr = {2, 3, 2, 4, 5, 2, 3, 2}; int maxFrequency = 0; int maxFrequencyElement = -1; for (int i : arr) { int frequency = 0; for (int j : arr) { if (i == j) { frequency++; } } if (frequency > maxFrequency) { maxFrequency = frequency; maxFrequencyElement = i; } } System.out.println(\"Max Frequency: \" + maxFrequency); System.out.println(\"Max Frequency Element: \" + maxFrequencyElement); } }"));
        questions.add(new Question("Write a Program to find the maximum element in an array", "public class MaxArray { public static void main(String[] args) { int[] arr = {1, 2, 3, 4, 5}; int max = arr[0]; for (int i = 1; i < arr.length; ++i) { if (arr[i] > max) { max = arr[i]; } } System.out.println(\"Max: \" + max); } }"));
        questions.add(new Question("Write a Program to find the minimum element in an array", "public class MinArray { public static void main(String[] args) { int[] arr = {1, 2, 3, 4, 5}; int min = arr[0]; for (int i = 1; i < arr.length; ++i) { if (arr[i] < min) { min = arr[i]; } } System.out.println(\"Min: \" + min); } }"));
        questions.add(new Question("Write a Program to find the first duplicate element in an array", "public class FirstDuplicate { public static void main(String[] args) { int[] arr = {1, 2, 3, 4, 5, 2}; int duplicate = -1; for (int i = 0; i < arr.length; ++i) { for (int j = i + 1; j < arr.length; ++j) { if (arr[i] == arr[j]) { duplicate = arr[i]; break; } } if (duplicate != -1) { break; } } System.out.println(\"First Duplicate: \" + duplicate); } }"));
        questions.add(new Question("Write a Program to find the second largest element in an array", "public class SecondLargest { public static void main(String[] args) { int[] arr = {1, 2, 3, 4, 5}; int max = arr[0]; int secondMax = Integer.MIN_VALUE; for (int i = 1; i < arr.length; ++i) { if (arr[i] > max) { secondMax = max; max = arr[i]; } else if (arr[i] > secondMax && arr[i] != max) { secondMax = arr[i]; } } System.out.println(\"Second Largest: \" + secondMax); } }"));
        questions.add(new Question("Write a Program to find the number of occurrences of each element in an array", "public class Occurrences { public static void main(String[] args) { int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4}; int[] count = new int[5]; for (int i = 0; i < arr.length; ++i) { count[arr[i] - 1]++; } for (int i = 0; i < count.length; ++i) { System.out.println(\"Element \" + (i + 1) + \" occurs \" + count[i] + \" times\"); } } }"));
        questions.add(new Question("Write a Program to find the median of an array", "public class Median { public static void main(String[] args) { int[] arr = {1, 2, 3, 4, 5}; int n = arr.length; if (n % 2 == 0) { System.out.println(\"Median: \" + (arr[n / 2 - 1] + arr[n / 2]) / 2.0); } else { System.out.println(\"Median: \" + arr[n / 2]); } } }"));
        questions.add(new Question("Write a Program to find the mode of an array", "public class Mode { public static void main(String[] args) { int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4}; int maxCount = 0; int mode = arr[0]; for (int i = 0; i < arr.length; ++i) { int count = 0; for (int j = 0; j < arr.length; ++j) { if (arr[i] == arr[j]) { count++; } } if (count > maxCount) { maxCount = count; mode = arr[i]; } } System.out.println(\"Mode: \" + mode); } }"));
        questions.add(new Question("Write a Program to find the sum of all elements in a 2D array", "public class Sum2DArray { public static void main(String[] args) { int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; int sum = 0; for (int i = 0; i < arr.length; i++) { for (int j = 0; j < arr[i].length; j++) { sum += arr[i][j]; } } System.out.println(\"Sum: \" + sum); } }"));
        questions.add(new Question("Write a Program to find the maximum element in a 2D array", "public class Max2DArray { public static void main(String[] args) { int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; int max = arr[0][0]; for (int i = 0; i < arr.length; i++) { for (int j = 0; j < arr[i].length; j++) { if (arr[i][j] > max) { max = arr[i][j]; } } } System.out.println(\"Max: \" + max); } }"));
        questions.add(new Question("Write a Program to find the minimum element in a 2D array", "public class Min2DArray { public static void main(String[] args) { int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; int min = arr[0][0]; for (int i = 0; i < arr.length; i++) { for (int j = 0; j < arr[i].length; j++) { if (arr[i][j] < min) { min = arr[i][j]; } } } System.out.println(\"Min: \" + min); } }"));
        questions.add(new Question("Write a Program to find the average of all elements in a 2D array", "public class Average2DArray { public static void main(String[] args) { int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; int sum = 0; int count = 0; for (int i = 0; i < arr.length; i++) { for (int j = 0; j < arr[i].length; j++) { sum += arr[i][j]; count++; } } double average = (double) sum / count; System.out.println(\"Average: \" + average); } }"));
        questions.add(new Question("Write a Program to find the standard deviation of a 2D array", "public class StandardDeviation2DArray { public static void main(String[] args) { int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; int sum = 0; int count = 0; for (int i = 0; i < arr.length; i++) { for (int j = 0; j < arr[i].length; j++) { sum += arr[i][j]; count++; } } double mean = (double) sum / count; double sumSquare = 0; for (int i = 0; i < arr.length; i++) { for (int j = 0; j < arr[i].length; j++) { sumSquare += (arr[i][j] - mean) * (arr[i][j] - mean); } } double standardDeviation = Math.sqrt(sumSquare / count); System.out.println(\"Standard Deviation: \" + standardDeviation); } }"));
        for (Question question : questions) {
            panel.add(question.getPanel());
        }
    }

   
    private static JFrame createFrame() {
        JFrame frame = new JFrame("Practice Questions");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLocationByPlatform(true);
        return frame;
    }

    private static JComponent createUI() {
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setPreferredSize(new Dimension(900, 600));

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1));

        Java_Coding_Questions_Frame app = new Java_Coding_Questions_Frame();
        app.loadQuestions(panel);

        scrollPane.setViewportView(panel);
        return scrollPane;
    }
    
    public static void main(String[] args) {
        JFrame frame = createFrame();
        frame.add(createUI());
        frame.pack();
        frame.setVisible(true);
    }
}
