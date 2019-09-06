  
public class Anagram {
	public static char[] sort(char[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					char temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		
		return arr;
	}

	public static boolean Anagram(String a,String b){
		String  s1=a.replaceAll("\\s","").toLowerCase();
		String s2=b.replaceAll("\\s","").toLowerCase();
		if(s1.length()!=s2.length()){
			return false;
		}
		String f=new String(sort(a.toCharArray()));
		String g=new String(sort(b.toCharArray()));
		
		if(f.equals(g)){
			return true;
		}else{
			return false;
		}
		
		
	}
	public static void main(String[] args) {
		String a="keep";
		String b="peek";
		boolean result=Anagram(a,b);
		System.out.println(result);

	}

}
