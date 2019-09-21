
public class FirstNonRepeatableCharacter {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("helloh");
		int counter[]=new int[256]; // max length of integer
		for(int i=0;i<s.length();i++){
			counter[s.charAt(i)]++;
		}
		// First non repeat character
		for(int i=0;i<s.length();i++){
			if(counter[s.charAt(i)]==1){
				System.out.println(s.charAt(i));
				break;
			}
		}
		// last non repeat character
		for(int i=s.length()-1;i>=0;i--){
			if(counter[s.charAt(i)]==1){
				System.out.println(s.charAt(i));
				break;
			}
		}
	}

}
