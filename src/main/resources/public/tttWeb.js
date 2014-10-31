$(document).ready(function() {
    clearBoard();
    newGame();

    $('#newGame').on("click", function() {
        newGame();
    });

    $("#ttt").on("click", "td", function( event ) {
        var number = $(this).attr('id');
        if ($(this).html() === "") {
            $.ajax({
                type: "post",
                url: "/id",
                data: "id=" + number
            }).done(function(result) {
                if (result === "X" || result === "O") {
                    $("#" + number).html(result);
                } else {
                    $("#score").html(result);
                    clearBoard();
                }
                
            });
            event.preventDefault();
        };
        
    });
}); 

function newGame() {
    $.ajax({
        type: "post",
        url: "/newGame",
    }).done(function(result) {
        if(result) {
            clearBoard();
        }
    });
}

function clearBoard() {
    for (var i = 0; i < 9; i++) {
        $("#" + i).html("");
    };
} 
