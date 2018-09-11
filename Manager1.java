import java.util.*;
public class Manager1 {
	private Scanner a = new Scanner(System.in);
	private ArrayList<Student> de01 = new ArrayList<Student>();
	
	private void read() {
		System.out.println("�л� �̸�, �а�, �й�, ���� ����� �Է��ϼ���.");
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
				System.out.println("�̸�:" + student.getName());
				System.out.println("�а�:" + student.getdept());
				System.out.println("�й�:" + student.getno());
				System.out.println("�������:" + student.getgrade());
				System.out.println("-----------------------");
			}	
	}
		private void Search(){
			while (true) {
			System.out.print("�л� �̸� >>");
			String name = a.nextLine();
			if (name.equals("�׸�")) {
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
