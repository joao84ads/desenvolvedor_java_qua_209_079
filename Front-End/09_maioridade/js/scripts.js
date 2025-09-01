//  Variável do formulário
const form = document.querySelector("form");

// arrow function
const msg = () => {
    //  variáveis locais
    let nome = document.querySelector('#nome').value;
    let idade = document.querySelector('#idade').value;
    
    //  verificar a idade
    if (idade >= 19){
        alert(`${nome} é maior de idade.`);
    }
    else {
        alert(`${nome} é menor de idade.`)
    }
}

//  evento
form.addEventListener('submit', function(event) {
    // dasativar o submit
    event.preventDefault();
    // executar a função
    msg();
});