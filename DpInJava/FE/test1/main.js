function switchTab(e){
    let mainDiv = document.getElementsByClassName("main-div")[0];
    let childNodes = mainDiv.getElementsByTagName("a");  
    for(let i = 0; i<childNodes.length; i++){
        childNodes[i].className = "";
    }
    e.currentTarget.className+=" active";
}