import java.util.*;
class week1_prog7{
public static void main(String args[]){
 Scanner scan=new Scanner(System.in);
 int km_per_hr,mtr_per_sec,choice;
  do{
 System.out.println(" 1.km_per_hr to mtr_per_sec\n 2.mtr_per_sec to km_per_hr.\n Enter your choice(0 to stop)");
choice=scan.nextInt();
switch(choice){
	case 1:System.out.println("Enter the speed in km_per_hr :");
            km_per_hr=scan.nextInt();
            double mt=0.277777778* km_per_hr;
            System.out.println("speed in mtr per sec: "+ mt);
            break;
    case 2:System.out.println("Enter the speed in mtr_per_sec :");
            mtr_per_sec=scan.nextInt();
           double km=3.6 * mtr_per_sec;
           System.out.println("speed in km per sec: " +km);
           break;
           default:System.out.println("Enter valid choice");
           break;
           }
	}while(choice !=0);
}
}