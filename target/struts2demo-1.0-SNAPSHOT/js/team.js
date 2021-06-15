function addtr(){
    var newTr = memberList.insertRow();
    var newTd0 = newTr.insertCell();
    var newTd1 = newTr.insertCell();
    var newTd2 = newTr.insertCell();
    var newTd3 = newTr.insertCell();
    var newTd4 = newTr.insertCell();

    newTd0.innerHTML = "<input type='text'>";
    newTd1.innerHTML = "<input type='text'>";
    newTd2.innerHTML = "<input type='text'>";
    newTd3.innerHTML = "<input type='text'>";
    newTd4.innerHTML = "<input type='text'>";
}
