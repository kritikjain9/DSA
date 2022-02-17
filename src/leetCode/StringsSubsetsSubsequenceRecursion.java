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
	
	
	public static void iterativeSubsets(int[] arr) {
		//wrong answer - these are subSequences, not subsets
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j <= arr.length; j++) {
				
				for(int p = i; p < j; p++)
					System.out.print(arr[p] + " ");
				System.out.println();
			}
		}
	}
	
	public static void __iterativeSubsets(int[] arr) {
		for(Integer i = 0; i < (int)Math.pow(2, arr.length); i++) {
			String str = Integer.toBinaryString(i);
//			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
//			System.out.println(i);
//			for(char ch : str.toCharArray()) {
//				System.out.println(ch - '0');
//			}
//			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
			char[] carr = str.toCharArray();
			for(int j = 0; j < carr.length; j++) {
				char c = carr[j];
				if(c - '0' == 1) {
					System.out.print(arr[j] + "\t");
				}
			}
			System.out.println();
		}
	}
	
	public static List<List<Integer>> ____iterativeSubsets(int[] arr){
		List<List<Integer>> res = new ArrayList<>();
		res.add(new ArrayList<>());
		
		
		
		return res;
	}
	
        public static boolean isValid(String s) {
        
	        Stack<Character> st = new Stack<>();
	        for(int i = 0; i < s.length(); i++){
	            char ch = s.charAt(i);
	        // for(char ch : s.toCharArray()){
	            if(ch == '(' || ch == '[' || ch == '{'){
	                st.push(ch);
	            }
		            else if(ch == ')' || ch == ']' || ch == '}'){
		                if(st.size() == 0)
		                    return false;
		            else if(ch == ')' && st.peek() != '('){
		                return false;
		            }
		            else if(ch == '}' && st.peek() != '{'){
		                return false;
		            }
		            else if(ch == ']' && st.peek() != '['){
		                return false;
		            }else {
		            	st.pop();	            	
		            }
	            }
	        }
	        if(st.size() != 0)
	            return false;
	        
	        return true;
        }
        
        public static void printPermutations(String str, char[] boxes, int p) {
        	System.out.println("```````````````````");
        	if(p == str.length()) {
        		for(char c : boxes) {
        			System.out.print(c + "\t");
        		}
        		System.out.println();
        	}
        	
        	System.out.println("```````````````````");
        	
        	for(int i = 0; i < str.length(); i++) {
        		char ch = str.charAt(i);
        		if(boxes[i] == '\u0000') {
        			boxes[i] = ch;
        			printPermutations(str, boxes, p++);
        		}
        	}
        	System.out.println("```````````````````");
        }
	
		public static void solver() {
			printPermutations("abc", new char[3], 0);
			
//			System.out.println(isValid("(])"));
			
//			int[] arr = {1, 2, 3};
//			List<List<Integer>> res = ____iterativeSubsets(arr);
//			for(List<Integer> list : res) {
//				System.out.println(list);
//			}
		
		}
	
}
