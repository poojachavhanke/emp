package LMN;

class Fybcs{
	int studrollno = 15;
	String studname = "pooja";
	String studclass = "fybcs";
	char studgrade = 'o';
	float studmark = 91.54f;
	void fyinfo()
	{
		System.out.println("fy roll no is " + studrollno);
		System.out.println("fy name is " + studname);
		System.out.println("fy class is " + studclass);
		System.out.println("fy grade is " + studgrade);
		System.out.println("fy mark is " + studmark);
	}
  }
	class Sybcs{
		int studrollno = 14;
		String studname = "Ashwini";
		String studclass = "sybcs";
		char studgrade = 'o';
		float studmark = 94.54f;
		void syinfo()
		{
			System.out.println("sy roll no is "+studrollno);
			System.out.println("sy name is " +studname);
			System.out.println("sy class is " +studclass);
			System.out.println("sy grade is "+studgrade);
			System.out.println("sy mark is "+studmark);
			
		}
	}
	class Tybcs{
		int studrollno = 13;
		String studname = "vaishnavi";
		String studclass = "tybcs";
		char studgrade = 'o';
		float studmark = 93.54f;
		void tyinfo() {
			System.out.println("ty roll no is " + studrollno);
			System.out.println("ty name is " + studname);
			System.out.println("ty class is " + studclass);
			System.out.println("ty grade is " + studgrade);
			System.out.println("ty mark is " + studmark);
		}
		
	}
public class Stud {
	public static void main(String[] args)
	{
		Fybcs f1 = new Fybcs();
		f1.fyinfo();
		Sybcs s1 = new Sybcs();
		s1.syinfo();
		Tybcs t1 = new Tybcs();
		t1.tyinfo();
		
	}

}
