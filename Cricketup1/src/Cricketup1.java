import java.util.*;
class Cricketup1
{
	static	Scanner sc=new Scanner(System.in);
	static float ao=0f;
	public void weather(String team1, String team2,int ss,float ao)throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Weather Condition");
		System.out.println("Weather it is Rainy(1.Yes/2.No):");
		int weather=sc.nextInt();
		if(weather==1)
		{
			System.out.println("match Delayed due to rain");
			System.out.println("after 2 hrs:");
			ao=40;
			overs40(team1,team2,ss,ao);
		}
		else
		{	ao=50;
			overs50(team1,team2,ss,ao);
		}
	}
	//50-Overs
	public void overs50(String team1,String team2,int s,float ao) throws Exception
	{
		int ss=0;
		//System.out.println("50-50 Overs Match");
		System.out.println(team1+" won the Toss & Elected to Bat First");
		System.out.println("Enter The Overs Played By "+team1);
		float overs1=sc.nextFloat();
		if(overs1>ao)
		{
			throw new CricketExceptions().new OversException();
		}
		else
		{
			System.out.println("Enter The RunRate of "+team1);
			float runrate1=sc.nextFloat();
			ss=(int)score1(overs1,runrate1);
			int tota=total50(runrate1,ss,team1,overs1,ao);
			System.out.println();
			System.out.println("Enter The Overs Played By "+team2);
			float overs2=sc.nextFloat();
			if(overs2>50)
			{
				throw new CricketExceptions().new OversException();
			}
			else
			{
				System.out.println("Enter The RunRate of "+team2);
				float runrate2=sc.nextFloat();
				int ss1=(int)score2(overs2,runrate2);
				//int total1=cr.total(runrate2,ss1,team2);
				result250(ss, ss1,team2,team1);
			}
		}
		
	}
	
	
	 //40-overs
	public void overs40(String team1,String team2,int ss,float ao)throws Exception
	{
		System.out.println("Weather Condition");
		System.out.println("Weather it is Rainy(1.Yes/2.No):");
		int weather=sc.nextInt();
		if(weather==1)
		{
			System.out.println("match Delayed due to rain");
			System.out.println("after 1 hrs:");
			ao=20;
			overs50(team1,team2,ss,ao);
		}
		else
		{
			System.out.println("Match reduced To 40-Overs");
			System.out.println(team1+" won the Toss & Elected to Bat First");
			System.out.println("Enter The Overs Played By "+team1);
			float overs1=sc.nextFloat();
			if(overs1>ao)
			{
				throw new CricketExceptions().new OversException40();
			}
			else
			{
				System.out.println("Enter The RunRate of "+team1);
				float runrate1=sc.nextFloat();
				ss=(int)score1(overs1,runrate1);
				int tota=total50(runrate1,ss,team1,overs1,ao);
				System.out.println();
				System.out.println("Enter The Overs Played By "+team2);
				float overs2=sc.nextFloat();
				if(overs2>40)
				{
					throw new CricketExceptions().new OversException40();
				}
				else
				{
					System.out.println("Enter The RunRate of "+team2);
					float runrate2=sc.nextFloat();
					int ss1=(int)score2(overs2,runrate2);
					//int total1=cr.total(runrate2,ss1,team2);
					result250(ss, ss1,team2,team1);
				}
			}
		}
}
	
	// match wickets condition
		public int total50(float runrate1, int ss, String team1, float overs1,float ao)
		{
			if(overs1==ao+1)
			{
				System.out.println("Overs Exceded");
			}
			else if(runrate1>=6 && overs1==ao)//success
			{
				System.out.println(team1+" Total Score "+ss+"/7");
			}
			else if(runrate1<6 && overs1==ao)//success
			{
				System.out.println(team1+" Total Score "+ss+"/9");
				
			}
			else if(runrate1>=6 && overs1<ao)//success
			{
				System.out.println(team1+" Total Score "+ss+"/10");
			}
			else if(runrate1<6 && overs1<ao)
			{
				System.out.println(team1+" Total Score "+ss+"/10");
			}
			else
			{
				System.out.println("invalid");
			}
			return ss;
		}
//score calculation for 1st Innings
	public float score1(float overs1, float runrate1)
	{
	 float score=overs1*runrate1;
		return  score;
		
	
	}
//Score Calculation for 2nd Innings
	public float score2(float overs2, float runrate2)
	{
	 float score1=overs2*runrate2;
		return  score1;
	}
//Final Result
		public void result250(int ss, int ss1,String team2,String team1)
		{
			int won;
			if(ss>ss1)
			{
				won=ss-ss1;
				System.out.println(team2+" Scored "+ss1+" runs");
				System.out.println( team1+" Won By"+won +" runs");
			}	
			else if(ss==ss1)
			{
				System.out.println(team2+" Scored "+ss1+"/7");
				System.out.println("Match Tie");
			}
			else
			{
				System.out.println(team2+" Won By 3 wickets");
			}
		}
//End of final result calculation
	public static void main(String[] args) throws Exception
	{
		Cricketup1 cr=new Cricketup1();
		System.out.println("Welcome To 50 Overs ODI Match");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Team One Name");
		String team1=sc.next();
		
		System.out.println("Enter The Team Two Name");
		String team2=sc.next();
		int ss=0;
		cr.weather(team1,team2,ss,ao);
	}
}