package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm{
	public int[] sort(int[] numbers) {
		//quick sort logic
		return numbers;
	}
}
