public class UniqueChars{
	public static void main(String[] args) {
		String str="abedefaaezzzzzzzxjdgdfsjadknskadcdd";
		StringBuilder unique=new StringBuilder("");
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			/*
			method-1
			if(! unique.toString().contains(""+ch)){ 
			*/
			//method-2 (code to avoid concat of strings)
			if(unique.toString().indexOf(ch)<0){
				unique.append(ch);
			}
		}
		char[] uniqueChars=unique.toString().toCharArray();
		for(char c:uniqueChars){
			System.out.println(c);
		}
		System.out.println("success");
	}
}