package leetcode.p0900_0999.p0914_xof_kind_in_deck_of_cards;

public interface XofKingInDeckOfCards {
    /**
     * In a deck of cards, each card has an integer written on it.
     * Return true if and only if you can choose X >= 2 such that it is
     * possible to split the entire deck into 1 or more groups of cards,
     * where:
     * - Each group has exactly X cards.
     * - All the cards in each group have the same integer.
     *
     * @param deck 1 <= deck.length <= 10^4
     *             0 <= deck[i] < 10^4
     * @return has same number of groups has same size.
     */
    boolean hasGroupsSizeX(int[] deck);
}
