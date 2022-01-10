package com.moodanalyzer;
import org.junit.Test;

	public class MoodAnalyzerTest {

		@Test
		public void testMoodAnalyser() {
			MoodAnalyzer analyser = new MoodAnalyzer();

			assertEquals("happy", analyser.analyseMood("happy"));
			assertEquals("sad", analyser.analyseMood("sad"));
			assertEquals("happy", analyser.analyseMood(null));
			assertEquals("happy", analyser.analyseMood(""));
			// TODO Auto-generated method stub
			
		}

		private void assertEquals(String string, String analyseMood) {
			// TODO Auto-generated method stub
			
		}
			
		}
