function hideContent(e){
    let contentElement = e.currentTarget.nextElementSibling;
    let iconElement = e.currentTarget.getElementsByTagName('i')[0];
    if(contentElement.style.maxHeight){
        contentElement.style.maxHeight = null;
        iconElement.className = 'fa fa-plus'
    } else {
        contentElement.style.maxHeight = contentElement.scrollHeight+'px';
        iconElement.className = 'fa fa-minus'
    }
}