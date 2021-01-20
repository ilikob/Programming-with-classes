package by.main.simplest_classes_and_objects.class03;

public class Main {

	public static void main(String[] args) {
		int numberStudents=10;
		Student students []=new Student[numberStudents];
		int rating[];

		
		
		for(int i=0;i<students.length;i++) {
			rating=new int[5];
			
			for(int j=0;j<rating.length;j++) {
				rating[j]=(int)(Math.random()*10+1);
			}
			
			students[i]=new Student("Student"+i,111+i,rating);
		}
		
		
		System.out.println("Студенты:");
		for(Student x:students) {
			System.out.println(x);
		}
		
		
		System.out.println("Отличники:");
		for(Student x:students) {
			if(x.isGoodRating()) {
				System.out.println(x);
			}
		}
		
	}

}
