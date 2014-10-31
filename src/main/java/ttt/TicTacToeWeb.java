
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

    private TicTacToe game;

    public void init() {
        
        if (game == null) {
            game = new TicTacToe();
        }

        post(new Route("/newGame") {
            @Override
            public Object handle(Request request, Response response) {
                game = new TicTacToe();
                return true;
            }
        });

        post(new Route("/id") {
            @Override
            public Object handle(Request request, Response response) {
                Integer cell = Integer.valueOf(request.queryParams("id"));
                return game.playCell(cell);
            }
        });
    }    
}
