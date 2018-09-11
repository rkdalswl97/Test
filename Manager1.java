import java.util.*;
public class Manager1 {
	private Scanner a = new Scanner(System.in);
	private ArrayList<Student> de01 = new ArrayList<Student>();
	
	private void read() {
		System.out.println("학생 이름, 학과, 학번, 학점 평균을 입력하세요.");
		for(int i = 0; i<4;i++) {
			System.out.print(">>");
			String text = a.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			String name = st.nextToken().trim();
			String dept = st.nextToken().trim();
			String no = st.nextToken().trim();
			double grade = Double.parseDouble(st.nextToken().trim());
			Student student = new Student(name, dept, no, grade);
			de01.add(student);
		}
	}
		
		private void print() { 
			Iterator<Student> it = de01.iterator();
			while (it.hasNext()) {
				Student student = it.next();
				System.out.println("-----------------------");
				System.out.println("이름:" + student.getName());
				System.out.println("학과:" + student.getdept());
				System.out.println("학번:" + student.getno());
				System.out.println("학점평균:" + student.getgrade());
				System.out.println("-----------------------");
			}	
	}
		private void Search(){
			while (true) {
			System.out.print("학생 이름 >>");
			String name = a.nextLine();
			if (name.equals("그만")) {
				break;
			}
			for (int i = 0; i < de01.size(); i++) {
				Student student = de01.get(i);
				if(student.getName().equals(name)) {
					System.out.print(student.getName() + ", ");
					System.out.print(student.getdept() + ", ");
					System.out.print(student.getno() + ", ");
					System.out.println(student.getgrade());
					break;
				}
			}
		}
			
			
	}
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager1 manager1 = new Manager1();
		manager1.read();
		manager1.print();
		manager1.Search();
		

	}

}
