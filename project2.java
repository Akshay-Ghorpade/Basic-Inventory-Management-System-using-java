import java.util.*;

class inventory {
	
}
//class stock management 
class production_management{
	Scanner obj1 = new Scanner(System.in);
	// array1 is storing the information of production of every month of the year 
	int array1[][]=new int[12][2];  // array1 has 12 rows and 2 columns columns are as respective actual production, target of that perticular month 
    
	public void adding_stock(){
		// integer b is used to know the number of month of year to which you want to add the details
		System.out.println("enter the month number->");
		int b = obj1.nextInt();
		System.out.println("enter the actual production ->");
		int actual_pro = obj1.nextInt(); 
		System.out.println("enter the target of that month ->");
		int target_pro = obj1.nextInt();
		array1[b-1][0]=actual_pro;
		array1[b-1][1]=target_pro;
		
	}
	
	// function viewing_productiondetails is to view the prodction detail of the perticular month
	public void viewing_productiondetails(){
		System.out.println("enter the month which you want to view the production detail ->");
		int view_pro = obj1.nextInt();
		System.out.println("production of month"+view_pro+" is "+array1[view_pro][0]+" and the target was "+array1[view_pro][1]);
	}
		
}
	
// class order management 
/*class order_management{
	array_order=
}*/
	
//class finance_details

class finance_details {
    Scanner obj1 = new Scanner(System.in);
    // array1 stores the profit and loss for each month of the year
    double array1[][]=new double[12][2]; // array1 has 12 rows and 2 columns columns are as respective actual profit/loss, target profit/loss of that particular month 

    public void adding_profit_loss() {
        // integer b is used to know the number of month of year to which you want to add the details
        System.out.println("Enter the month number ->");
        int month = obj1.nextInt();
        System.out.println("Enter the actual profit/loss ->");
        double actual_profit_loss = obj1.nextDouble(); 
        System.out.println("Enter the target profit/loss of that month ->");
        double target_profit_loss = obj1.nextDouble();
        array1[month-1][0] = actual_profit_loss;
        array1[month-1][1] = target_profit_loss;
    }

    // function viewing_profit_loss_details is to view the profit/loss detail of the particular month
    public void viewing_profit_loss_details() {
        System.out.println("Enter the month which you want to view the profit/loss detail ->");
        int view_month = obj1.nextInt();
        System.out.println("Profit/Loss of month " + view_month + " is " + array1[view_month-1][0] + " and the target was " + array1[view_month-1][1]);
    }
}


//class raw_material details 

class raw_material_details {
    Scanner obj1 = new Scanner(System.in);
    // array1 stores the raw material details for each month of the year
    double array1[][]=new double[12][3]; // array1 has 12 rows and 3 columns: month number, raw material purchased, raw material remaining

    public void add_rawmaterial() {
        
        System.out.println("Enter the month number ->");
        int month = obj1.nextInt();
        System.out.println("Enter the raw material purchased (kg) ->");
        double purchased = obj1.nextDouble(); 
        System.out.println("Enter the raw material remaining (kg) ->");
        double remaining = obj1.nextDouble();
        array1[month-1][0] = month;
        array1[month-1][1] = purchased;
        array1[month-1][2] = remaining;
    }

    // function view_raw_material_details is to view the raw material detail of the particular month
    public void view_details() {
        System.out.println("Enter the month which you want to view the raw material detail ->");
        int month = obj1.nextInt();
        System.out.println("Raw Material details for month " + month + ": ");
        System.out.println("Purchased (kg): " + array1[month-1][1]);
        System.out.println("Remaining (kg): " + array1[month-1][2]);
    }
}

	







// main class with name project 
class project2{
public static void main(String[] args){
	// object obj for scanner class
	Scanner obj = new Scanner(System.in);
	
	System.out.println("enter 1 for financial details 2 for production management and 3 for row material details");
	int a = obj.nextInt();
	// integer a is to use which class should be implemented 
	if(a==1 || a==2 || a==3){
		switch(a){
			case 1:
			System.out.println("enter 1 for detail updation 2 for viewing detail");
			finance_details obj5 = new finance_details();
			int x=obj.nextInt();
			switch(x){
				case 1:
				obj5.adding_profit_loss();
				break;
				case 2:
				obj5.viewing_profit_loss_details();
				break;
			}
			break;
			
			case 2:
			System.out.println("enter 1 for detail updation 2 for viewing detail");
			production_management obj6 = new production_management();
			int y=obj.nextInt();
			switch(y){
				case 1:
				obj6.adding_stock();
				break;
				case 2:
				obj6.viewing_productiondetails();
				break;
			}
			break;
			
			
			
			case 3:
			System.out.println("enter 1 for detail updation 2 for viewing detail");
			raw_material_details obj7 = new raw_material_details();
			int z=obj.nextInt();
			switch(z){
				case 1:
				obj7.add_rawmaterial();
				break;
				case 2:
				obj7.view_details();
				break;
			}
			break;
			
			
			
		}
	}
	else {
		System.out.println("enter proper number 1 or 2 or 3");
	}
}
} 