import java.util.*;

public class UniqueSortedList {
    
    public static List<Integer> getUniqueSorted(List<Integer> inputList) {
        Set<Integer> uniqueSet = new HashSet<>(inputList);
        List<Integer> uniqueList = new ArrayList<>(uniqueSet);
        Collections.sort(uniqueList);
        return uniqueList;
    }

    public static void main(String[] args) {
        List<Integer> testList = new ArrayList<>();
        testList.add(5);
        testList.add(2);
        testList.add(8);
        testList.add(2);
        testList.add(5);
        testList.add(1);
        testList.add(8);
        testList.add(3);
        System.out.println("Исходный список: " + testList);
        List<Integer> result = getUniqueSorted(testList);
        System.out.println("Уникальные элементы (отсортированные): " + result);
        System.out.println("Дополнительные тесты:");
        List<Integer> emptyList = new ArrayList<>();
        System.out.println("Пустой список: " + getUniqueSorted(emptyList));
        List<Integer> singleList = new ArrayList<>();
        singleList.add(42);
        System.out.println("Список с одним элементом: " + getUniqueSorted(singleList));
        List<Integer> sortedList = new ArrayList<>();
        sortedList.add(1);
        sortedList.add(3);
        sortedList.add(5);
        sortedList.add(7);
        sortedList.add(9);
        System.out.println("Уже отсортированный список: " + getUniqueSorted(sortedList));
    }
}
