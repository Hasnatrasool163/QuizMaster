package CodingQuestionsFrames;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author MuhammadHasnatRasool
 */
public class C_Coding_Questions_Frame extends Coding_Questions_Frame {

    @Override
    public void loadQuestions(JPanel panel) {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("Write a Program to find factorial of a number",
                "#include<stdio.h>\n\nint factorial(int n) {\n    if (n == 0)\n        return 1;\n    else\n        return n * factorial(n - 1);\n}\n\nint main() {\n    int number = 5;\n    int result = factorial(number);\n    printf(\"Factorial of %d is: %d\\n\", number, result);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to check if a number is prime or not",
                "#include<stdio.h>\n\nint isPrime(int n) {\n    if (n <= 1)\n        return 0;\n    for (int i = 2; i*i <= n; i++) {\n        if (n % i == 0)\n            return 0;\n    }\n    return 1;\n}\n\nint main() {\n    int number = 17;\n    if (isPrime(number))\n        printf(\"%d is a prime number\\n\", number);\n    else\n        printf(\"%d is not a prime number\\n\", number);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to reverse a string",
                "#include<stdio.h>\n#include<string.h>\n\nint main() {\n    char str[] = \"Hello, World!\";\n    int n = strlen(str);\n    for (int i = n - 1; i >= 0; i--) {\n        printf(\"%c\", str[i]);\n    }\n    printf(\"\\n\");\n    return 0;\n}"));

        questions.add(new Question("Write a Program to sort an array of integers using Bubble Sort",
                "#include<stdio.h>\n\nvoid bubbleSort(int arr[], int n) {\n    for (int i = 0; i < n - 1; i++) {\n        for (int j = 0; j < n - i - 1; j++) {\n            if (arr[j] > arr[j + 1]) {\n                int temp = arr[j];\n                arr[j] = arr[j + 1];\n                arr[j + 1] = temp;\n            }\n        }\n    }\n}\n\nint main() {\n    int arr[] = {64, 25, 12, 22, 11};\n    int n = sizeof(arr) / sizeof(arr[0]);\n    bubbleSort(arr, n);\n    printf(\"Sorted array: \\n\");\n    for (int i = 0; i < n; i++)\n        printf(\"%d \", arr[i]);\n    printf(\"\\n\");\n    return 0;\n}"));

        questions.add(new Question("Write a Program to implement Binary Search on a sorted array",
                "#include<stdio.h>\n\nint binarySearch(int arr[], int left, int right, int x) {\n    while (left <= right) {\n        int mid = left + (right - left) / 2;\n        if (arr[mid] == x)\n            return mid;\n        if (arr[mid] < x)\n            left = mid + 1;\n        else\n            right = mid - 1;\n    }\n    return -1;\n}\n\nint main() {\n    int arr[] = {2, 3, 4, 10, 40};\n    int n = sizeof(arr) / sizeof(arr[0]);\n    int x = 10;\n    int result = binarySearch(arr, 0, n - 1, x);\n    if (result == -1)\n        printf(\"Element not found\\n\");\n    else\n        printf(\"Element found at index %d\\n\", result);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to implement Insertion Sort on an array",
                "#include<stdio.h>\n\nvoid insertionSort(int arr[], int n) {\n    int i, key, j;\n    for (i = 1; i < n; i++) {\n        key = arr[i];\n        j = i - 1;\n        while (j >= 0 && arr[j] > key) {\n            arr[j + 1] = arr[j];\n            j = j - 1;\n        }\n        arr[j + 1] = key;\n    }\n}\n\nint main() {\n    int arr[] = {12, 11, 13, 5, 6};\n    int n = sizeof(arr) / sizeof(arr[0]);\n    insertionSort(arr, n);\n    printf(\"Sorted array: \\n\");\n    for (int i = 0; i < n; i++)\n        printf(\"%d \", arr[i]);\n    printf(\"\\n\");\n    return 0;\n}"));

        questions.add(new Question("Write a Program to implement Selection Sort on an array",
                "#include<stdio.h>\n\nvoid selectionSort(int arr[], int n) {\n    int i, j, min_idx;\n    for (i = 0; i < n-1; i++) {\n        min_idx = i;\n        for (j = i+1; j < n; j++)\n            if (arr[j] < arr[min_idx])\n                min_idx = j;\n        int temp = arr[min_idx];\n        arr[min_idx] = arr[i];\n        arr[i] = temp;\n    }\n}\n\nint main() {\n    int arr[] = {64, 25, 12, 22, 11};\n    int n = sizeof(arr) / sizeof(arr[0]);\n    selectionSort(arr, n);\n    printf(\"Sorted array: \\n\");\n    for (int i = 0; i < n; i++)\n        printf(\"%d \", arr[i]);\n    printf(\"\\n\");\n    return 0;\n}"));

        questions.add(new Question("Write a Program to implement Merge Sort on an array",
                "#include<stdio.h>\n\nvoid merge(int arr[], int l, int m, int r) {\n    int n1 = m - l + 1;\n    int n2 = r - m;\n    int L[n1], R[n2];\n    for (int i = 0; i < n1; i++)\n        L[i] = arr[l + i];\n    for (int j = 0; j < n2; j++)\n        R[j] = arr[m + 1 + j];\n    int i = 0, j = 0, k = l;\n    while (i < n1 && j < n2) {\n        if (L[i] <= R[j]) {\n            arr[k] = L[i];\n            i++;\n        } else {\n            arr[k] = R[j];\n            j++;\n        }\n        k++;\n    }\n    while (i < n1) {\n        arr[k] = L[i];\n        i++;\n        k++;\n    }\n    while (j < n2) {\n        arr[k] = R[j];\n        j++;\n        k++;\n    }\n}\n\nvoid mergeSort(int arr[], int l, int r) {\n    if (l < r) {\n        int m = l + (r - l) / 2;\n        mergeSort(arr, l, m);\n        mergeSort(arr, m + 1, r);\n        merge(arr, l, m, r);\n    }\n}\n\nint main() {\n    int arr[] = {12, 11, 13, 5, 6, 7};\n    int n = sizeof(arr) / sizeof(arr[0]);\n    mergeSort(arr, 0, n - 1);\n    printf(\"Sorted array: \\n\");\n    for (int i = 0; i < n; i++)\n        printf(\"%d \", arr[i]);\n    printf(\"\\n\");\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find GCD (Greatest Common Divisor) of two numbers",
                "#include<stdio.h>\n\nint gcd(int a, int b) {\n    if (b == 0)\n        return a;\n    return gcd(b, a % b);\n}\n\nint main() {\n    int num1 = 24, num2 = 18;\n    int result = gcd(num1, num2);\n    printf(\"GCD of %d and %d is: %d\\n\", num1, num2, result);\n    return 0;\n}"));
        questions.add(new Question("Write a Program to calculate the sum of natural numbers up to N",
                "#include<stdio.h>\n\nint main() {\n    int N = 10;\n    int sum = 0;\n    for (int i = 1; i <= N; i++) {\n        sum += i;\n    }\n    printf(\"Sum of natural numbers up to %d is: %d\\n\", N, sum);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to check if a string is palindrome or not",
                "#include<stdio.h>\n#include<string.h>\n\nint main() {\n    char str[] = \"madam\";\n    int len = strlen(str);\n    int isPalindrome = 1;\n    for (int i = 0; i < len / 2; i++) {\n        if (str[i] != str[len - i - 1]) {\n            isPalindrome = 0;\n            break;\n        }\n    }\n    if (isPalindrome)\n        printf(\"%s is a palindrome\\n\", str);\n    else\n        printf(\"%s is not a palindrome\\n\", str);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find Fibonacci series up to N terms",
                "#include<stdio.h>\n\nint main() {\n    int N = 10;\n    int a = 0, b = 1, next;\n    printf(\"Fibonacci series up to %d terms: \\n\", N);\n    for (int i = 1; i <= N; i++) {\n        printf(\"%d, \", a);\n        next = a + b;\n        a = b;\n        b = next;\n    }\n    printf(\"\\n\");\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find if a number is Armstrong number or not",
                "#include<stdio.h>\n#include<math.h>\n\nint isArmstrong(int n) {\n    int original = n;\n    int numDigits = 0;\n    while (original != 0) {\n        numDigits++;\n        original /= 10;\n    }\n    int sum = 0;\n    original = n;\n    while (original != 0) {\n        int digit = original % 10;\n        sum += pow(digit, numDigits);\n        original /= 10;\n    }\n    return sum == n;\n}\n\nint main() {\n    int number = 153;\n    if (isArmstrong(number))\n        printf(\"%d is an Armstrong number\\n\", number);\n    else\n        printf(\"%d is not an Armstrong number\\n\", number);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to calculate the power of a number using recursion",
                "#include<stdio.h>\n\nint power(int base, int exp) {\n    if (exp == 0)\n        return 1;\n    else\n        return base * power(base, exp - 1);\n}\n\nint main() {\n    int base = 2, exponent = 3;\n    int result = power(base, exponent);\n    printf(\"%d raised to the power %d is: %d\\n\", base, exponent, result);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find factorial of a number using recursion",
                "#include<stdio.h>\n\nint factorial(int n) {\n    if (n == 0)\n        return 1;\n    else\n        return n * factorial(n - 1);\n}\n\nint main() {\n    int number = 5;\n    int result = factorial(number);\n    printf(\"Factorial of %d is: %d\\n\", number, result);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find LCM (Least Common Multiple) of two numbers",
                "#include<stdio.h>\n\nint gcd(int a, int b) {\n    if (b == 0)\n        return a;\n    return gcd(b, a % b);\n}\n\nint lcm(int a, int b) {\n    return (a * b) / gcd(a, b);\n}\n\nint main() {\n    int num1 = 12, num2 = 18;\n    int result = lcm(num1, num2);\n    printf(\"LCM of %d and %d is: %d\\n\", num1, num2, result);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to check if a year is leap year or not",
                "#include<stdio.h>\n\nint isLeapYear(int year) {\n    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))\n        return 1;\n    else\n        return 0;\n}\n\nint main() {\n    int year = 2024;\n    if (isLeapYear(year))\n        printf(\"%d is a leap year\\n\", year);\n    else\n        printf(\"%d is not a leap year\\n\", year);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to convert temperature from Celsius to Fahrenheit",
                "#include<stdio.h>\n\nint main() {\n    float celsius = 37.5;\n    float fahrenheit = (celsius * 9 / 5) + 32;\n    printf(\"Temperature in Fahrenheit: %.2f\\n\", fahrenheit);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to convert temperature from Fahrenheit to Celsius",
                "#include<stdio.h>\n\nint main() {\n    float fahrenheit = 98.6;\n    float celsius = (fahrenheit - 32) * 5 / 9;\n    printf(\"Temperature in Celsius: %.2f\\n\", celsius);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find the sum of digits of a number",
                "#include<stdio.h>\n\nint sumOfDigits(int n) {\n    int sum = 0;\n    while (n != 0) {\n        sum += n % 10;\n        n /= 10;\n    }\n    return sum;\n}\n\nint main() {\n    int number = 12345;\n    int result = sumOfDigits(number);\n    printf(\"Sum of digits of %d is: %d\\n\", number, result);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find if a number is perfect or not",
                "#include<stdio.h>\n\nint isPerfect(int n) {\n    int sum = 0;\n    for (int i = 1; i < n; i++) {\n        if (n % i == 0)\n            sum += i;\n    }\n    return sum == n;\n}\n\nint main() {\n    int number = 28;\n    if (isPerfect(number))\n        printf(\"%d is a perfect number\\n\", number);\n    else\n        printf(\"%d is not a perfect number\\n\", number);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to convert a decimal number to binary",
                "#include<stdio.h>\n\nvoid decimalToBinary(int n) {\n    int binary[32];\n    int i = 0;\n    while (n > 0) {\n        binary[i] = n % 2;\n        n /= 2;\n        i++;\n    }\n    printf(\"Binary representation: \");\n    for (int j = i - 1; j >= 0; j--) {\n        printf(\"%d\", binary[j]);\n    }\n    printf(\"\\n\");\n}\n\nint main() {\n    int decimal = 25;\n    decimalToBinary(decimal);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find the reverse of a number",
                "#include<stdio.h>\n\nint reverseNumber(int n) {\n    int reversed = 0;\n    while (n != 0) {\n        reversed = reversed * 10 + n % 10;\n        n /= 10;\n    }\n    return reversed;\n}\n\nint main() {\n    int number = 12345;\n    int reversed = reverseNumber(number);\n    printf(\"Reverse of %d is: %d\\n\", number, reversed);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find if a number is a strong number or not",
                "#include<stdio.h>\n\nint factorial(int n) {\n    if (n == 0 || n == 1)\n        return 1;\n    else\n        return n * factorial(n - 1);\n}\n\nint isStrong(int n) {\n    int original = n;\n    int sum = 0;\n    while (n != 0) {\n        int digit = n % 10;\n        sum += factorial(digit);\n        n /= 10;\n    }\n    return sum == original;\n}\n\nint main() {\n    int number = 145;\n    if (isStrong(number))\n        printf(\"%d is a strong number\\n\", number);\n    else\n        printf(\"%d is not a strong number\\n\", number);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find the sum of even and odd numbers up to N",
                "#include<stdio.h>\n\nint main() {\n    int N = 10;\n    int sumEven = 0, sumOdd = 0;\n    for (int i = 1; i <= N; i++) {\n        if (i % 2 == 0)\n            sumEven += i;\n        else\n            sumOdd += i;\n    }\n    printf(\"Sum of even numbers up to %d is: %d\\n\", N, sumEven);\n    printf(\"Sum of odd numbers up to %d is: %d\\n\", N, sumOdd);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find if a number is a Harshad number or not",
                "#include<stdio.h>\n\nint isHarshad(int n) {\n    int sumDigits = 0;\n    int original = n;\n    while (n != 0) {\n        sumDigits += n % 10;\n        n /= 10;\n    }\n    return (original % sumDigits == 0);\n}\n\nint main() {\n    int number = 18;\n    if (isHarshad(number))\n        printf(\"%d is a Harshad number\\n\", number);\n    else\n        printf(\"%d is not a Harshad number\\n\", number);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to check if two strings are anagrams of each other",
                "#include<stdio.h>\n#include<string.h>\n\nint areAnagrams(char str1[], char str2[]) {\n    int len1 = strlen(str1);\n    int len2 = strlen(str2);\n    if (len1 != len2)\n        return 0;\n    int freq[256] = {0};\n    for (int i = 0; i < len1; i++) {\n        freq[str1[i]]++;\n        freq[str2[i]]--;\n    }\n    for (int i = 0; i < 256; i++) {\n        if (freq[i] != 0)\n            return 0;\n    }\n    return 1;\n}\n\nint main() {\n    char str1[] = \"listen\";\n    char str2[] = \"silent\";\n    if (areAnagrams(str1, str2))\n        printf(\"%s and %s are anagrams\\n\", str1, str2);\n    else\n        printf(\"%s and %s are not anagrams\\n\", str1, str2);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find if a number is a Krishnamurthy number or not",
                "#include<stdio.h>\n\nint factorial(int n) {\n    if (n == 0 || n == 1)\n        return 1;\n    else\n        return n * factorial(n - 1);\n}\n\nint isKrishnamurthy(int n) {\n    int original = n;\n    int sum = 0;\n    while (n != 0) {\n        int digit = n % 10;\n        sum += factorial(digit);\n        n /= 10;\n    }\n    return sum == original;\n}\n\nint main() {\n    int number = 145;\n    if (isKrishnamurthy(number))\n        printf(\"%d is a Krishnamurthy number\\n\", number);\n    else\n        printf(\"%d is not a Krishnamurthy number\\n\", number);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find the sum of series: 1 + 1/2 + 1/3 + ... + 1/N",
                "#include<stdio.h>\n\nint main() {\n    int N = 5;\n    float sum = 0.0;\n    for (int i = 1; i <= N; i++) {\n        sum += 1.0 / i;\n    }\n    printf(\"Sum of series 1 + 1/2 + ... + 1/%d is: %.2f\\n\", N, sum);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find the sum of first N even and odd numbers",
                "#include<stdio.h>\n\nint main() {\n    int N = 5;\n    int sumEven = 0, sumOdd = 0;\n    for (int i = 1, even = 2, odd = 1; i <= N; i++, even += 2, odd += 2) {\n        sumEven += even;\n        sumOdd += odd;\n    }\n    printf(\"Sum of first %d even numbers is: %d\\n\", N, sumEven);\n    printf(\"Sum of first %d odd numbers is: %d\\n\", N, sumOdd);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find if a number is a vampire number or not",
                "#include<stdio.h>\n#include<string.h>\n\nint isVampire(int num) {\n    char str[10];\n    sprintf(str, \"%d\", num);\n    int len = strlen(str);\n    if (len % 2 != 0)\n        return 0;\n    for (int i = 10; i < 100; i++) {\n        if (num % i == 0) {\n            int product = i * (num / i);\n            char productStr[10];\n            sprintf(productStr, \"%d%d\", i, num / i);\n            if (strcmp(str, productStr) == 0)\n                return 1;\n        }\n    }\n    return 0;\n}\n\nint main() {\n    int number = 1260;\n    if (isVampire(number))\n        printf(\"%d is a vampire number\\n\", number);\n    else\n        printf(\"%d is not a vampire number\\n\", number);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find if a number is a Pronic number or not",
                "#include<stdio.h>\n\nint isPronic(int n) {\n    int flag = 0;\n    for (int i = 0; i <= n; i++) {\n        if (i * (i + 1) == n) {\n            flag = 1;\n            break;\n        }\n    }\n    return flag;\n}\n\nint main() {\n    int number = 6;\n    if (isPronic(number))\n        printf(\"%d is a Pronic number\\n\", number);\n    else\n        printf(\"%d is not a Pronic number\\n\", number);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to generate Pascal's triangle up to N rows",
                "#include<stdio.h>\n\nint binomialCoefficient(int n, int k) {\n    if (k == 0 || k == n)\n        return 1;\n    else\n        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);\n}\n\nint main() {\n    int N = 5;\n    for (int i = 0; i < N; i++) {\n        for (int j = 0; j <= i; j++) {\n            printf(\"%d \", binomialCoefficient(i, j));\n        }\n        printf(\"\\n\");\n    }\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find the sum of first N natural numbers using recursion",
                "#include<stdio.h>\n\nint sum(int n) {\n    if (n == 0)\n        return 0;\n    else\n        return n + sum(n - 1);\n}\n\nint main() {\n    int N = 10;\n    int result = sum(N);\n    printf(\"Sum of first %d natural numbers is: %d\\n\", N, result);\n    return 0;\n}"));
        questions.add(new Question("Write a Program to find GCD (Greatest Common Divisor) of two numbers",
                "#include<stdio.h>\n\nint gcd(int a, int b) {\n    if (b == 0)\n        return a;\n    return gcd(b, a % b);\n}\n\nint main() {\n    int num1 = 24, num2 = 36;\n    int result = gcd(num1, num2);\n    printf(\"GCD of %d and %d is: %d\\n\", num1, num2, result);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find if a number is a Smith number or not",
                "#include<stdio.h>\n\nint sumOfDigits(int n) {\n    int sum = 0;\n    while (n > 0) {\n        sum += n % 10;\n        n /= 10;\n    }\n    return sum;\n}\n\nint sumOfPrimeFactors(int n) {\n    int sum = 0;\n    int i = 2;\n    while (n > 1) {\n        if (n % i == 0) {\n            sum += sumOfDigits(i);\n            n /= i;\n        }\n        else\n            i++;\n    }\n    return sum;\n}\n\nint isSmith(int n) {\n    int sumDigits = sumOfDigits(n);\n    int sumPrimeFactors = sumOfPrimeFactors(n);\n    return sumDigits == sumPrimeFactors;\n}\n\nint main() {\n    int number = 378;\n    if (isSmith(number))\n        printf(\"%d is a Smith number\\n\", number);\n    else\n        printf(\"%d is not a Smith number\\n\", number);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find if a number is a Duck number or not",
                "#include<stdio.h>\n#include<string.h>\n\nint isDuck(int n) {\n    char str[20];\n    sprintf(str, \"%d\", n);\n    int len = strlen(str);\n    for (int i = 1; i < len; i++) {\n        if (str[i] == '0')\n            return 1;\n    }\n    return 0;\n}\n\nint main() {\n    int number = 3206;\n    if (isDuck(number))\n        printf(\"%d is a Duck number\\n\", number);\n    else\n        printf(\"%d is not a Duck number\\n\", number);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find if a number is a Happy number or not",
                "#include<stdio.h>\n\nint sumOfSquaresOfDigits(int n) {\n    int sum = 0;\n    while (n > 0) {\n        int digit = n % 10;\n        sum += digit * digit;\n        n /= 10;\n    }\n    return sum;\n}\n\nint isHappy(int n) {\n    while (n != 1 && n != 4) {\n        n = sumOfSquaresOfDigits(n);\n    }\n    return n == 1;\n}\n\nint main() {\n    int number = 19;\n    if (isHappy(number))\n        printf(\"%d is a Happy number\\n\", number);\n    else\n        printf(\"%d is not a Happy number\\n\", number);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find if a number is a Disarium number or not",
                "#include<stdio.h>\n#include<math.h>\n\nint countDigits(int n) {\n    int count = 0;\n    while (n != 0) {\n        count++;\n        n /= 10;\n    }\n    return count;\n}\n\nint isDisarium(int n) {\n    int sum = 0;\n    int original = n;\n    int len = countDigits(n);\n    while (n != 0) {\n        int digit = n % 10;\n        sum += pow(digit, len);\n        len--;\n        n /= 10;\n    }\n    return sum == original;\n}\n\nint main() {\n    int number = 135;\n    if (isDisarium(number))\n        printf(\"%d is a Disarium number\\n\", number);\n    else\n        printf(\"%d is not a Disarium number\\n\", number);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find if a number is a Neon number or not",
                "#include<stdio.h>\n\nint isNeon(int n) {\n    int square = n * n;\n    int sumDigits = 0;\n    while (square != 0) {\n        sumDigits += square % 10;\n        square /= 10;\n    }\n    return sumDigits == n;\n}\n\nint main() {\n    int number = 9;\n    if (isNeon(number))\n        printf(\"%d is a Neon number\\n\", number);\n    else\n        printf(\"%d is not a Neon number\\n\", number);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find if a number is a Niven (Harshad) number or not",
                "#include<stdio.h>\n\nint isNiven(int n) {\n    int sumDigits = 0;\n    int original = n;\n    while (n != 0) {\n        sumDigits += n % 10;\n        n /= 10;\n    }\n    return (original % sumDigits == 0);\n}\n\nint main() {\n    int number = 18;\n    if (isNiven(number))\n        printf(\"%d is a Niven number\\n\", number);\n    else\n        printf(\"%d is not a Niven number\\n\", number);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find if a number is a Spy number or not",
                "#include<stdio.h>\n\nint sumOfDigits(int n) {\n    int sum = 0;\n    while (n != 0) {\n        sum += n % 10;\n        n /= 10;\n    }\n    return sum;\n}\n\nint productOfDigits(int n) {\n    int product = 1;\n    while (n != 0) {\n        product *= n % 10;\n        n /= 10;\n    }\n    return product;\n}\n\nint isSpy(int n) {\n    int sumDigits = sumOfDigits(n);\n    int productDigits = productOfDigits(n);\n    return sumDigits == productDigits;\n}\n\nint main() {\n    int number = 1124;\n    if (isSpy(number))\n        printf(\"%d is a Spy number\\n\", number);\n    else\n        printf(\"%d is not a Spy number\\n\", number);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find if a number is a Palindromic prime or not",
                "#include<stdio.h>\n#include<string.h>\n#include<math.h>\n\nint isPrime(int n) {\n    if (n <= 1)\n        return 0;\n    if (n <= 3)\n        return 1;\n    if (n % 2 == 0 || n % 3 == 0)\n        return 0;\n    for (int i = 5; i * i <= n; i += 6) {\n        if (n % i == 0 || n % (i + 2) == 0)\n            return 0;\n    }\n    return 1;\n}\n\nint isPalindromic(int n) {\n    char str[20];\n    sprintf(str, \"%d\", n);\n    int len = strlen(str);\n    for (int i = 0; i < len / 2; i++) {\n        if (str[i] != str[len - i - 1])\n            return 0;\n    }\n    return 1;\n}\n\nint isPalindromicPrime(int n) {\n    return isPrime(n) && isPalindromic(n);\n}\n\nint main() {\n    int number = 131;\n    if (isPalindromicPrime(number))\n        printf(\"%d is a Palindromic prime\\n\", number);\n    else\n        printf(\"%d is not a Palindromic prime\\n\", number);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to print all prime numbers between 1 to N using Sieve of Eratosthenes",
                "#include<stdio.h>\n#include<stdbool.h>\n\nvoid sieveOfEratosthenes(int n) {\n    bool prime[n + 1];\n    memset(prime, true, sizeof(prime));\n    for (int p = 2; p * p <= n; p++) {\n        if (prime[p] == true) {\n            for (int i = p * p; i <= n; i += p)\n                prime[i] = false;\n        }\n    }\n    printf(\"Prime numbers between 1 and %d are:\\n\", n);\n    for (int p = 2; p <= n; p++) {\n        if (prime[p])\n            printf(\"%d\\n\", p);\n    }\n}\n\nint main() {\n    int N = 30;\n    sieveOfEratosthenes(N);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to convert a decimal number to binary without using arrays",
                "#include<stdio.h>\n\nvoid decimalToBinary(int n) {\n    int binary = 0;\n    int place = 1;\n    while (n > 0) {\n        binary += (n % 2) * place;\n        n /= 2;\n        place *= 10;\n    }\n    printf(\"Binary equivalent is: %d\\n\", binary);\n}\n\nint main() {\n    int decimal = 25;\n    decimalToBinary(decimal);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find the sum of digits of a number until a single digit is obtained",
                "#include<stdio.h>\n\nint sumOfDigits(int n) {\n    int sum = 0;\n    while (n > 0 || sum > 9) {\n        if (n == 0) {\n            n = sum;\n            sum = 0;\n        }\n        sum += n % 10;\n        n /= 10;\n    }\n    return sum;\n}\n\nint main() {\n    int number = 9875;\n    int result = sumOfDigits(number);\n    printf(\"Single digit sum of digits of %d is: %d\\n\", number, result);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to check if a number is a Kaprekar number or not",
                "#include<stdio.h>\n#include<math.h>\n\nint isKaprekar(int n) {\n    if (n == 1)\n        return 1;\n    int square = n * n;\n    int countDigits = 0;\n    int temp = square;\n    while (temp != 0) {\n        countDigits++;\n        temp /= 10;\n    }\n    for (int i = 1; i < countDigits; i++) {\n        int part = pow(10, i);\n        if (part == n)\n            continue;\n        int sum = square / part + square % part;\n        if (sum == n)\n            return 1;\n    }\n    return 0;\n}\n\nint main() {\n    int number = 297;\n    if (isKaprekar(number))\n        printf(\"%d is a Kaprekar number\\n\", number);\n    else\n        printf(\"%d is not a Kaprekar number\\n\", number);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find if a number is a Perfect number or not",
                "#include<stdio.h>\n\nint isPerfect(int n) {\n    int sum = 0;\n    for (int i = 1; i <= n / 2; i++) {\n        if (n % i == 0)\n            sum += i;\n    }\n    return sum == n;\n}\n\nint main() {\n    int number = 28;\n    if (isPerfect(number))\n        printf(\"%d is a Perfect number\\n\", number);\n    else\n        printf(\"%d is not a Perfect number\\n\", number);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find if a number is a Harshad or Niven number",
                "#include<stdio.h>\n\nint isHarshadNiven(int n) {\n    int sumDigits = 0;\n    int original = n;\n    while (n != 0) {\n        sumDigits += n % 10;\n        n /= 10;\n    }\n    return (original % sumDigits == 0);\n}\n\nint main() {\n    int number = 18;\n    if (isHarshadNiven(number))\n        printf(\"%d is a Harshad (Niven) number\\n\", number);\n    else\n        printf(\"%d is not a Harshad (Niven) number\\n\", number);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find if a number is a Harshad or Niven number with 3 digits",
                "#include<stdio.h>\n\nint isHarshadNivenThreeDigit(int n) {\n    if (n < 100 || n > 999)\n        return 0;\n    int sumDigits = 0;\n    int original = n;\n    while (n != 0) {\n        sumDigits += n % 10;\n        n /= 10;\n    }\n    return (original % sumDigits == 0);\n}\n\nint main() {\n    int number = 189;\n    if (isHarshadNivenThreeDigit(number))\n        printf(\"%d is a Harshad (Niven) number with 3 digits\\n\", number);\n    else\n        printf(\"%d is not a Harshad (Niven) number with 3 digits\\n\", number);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find if a number is a Keith number or not",
                "#include<stdio.h>\n#include<string.h>\n\nint isKeith(int n) {\n    char str[20];\n    sprintf(str, \"%d\", n);\n    int len = strlen(str);\n    int terms[len];\n    for (int i = 0; i < len; i++) {\n        terms[i] = str[i] - '0';\n    }\n    int sum = 0;\n    while (sum < n) {\n        sum = 0;\n        for (int i = 0; i < len; i++) {\n            sum += terms[i];\n            if (i < len - 1)\n                terms[i] = terms[i + 1];\n            else\n                terms[i] = sum;\n        }\n    }\n    return sum == n;\n}\n\nint main() {\n    int number = 19;\n    if (isKeith(number))\n        printf(\"%d is a Keith number\\n\", number);\n    else\n        printf(\"%d is not a Keith number\\n\", number);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find if a number is a Lucas number or not",
                "#include<stdio.h>\n#include<math.h>\n\nint isPerfectSquare(int n) {\n    int s = sqrt(n);\n    return s * s == n;\n}\n\nint isLucas(int n) {\n    return isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4);\n}\n\nint main() {\n    int number = 4;\n    if (isLucas(number))\n        printf(\"%d is a Lucas number\\n\", number);\n    else\n        printf(\"%d is not a Lucas number\\n\", number);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find if a number is a Ramanujan number or not",
                "#include<stdio.h>\n\nint isRamanujan(int n) {\n    for (int i = 1; i * i * i < n; i++) {\n        for (int j = i + 1; j * j * j < n; j++) {\n            int sum = i * i * i + j * j * j;\n            if (sum == n)\n                return 1;\n        }\n    }\n    return 0;\n}\n\nint main() {\n    int number = 1729;\n    if (isRamanujan(number))\n        printf(\"%d is a Ramanujan number\\n\", number);\n    else\n        printf(\"%d is not a Ramanujan number\\n\", number);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find if a number is a Harshad or Niven number with a twist",
                "#include<stdio.h>\n\nint isHarshadNivenTwist(int n) {\n    int sumDigits = 0;\n    int original = n;\n    while (n != 0) {\n        sumDigits += n % 10;\n        n /= 10;\n    }\n    return (original % sumDigits == 0) && (original % (original % 10) == 0);\n}\n\nint main() {\n    int number = 18;\n    if (isHarshadNivenTwist(number))\n        printf(\"%d is a Harshad (Niven) number with a twist\\n\", number);\n    else\n        printf(\"%d is not a Harshad (Niven) number with a twist\\n\", number);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find if a number is a magic number or not",
                "#include<stdio.h>\n\nint isMagic(int n) {\n    while (n > 9) {\n        int sum = 0;\n        while (n != 0) {\n            sum += n % 10;\n            n /= 10;\n        }\n        n = sum;\n    }\n    return n == 1;\n}\n\nint main() {\n    int number = 19;\n    if (isMagic(number))\n        printf(\"%d is a Magic number\\n\", number);\n    else\n        printf(\"%d is not a Magic number\\n\", number);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find if a number is a Vampire number or not",
                "#include<stdio.h>\n#include<math.h>\n\nint countDigits(int n) {\n    int count = 0;\n    while (n != 0) {\n        count++;\n        n /= 10;\n    }\n    return count;\n}\n\nint isVampire(int n) {\n    int len = countDigits(n);\n    int original = n;\n    int fangs[2];\n    int index = 0;\n    for (int i = 2; i <= sqrt(n); i++) {\n        if (n % i == 0) {\n            fangs[index++] = i;\n            if (index == 2)\n                break;\n        }\n    }\n    if (index != 2)\n        return 0;\n    int product = fangs[0] * fangs[1];\n    if (countDigits(product) != len)\n        return 0;\n    int fangDigits[4];\n    sprintf(fangDigits, \"%d%d\", fangs[0], fangs[1]);\n    char combined[10];\n    sprintf(combined, \"%d\", original);\n    for (int i = 0; i < 4; i++) {\n        char* occurrence = strchr(combined, fangDigits[i]);\n        if (occurrence == NULL)\n            return 0;\n        else\n            *occurrence = '0';\n    }\n    return 1;\n}\n\nint main() {\n    int number = 1260;\n    if (isVampire(number))\n        printf(\"%d is a Vampire number\\n\", number);\n    else\n        printf(\"%d is not a Vampire number\\n\", number);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find if a number is a Squarefree number or not",
                "#include<stdio.h>\n\nint isSquarefree(int n) {\n    for (int i = 2; i * i <= n; i++) {\n        if (n % (i * i) == 0)\n            return 0;\n    }\n    return 1;\n}\n\nint main() {\n    int number = 42;\n    if (isSquarefree(number))\n        printf(\"%d is a Squarefree number\\n\", number);\n    else\n        printf(\"%d is not a Squarefree number\\n\", number);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to check if a number is a harshad number or not",
                "#include<stdio.h>\n\nint isHarshad(int n) {\n    int sumDigits = 0;\n    int original = n;\n    while (n != 0) {\n        sumDigits += n % 10;\n        n /= 10;\n    }\n    return (original % sumDigits == 0);\n}\n\nint main() {\n    int number = 18;\n    if (isHarshad(number))\n        printf(\"%d is a Harshad number\\n\", number);\n    else\n        printf(\"%d is not a Harshad number\\n\", number);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find if a number is a Keith number or not",
                "#include<stdio.h>\n\nint isKeith(int n) {\n    int original = n;\n    int digits[20];\n    int numDigits = 0;\n    while (n > 0) {\n        digits[numDigits++] = n % 10;\n        n /= 10;\n    }\n    int sum = 0;\n    int nextTerm = 0;\n    for (int i = numDigits - 1; i >= 0; i--) {\n        sum += digits[i];\n    }\n    while (nextTerm < original) {\n        nextTerm = 0;\n        for (int i = 1; i <= numDigits; i++) {\n            nextTerm += digits[(numDigits + numDigits - i) % numDigits];\n            digits[(numDigits + numDigits - i) % numDigits] = nextTerm - digits[(numDigits + numDigits - i) % numDigits];\n        }\n        if (nextTerm == original)\n            return 1;\n    }\n    return 0;\n}\n\nint main() {\n    int number = 19;\n    if (isKeith(number))\n        printf(\"%d is a Keith number\\n\", number);\n    else\n        printf(\"%d is not a Keith number\\n\", number);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find if a number is a prime number or not",
                "#include<stdio.h>\n\nint isPrime(int n) {\n    if (n <= 1)\n        return 0;\n    if (n <= 3)\n        return 1;\n    if (n % 2 == 0 || n % 3 == 0)\n        return 0;\n    for (int i = 5; i * i <= n; i += 6) {\n        if (n % i == 0 || n % (i + 2) == 0)\n            return 0;\n    }\n    return 1;\n}\n\nint main() {\n    int number = 23;\n    if (isPrime(number))\n        printf(\"%d is a prime number\\n\", number);\n    else\n        printf(\"%d is not a prime number\\n\", number);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find if a number is a balanced number or not",
                "#include<stdio.h>\n#include<math.h>\n\nint isBalanced(int n) {\n    int numDigits = log10(n) + 1;\n    int firstHalf = 0, secondHalf = 0;\n    for (int i = 0; i < numDigits / 2; i++) {\n        int digit = n % 10;\n        firstHalf += digit;\n        n /= 10;\n    }\n    if (numDigits % 2 != 0)\n        n /= 10;\n    for (int i = 0; i < numDigits / 2; i++) {\n        int digit = n % 10;\n        secondHalf += digit;\n        n /= 10;\n    }\n    return firstHalf == secondHalf;\n}\n\nint main() {\n    int number = 1234006;\n    if (isBalanced(number))\n        printf(\"%d is a balanced number\\n\", number);\n    else\n        printf(\"%d is not a balanced number\\n\", number);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find if a number is a power of 3 or not",
                "#include<stdio.h>\n\nint isPowerOfThree(int n) {\n    if (n <= 0)\n        return 0;\n    while (n % 3 == 0)\n        n /= 3;\n    return n == 1;\n}\n\nint main() {\n    int number = 27;\n    if (isPowerOfThree(number))\n        printf(\"%d is a power of 3\\n\", number);\n    else\n        printf(\"%d is not a power of 3\\n\", number);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find if a number is a jacobsthal number or not",
                "#include<stdio.h>\n\nint isJacobsthal(int n) {\n    if (n == 0)\n        return 0;\n    if (n == 1)\n        return 1;\n    int a = 0, b = 1, c;\n    for (int i = 2; i <= n; i++) {\n        c = b;\n        b = b + 2 * a;\n        a = c;\n    }\n    return b == n;\n}\n\nint main() {\n    int number = 11;\n    if (isJacobsthal(number))\n        printf(\"%d is a Jacobsthal number\\n\", number);\n    else\n        printf(\"%d is not a Jacobsthal number\\n\", number);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find if a number is a Triangular number or not",
                "#include<stdio.h>\n#include<math.h>\n\nint isTriangular(int n) {\n    if (n < 0)\n        return 0;\n    int temp = sqrt(2 * n);\n    return temp * (temp + 1) == 2 * n;\n}\n\nint main() {\n    int number = 15;\n    if (isTriangular(number))\n        printf(\"%d is a Triangular number\\n\", number);\n    else\n        printf(\"%d is not a Triangular number\\n\", number);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find if a number is a Fibonacci number or not",
                "#include<stdio.h>\n#include<math.h>\n\nint isPerfectSquare(int n) {\n    int s = sqrt(n);\n    return s * s == n;\n}\n\nint isFibonacci(int n) {\n    return isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4);\n}\n\nint main() {\n    int number = 5;\n    if (isFibonacci(number))\n        printf(\"%d is a Fibonacci number\\n\", number);\n    else\n        printf(\"%d is not a Fibonacci number\\n\", number);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find if a number is a Spy number or not",
                "#include<stdio.h>\n\nint isSpy(int n) {\n    int sumDigits = 0, productDigits = 1, lastDigit;\n    while (n != 0) {\n        lastDigit = n % 10;\n        sumDigits += lastDigit;\n        productDigits *= lastDigit;\n        n /= 10;\n    }\n    return sumDigits == productDigits;\n}\n\nint main() {\n    int number = 123;\n    if (isSpy(number))\n        printf(\"%d is a Spy number\\n\", number);\n    else\n        printf(\"%d is not a Spy number\\n\", number);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find if a number is a Abundant number or not",
                "#include<stdio.h>\n\nint isAbundant(int n) {\n    int sum = 0;\n    for (int i = 1; i <= n / 2; i++) {\n        if (n % i == 0)\n            sum += i;\n    }\n    return sum > n;\n}\n\nint main() {\n    int number = 18;\n    if (isAbundant(number))\n        printf(\"%d is an Abundant number\\n\", number);\n    else\n        printf(\"%d is not an Abundant number\\n\", number);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find if a number is a Niven number or not",
                "#include<stdio.h>\n\nint isNiven(int n) {\n    int sumDigits = 0;\n    int original = n;\n    while (n != 0) {\n        sumDigits += n % 10;\n        n /= 10;\n    }\n    return (original % sumDigits == 0);\n}\n\nint main() {\n    int number = 18;\n    if (isNiven(number))\n        printf(\"%d is a Niven number\\n\", number);\n    else\n        printf(\"%d is not a Niven number\\n\", number);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to find if a number is a palindrome or not",
                "#include<stdio.h>\n\nint isPalindrome(int n) {\n    int reverse = 0, original = n;\n    while (n > 0) {\n        reverse = reverse * 10 + n % 10;\n        n /= 10;\n    }\n    return reverse == original;\n}\n\nint main() {\n    int number = 12321;\n    if (isPalindrome(number))\n        printf(\"%d is a palindrome number\\n\", number);\n    else\n        printf(\"%d is not a palindrome number\\n\", number);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to check if a number is a sum of two prime numbers",
                "#include<stdio.h>\n\nint isPrime(int n) {\n    if (n <= 1)\n        return 0;\n    if (n <= 3)\n        return 1;\n    if (n % 2 == 0 || n % 3 == 0)\n        return 0;\n    for (int i = 5; i * i <= n; i += 6) {\n        if (n % i == 0 || n % (i + 2) == 0)\n            return 0;\n    }\n    return 1;\n}\n\nint isSumOfTwoPrimes(int n) {\n    for (int i = 2; i <= n / 2; i++) {\n        if (isPrime(i) && isPrime(n - i))\n            return 1;\n    }\n    return 0;\n}\n\nint main() {\n    int number = 34;\n    if (isSumOfTwoPrimes(number))\n        printf(\"%d is a sum of two prime numbers\\n\", number);\n    else\n        printf(\"%d is not a sum of two prime numbers\\n\", number);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to print the series 1,2,5,26,677,458330",
                "#include<stdio.h>\n\nvoid generateSeries() {\n    int n = 5, a = 1, b = 2;\n    int next = 0;\n    for (int i = 1; i <= n; i++) {\n        next = a + (b * b);\n        a = b;\n        b = next;\n        printf(\"%d\", next);\n        if (i < n)\n            printf(\",\");\n    }\n}\n\nint main() {\n    generateSeries();\n    return 0;\n}"));

        questions.add(new Question("Write a Program to print the series 1,1,2,3,5,8,13,21,34,...",
                "#include<stdio.h>\n\nvoid fibonacci(int n) {\n    int a = 0, b = 1, c;\n    for (int i = 1; i <= n; i++) {\n        c = a + b;\n        a = b;\n        b = c;\n        printf(\"%d\", a);\n        if (i < n)\n            printf(\",\");\n    }\n}\n\nint main() {\n    int N = 10;\n    fibonacci(N);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to print the series 1,2,4,8,16,32,...",
                "#include<stdio.h>\n\nvoid powersOfTwo(int n) {\n    for (int i = 0; i < n; i++) {\n        printf(\"%d\", 1 << i);\n        if (i < n - 1)\n            printf(\",\");\n    }\n}\n\nint main() {\n    int N = 10;\n    powersOfTwo(N);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to print the series 2,5,10,17,26,37,...",
                "#include<stdio.h>\n\nvoid generateSeries(int n) {\n    int a = 2;\n    for (int i = 1; i <= n; i++) {\n        int term = a * i + i * i;\n        printf(\"%d\", term);\n        if (i < n)\n            printf(\",\");\n    }\n}\n\nint main() {\n    int N = 10;\n    generateSeries(N);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to print the series 2,3,5,7,11,13,...",
                "#include<stdio.h>\n\nint isPrime(int n) {\n    if (n <= 1)\n        return 0;\n    if (n <= 3)\n        return 1;\n    if (n % 2 == 0 || n % 3 == 0)\n        return 0;\n    for (int i = 5; i * i <= n; i += 6) {\n        if (n % i == 0 || n % (i + 2) == 0)\n            return 0;\n    }\n    return 1;\n}\n\nvoid primeSeries(int n) {\n    int num = 2, count = 0;\n    while (count < n) {\n        if (isPrime(num)) {\n            printf(\"%d\", num);\n            if (count < n - 1)\n                printf(\",\");\n            count++;\n        }\n        num++;\n    }\n}\n\nint main() {\n    int N = 10;\n    primeSeries(N);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to print the series 1,4,27,256,3125,...",
                "#include<stdio.h>\n\nvoid powersOfThree(int n) {\n    for (int i = 1; i <= n; i++) {\n        int powThree = 1;\n        for (int j = 1; j <= i; j++) {\n            powThree *= 3;\n        }\n        printf(\"%d\", powThree);\n        if (i < n)\n            printf(\",\");\n    }\n}\n\nint main() {\n    int N = 5;\n    powersOfThree(N);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to print the series 1,2,9,64,625,...",
                "#include<stdio.h>\n\nvoid powersOfFour(int n) {\n    for (int i = 1; i <= n; i++) {\n        int powFour = 1;\n        for (int j = 1; j <= i; j++) {\n            powFour *= 4;\n        }\n        printf(\"%d\", powFour);\n        if (i < n)\n            printf(\",\");\n    }\n}\n\nint main() {\n    int N = 5;\n    powersOfFour(N);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to print the series 1,1,2,3,5,8,13,...",
                "#include<stdio.h>\n\nvoid fibonacci(int n) {\n    int a = 0, b = 1, c;\n    for (int i = 1; i <= n; i++) {\n        c = a + b;\n        a = b;\n        b = c;\n        printf(\"%d\", a);\n        if (i < n)\n            printf(\",\");\n    }\n}\n\nint main() {\n    int N = 10;\n    fibonacci(N);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to print the series 1,11,111,1111,11111,...",
                "#include<stdio.h>\n\nvoid generateSeries(int n) {\n    for (int i = 1; i <= n; i++) {\n        int term = 0;\n        for (int j = 1; j <= i; j++) {\n            term = term * 10 + 1;\n        }\n        printf(\"%d\", term);\n        if (i < n)\n            printf(\",\");\n    }\n}\n\nint main() {\n    int N = 5;\n    generateSeries(N);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to print the series 1, 2, 5, 26, 677, 458330",
                "#include<stdio.h>\n\nvoid printSeries(int n) {\n    int a = 1, b = 2;\n    printf(\"%d, %d\", a, b);\n    int next = 0;\n    for (int i = 3; i <= n; i++) {\n        next = a + b * b;\n        a = b;\n        b = next;\n        printf(\", %d\", next);\n    }\n}\n\nint main() {\n    int n = 6;\n    printSeries(n);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to print the series 2, 3, 5, 8, 13, 21, 34, ...",
                "#include<stdio.h>\n\nvoid fibonacci(int n) {\n    int a = 0, b = 1, c;\n    for (int i = 1; i <= n; i++) {\n        c = a + b;\n        a = b;\n        b = c;\n        printf(\"%d\", a);\n        if (i < n)\n            printf(\", \");\n    }\n}\n\nint main() {\n    int num = 10;\n    fibonacci(num);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to print the series 1, 2, 4, 8, 16, 32, ...",
                "#include<stdio.h>\n\nvoid printSeries(int n) {\n    for (int i = 0; i < n; i++) {\n        printf(\"%d\", 1 << i);\n        if (i != n - 1) {\n            printf(\", \");\n        }\n    }\n}\n\nint main() {\n    int num = 10;\n    printSeries(num);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to print the series 2, 5, 10, 17, 26, 37, ...",
                "#include<stdio.h>\n\nvoid printSeries(int n) {\n    int a = 2;\n    for (int i = 1; i <= n; i++) {\n        int term = a + (i * i);\n        printf(\"%d\", term);\n        if (i != n) {\n            printf(\", \");\n        }\n    }\n}\n\nint main() {\n    int num = 10;\n    printSeries(num);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to print the series 2, 3, 5, 7, 11, 13, ...",
                "#include<stdio.h>\n#include<stdbool.h>\n\nbool isPrime(int n) {\n    if (n <= 1) {\n        return false;\n    }\n    if (n <= 3) {\n        return true;\n    }\n    if (n % 2 == 0 || n % 3 == 0) {\n        return false;\n    }\n    int i = 5;\n    while (i * i <= n) {\n        if (n % i == 0 || n % (i + 2) == 0) {\n            return false;\n        }\n        i += 6;\n    }\n    return true;\n}\n\nvoid printSeries(int n) {\n    int num = 2, count = 0;\n    while (count < n) {\n        if (isPrime(num)) {\n            printf(\"%d\", num);\n            count++;\n            if (count != n) {\n                printf(\", \");\n            }\n        }\n        num++;\n    }\n}\n\nint main() {\n    int num = 10;\n    printSeries(num);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to print the series 1, 4, 27, 256, 3125, ...",
                "#include<stdio.h>\n\nvoid printSeries(int n) {\n    int base = 1;\n    for (int i = 1; i <= n; i++) {\n        int term = 1;\n        for (int j = 1; j <= i; j++) {\n            term *= base;\n        }\n        printf(\"%d\", term);\n        if (i != n) {\n            printf(\", \");\n        }\n    }\n}\n\nint main() {\n    int num = 5;\n    printSeries(num);\n    return 0;\n}"));

        questions.add(new Question("Write a Program to check if a number is an automorphic number",
                "#include<stdio.h>\n#include<math.h>\n\nint isAutomorphic(int n) {\n    int square = n * n;\n    while (n > 0) {\n        if (n % 10 != square % 10) {\n            return 0;\n        }\n        n /= 10;\n        square /= 10;\n    }\n    return 1;\n}\n\nint main() {\n    int number = 5;\n    if (isAutomorphic(number)) {\n        printf(\"%d is an Automorphic number\\n\", number);\n    } else {\n        printf(\"%d is not an Automorphic number\\n\", number);\n    }\n    return 0;\n}"));

        questions.add(new Question("Write a Program to check if a number is a Harshad number",
                "#include<stdio.h>\n\nint isHarshad(int n) {\n    int sum = 0, num = n;\n    while (n > 0) {\n        sum += n % 10;\n        n /= 10;\n    }\n    return num % sum == 0;\n}\n\nint main() {\n    int number = 18;\n    if (isHarshad(number)) {\n        printf(\"%d is a Harshad number\\n\", number);\n    } else {\n        printf(\"%d is not a Harshad number\\n\", number);\n    }\n    return 0;\n}"));

        questions.add(new Question("Write a Program to check if a number is a Disarium number",
                "#include<stdio.h>\n#include<math.h>\n\nint isDisarium(int n) {\n    int sum = 0, temp = n, length = log10(n) + 1, digit;\n    while (temp > 0) {\n        digit = temp % 10;\n        sum += pow(digit, length--);\n        temp /= 10;\n    }\n    return sum == n;\n}\n\nint main() {\n    int number = 135;\n    if (isDisarium(number)) {\n        printf(\"%d is a Disarium number\\n\", number);\n    } else {\n        printf(\"%d is not a Disarium number\\n\", number);\n    }\n    return 0;\n}"));

        questions.add(new Question("Write a Program to check if a number is a Duck number",
                "#include<stdio.h>\n\nint isDuck(int n) {\n    while (n > 0) {\n        if (n % 10 == 0) {\n            return 1;\n        }\n        n /= 10;\n    }\n    return 0;\n}\n\nint main() {\n    int number = 1209;\n    if (isDuck(number)) {\n        printf(\"%d is a Duck number\\n\", number);\n    } else {\n        printf(\"%d is not a Duck number\\n\", number);\n    }\n    return 0;\n}"));

        questions.add(new Question("Write a Program to check if a number is a Keith number",
                "#include<stdio.h>\n#include<math.h>\n\nint isKeith(int n) {\n    int temp = n, sum = 0, count = 0;\n    int digits[10] = {0};\n    while (temp > 0) {\n        digits[count++] = temp % 10;\n        temp /= 10;\n    }\n    int nextTerm = 0;\n    for (int i = count - 1; i >= 0; i--) {\n        sum += digits[i];\n    }\n    while (nextTerm < n) {\n        nextTerm = 0;\n        for (int i = 1; i <= count; i++) {\n            nextTerm += digits[(sum - count + i) % count];\n        }\n        if (nextTerm == n) {\n            return 1;\n        }\n        sum = nextTerm;\n    }\n    return 0;\n}\n\nint main() {\n    int number = 197;\n    if (isKeith(number)) {\n        printf(\"%d is a Keith number\\n\", number);\n    } else {\n        printf(\"%d is not a Keith number\\n\", number);\n    }\n    return 0;\n}"));

        questions.add(new Question("Write a Program to check if a number is a Neon number",
                "#include<stdio.h>\n\nint isNeon(int n) {\n    int square = n * n, sum = 0;\n    while (square > 0) {\n        sum += square % 10;\n        square /= 10;\n    }\n    return sum == n;\n}\n\nint main() {\n    int number = 9;\n    if (isNeon(number)) {\n        printf(\"%d is a Neon number\\n\", number);\n    } else {\n        printf(\"%d is not a Neon number\\n\", number);\n    }\n    return 0;\n}"));

        questions.add(new Question("Write a Program to check if a number is a Pronic number",
                "#include<stdio.h>\n\nint isPronic(int n) {\n    for (int i = 1; i * (i + 1) <= n; i++) {\n        if (i * (i + 1) == n) {\n            return 1;\n        }\n    }\n    return 0;\n}\n\nint main() {\n    int number = 12;\n    if (isPronic(number)) {\n        printf(\"%d is a Pronic number\\n\", number);\n    } else {\n        printf(\"%d is not a Pronic number\\n\", number);\n    }\n    return 0;\n}"));

        questions.add(new Question("Write a Program to check if a number is a repunit prime number",
                "#include<stdio.h>\n\nint isRepunitPrime(int n) {\n    if (n == 1) {\n        return 0;\n    }\n    for (int i = 2; i * i <= n; i++) {\n        if (n % i == 0) {\n            return 0;\n        }\n    }\n    return 1;\n}\n\nint main() {\n    int number = 7;\n    if (isRepunitPrime(number)) {\n        printf(\"%d is a repunit prime number\\n\", number);\n    } else {\n        printf(\"%d is not a repunit prime number\\n\", number);\n    }\n    return 0;\n}"));

        questions.add(new Question("Write a Program to check if a number is a self number",
                "#include<stdio.h>\n\nint isSelfNumber(int n) {\n    for (int i = 1; i < n; i++) {\n        int sum = i, temp = i;\n        while (temp > 0) {\n            sum += temp % 10;\n            temp /= 10;\n        }\n        if (sum == n) {\n            return 0;\n        }\n    }\n    return 1;\n}\n\nint main() {\n    int number = 21;\n    if (isSelfNumber(number)) {\n        printf(\"%d is a self number\\n\", number);\n    } else {\n        printf(\"%d is not a self number\\n\", number);\n    }\n    return 0;\n}"));

        questions.add(new Question("Write a Program to check if a number is a vampire number",
                "#include<stdio.h>\n#include<math.h>\n\nint isVampire(int n) {\n    int numDigits = 0, temp = n;\n    while (temp > 0) {\n        numDigits++;\n        temp /= 10;\n    }\n    int digits[numDigits], productDigits = 1;\n    temp = n;\n    for (int i = numDigits - 1; i >= 0; i--) {\n        digits[i] = temp % 10;\n        temp /= 10;\n    }\n    for (int i = 0; i < numDigits / 2; i++) {\n        productDigits *= (digits[i] * 10 + digits[numDigits - i - 1]);\n    }\n    return productDigits == n;\n}\n\nint main() {\n    int number = 1260;\n    if (isVampire(number)) {\n        printf(\"%d is a vampire number\\n\", number);\n    } else {\n        printf(\"%d is not a vampire number\\n\", number);\n    }\n    return 0;\n}"));

        for (Question question : questions) {
            panel.add(question.getPanel());
        }
    }

    public static void main(String[] args) {
        JFrame frame = createFrame();
        frame.add(createUI());
        frame.pack();
        frame.setVisible(true);
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

        C_Coding_Questions_Frame app = new C_Coding_Questions_Frame();
        app.loadQuestions(panel);

        scrollPane.setViewportView(panel);
        return scrollPane;
    }
}
