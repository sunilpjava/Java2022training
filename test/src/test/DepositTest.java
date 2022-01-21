package test;

public class DepositTest {
	
	public static int depositAmount = 0;
	
	static int DepositAmount(int amt)
	{
		depositAmount = depositAmount+ amt;
		return depositAmount;
	}
}
