import java.util.*;
class StandardMaterialConstructionCost implements StandardMaterial{
	public double standardConstructionCost(String standard,double area,char cho){
		return (1200*area);
	}
}
class AboveStandardMaterialConstructionCost implements AboveStandardMaterial{
	public double aboveStandardConstructionCost(String standard,double area,char cho){
		return (1500*area);
	}
}
class HighStandardMaterialConstructionCost implements HighStandardMaterial{
	public double highStandardConstructionCost(String standard,double area,char cho){
		return (1800*area);
	}
}
class AutomatedAndHighStandardMaterialConstructionCost implements AutomatedAndHighStandardMaterial{
	public double automatedAndHighStandardConstructionCost(String standard,double area,char cho){
		return (2500*area);
	}
}
class ConstructionCostCalculator{
	public static void main(String arg[]){
		String choice;
		double ar;
		char automated;
		double constructioncost;
		StandardMaterialConstructionCost sm=new StandardMaterialConstructionCost();
		AboveStandardMaterialConstructionCost asm=new AboveStandardMaterialConstructionCost();
		HighStandardMaterialConstructionCost hsm=new HighStandardMaterialConstructionCost();
		AutomatedAndHighStandardMaterialConstructionCost ahsm=new AutomatedAndHighStandardMaterialConstructionCost();
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your choice");
		choice=obj.nextLine();
		System.out.println("Total Area Of House");
		ar=obj.nextDouble();
		System.out.println("Do you want fully automated or not?Enter y/n");
		automated=obj.next().charAt(0);
		switch(choice){
			case "Standard Material":
				if(automated=='n'){
					constructioncost=sm.standardConstructionCost(choice,ar,automated);
					System.out.println("Construction Cost= " +constructioncost+" INR");
					break;
				}
				else{
					System.out.println("Fully Automated not applicable");
					break;
				}
			case "Above Standard Material":
				if(automated=='n'){
					constructioncost=asm.aboveStandardConstructionCost(choice,ar,automated);
					System.out.println("Construction Cost= " +constructioncost+" INR");
					break;
				}
				else{
					System.out.println("Fully Automated not applicable");
					break;
				}
			case "High Standard Material":
				if(automated=='n'){
					constructioncost=hsm.highStandardConstructionCost(choice,ar,automated);
					System.out.println("Construction Cost= " +constructioncost+" INR");
					break;
				}
				else{
					System.out.println("Fully Automated not applicable");
					break;
				}
			case "Automated And High Standard Material":
				if(automated=='y'){
					constructioncost=ahsm.automatedAndHighStandardConstructionCost(choice,ar,automated);
					System.out.println("Fully automated applicable \nConstruction Cost= "+constructioncost+" INR");
					break;
				}
				else{
					System.out.println("Please go for only \"High Standard Material\" for Non-Automated Home");
					break;
				}
			
			default:
				System.out.println("Invalid Material Type");
		}
	}
}