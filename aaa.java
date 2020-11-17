package midterm;

public class aaa {

	public static void main(String[] args) {
		int temp=15;
		for(int i=0;i<5;i++) {
			for(int j=0;j<4-i;++j) {
				System.out.printf("%3s"," ");
			}
			for(int z=0;z<i+1;++z) {
				System.out.printf("%02d ", temp);
				temp--;
			}
			System.out.printf("%n");
		}

	}

}
