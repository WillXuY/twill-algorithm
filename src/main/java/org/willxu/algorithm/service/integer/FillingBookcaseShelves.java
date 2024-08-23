package org.willxu.algorithm.service.integer;

public interface FillingBookcaseShelves {
    /**
     * You are given an array books where
     * books[i] = [thickness_i, height_i] indicates the thickness and
     * height of the ith book. You are also given an integer shelfWidth.
     * <p>
     * We want to place these books in order onto bookcase shelves that
     * have a total width shelfWidth.
     * <p>
     * We choose some of the books to place on this shelf such that the
     * sum of their thickness is less than or equal to shelfWidth, then
     * build another level of the shelf of the bookcase so that the
     * total height of the bookcase has increased by the maximum height
     * of the books we just put down. We repeat this process until there
     * are no more books to place.
     * <p>
     * Note that at each step of the above process, the order of the
     * books we place is the same order as the given sequence of books.
     * <p>
     * - For example, if we have an ordered list of 5 books, we might
     *   place the first and second book onto the first shelf, the
     *   third book on the second shelf, and the fourth and fifth book
     *   on the last shelf.
     * <p>
     * Return the minimum possible height that the total bookshelf can
     * be after placing shelves in this manner.
     *
     * @param books 1 <= books.length <= 1000
     * @param shelfWidth 1 <= thickness_i <= shelfWidth <= 1000
     *                   1 <= height_i <= 1000
     */
    int minHeightShelves(int[][] books, int shelfWidth);
}
