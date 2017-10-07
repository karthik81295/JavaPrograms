/* 
    program to find the largest palindrome substring 
    ex: i/p: "ggabcbaxyz"  ;
        o/p: "abcba"
*/



public class Test{
	public static void main(String[] args) {
		String str="gefhfhgdhgabcdeedcbaxyz";
		System.out.println("longest substring palindrome:"+subStr(str));
		//System.out.println(isPalindrome(str));
	}
	public static String subStr(String s){
		int len=s.length();
		int counter=1;
		while(len>1){
			for(int i=0;i<counter;i++){
				String sub=s.substring(i,len+i);
			//	System.out.println("sub string"+sub);
				if(isPalindrome(sub)){
					return sub;
				}
			}
			counter++;
			len--;
		}
		return "";

	}
	public static boolean isPalindrome(String s){
		for(int i=0;i<s.length()/2;i++){
			if(s.charAt(i)!=s.charAt(s.length()-1-i)){
				return false;
			}
		}
		return true;
	}
}
