package implicitConversion;

public class inplicitConversion1 {

	public static void main(String[] args) {
		byte bNum = 10;
		int iNum = bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);

		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(iNum2);
		System.out.println(fNum);
		
		double dnum;
		dnum = fNum + iNum;
		System.out.println(dnum);
	}

}
