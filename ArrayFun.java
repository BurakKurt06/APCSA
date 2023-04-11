import java.util.Arrays;

public class ArrayFun {
	public static int[] multOfSevens (int n) {
		int [] temp = new int [n];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = 7 * (i + 1);
		}
		return temp;
	}
	
	public static int findFriend(String [] arr, String fr) {
		int frIndex = -1;
		for(int i = 0; i < arr.length; i++) {
			if (arr[i].equalsIgnoreCase(fr)) {
				frIndex = i;
			}
		}
		return frIndex;
	}
	
	public static int findFriendIndex(String [] arr, String fr) {
		int frIndex = -1;
		for(int i = 0; i < arr.length; i++) {
			if (arr[i].equalsIgnoreCase(fr)) {
				frIndex = i + 1;
			}
		}
		return frIndex;
	}
	
	public static String [] deleteFriend (String arr [], String fr) {
		int index = findFriendIndex(arr, fr);
		String [] newList = new String [arr.length - 1];
		
		for (int i = index; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		for (int i = 0; i < newList.length; i++) {
			newList[i] = arr[i];
		}
		return newList;
	}
	
	public static String[] nameArray (String last) {
		String[] nameArr = new String[last.length()];
		for (int i = 0; i<nameArr.length; i++) {
			nameArr[i] = last.charAt(i) + "";
		}
		return nameArr;
	}
	
	public static void main(String [] args) {
		System.out.println(Arrays.toString(multOfSevens(5)));
		
		String friends [] = new String [] { "Charlie", "Lucy", "Sally", "Linus" };
		System.out.println(Arrays.toString(friends));
		System.out.println(findFriend(friends, "Lucy "));
		
	}
}