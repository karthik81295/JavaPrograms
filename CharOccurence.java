public class CharOccurence{
	public static void main(String[] args) {
		String str="xxxxxxxgggggggggmmckkkllxxxy";
		StringBuilder sb=new StringBuilder("");
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			int j=i;
			while(j<str.length() && ch==str.charAt(j)){ //left-to -rigtht associativity therefore check j vlaue first
				System.out.println("Ch:"+ch+" ch2:"+str.charAt(j)+"i,j:"+i+","+j);
				j++;
			}
			sb.append(ch);
			sb.append(j-i);
			System.out.println(sb.toString()+"i,j:"+i+","+j);
			i=j-1;
	
		}
		System.out.println(sb.toString());
	}
}