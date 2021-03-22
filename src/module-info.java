module MoodAnalyzer {
	public String analyse Mood() throws MoodAnalysis Exception{
		try {
			if (message.length()==0)
				throw new MoodAnalysisException("Please enter proper message")
				if (message.contains ("Sad"))
					return "SAD";
				else
					return "HAPPY";
		}
		catch (NullPointerException e) {
			throw new MoodAnalysisException("Pleasw enter proper message")
		}
		public class MoodAnalysisException extends Exception
		enum type {
			ENTERED_NULL, ENTERED_EMPTY
		}
		public MoodAnalysisException("String message") {
			super (message);
		}
	}
	ExceptionType type;
	@Test
	public void givenNullMoodShouldThrowException() {
		MoodAnalyser moodAnalyser = new MoodAnalyser (null);
		try {
			moodAnalyser.analyseMood(null);
		}
		catch (MoodAnalysisException e) {
			Assert.assertEquals(MoodAnalysis Exception.ExceptionType.ENTERED_NULL, e.type);
		}
	}
	@Test
	public void givenWrongClass_ThenThrowexception() {
		try {
			ExpectedException exceptionRule=ExpectedException.none();
			exceptionRule.except(ObjectReflectorException.class);
			Object myObj=ObjectReflector.createObject(className'Mood', String)
		}
	}
}