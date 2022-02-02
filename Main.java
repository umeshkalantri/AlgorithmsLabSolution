package com.greatlearning.lab2Assignment;

import java.util.Arrays;
import java.util.Scanner;

import com.greatlearning.lab2Assignment.MergeSortImplementation;
// import com.greatlearning.service.QuickSortImplementation;

import com.greatlearning.lab2Assignment.NotesCount;

public class Main {

	public static void main(String[] args) {

		MergeSortImplementation mergeSortImplementation = new MergeSortImplementation();
		NotesCount notesCount = new NotesCount();
		
		// QuickSortImplementation quickSortImplementation = new QuickSortImplementation();

		System.out.println("enter the size of currency denominations ");
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] notes = new int[size];
		System.out.println("enter the currency denominations value");
		

		for (int i = 0; i < size; i++) {
			notes[i] = sc.nextInt();
		}
		System.out.println("enter the amount you want to pay");
		

		int amount = sc.nextInt();
		mergeSortImplementation.sort(notes,0,notes.length-1);
		// quickSortImplementation.quickSort(notes,0,notes.length-1);
		
		for (int i = 0; i < size; i++) {
			System.out.println(notes[i]);
		}
		
		notesCount.notesCountImplementation(notes, amount);
	}

}