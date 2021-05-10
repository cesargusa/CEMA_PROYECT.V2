document.getElementById("entrada").onclick = entrada

function entrada() {
    let valorEntrada = document.getElementById("valor-entrada").value
        location.href="/?nombre_producto="+valorEntrada
}