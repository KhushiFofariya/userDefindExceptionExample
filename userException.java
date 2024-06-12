package userDefindExceptiomExample;

public class userException {
	public static boolean validateMarks(int[] marks) throws invalidMarksException
	{
		for(int value : marks)  
		{
			if(value < 0 || value > 100)
				throw new invalidMarksException("Marks should be bwtween 0 to 100");
		}
			return true;
	}
	public static float calculatePercentage(int[] marks)
	{
		int total=0;
		for(int result : marks)
				total += result;
				float per=total/marks.length*100;
				return per;	
	
	}
}
