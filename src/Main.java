public class Main {
	 public static void main(String[] args) {
		 Courses courses1=new Courses(1,"C# & Angular","Engin DEM�RO�");
		 Courses courses2=new Courses(2,"Java & React ","Engin DEM�RO�");
		 Courses courses3=new Courses(3,"Programlama Giri� i�in Temel Kurs","Engin DEM�RO�");

		 Courses[] courses= {courses1,courses2,courses3};
		 
		 for (Courses course : courses) {
			 System.out.println(course.course_name);
			
		}
		 Category category1=new Category(1,"Programlama");
		 Category category2=new Category(2,"T�m�");
		 
		 Category[] category= {category1,category2};
		 
		for (Category categorys: category) {
			
			System.out.println(categorys.category_name);
			
			
		}
		 CourseManager courseManager1=new CourseManager();
		   courseManager1.Add(courses3);
		   
		   CourseManager courseManager2=new CourseManager();
		   courseManager2.Delete(courses3);
		   
		   

		 
		 
		 
	 }

}
