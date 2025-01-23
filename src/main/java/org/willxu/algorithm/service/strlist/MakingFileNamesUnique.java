package org.willxu.algorithm.service.strlist;

public interface MakingFileNamesUnique {
	/**
	 * Given an array of strings names of size n. You will create n
	 * folders in your file system such that, at the i^th minute, you
	 * will create a folder with the name names[i].
	 * <p>
	 * Since two files cannot have the same name, if you enter a folder
	 * name that was previously used, the system will have a suffix
	 * addition to its name in the form of (k), where, k is the smallest
	 * positive integer such that the obtained name remains unique.
	 * <p>
	 * Return an array of strings of length n where ans[i] is the actual
	 * name the system will assign to the ith folder when you create it.
	 * 
	 * @param names 1 <= names.length <= 5 * 10^4
	 *              1 <= names[i].length <= 20
	 *              names[i] consists of lowercase English letters,
	 *              digits, and/or round brackets.
	 */
	String[] getFolderNames(String[] names);
}
