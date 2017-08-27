/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function getMenuData() {
    var tree;
    $.ajax({
        type: 'post',
        url: "test.do",
        dataType: "json",
        cache: false,
        async: false,
        data: {userName: "userName"},
        beforeSend: function () {

        },
        success: function (data) {
            tree = data;
        },
        complete: function () {

        },
        error: function () {

        }
    });
    return tree;
}
function forwardMenu(menuId){
    $("#contentBody").load("foward.do?menuId="+menuId);
}
