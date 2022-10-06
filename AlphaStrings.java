import java.util.*;
class AlphaStrings
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String words [] = line.split(" ");
        System.out.println("Before Sorting");
        for(String word: words)
            System.out.print(word+" ");
        Arrays.sort(words);
        System.out.println();
        System.out.println("After Sorting");
        for(String word: words)
            System.out.print(word+" ");
    }
}