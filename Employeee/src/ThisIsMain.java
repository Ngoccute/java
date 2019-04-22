import java.util.Scanner;
public class ThisIsMain{
	static Employeee[] e=new Employeee[100];
	static Job[] job=new Job[100];
	
	
	public static int nhap() {
		int n=0;
		boolean check=false;
		Scanner s=new Scanner(System.in);
		while(!check) {
			System.out.println(" ");
			try {
				n=s.nextInt();
				check=true;
			}catch(Exception e){
				System.out.println("yeu cau nhap lai!! ");
				s.nextLine();
			}
		}
		System.out.println(n);
		return n;				
	}
	
	 public static void chucNang() {
		 System.out.println("lam theo yeu cau: ");
		 System.out.println("nhap 1 de xem thong tin nhan vien");
		 System.out.println("nhap 2 de them nhan vien");
		 System.out.println("nhap 3 de thoat");
		
	}
	 public static void witchCase() {
		 
    	int n=nhap();
    	switch(n) {
    		case 1: 
    			thongtin();//HIEN THI THong tin
    			chucNang();
    			witchCase();
    			break;
    		case 2:
    			themThongTin();//them thong tin
    			chucNang();
    			witchCase();
    			break;
    		case 3:System.exit(0);
    		
    	}
    	}
	 
	 public static void thongtin() {
	    Job job0=new Job("corder",01);
		Employeee e1=new Employeee("ngoc",1234,45.6,22,false, job0);
		e[0]=e1;
		System.out.print("     name      id       salary     age    marry      ");
		System.out.println("jobname       id job ");
		System.out.println("nhap nhan vien can tim");
		
		Scanner s=new Scanner(System.in);
		int nhanvien=s.nextInt();
		System.out.print("nv1: "+e[nhanvien].name+"    "+e[nhanvien].id+"    "+e[nhanvien].salary+"     ");
		System.out.print(e[nhanvien].age+"     "+e[nhanvien].marry+"    "+e[nhanvien].job.jobname);
		System.out.println("     "+e[nhanvien].job.id);
	 }
	 
	 public static void themThongTin() {
		 int i=1;
		 boolean check=false;
		 Scanner s=new Scanner(System.in);
		 while(!check) {
		 try { 
			System.out.println(" nhap vao ho ten: ");
			String name =s.nextLine();
			System.out.println("nhap vao id: ");
			int id=s.nextInt();
			System.out.println("nhap vao salary:");
			double salary=s.nextDouble();
			System.out.println("nhap vao age: ");
			int age=s.nextInt();
			System.out.println("nhap vao marry:  ");
			boolean marry=s.hasNext();
		      /* Scanner j1=new Scanner(System.in);
		       System.out.println("nhap vao job id: ");
		       int jobId=j1.nextInt();
		       System.out.println("nhap vao job name: ");
		       String jobName=j1.nextLine();*/
		      check=true; 
		     // job[0]=new Job("corder",01);
		      job[1]=new Job("hr",1);
		      job[2]=new Job("coder",02);
		      job[3]=new Job("tester",03);
		      for(int index=1;index<4;index++) {
		    	  System.out.println(index+": "+ job[index].jobname );
		      }
		      System.out.println("nhap chon job: ");
		      Scanner jb =new Scanner(System.in);
		      int congviec=jb.nextInt();
		      e[i]=new Employeee(name, id, salary, age, marry, job[congviec]);
		      System.out.print("nv1: "+e[i].name+"    "+e[i].id+"    "+e[i].salary+"     ");
				System.out.print(e[i].age+"     "+e[i].marry+"    "+e[i].job.jobname);
				System.out.println("     "+e[i].job.id);
             
			}catch(Exception e) {
				System.out.println("loi: "+e);
				System.out.println("yeu cau nhap lai");
				s.nextLine();
			}
		
		 }
	    } 
		
	public static void main(String[] args) {
		chucNang();
		witchCase();
		        //System.out.println("input n:");
		        //nhap();
		       //111 thongtin();
				
	}
}