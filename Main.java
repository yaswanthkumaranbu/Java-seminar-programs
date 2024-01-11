import java.util.*;

public class Main {
    static int operation(int n) {
        int rem = 0, sum = 0;
        while (n > 0) {
            rem = n % 10;
            sum += rem * rem;
            n /= 10;
        }
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the case number:");
        int n = sc.nextInt();
        sc.nextLine();
        switch (n) {
            case 1: { // Regex expression - sanjai kumar
                System.out.print("Enter the expression:");
                String s = sc.nextLine();
                String[] arr = s.split("[^a-z A-Z]");
                for (String x : arr)
                    System.out.println(x);
                break;
            }
            case 2: { // Happy number - Gajapathi
                System.out.print("Enter the number:");
                int num = sc.nextInt();
                int slow = num;
                int fast = num;
                do {
                    slow = operation(slow);
                    System.out.println(slow + " ");
                    fast = operation(operation(fast));
                    System.out.println(fast + " ");
                } while (slow != fast);
                if (slow == 1)
                    System.out.println("Number is a happy number!");
                else
                    System.out.println("Number is not a happy number!");
                break;
            }
            case 3: { // Replacing all 0's with 1's
                System.out.print("Enter the number:");
                int num = sc.nextInt();
                int temp = num;
                int sum = 0;
                while (temp > 0) {
                    if (temp % 10 != 0) {
                        sum = sum * 10 + temp % 10;
                    } else {
                        sum = sum * 10 + 1;
                    }
                    temp /= 10;
                }
                int result = 0;
                while (sum > 0) {
                    result = result * 10 + sum % 10;
                    sum /= 10;
                }
                System.out.println(result);
                break;
            }
            case 4: { // Prime or not
                int x = 0;
                System.out.print("Enter the number:");
                int num = sc.nextInt();
                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        System.out.println("The number is not prime");
                        x = 1;
                        break;
                    }
                }
                if (x == 0) {
                    System.out.println("The number is a prime");
                }
                break;
            }
            case 5: { // Adding all the digits present in the string
                System.out.print("Enter the string with numbers:");
                String s = sc.next();
                char[] c = s.toCharArray();
                int sum = 0;
                for (char i : c) {
                    if (i >= 48 && i <= 57) {
                        sum += i - 48;
                    }
                }
                System.out.print(sum);
                break;
            }
            case 6: { // Removing duplicates - sanjai das
                int[] arr = { 20, 10, 30, 40, 50 };
                HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
                for (int i = 0; i < arr.length; i++) {
                    if (m.containsKey(arr[i])) {
                        m.put(arr[i], m.get(arr[i]) + 1);
                    } else {
                        m.put(arr[i], 1);
                    }
                }
                System.out.println(m);
                break;
            }
            case 7: { // Rotate the matrix
                int[][] arr = { { 1, 2 }, { 3, 4 } };
                for (int x[] : arr) {
                    for (int y : x) {
                        System.out.print(y + " ");
                    }
                    System.out.println();
                }
                System.out.println();
                for (int i = 0; i < arr.length; i++) {
                    for (int j = i; j < arr[i].length; j++) {
                        int temp = arr[i][j];
                        arr[i][j] = arr[j][i];
                        arr[j][i] = temp;
                    }
                }

                for (int z[] : arr) {
                    int i = 0;
                    int j = z.length - 1;
                    while (i < j) {
                        int temp = z[i];
                        z[i] = z[j];
                        z[j] = temp;
                        i++;
                        j--;
                    }
                }
                for (int x[] : arr) {
                    for (int y : x) {
                        System.out.print(y + " ");
                    }
                    System.out.println();
                }
                break;
            }
            case 8: {
                int[] digits = { 9, 9, 8 };
                for (int i = digits.length - 1; i >= 0; i--) {
                    if (digits[i] < 9) {
                        digits[i]++;
                        for (int j : digits) {
                            System.out.print(j + " ");
                        }
                        System.exit(0);
                        break;

                    }
                    digits[i] = 0;
                }
                digits = new int[digits.length + 1];
                digits[0] = 1;
                for (int i : digits) {
                    System.out.print(i + " ");
                }
                break;
            }
            case 9: {
                int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
                int[] lower = new int[arr[0].length];
                int[] higher = new int[arr[0].length];
                for (int i = 0; i < arr.length; i++) {
                    int low = arr[i][0];
                    for (int j = 0; j < arr[0].length; j++) {
                        if (arr[i][j] < low)
                            low = arr[i][j];
                    }

                }
                break;
            }
        }
    }
}
