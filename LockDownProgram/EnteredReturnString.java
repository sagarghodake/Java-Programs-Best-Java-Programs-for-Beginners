package LockDownProgram;

public class EnteredReturnString {

	public static void printString(String str[], char ch1, char ch2) {
		int i, j;
		for (i = 0; i < str.length; i++) {
			// System.out.println(str[i]);
			char ch[] = str[i].toCharArray();
			for (j = 0; j < str.length; j++) {
				if (ch[0] == ch1 && ch[1] == ch2) {
					System.out.println(str[i]);
					break;
				} else {
					continue;
				}
			}
		}
	}

	public static void main(String[] args) {
		char ch1 = 'd', ch2 = 'o';
		String str[] = { "del", "dog", "deal", "determine", "do" };
		EnteredReturnString.printString(str, ch1, ch2);

	}
}

/*
 * package LockDownProgram;

public class EnteredReturnString {
	
	public static void printString(String str[],int pos1,int pos2,char ch1,char ch2){
		int i,j;
		for(i=0;i<str.length;i++){
			//System.out.println(str[i]);
			char ch[]=str[i].toCharArray();
			for(j=0;j<str.length;j++){
				if(ch[pos1-1]==ch1 && ch[pos2-1]==ch2){
					System.out.println(str[i]);
					break;
				}else{
					continue;
				}
			}
		} 
	} 
	
	public static void main(String[] args) {
		int pos1=1,pos2=2;
		char ch1='d',ch2='e';
		String str[]={"del","dog","deal","determine","do"};
		EnteredReturnString.printString(str,pos1,pos2,ch1,ch2);
		
	}
}
*/
