
package controllers;

import twitter4j.*;

import java.util.*;

public class SearchTweets {
    
    public static List<String> search(String queryTerm) {
	List<String> searchResult = new ArrayList<String>();
	Status tweet;
        Twitter twitter = new TwitterFactory().getInstance();
        try {
            Query query = new Query(queryTerm);
            QueryResult result;
	    result = twitter.search(query);
            for(int i = 0; i < 20 && (result.nextQuery() != null); ++i){
                List<Status> tweets = result.getTweets();
                for (int j = 0; j < 10 && j < tweets.size(); ++j) {
			tweet = tweets.get(j);
                    searchResult.add("@" + tweet.getUser().getScreenName() + " - " + tweet.getText()+ " - " + tweet.getCreatedAt().toString());
                }
		query = result.nextQuery();
		result = twitter.search(query);
            } 
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to search tweets: " + te.getMessage());
        }
	return searchResult;
    }
}
