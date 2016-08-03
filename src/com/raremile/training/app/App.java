package com.raremile.training.app;

import com.raremile.training.service.MaxMovieTime;

public class App {

	public static void main(String[] args) {
		int[] startTime = { 1, 1, 2, 3, 5 };
		int[] endTime = { 4, 2, 3, 5, 6 };

		MaxMovieTime maxMovieTime = new MaxMovieTime(startTime, endTime);
		maxMovieTime.getMaxMovieTime();
	}

}
