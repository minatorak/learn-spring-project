package team.odds.minatorak.springin5steps;

class BinarySearchImpl {
    private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers,
                            int numberToSearchFor) {
        BubbleSortAlgorithm bubbleSort = new BubbleSortAlgorithm();
        int[] sortedNumbers = bubbleSort.sort(numbers);
        return 1;
    }
}
