$(document).ready(function() {
    clearBoard();

    $('#newGame').on("click", function( event ) {
        $.ajax({
                type: "post",
                url: "/newGame",
            }).done(function(result) {
                if(result) {
                    clearBoard();
                }
            });
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
        };
        
    });
}); 

function clearBoard() {
    for (var i = 0; i < 9; i++) {
        $("#" + i).html("");
    };
} 
