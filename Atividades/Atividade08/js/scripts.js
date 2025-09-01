//  Variável do formulário
const form = document.querySelector("form");

// arrow function
function calcularIMC() {
    const altura = parseFloat(document.getElementById('altura').value.replace(',', '.'));
    const peso = parseFloat(document.getElementById('peso').value.replace(',', '.'));

    if (peso > 0 && altura > 0) {
        const imc = peso / (altura * altura);
        let classificacao = '';

        if (imc < 18.5) {
            classificacao = 'Abaixo do peso';
        } else if (imc < 24.9) {
            classificacao = 'Peso normal';
        } else if (imc < 29.9) {
            classificacao = 'Sobrepeso';
        } else {
            classificacao = 'Obesidade';
        }

        document.getElementById('resultado').innerText =
            `Seu IMC é ${imc.toFixed(2)} (${classificacao}).`;
    } else {
        document.getElementById('resultado').innerText =
            'Por favor, insira valores válidos para peso e altura.';
    }
}
//  evento
form.addEventListener('submit', function (event) {
    // dasativar o submit
    event.preventDefault();
    // executar a função
    calcularIMC();
});