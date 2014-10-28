package ttt;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class TicTacToeWeb implements SparkApplication {
	public static void main(String[] args) {
		staticFileLocation("/public");
		SparkApplication tttWeb = new TicTacToeWeb();
		String port = System.getenv("PORT");
		if (port != null) {
            setPort(Integer.valueOf(port));
        } 
        tttWeb.init();
	}

	public void init() {
		post(new Route("/"){
            @Override
            public Object handle(Request request, Response response){
                return "Hello World!";
            }
        });
	}
}
