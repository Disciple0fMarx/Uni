const voirCV = () => {
    location.href = '../cv.html';
}


const voirContacts = () => {
    document.getElementById('dropdown-content').classList.toggle('show');
}


window.onclick = (event) => {
    if (!event.target.matches('.contacts-button')) {
        var dropdowns = document.getElementsByClassName("dropdown-content");
        var i;
        for (i = 0; i < dropdowns.length; i++) {
            var openDropdown = dropdowns[i];
            if (openDropdown.classList.contains('show')) {
                openDropdown.classList.remove('show');
            }
        }
    }
}
