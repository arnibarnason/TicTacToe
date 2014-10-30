
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

		final TicTacToe game = new TicTacToe();

        post(new Route("/mark"){
            @Override
            public Object handle(Request request, Response response){
                Integer cell = Integer.valueOf(request.queryParams("cellid"));

                if(game.isOver()) {
                	return game.scoreMessage();
                } else {
                	return game.playCell(cell);
                }
            }
        });
	}
}
