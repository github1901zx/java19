function modifyDiscipline(){
    var checkedBoxes = document.querySelectorAll('input[type=checkbox]:checked');
    if(checkedBoxes.length == 0){
        alert(" Выбирите хотябы одну дисциплину ")
        return;
    }

    if(checkedBoxes.length > 1){
        alert(" Выбирите только одну дисциплину ")
        return;
    }
    var id = checkedBoxes[0].getAttribute("value");
    var hidden = document.getElementById("hiddenModify");
    hidden.setAttribute("value",id);

    var form = document.getElementById("formModify");
    form.submit();

}

function delDiscipline(){
    var checkedBoxes = document.querySelectorAll('input[type=checkbox]:checked');
    if(checkedBoxes.length == 0){
        alert(" Выбирите хотябы одну дисциплину ")
        return;
    }
    if(checkedBoxes.length > 1){
        alert(" Выбирите только одну дисциплину ")
        return;
    }

    var id = checkedBoxes[0].getAttribute("value");
    var hidden = document.getElementById("hiddenDelete");
    hidden.setAttribute("value",id);

    var form = document.getElementById("formDelete");
    form.submit();
}