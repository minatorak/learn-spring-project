package team.odds.minatorak.springin5steps;

import org.springframework.stereotype.Component;

@Component
class BinarySearchImpl {
//    @Autowired
    private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers,
                            int numberToSearchFor) {
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
        return 1;
    }
}
