package org.willxu.algorithm.domain;

import java.util.List;

/**
 * Design a simplified version of Twitter where users can post tweets,
 * follow/unfollow another user, and is able to see the 10 most recent
 * tweets in the user's news feed.
 * <p>
 * Implement the Twitter class:
 * <p>
 * - Twitter() Initializes your twitter object.
 * <p>
 * At most 3 * 104 calls will be made to postTweet, getNewsFeed, follow,
 * and unfollow.
 */
public interface DesignTwitter {
    /**
     * Composes a new tweet with ID tweetId by the user userId. Each
     * call to this function will be made with a unique tweetId.
     *
     * @param userId 1 <= userId <= 500
     * @param tweetId 0 <= tweetId <= 10^4
     *                All the tweets have unique IDs.
     */
    void postTweet(int userId, int tweetId);

    /**
     * Retrieves the 10 most recent tweet IDs in the user's news feed.
     * Each item in the news feed must be posted by users who the user
     * followed or by the user themself. Tweets must be ordered from
     * most recent to least recent.
     *
     * @param userId 1 <= userId <= 500
     */
    List<Integer> getNewsFeed(int userId);

    /**
     * The user with ID followerId started following the user with ID
     * followeeId.
     *
     * @param followerId,followeeId 1 <= followerId, followeeId <= 500
     */
    void follow(int followerId, int followeeId);

    /**
     * The user with ID followerId started unfollowing the user with ID
     * followeeId.
     *
     * @param followerId,followeeId 1 <= followerId, followeeId <= 500
     */
    void unfollow(int followerId, int followeeId);
}
