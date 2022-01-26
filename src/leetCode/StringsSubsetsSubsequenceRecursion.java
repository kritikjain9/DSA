package leetCode;

public class StringsSubsetsSubsequenceRecursion {

	public static void main(String[] args) {
		solver();
	}
	
	public static void removeAs(String str, int idx, String res) {
		if(idx == str.length()) {
			System.out.println(res);
			return;
		}
		
		char ch = str.charAt(idx);
		if(ch != 'a')
			removeAs(str, idx+1, res+= ch);
		else {
			removeAs(str, idx + 1, res);
		}
	}
	
	//better approach
	public static String _removeAs(String str, int idx) {
		if(idx == str.length())
			return new String();
		
		char ch = str.charAt(idx);
		if(ch != 'a') {
			return ch + _removeAs(str, idx+1);
		}else {			
			return _removeAs(str, idx+1);
		}
	}
	
	public static String removeA(String str) {
		String res = "";
		for(char ch : str.toCharArray()) {
			if(ch != 'a')
				res += ch;
		}
		return res;
	}
	
	public static String removeUnwanted(String str, String un) {
		if(str.isEmpty())
			return "";
		
		if(str.startsWith(un)) {
			return removeUnwanted(str.substring(un.length()), un);
		}else {
			return str.charAt(0) + removeUnwanted(str.substring(1), un);
		}
		
	}
	
	public static String removeUnwantedKeepWanted(String str, String wanted, String unwanted) {
		if(str.isEmpty())
			return "";
		
		//minute change rahega ki that string should startswith(wanted) and should not startwith(unwanted)
		if(str.startsWith(unwanted) && !str.startsWith(wanted)) {
			return removeUnwantedKeepWanted(str.substring(unwanted.length()), wanted, unwanted);
		}else {
			return str.charAt(0) + removeUnwantedKeepWanted(str.substring(1), wanted, unwanted);
		}
		
	}
	
	public static void printSubsets(String str, String res) {
		if(str.isEmpty()) {
			System.out.println(res);
			return;
		}
		
		char ch = str.charAt(0);
		printSubsets(str.substring(1), res+ch);
		printSubsets(str.substring(1), res);
	}

	public static void solver() {
		printSubsets("abc", "");
//		System.out.println(removeUnwantedKeepWanted("A_GOOD_appleapp_appapple_STRING", "apple", "app"));
//		System.out.println(removeUnwanted("kritikjainisnotabeast", "kritikjain"));
//		removeAs(str, 0, res);
//		System.out.println(_removeAs("baccaaaaaaad", 0));
	}
	
}
