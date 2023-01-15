import java.util.*;
class PowerSet {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int val = (int) Math.pow(2, n);
        for (int i = 1; i < val; i++) {
            int binary = i;
            ArrayList<Integer> al = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((binary & 1) == 1) {
                    al.add(arr[j]);
                }
                binary >>= 1;
            }

            for (int k = 0; k < al.size(); k++) {
                System.out.print(al.get(k) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}