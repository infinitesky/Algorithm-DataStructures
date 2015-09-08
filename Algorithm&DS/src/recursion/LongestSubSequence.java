package recursion;

public class LongestSubSequence {

	public static void main(String[] args) {
		String str1 = "stringissubstringofstring";
		String str2 = "srt";
		
		String result = lcs(str1, str2);
		
		
		int length = lcslength(str1, str2);
		System.out.println("Length of the SubSequeunce: "+ length + "\nSubsequence String: "+ result);
		System.out.println( result);
		

	}
	
	
	
	private static String lcs(String str1, String str2){
		
		int x = str1.length();
		int y = str2.length();
		if (str1==null || str2==null)
			return "";
		if (x==0 || y==0)
			return "";
		else if (str1.charAt(x-1) == str2.charAt(y-1)){
			return  lcs(str1.substring(0, x-1), str2.substring(0, y-1))+ str1.charAt(y-1);
		}
		else
		{
			String a = lcs(str1,str2.substring(0,y-1));
			String b = lcs(str1.substring(0,x-1), str2);
			return (a.length()>b.length()?a:b);
		}
		
	}
	
	public static String getlcs(String a, String b){
	    int aLen = a.length();
	    int bLen = b.length();
	    if(aLen == 0 || bLen == 0){
	        return "";
	    }else if(a.charAt(aLen-1) == b.charAt(bLen-1)){
	        return lcs(a.substring(0,aLen-1),b.substring(0,bLen-1))
	            + a.charAt(aLen-1);
	    }else{
	        String x = lcs(a, b.substring(0,bLen-1));
	        String y = lcs(a.substring(0,aLen-1), b);
	        return (x.length() > y.length()) ? x : y;
	    }
	}
	
	public static int lcslength(String a, String b){
	    
		int x = a.length();
		int y = b.length();
		
		 if (x == 0 || y == 0)
		     return 0;
		
		 else if(a.charAt(x-1) == b.charAt(y-1)){
	        return 1 + lcslength(a.substring(0,x-1),b.substring(0,y-1));
	    }else{
	    	return Math.max(lcslength(a,b.substring(0,y-1)), lcslength(a.substring(0,x-1),b));
	        	 }
	}

}
