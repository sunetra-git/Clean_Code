import java.lang.Math;
import java.util.*;
class SimpleInterestCalculator implements SimpleInterest{
		public double calculateSimpleInterest(double p,double r,int t){
		double interest;
		return ((p*r*t)/100);
	}
}
class CompoundInterestCalculator implements CompoundInterest{
	public double calculateCompoundInterest(double p,double r,int n,int t){
		double k=(1+(r/n));
		return (p*(Math.pow(k,(n*t))));
	}
}
class InterestCalculator{
	public static void main(String ar[]){
		double initialPrincipalBalance,interestRate,simpleInterest,compoundInterest;
		int time;
		int numberOfTimesInterestAppliedPerTimePeriod;
		SimpleInterestCalculator simple=new SimpleInterestCalculator();
		CompoundInterestCalculator compound=new CompoundInterestCalculator();
		Scanner objSimple=new Scanner(System.in);
		Scanner objCompound=new Scanner(System.in);
		System.out.println("FOR SIMPLE INTEREST::\nEnter InitialPrincipalBalance(p),Time(t),InterestRate(r)");
		initialPrincipalBalance=objSimple.nextDouble();
		interestRate=objSimple.nextDouble();
		time=objSimple.nextInt();
		System.out.println("FOR COMPOUND INTEREST::\nEnter InitialPrincipalBalance(p),Time(t),InterestRate(r),NumberOfTimesInterestAppliedPerTimePeriod(n)");
		initialPrincipalBalance=objCompound.nextDouble();
		interestRate=objCompound.nextDouble();
		time=objCompound.nextInt();
		numberOfTimesInterestAppliedPerTimePeriod=objCompound.nextInt();
		simpleInterest=simple.calculateSimpleInterest(initialPrincipalBalance,interestRate,time);
		compoundInterest=compound.calculateCompoundInterest(initialPrincipalBalance,interestRate,numberOfTimesInterestAppliedPerTimePeriod,time);
		System.out.println("Simple Interest "+ simpleInterest);		
		System.out.println("Compound Interest "+compoundInterest);
	}
}
