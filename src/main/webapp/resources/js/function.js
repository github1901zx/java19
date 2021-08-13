function modifyDiscipline() {
    var checkedBoxes = document.querySelectorAll('input[type=checkbox]:checked');
    if (checkedBoxes.length == 0) {
        alert(" Выбирите хотябы одну дисциплину ")
        return;
    }

    if (checkedBoxes.length > 1) {
        alert(" Выбирите только одну дисциплину ")
        return;
    }
    var id = checkedBoxes[0].getAttribute("value");
    var hidden = document.getElementById("hiddenModify");
    hidden.setAttribute("value", id);

    var form = document.getElementById("formModify");
    form.submit();

}

function delDiscipline() {
    var checkedBoxes = document.querySelectorAll('input[type=checkbox]:checked');
    if (checkedBoxes.length == 0) {
        alert(" Выбирите хотябы одну дисциплину ")
        return;
    }
    var ids = "";
    var d = 0;
    if (checkedBoxes.length == 1) {
        var ids = ids + "'" + checkedBoxes[0].getAttribute("value") + "'";
        d=1
    }
    if(d == 0){
        for (var i = 0; i < checkedBoxes.length; i++) {

            if (i != checkedBoxes.length-1) {
                ids = ids + "'" + checkedBoxes[i].getAttribute("value") + "',";
            } else {
                ids = ids + "'" + checkedBoxes[i].getAttribute("value") + "'";
            }
        }
    }

    var hidden = document.getElementById("hiddenDelete");
    hidden.setAttribute("value", ids);
    var form = document.getElementById("formDelete");
    form.submit();
}

$( function() {
    $( "#datepicker" ).datepicker();
} );

function delStudents() {
    var checkedBoxes = document.querySelectorAll('input[type=checkbox]:checked');
    if (checkedBoxes.length == 0) {
        alert(" Выбирите хотябы одного студента ")
        return;
    }
    if (checkedBoxes.length > 1) {
        alert(" Выбирите только одного студента ")
        return;
    }
    var ids = "";
    var d = 0;
    if (checkedBoxes.length == 1) {
        var ids = ids + "'" + checkedBoxes[0].getAttribute("value") + "'";
        d=1
    }
    // if(d == 0){
    //     for (var i = 0; i < checkedBoxes.length; i++) {
    //
    //         if (i != checkedBoxes.length-1) {
    //             ids = ids + "'" + checkedBoxes[i].getAttribute("value") + "',";
    //         } else {
    //             ids = ids + "'" + checkedBoxes[i].getAttribute("value") + "'";
    //         }
    //     }
    // }

    var hidden = document.getElementById("hiddenDelete");
    hidden.setAttribute("value", ids);
    var form = document.getElementById("formDeleteStud");
    form.submit();
}

function modifyStud() {
    var checkedBoxes = document.querySelectorAll('input[type=checkbox]:checked');
    if (checkedBoxes.length == 0) {
        alert(" Выбирите хотябы одного студента")
        return;
    }

    if (checkedBoxes.length > 1) {
        alert(" Выбирите только одного студента")
        return;
    }
    var id = checkedBoxes[0].getAttribute("value");
    var hidden = document.getElementById("hiddenModify");
    hidden.setAttribute("value", id);

    var form = document.getElementById("formModifyStud");
    form.submit();

}