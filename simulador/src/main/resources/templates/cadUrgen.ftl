<#import "commons/nav.ftl" as nav/>
<#import "commons/components.ftl" as comp/>

<@comp.head/>
<@nav.profile/>

<div class="col-md-9">
    <div class="profile-content">

        <br>
        <ul class="nav nav-tabs">
            <li class="active" id="tdPad" onclick="btnTrocaRec(tdPad, tdPage)"><a>Todas as urgências</a></li>
        </ul>
        <br>

        Urgências são todos os recursos que você irá guardar para caso ocorra algo inesperado no seu mês, urgências podem
        ser um dinheiro guardado para um remédio, uma consulta de última hora ou até mesmo um empréstimo a ser feito.
        <br><br>

        <p>
            Aqui você pode cadastrar suas urgências
        </p>

        Temos nossas opções padrões:

        <select class="form-control" id="cmbUrgen" onchange="btnTroca(cmbUrgen, txtUrgenPad)">
            <option value="" disabled selected>Selecione uma urgência</option>
            <option value="1">Uniforme</option>
            <option value="2">Material Escolar</option>
            <option value="3">Manutenção Casa</option>
            <option value="4">Manuteção Carro</option>
        </select>

        <br>

        <div class="form-group">
            <div class="form-label-group">
                <input type="text" id="txtUrgenPad" readonly class="form-control" placeholder="Nova urgência" required="required">
            </div>
        </div>

        <!-- Valor Receita padrão-->
        <div class="form-group">
            <div class="form-label-group">
                <input type="number" id="txtValorUrgenPad" class="form-control" placeholder="Valor urgência" required="required">
            </div>
        </div>

        <!-- Receita padrão -->
        <div class="form-group">
            <div class="form-label-group">
                <button type="button" class="btn btn-primary" onclick="btnNew(txtUrgenPad, txtValorUrgenPad, tbUrgen, tableUrgen)">
                    Adicionar urgência
                </button>
            </div>
        </div>

        <br><br>

        <p>
            Ou você pode adicionar uma urgência que ainda não existe:
        </p>

        <!-- Nova Receita-->
        <div class="form-group">
            <div class="form-label-group">
                <input type="text" id="txtUrgen" class="form-control" placeholder="Nova urgência" required="required">
            </div>
        </div>

        <!-- Valor Receita-->
        <div class="form-group">
            <div class="form-label-group">
                <input type="number" id="txtValor" class="form-control" placeholder="Valor urgência" required="required">
            </div>
        </div>

        <button type="submit" class="btn btn-primary">Confirmar</button>

        <br><br>
        <table class="table">

            <thead>
            <tr class="thead-dark">
                <th>#</th>
                <th>Urgência</th>
                <th>Valor Urgência</th>
                <th>Edições</th>
            </tr>
            </thead>

            <tbody>
            </tbody>

        </table>
        <br><br>
    </div>
</div>

<script src="js/config.js"></script>

<br>
<br>
