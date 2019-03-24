
var selectInst;
var tabsInst;
var navInst;

document.addEventListener('DOMContentLoaded', function() {
    var select = document.querySelectorAll('select');
    selectInst = M.FormSelect.init(select);
    $('.sidenav').sidenav();
    initTabs();
    initNavBar();
});

function initTabs(){
    var tab = document.querySelectorAll('ul.tabs');
    tabsInst = M.Tabs.init(tab);
}

function initNavBar(){
    var elems = document.querySelectorAll('.sidenav');
    navInst = M.Sidenav.init(elems);
}

$(document).ready(function(){
     $("#search-schedule-by-group").on( "click", function() {
         var url = "/schedule";
         var data = getGroupName();
         callPostEndpointForSearch(url, data).done(function (message) {
             $("#schedule").html(message);
             initTabs();
         });
     });

    $("#search-student-by-group").on( "click", function() {
        var url = "/student";
        var data = getGroupName();
        callPostEndpointForSearch(url, data).done(function (message) {
            $("#students").html(message);
        });
    });

    function callPostEndpointForSearch(url, data){
        var posting = $.ajax({
            url: url,
            type: "POST",
            data: data
        });
        return posting;
    }

    function getGroupName(){
        var groupName = $(".group-select").find("li.selected").text();
        return {
            groupName:groupName
        };
    }

     $(".admin-menu li").on("click", function () {
         var element = $(this);
         $(".admin-menu li.active").removeClass("active");
         $(this).addClass("active");
         console.log(element.find("a").attr("href"));
     })

});

