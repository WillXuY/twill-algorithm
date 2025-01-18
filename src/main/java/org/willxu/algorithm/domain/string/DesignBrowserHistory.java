package org.willxu.algorithm.domain.string;

/**
 * You have a browser of one tab where you start on the homepage and you
 * can visit another url, get back in the history number of steps or
 * move forward in the history number of steps.
 * <p>
 * Implement the BrowserHistory class:
 * <p>
 * BrowserHistory(string homepage) Initializes the object with the
 * homepage of the browser.
 * <p>
 * - 1 <= homepage.length <= 20
 * - homepage consist of  '.' or lower case English letters.
 * - At most 5000 calls will be made to visit, back, and forward.
 */
public interface DesignBrowserHistory {
	/**
	 * Visits url from the current page. It clears up all the forward
	 * history.
	 * 
	 * @param url 1 <= url.length <= 20
	 *            consist of  '.' or lower case English letters.
	 */
	void visit(String url);

	/**
	 * Move steps back in history. If you can only return x steps in the
	 * history and steps > x, you will return only x steps. Return the
	 * current url after moving back in history at most steps.
	 * 
	 * @param steps 1 <= steps <= 100
	 */
    public String back(int steps);
    
    /**
     * Move steps forward in history. If you can only forward x steps in
     * the history and steps > x, you will forward only x steps. Return
     * the current url after forwarding in history at most steps.
     * 
	 * @param steps 1 <= steps <= 100
     */
    public String forward(int steps);
}
