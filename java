// Definir a data de início do namoro
const dataInicioNamoro = new Date("2024-09-08"); // Alterar para a data do seu namoro

// Função para calcular a diferença em dias
function calcularDias() {
    const hoje = new Date();
    const diffTime = hoje - dataInicioNamoro;
    const diffDays = Math.floor(diffTime / (1000 * 60 * 60 * 24));
    document.getElementById("count").textContent = diffDays;
}

// Chama a função assim que o site carregar
window.onload = calcularDias;
