package team.odds.minatorak.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

    //What are the beans
    //What are the dependencies of a bean
    //Where to search for bean

	public static void main(String[] args) {
	    BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
	    int result = binarySearch.binarySearch(new int[]{12,4,6},3);
        System.out.println(result);
//        ApplicationContext context = SpringApplication.run(SpringIn5StepsApplication.class, args);
	}
}
