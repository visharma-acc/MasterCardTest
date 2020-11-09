package com.test.mastercard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;


public class CandidateCode2 {
	
     public static int valid=0;
     
     public static int total=0;
     
     public static int total1=0;
     
     public static int output=0;
     
     public static String str=""; 
     
     public static HashSet<String> hs=new HashSet<String>();
     
     public static ArrayList<String> ls=new ArrayList();
		
	  String PlayerType;
	  int Skill;
	  String town;
	  
	  public CandidateCode2() {
		
		}
	  
	  
	public CandidateCode2(String playerType, int skill, String town) {
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
		CandidateCode2 other = (CandidateCode2) obj;
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

static boolean checkNoofBastman(CandidateCode2 data[])
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

static boolean checkNoofBowler(CandidateCode2 data[])
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

static boolean checkNoofAllRounder(CandidateCode2 data[])
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

static boolean checkNoofWicketKeeper(CandidateCode2 data[])
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

static boolean checkNoOfPlayerFromTown(CandidateCode2 data[])
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

static boolean checkTotalSkill(CandidateCode2 data[])
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


	
static void combinationUtil(CandidateCode2 arr[], CandidateCode2 data[], int start, 
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

static void printCombination(CandidateCode2 arr[], int n, int r) 
{ 
    // A temporary array to store all combination one by one 
	CandidateCode2 data[]=new CandidateCode2[r]; 

    // Print all combination using temprary array 'data[]' 
    combinationUtil(arr, data, 0, n-1, 0, r); 
}

	 
	public static void main(String s[]) throws Exception
	{
		int c=0;
		CandidateCode2 ob=new CandidateCode2();
		
	    CandidateCode2 list[]= new CandidateCode2[22];
	    
		
		System.out.println("Enter the input -->");
		
		Scanner scanner = new Scanner(System.in);
		
		while (scanner.hasNextLine() && c<22)
		{	
		
			
		String PlayerType = scanner.next();
		int Skill = scanner.nextInt();
		String town = scanner.next();
		if(ob.checkPlayerType(PlayerType) && ob.checkSkill(Skill) && ob.checkTown(town))
		{
		
			list[c]=new CandidateCode2(PlayerType, Skill, town);
		
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
	
	


	
	
	}
	
	

}

