package ttt;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;
import ttt.TicTacToe;

public class TicTacToeWeb implements SparkApplication {
	private TicTacToe game;
	public static void main(String[] args) {
		staticFileLocation("/public");
		final SparkApplication tttWeb = new TicTacToeWeb();
		final String port = System.getenv("PORT");
		if (port != null) {
            setPort(Integer.valueOf(port));
        } 
        tttWeb.init();
	}


    public void init() {
        
        if (game == null) {
            game = new TicTacToe();
        }

        post(new Route("/newGame") {
            @Override
            public Object handle( final Request request, final Response response) {
                game = new TicTacToe();
                return game.scoreMessage();
            }
        });

        post(new Route("/id") {
            @Override
            public Object handle(final Request request, final Response response) {
                final Integer cell = Integer.valueOf(request.queryParams("id"));
                final String sign = game.playCell(cell);
                if(game.isOver()) {
                    return "W" + sign + game.scoreMessage();
                } else {
                    return sign;
                }
            }
        });
    }    
}
