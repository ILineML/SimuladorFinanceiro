
function btnTroca(cmbRec, receita, id){
    id.value = cmbRec.value;
    receita.value = cmbRec[cmbRec.value].innerHTML;
}

function btnNew(receita, valor, tabela, table) {

    var linhas = table.getElementsByTagName('tr');
    var id =  linhas.length;

    tabela.innerHTML += `
                    <tr>
                        <th scope="row">${id}</th>
                        <td>${receita.value}</td>
                        <td>${valor.value}</td>
                        <td>
                        <img src = "img/edit.png">
                        <img src = "img/delete.png">
                        </td>
                    </tr>`;
}

function btnInv(invest,entrada, mensal, tabela,table) {
    var linhas = table.getElementsByTagName('tr');
    var id =  linhas.length;

    tabela.innerHTML += `
                    <tr>
                        <th scope="row">${id}</th>
                        <td>${invest.value}</td>
                        <td>${entrada.value}</td>
                        <td>${mensal.value}</td>
                        <td>
                        <img src = "img/edit.png">
                        <img src = "img/delete.png">
                        </td>
                    </tr>`;
}

function btnTrocaRec(troca, pag) {

    tdPad.classList.remove("active");
    tdCadPad.classList.remove("active");

    tdPage.style.display = 'none';
    cadPage.style.display = 'none';


    troca.classList.add("active");
    pag.style.display = 'block';
}

function btnTrocaP(troca, pag){
    tdRend.classList.remove("active");
    fixa.classList.remove("active");
    variavel.classList.remove("active");

    rendasP.style.display = 'none';
    variaP.style.display = 'none';
    fixaP.style.display = 'none';

    troca.classList.add("active");
    pag.style.display = 'block';
}
