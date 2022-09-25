package day7_objectwithconditions;

public class UseStudent {
	public static void main(String[] args) {
		
		Student student1=new Student();
		student1.name="Sasi";
		student1.initial='S';
		student1.age=22;
		student1.height=169;
		student1.phoneNumber=9876543210l;
		
		Student student2=new Student();
		student2.name="Nisha";
		student2.initial='K';
		student2.age=20;
		student2.height=159;
		student2.phoneNumber=9753186420l;
		
		Student student3=new Student();
		student3.name="Karthi";
		student3.initial='K';
		student3.age=19;
		student3.height=175;
		student3.phoneNumber=8936753210l;
		
		if(student1.age<student2.age&&student1.age<student3.age) {
			System.out.println(student1.name+" is younger");
		}
		else if(student2.age<student1.age&&student2.age<student3.age) {
			System.out.println(student2.name+" is younger");
		}
		else {
			System.out.println(student3.name+" is younger");
		}
		
		if(student1.height>student2.height&&student1.height>student3.height) {
			System.out.println(student1.name+" is taller");
		}
		else if(student2.height>student1.height&&student2.height>student3.height) {
			System.out.println(student2.name+" is taller");
		}
		else {
			System.out.println(student3.name+" is taller");
		}
	}

}
