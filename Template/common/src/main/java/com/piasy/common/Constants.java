package com.piasy.common;

/**
 * Created by Piasy{github.com/Piasy} on 15/7/23.
 */
public class Constants {
    public static final String GITHUB_SERVER_ENDPOINT = "https://api.github.com";

    public interface GithubAPIParams {
        String SEARCH_SORT_FOLLOWER = "followers";
        String SEARCH_SORT_REPO = "repositories";
        String SEARCH_SORT_JOINED = "joined";

        String SEARCH_ORDER_ASC = "asc";
        String SEARCH_ORDER_DESC = "desc";
    }
}
