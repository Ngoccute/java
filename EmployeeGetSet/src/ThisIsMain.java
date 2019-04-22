
public class ThisIsMain {

	public static void main(String[] args) {
		Job job1=new Job("coding",01);
		Job job2=new Job("tester",02);
		Job job3=new Job("hr",03);
		Job job4=new Job("dev",04);
		Job[] j=new Job[4];
	// TODO Auto-generated method stub
      Employee e1=new Employee("ngoc",184216404,90.5,22,false,job1);
	  Employee e2=new Employee("sinh",134564565,70.6,21,false,job2);
	  Employee e3=new Employee("trang",145676565,80.4,22,false,job3);
	  Employee e4=new Employee("hang",145678923,67.4,22,true,job4);
	  Employee e5=new Employee("van",145567865,50.4,22,true,job3);
	  Employee[] e=new Employee[5];
	  e[0]=e1;
	  e[1]=e2;
	  e[2]=e3;
	  e[3]=e4;
	  e[4]=e5;
	  
	  System.out.print("        "+"name:"+"     "+"id"+"         "+"salary"+"     "+"age"+"     ");
	  System.out.println("marry"+"     "+"job"+"     "+"IdJob");
	System.out.print("nv1:"+"    "+e1.getName()+"     "+e1.getId()+"     "+e1.getSalary()+"      ");
	System.out.println(+e1.getAge()+"      "+e1.isMarry()+"     "+e1.getJob().getJobname()+"    "+e1.getJob().getId());
	System.out.print("nv2:"+"    "+e2.getName()+"     "+e2.getId()+"     "+e2.getSalary()+"      ");
	System.out.println(+e2.getAge()+"      "+e2.isMarry()+"     "+e2.getJob().getJobname()+"    "+e2.getJob().getId());
	System.out.print("nv3:"+"    "+e3.getName()+"     "+e3.getId()+"     "+e3.getSalary()+"      ");
	System.out.println(+e3.getAge()+"      "+e3.isMarry()+"     "+e3.getJob().getJobname()+"    "+e3.getJob().getId());
	System.out.print("nv4:"+"    "+e4.getName()+"     "+e4.getId()+"     "+e4.getSalary()+"      ");
	System.out.println(+e4.getAge()+"      "+e4.isMarry()+"     "+e4.getJob().getJobname()+"    "+e4.getJob().getId());
	System.out.print("nv5:"+"    "+e5.getName()+"     "+e5.getId()+"     "+e5.getSalary()+"      ");
	System.out.println(+e5.getAge()+"      "+e5.isMarry()+"     "+e5.getJob().getJobname()+"    "+e5.getJob().getId());
	
	/*for(int i=0;i<e.length;i++) {
		//e[i]=e[i+1];
		//j[i]=j[i+1];
		
		System.out.print("nv"+i+":"+e[i].name +"     "+e[i].id+"     "+e[i].salary);
		System.out.print("     "+e[i].age+"     "+e[i].marry+"     "+e[i].job.jobname);
		System.out.println("     "+e[i].getJob().getId());
	}*/
	}

}
