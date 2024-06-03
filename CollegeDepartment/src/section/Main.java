package section;

public class Main {
	public static void main(String[] args) {
		
		//object for the super class
		
		SuperDepartment obj=new SuperDepartment();
		System.out.println(obj.departmentName());
		System.out.println(obj.getTodayWork());
		System.out.println(obj.getWorkDeadLine());
		System.out.println(obj.getTodayAHoliday());
		System.out.println("----------------------");
		
		//object for Admin Department
		
		AdminDepartment obj1=new AdminDepartment();
		System.out.println(obj1.departmentName());
		System.out.println(obj1.departmentName());
		System.out.print(obj1.getTodaysWork());
		
		System.out.println(obj1.getTodayAHoliday());
		System.out.println(obj1.getWorkDeadLine());
		System.out.println(obj1.getTodaysWork());
		System.out.println(obj1.getWorkDeadLine());
		System.out.println(obj1.getTodayAHoliday());
		System.out.println("-----------------");
		//object for hr department
		
		HRDepartment hd=new HRDepartment(); 
		System.out.println(hd.departmentName());
		System.out.println(hd.depatmentName());
		System.out.print(hd.getTodaysWork());
		System.out.println(hd.doActivities());
		System.out.println(hd.getTodayAHoliday());
		System.out.println("----------------------");
		//object for Tech Department 
		
		TeckDepartment td=new TeckDepartment();
		System.out.println(td.departmentName());
		System.out.println(td.departmentName());
		System.out.println(hd.departmentName());
		System.out.println(td.getWorkDeadLine());
		System.out.print(hd.getTodaysWork());
		System.out.println(hd.doActivities());
		System.out.println(hd.getTodayAHoliday());
		System.out.print(td.getTodayWork());
		System.out.println(td.getStackInformation());
		System.out.println(td.getTodayAHoliday());
		System.out.println("---------------");
	}

}
