import java.util.*;

class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
    }
}

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

    static Node head = null;

    // Insertion

    void insert(int d) {
        Node n = new Node(d);
        // n.data=d;
        n.next = null;

        if (head == null)
            head = n;

        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
        }
    }

    boolean palindrome() {
        Node temp = head;
        int count = 0;
        while (temp.next != null) {
            count++;
            temp = temp.next;
        }
        Node forward = head;
        for (int i = 0; i <= count / 2; i++) {
            Node backward = head;
            for (int j = 0; j < count - i; j++) {
                backward = backward.next;
            }
            // System.out.println(forward.data+" "+backward.data);
            if (backward.data != forward.data) {
                return false;
            }
            forward = forward.next;
        }
        return true;
    }

    void display() {
        Node temp = head;
        if (temp != null) {
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        } else {
            System.out.println("List is empty!");
        }
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
                int[][] arr = { { 4, 16, 12 }, { 2, 18, 14 }, { 1, 3, 6 } };
                int[] lower = new int[arr[0].length];
                int[] higher = new int[arr[0].length];
                for (int i = 0; i < arr.length; i++) {
                    int low = arr[i][0];
                    for (int j = 0; j < arr[0].length; j++) {
                        if (arr[i][j] < low)
                            low = arr[i][j];
                    }
                    lower[i] = low;
                }
                for (int i = 0; i < arr.length; i++) {
                    int high = arr[0][i];
                    for (int j = 0; j < arr[0].length; j++) {
                        if (arr[j][i] > high)
                            high = arr[j][i];
                        // System.out.println(high);
                    }
                    higher[i] = high;
                }
                System.out.print("saddle point is:");
                for (int k : lower) {
                    for (int l : higher) {
                        if (k == l) {
                            System.out.println(k);
                            break;
                        }
                    }
                }
                break;
            }
            case 10: { // Integer to roman
                int num = 111;
                String[] th = { "", "M", "MM", "MMM" };
                String[] hu = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
                String[] te = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
                String[] on = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
                String s = "";
                s += th[num / 1000];
                s += hu[(num % 1000) / 100];
                s += te[(num % 100) / 10];
                s += on[num % 10];
                System.out.println(s);
                break;
            }
            case 11: { // Spiral matrix
                int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
                List<Integer> ans = new ArrayList<>();
                int row = arr.length;
                int col = arr[0].length;
                int r = 0;
                int c = 0;
                while (r < row && c < col) {
                    for (int i = c; i < col; i++) {
                        ans.add(arr[r][i]);
                    }
                    r++;
                    for (int j = r; j < row; j++) {
                        ans.add(arr[j][row - 1]);
                    }
                    col--;
                    if (r < row) {
                        for (int i = col - 1; i >= 0; --i) {
                            ans.add(arr[row - 1][i]);
                        }
                        row--;
                    }
                    if (c < col) {
                        for (int j = row - 1; j >= r; j--) {
                            ans.add(arr[j][c]);
                        }
                        c++;
                    }
                }
                System.out.println(ans);
                break;
            }
            case 12: {
                Main m = new Main();
                m.insert(10);
                m.display();
                System.out.println();
                m.insert(20);
                m.display();
                System.out.println();
                m.insert(30);
                m.display();
                System.out.println();
                m.insert(10);
                m.display();
                System.out.println();
                System.out.println("Palindrome : " + m.palindrome());

                break;
            }
        }
    }
}
