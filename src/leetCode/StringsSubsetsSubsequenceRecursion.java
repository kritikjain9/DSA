package leetCode;
import java.util.*;

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
	
	public static ArrayList<String> returnSubsets(String str) {
		if(str.isEmpty()) {
			ArrayList<String> res = new ArrayList<>();
			res.add("");
			return res;
		}
		
		char ch = str.charAt(0);
		ArrayList<String> rres = returnSubsets(str.substring(1));
		ArrayList<String> myRes = new ArrayList<>();
		for(String s : rres) {
			myRes.add("" + s);
		}
		for(String s : rres) {
			myRes.add(ch + s);
		}
		return myRes;
	}
	
	public static void printAsciiSubsets(String str, String res) {
		if(str.isEmpty()) {
			System.out.println(res);
			return;
		}
		
		char ch = str.charAt(0);
		printAsciiSubsets(str.substring(1), res);
		printAsciiSubsets(str.substring(1), res+ch);
		printAsciiSubsets(str.substring(1), res+(int)ch);
	}
	
	
	public static ArrayList<String> returnAsciiSubsets(String str, String res){
		if(str.isEmpty()) {
			ArrayList<String> bc = new ArrayList<>();
			bc.add(res);
			return bc;
		}
		
		char ch = str.charAt(0);
		
		ArrayList<String> left = returnAsciiSubsets(str.substring(1), res);
		ArrayList<String> right = returnAsciiSubsets(str.substring(1), res + ch);
		ArrayList<String> mid = returnAsciiSubsets(str.substring(1), res + (int)ch);
		
		left.addAll(right);
		left.addAll(mid);
		
		return left;
	}
	

		public static void solver() {
	//	System.out.println(printSubsets("abc"));
	//	printAsciiSubsets("ab ","");
			System.out.println(returnAsciiSubsets("ab", ""));
		}
	
}
