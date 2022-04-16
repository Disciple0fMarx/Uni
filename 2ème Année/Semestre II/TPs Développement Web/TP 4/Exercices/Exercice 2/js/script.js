const getIMC = () => {
    let poids = parseFloat(document.getElementById('poids').value);
    let taille = parseFloat(document.getElementById('taille').value);
    let result = poids / (taille * taille);

    let output = document.getElementById('output');
    output.textContent = `Votre IMC est ${result}`;

    let messageText;
    if (result < 18.5) messageText = 'Vous êtes maigre.';
    else if (result > 25) messageText = 'Vous êtes gros(se).';
    else messageText = 'Tout va bien!';

    let condition = (result >= 18.5) && (result <= 25);
    let message = document.getElementById('message');
    message.textContent = messageText;
    message.style.color = condition ? 'green' : 'red';
}
