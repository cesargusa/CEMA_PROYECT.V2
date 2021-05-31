document.getElementById("entrada").onclick = entradaNombre_producto
document.getElementById("entradaProducto").onclick = entradaUsuario

function entradaNombre_producto() {
    let valorEntrada = document.getElementById("valor-entrada").value
        location.href="/?nombre_producto="+valorEntrada
}

function entradaUsuario() {
    let valorEntradaUsuario = document.getElementById("valor-entradaUsuario").value
        location.href="/usuarios/?usuario="+valorEntradaUsuario
}