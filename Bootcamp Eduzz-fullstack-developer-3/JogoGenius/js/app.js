let order = [];
let clickedOrder = [];
let score = 0;

//0 - verde
//1 - vermelho
//2 - amarelo
//3 - azul

const blue = document.querySelector('.blue');
const yellow = document.querySelector('.yellow');
const red = document.querySelector('.red');
const green = document.querySelector('.green');

// ========= cria a ordem aleatoria de colores ==============
let sufferOrder = () => {
    let colorOrder = Math.floor(Math.random() * 4);
    order[order.length] = colorOrder;
    clickedOrder = [];

    for (let i in order) {
        let elementeColor = createColorElement(order[i]);
        lightColor(elementeColor, Number(i) + 1);

    }
}

// =========== acende a proxima cor  =================
let lightColor = (element, number) => {
    number = number * 500;
    setTimeout(() => {
        element.classList.add('selected');
    }, number - 250);
    setTimeout(() => {
        element.classList.remove('selected');
    });
}

//=========== verifica se a ordem dos cliques esta correta ==============
let checkOrder = () => {
    for (let i in clickedOrder) {
        if (clickedOrder[i] != order[i])
            gameOver();
        break;
    }

    if (clickedOrder.length == order.length) {
        alert("Pontuação: " + score + "\n Você acertou! Iniciando próximo nível.");
        nextLevel();
    }

}

//======== clique do usuario ================
let click = (color) => {
    clickedOrder[clickedOrder.length] = color;
    createColorElement(color).classList.add('selected');

    setTimeout(() => {
        createColorElement(color).classList.remove('selected');
        checkOrder();
    }, 250);
}

//=========== retorna a cor clicada ==============
let createColorElement = (color) => {

    switch (color) {
        case 0:
            return green;
            break;
        case 1:
            return red;
            break;
        case 2:
            return yellow;
            break;
        case 3:
            return blue;
            break;
    }
    /* if (color == 0) {
         return green;
     } else if (color == 1) {
         return red;
     } else if (color == 2) {
         return yellow;
     } else if (color == 3) {
         return blue;
     }*/
}

//========= proximo nivel do jogo ============
let nextLevel = () => {
    score++;
    sufferOrder();
}

// ================= gameOver ==================
let gameOver = () => {
    alert('Pontuação: ' + score + '\nVocê perdeu!\nClique em OK para um novo jogo.');
    order = [];
    clickedOrder = [];

    playGame();
}

//============== inicia o jogo =============
let playGame = () => {
    alert('Genius!\nBom jogo.');
    score = 0;
    nextLevel();
}

//eventos de clique para as cores
green.onclick = () => click(0);
red.onclick = () => click(1);
yellow.onclick = () => click(2);
blue.onclick = () => click(3);


//inicio do jogo
playGame();