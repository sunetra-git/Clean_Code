import java.lang.Math;
class InterestCalculator implements SimpleInterest,CompoundInterest{
	double interest;
	public void calculateSimpleInterest(double p,double r,int t){
		interest=(p*r*t)/100;
	}
	public void display(){
		System.out.println(interest);
	}
	public void calculateCompoundInterest(double p,double r,int n,int t){
		double k=(1+(r/n));
		interest=p*(Math.pow(k,(n*t)));
	}
	public static void main(String ar[]){
		InterestCalculator ob=new InterestCalculator();
		ob.calculateSimpleInterest(100.00,0.15,5);
		System.out.println("Simple Interest");
		ob.display();
		ob.calculateCompoundInterest(100.00,0.15,2,5);
		System.out.println("Compound Interest");
		ob.display();
	}
}
