package team.odds.minatorak.springin5steps;

class BinarySearchImpl {

    public int binarySearch(int[] numbers,
                            int numberToSearchFor) {
        BubbleSortAlgorithm bubbleSort = new BubbleSortAlgorithm();
        int[] sortedNumbers = bubbleSort.sort(numbers);
        return 1;
    }
}
