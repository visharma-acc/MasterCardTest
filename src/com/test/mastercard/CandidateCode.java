package com.test.mastercard;


import java.util.Scanner;


public class CandidateCode {
	
     public static int valid=0;
     
     public static int total=0;
     
     public static int total1=0;
     
     public static int output=0;
     
     public static String str=""; 
     

		
	  String PlayerType;
	  int Skill;
	  String town;
	  
	  public CandidateCode() {
		
		}
	  
	  
	public CandidateCode(String playerType, int skill, String town) {
		super();
		PlayerType = playerType;
		Skill = skill;
		this.town = town;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((PlayerType == null) ? 0 : PlayerType.hashCode());
		result = prime * result + Skill;
		result = prime * result + ((town == null) ? 0 : town.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CandidateCode other = (CandidateCode) obj;
		if (PlayerType == null) {
			if (other.PlayerType != null)
				return false;
		} else if (!PlayerType.equals(other.PlayerType))
			return false;
		if (Skill != other.Skill)
			return false;
		if (town == null) {
			if (other.town != null)
				return false;
		} else if (!town.equals(other.town))
			return false;
		return true;
	}


	public String getPlayerType() {
		return PlayerType;
	}
	public void setPlayerType(String playerType) {
		PlayerType = playerType;
	}
	public int getSkill() {
		return Skill;
	}
	public void setSkill(int skill) {
		Skill = skill;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (PlayerType+" "+Skill+" "+town);
	}


	boolean checkPlayerType(String s)
	{
		boolean flag=false;
				
		if(s.equals("Batsman") || s.equals("Bowler") || s.equals("WicketKeeper") || s.equals("AllRounder") )
		{
		   flag=true;	
		}
		return flag;
			
	}
	  
	boolean checkSkill(int n)
	{
		boolean flag=false;
		
		if(n>=5 && n<=10)
		{
			flag=true;
		}
		return flag;
	}

	boolean checkTown(String town)
	{
		boolean flag=false;
		
		if(town.equals("Ipswich") || town.equals("Suffolk") )
		{
		   flag=true;	
		}
		return flag;
	}

static boolean checkNoofBastman(CandidateCode data[])
{
	int len=data.length;
	int c=0;
	for(int i=0;i<len;i++)
	{
		if(data[i].getPlayerType().equals("Batsman"))
		{
			c++;
		}
	}
	if(c>=3 && c<=6)
	{	
	return true;
	}
	else
	{
	return false;
	}
		
}

static boolean checkNoofBowler(CandidateCode data[])
{
	int len=data.length;
	int c=0;
	for(int i=0;i<len;i++)
	{
		if(data[i].getPlayerType().equals("Bowler"))
		{
			c++;
		}
	}
	if(c>=3 && c<=6)
	{	
	return true;
	}
	else
	{
	return false;
	}
		
}

static boolean checkNoofAllRounder(CandidateCode data[])
{
	int len=data.length;
	int c=0;
	for(int i=0;i<len;i++)
	{
		if(data[i].getPlayerType().equals("AllRounder"))
		{
			c++;
		}
	}
	if(c>=1 && c<=4)
	{	
	return true;
	}
	else
	{
	return false;
	}
		
}

static boolean checkNoofWicketKeeper(CandidateCode data[])
{
	int len=data.length;
	int c=0;
	for(int i=0;i<len;i++)
	{
		if(data[i].getPlayerType().equals("WicketKeeper"))
		{
			c++;
		}
	}
	if(c>=1 && c<=4)
	{	
	return true;
	}
	else
	{
	return false;
	}
		
}

static boolean checkNoOfPlayerFromTown(CandidateCode data[])
{
	int len=data.length;
	int c=0;
	int ct=0;
	for(int i=0;i<len;i++)
	{
		if(data[i].getTown().equals("Ipswich"))
		{
			c++;
		}
	}
	for(int i=0;i<len;i++)
	{
		if(data[i].getTown().equals("Suffolk"))
		{
			ct++;
		}
	}
	int t=c+ct;
	
	if(c<=7 && ct<=7 && t==11)
	{	
	return true;
	}
	else
	{
	return false;
	}
		
}

static boolean checkTotalSkill(CandidateCode data[])
{
	int len=data.length;
	
	int c=0,sum=0;
	
	for(int i=0;i<len;i++)
	{
		sum+=data[i].getSkill();
	}
	if(sum<=100)
	{	
	return true;
	}
	else
	{
	return false;
	}
		
}

static int TotalSkill(CandidateCode data[])
{
	int len=data.length;
	int c=0,sum=0;
	System.out.println("data array lenght is "+len);
	
	for(int i=0;i<len;i++)
	{
		System.out.println("skill at data["+i+"]"+data[i].getSkill());
		sum+=data[i].getSkill();
		System.out.println("sum after "+i+"data addition"+sum);
	}
	return sum;
		
}
	
static void combinationUtil(CandidateCode arr[], CandidateCode data[], int start, 
            int end, int index, int r) 
{ 
	String tmp="";
	StringBuilder sb=new StringBuilder();
	
	
	
// Current combination is ready to be printed, print it 
if (index == r) 
{ 
for (int j=0; j<r; j++) 
{	
//System.out.print(data[j]+" ");
 //tmp=Arrays.toString(data);
	sb=sb.append(data[j]+" ");

}	
//System.out.println(sb);
 //tmp=sb+"";
//hs.add(tmp);
//System.out.println(""); 
total++;
if(checkNoofBastman(data) && checkNoofBowler(data) && checkNoofAllRounder(data) && checkNoofWicketKeeper(data) && checkNoOfPlayerFromTown(data) && checkTotalSkill(data))
{
	valid++;
	//tmp=Arrays.toString(data);
	//System.out.println(sb);
	//System.out.println("sum is "+TotalSkill(data));
	if(str.equals(sb.toString()))
	{
	 // do nothing	
		total1++;
	}
	else
	{
		str=sb+"";
		output++;
	}

	
	
}

return; 
} 

for (int i=start; i<=end && end-i+1 >= r-index; i++) 
{ 
data[index] = arr[i]; 
combinationUtil(arr, data, i+1, end, index+1, r); 
} 
} 

static void printCombination(CandidateCode arr[], int n, int r) 
{ 
    // A temporary array to store all combination one by one 
	CandidateCode data[]=new CandidateCode[r]; 


    // Print all combination using temprary array 'data[]' 
    combinationUtil(arr, data, 0, n-1, 0, r); 
}

	 
	public static void main(String s[]) throws Exception
	{
		int c=0;
		CandidateCode ob=new CandidateCode();
		
	    CandidateCode list[]= new CandidateCode[22];
	    
		
		System.out.println("Enter the input -->");
		
		Scanner scanner = new Scanner(System.in);
		
		while (scanner.hasNextLine() && c<22)
		{	
		
			
		String PlayerType = scanner.next();
		int Skill = scanner.nextInt();
		String town = scanner.next();
		if(ob.checkPlayerType(PlayerType) && ob.checkSkill(Skill) && ob.checkTown(town))
		{
		
			list[c]=new CandidateCode(PlayerType, Skill, town);
			//System.out.println("data added in list-->");
			c++;
		}
		else
		{
		
			System.out.println("the input is incorrect");
		}
		
			
	}
		scanner.close();
	
	
	printCombination(list,22,11);
	System.out.println(valid);
	//System.out.println(output);
	//System.out.println(total1);
	


	
	
	}
	
	

}

