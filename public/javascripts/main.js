const fetchingData  = function () {
    fetch("/").then(function(res) {
        return res.text();
    }).then( function(res) {
        console.log(res)
    });
};
