
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		//int t =calc(10,20,30);
		//System.out.println(calc(10,20,30));

		int x=calculateHighScorePosition(1150);
		int y=calculateHighScorePosition(800);
		int z=calculateHighScorePosition(1000);
		int w=calculateHighScorePosition(50);
		displayHighScorePosition("apple", x);
		displayHighScorePosition("boll", y);
		displayHighScorePosition("cot", z);
		displayHighScorePosition("dog", w);


	}

 


public static void  displayHighScorePosition(String name, int position)
{

	System.out.println(name+ " is"+" managed to get into the position "+position+" on the highscore table");

}
public static int calculateHighScorePosition(int playersScore)
{
	if (playersScore>1000)
	return 1;
	else if (playersScore>500 && playersScore<1000)
			return 2;
	else if (playersScore>100 && playersScore< 500)
	return 3;
	else 
		return 4;

}	

}