//82% of storage used … If you run out, you won't have enough storage to create, edit and upload files. Get 100 GB of storage for ₹130.00 ₹35.00/month for 3 months.
package experiment_practice;

public class TestArray {

	public static void main(String[] args) {

		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 90;
		arr[2] = 56;
		arr[3] = 67;
		arr[4] = 42;

		Employee e1 = new Employee(1, "Ritesh", 70000);
		Employee e2 = new Employee(2, "Nisha", 30000);
		Employee e3 = new Employee(3, "Sonal", 50000);
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		// can we create array of UDT/RefType/Classes
		// YES

		Employee[] iacsd = new Employee[3];
		for (int i = 0; i < iacsd.length; i++) {
			System.out.println(iacsd[i]);
		}

		// store first element into iacsd
		iacsd[0] = e1;
		iacsd[1] = e2;
		iacsd[2] = e3;

		for (int i = 0; i < iacsd.length; i++) {
			System.out.println(iacsd[i]);
		}

		for(int i=0;i<iacsd.length;i++) {
			
			System.out.println(iacsd[i].hashCode());
		}

	}

}