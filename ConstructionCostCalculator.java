import java.util.*;
class ConstructionCostCalculator implements StandardMaterial,AboveStandardMaterial,HighStandardMaterial,AutomatedAndHighStandardMaterial{
	double constructioncost;
	public void standardConstructionCost(String standard,double area,char cho){
		constructioncost=(1200*area);
	}
	public void aboveStandardConstructionCost(String standard,double area,char cho){
		constructioncost=(1500*area);
	}
	public void highStandardConstructionCost(String standard,double area,char cho){
		constructioncost=(1800*area);
	}
	public void automatedAndHighStandardConstructionCost(String standard,double area,char cho){
		constructioncost=(2500*area);
	}
	public void display(){
		System.out.println(constructioncost+"INR");
	}
	public static void main(String arg[]){
		String choice;
		double ar;
		char automated;
		ConstructionCostCalculator ob=new ConstructionCostCalculator();
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your choice");
		choice=obj.nextLine();
		ar=obj.nextInt();
		System.out.println("Do you want fully automated or not?Enter y/n");
		automated=obj.next().charAt(0);
		switch(choice){
			case "Standard Material":
				if(automated=='n'){
					ob.standardConstructionCost(choice,ar,automated);
					System.out.println("Construction Cost=");
					ob.display();
					break;
				}
				else{
					System.out.println("Fully Automated not applicable");
					break;
				}
			case "Above Standard Material":
				if(automated=='n'){
					ob.aboveStandardConstructionCost(choice,ar,automated);
					System.out.println("Construction Cost=");
					ob.display();
					break;
				}
				else{
					System.out.println("Fully Automated not applicable");
					break;
				}
			case "High Standard Material":
				if(automated=='n'){
					ob.highStandardConstructionCost(choice,ar,automated);
					System.out.println("Construction Cost=");
					ob.display();
					break;
				}
				else{
					System.out.println("Fully Automated not applicable");
					break;
				}
			case "Automated And High Standard Material":
			case "y":
				ob.automatedAndHighStandardConstructionCost(choice,ar,automated);
				System.out.println("Fully automated applicable \nConstruction Cost=");
				ob.display();
				break;
			default:
				System.out.println("Invalid Material Type");
		}
	}
}