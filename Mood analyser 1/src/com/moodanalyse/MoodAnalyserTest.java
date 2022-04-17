package com.moodanalyse;

import org.junit.Test;

import org.junit.Assert;

public class MoodAnalyserTest {
	MoodAnalyser moodAnalyser = new MoodAnalyser();

	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() {
		String mood = moodAnalyser.analyseMood("I am in sad mood");
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
		String mood1 = moodAnalyser.analyseMood();
		Assert.assertEquals("Sad", mood1);
	}

	@Test
	public void givenMessage_WhenHappy_ShouldReturnHappy() {
		String mood = moodAnalyser.analyseMood("I am in any mood");
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any mood");
		String mood1 = moodAnalyser.analyseMood();
		Assert.assertEquals("Happy", mood1);
	}
}
