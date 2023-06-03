import javafx.util.Pair;

public class Main {
    public static int Sum(int[] arr, IPair pair) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            if (pair.IsPair(arr[i]))
                sum += arr[i];
        return sum;
    }
    public static void main(String[] args) {
        IPair pair1;

        pair1 = (d) -> {
            if (d % 2 == 0) return true;
            else return false;
        };

        int[] arr = {2, 3, 5, 6, 8, 7, 10};
        System.out.println("Масив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        int sum = Sum(arr, pair1);
        System.out.println("1. Сумма парних елементів масиву = " + sum);
        sum = Sum(arr, (IPair) ((d) -> {
            if (d % 2 != 0) return true;
            else return false;
        }));
        System.out.println("2. Сумма непарних елементів масиву = " + sum);

        IRange range;
        range = (A, B) -> {
            int sumRange = 0;
            for (int i = 0; i < arr.length; i++)
                if (arr[i] >= A && arr[i] <= B)
                    sumRange = sumRange + arr[i];

            return sumRange;
        };
      System.out.println("3. Сума чисел, які знаходяться в заданому діапазоні = " + range.IsRange(4, 9));

IMultiple pair3;

        pair3 = (a) -> {
            int sum3 = 0;
            for (int i = 0; i<arr.length; i++){
                if (arr[i] % a == 0){
                    sum3 = sum3+ arr[i];
                }
            }
            return sum3;
        };
        System.out.println("4. Сумма чисел кратних параметру А = " + pair3.IsMultiple(5));

  }
}
interface IPair {
    boolean IsPair(int d);
}

interface IRange{
    int IsRange(int A, int B);
}

interface IMultiple {
    int IsMultiple(int a);
}
