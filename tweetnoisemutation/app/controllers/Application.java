package controllers;

import play.*;
import play.mvc.Controller;
import play.mvc.Result;
import play.data.*;

import views.html.*;

import java.util.*;

public class Application extends Controller {

	public static String defaultQuery = "boston";
	public static List<String> tweetList;
	
	public static Result index(String queryTerm) {

		tweetList = SearchTweets.search(queryTerm);
		return ok(index.render(tweetList, queryTerm));
	}

	public static Result search() {

		DynamicForm toSearch = DynamicForm.form().bindFromRequest();
		String query = toSearch.get("query");
		if(query == "") {
			System.out.println("empty");
			return redirect(routes.Application.index(defaultQuery));
		} else {
			
			System.out.println(query);
			return redirect(routes.Application.index(query));
		}


	}

}

