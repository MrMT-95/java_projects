import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> arrayList = readArrayList(scanner);
        int number = scanner.nextInt();

        int minValue = minDifference(arrayList, number);
        ArrayList<Integer> output = outputArray(arrayList, number, minValue);

        System.out.println(output.toString().replaceAll("\\[|\\]", "").replaceAll("\\,", ""));


    }

    private static ArrayList<Integer> readArrayList(Scanner scanner) {
        return Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    private static int minDifference(ArrayList<Integer> arrayList, int number) {

        int min;
        ArrayList<Integer> minArrayList = new ArrayList<>();

        for (Integer integer : arrayList) {
            minArrayList.add(Math.abs(integer - number));
        }
        min = minArrayList.get(minArrayList.indexOf(Collections.min(minArrayList)));

        return min;
    }

    private static ArrayList<Integer> outputArray(ArrayList<Integer> arrayList, int number, int minValue) {
        ArrayList<Integer> outputArrayList = new ArrayList<>();

        for (int i = 0; i < arrayList.size(); i++) {
            if (Math.abs(arrayList.get(i) - number) == minValue) {
                outputArrayList.add(arrayList.get(i));
            }
        }
        Collections.sort(outputArrayList);

        return outputArrayList;
    }
}

