function changeText(){
    txtReceitaPad.value = cmbReceita[cmbReceita.value].innerHTML;
}

$(document).ready(function () {
    txtValor.value = 1.00;
    txtValorPad.value = 1.00;
});

function changeValue(valor) {
    if(valor.value == "" || valor.value <= 0){
        valor.value = 1.00;
    }
}

function btnConfirm(valor, receita, rec, val) {

    if(valor.value <= 0){
        swal({
           title: "Ops!",
           text: "Valor da receita inválido"
        });
        return;
    }

    if(receita.value == ""){
        swal({
            title: "Ops!",
            text: "Necessário definir uma receita"
        });
        return;
    }

    document.getElementsByClassName("recipe")[rec].innerHTML = receita.value;
    document.getElementsByClassName("value")[val].innerHTML = valor.value;
    $('.modal').modal('show');
}

$('#modalExemplo').on('shown.bs.modal', function () {
    $('#meuInput').trigger('focus')
});