package crawler;

public class Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Barea, Jose Juan  巴里亚, 何塞-胡安";
		/*String name = a.replaceAll(" ", "");
		System.out.println(name);
		int flag = -1;
		int length = name.length();
		for (int j=0;j <length;j++) {
			char c = name.charAt(j);
			if ((c >= 0x4e00)&&(c <= 0x9fbb)) {
				flag = j;
				break;
			}
		}
		String EName = "ename";
		String CName = "cname";
		if (flag != -1) {
			EName = name.substring(0, flag);
			CName = name.substring(flag);
		}*/
		String[] name = a.split("\\s+");
		System.out.println(name.length);
		//System.out.println("_"+EName+"_");
		//System.out.println("_"+CName+"_");
	}

}
