package com.eric.sequences;

public class Sequences {
	public void fibonacci(int count) {
		int f = 0;
		int g = 1;
		
		for (int i = 0; i < count; i++) {
			System.out.println(f);
			f = f + g;
			g = f - g;
		}
	}
}
