package org.willxu.algorithm.domain.integer;

/**
 * Implement the class SubrectangleQueries which receives a rows x cols
 * rectangle as a matrix of integers in the constructor and supports two
 * methods:
 * <p>
 * There will be at most 500 operations considering both methods:
 * updateSubrectangle and getValue.
 * rows == rectangle.length
 * cols == rectangle[i].length
 */
public interface SubrectangleQueries {
	/**
	 * Updates all values with newValue in the subrectangle whose upper
	 * left coordinate is (row1,col1) and bottom right coordinate is
	 * (row2,col2).
	 * 
	 * @param row1,row2 0 <= row1 <= row2 < rows
	 * @param col1,col2 0 <= col1 <= col2 < cols
	 * @param newValue 1 <= newValue, rectangle[i][j] <= 10^9
	 */
	void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue);
    
	/**
	 * Returns the current value of the coordinate (row,col) from the
	 * rectangle.
	 * 
	 * @param row,col 1 <= rows, cols <= 100
	 *                0 <= row < rows
	 *                0 <= col < cols
	 */
    public int getValue(int row, int col);
}
