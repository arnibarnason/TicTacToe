
package ttt;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;
import ttt.TicTacToe;

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
		post(new Route("/game"){
			final TicTacToe game = new TicTacToe();

			// TODO: Game logic needed

            @Override
            public Object handle(Request request, Response response){
                return game.greeting();
            }
        });

        post(new Route("/mark"){
            @Override
            public Object handle(Request request, Response response){
                Integer cell = Integer.valueOf(request.queryParams("cellid"));

                // TODO: Game logic needed
                
                return;
            }
        });
	}
}
