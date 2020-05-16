import java.util.*;
class com implements Comparator<Student>
{
    @Override
    public int compare(Student a, Student b)
    {
        if(a.cgpa==b.cgpa)
        {
            if(a.fname.compareTo(b.fname)==0)
            {
                return a.id-b.id;

            }
            else
            {
                return a.fname.compareTo(b.fname);
            }

        }
        else
        {
            int k=0;
            if(b.cgpa-a.cgpa>0)
            {
                k=1;

            }
            else
            {
                k=-1;
            }

            return k;
        }
    }

}
class Student{
	public int id;
	public String fname;
	public double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

//Complete the code
public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
        Collections.sort(studentList,new com());
      
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}



