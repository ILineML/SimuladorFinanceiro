<#import "commons/nav.ftl" as nav/>
<#import "commons/components.ftl" as comp/>

<@comp.head/>
<@nav.profile/>

<div class="col-md-9">
    <div class="profile-content">
        TEXTOS SOBRE INVESTIMENTOS

        <br><br>

        <ul class="nav nav-tabs">
            <li class="active" id="tdPad" onclick="btnTrocaRec(tdPad, tdPage)"><a>Todas os investimentos</a></li>
            <li id="tdCadPad" onclick="btnTrocaRec(tdCadPad, cadPage)"><a>Simulador de investimentos</a></li>
        </ul>

        <br><br>

        <div id="tdPage">
            Temos nossas opções padrões:

            <select class="form-control" id="cmbInv" onchange="btnTroca(cmbInv, txtInvPad)">
                <option value="" disabled selected>Selecione um investimento</option>
                <option value="1">Tesouro Direto</option>
                <option value="2">LCI e LCA</option>
                <option value="3">Ações</option>
            </select>

            <br>

            <div class="form-group">
                <div class="form-label-group">
                    <input type="text" id="txtInvPad" readonly class="form-control" placeholder="Novo investimento" required="required">
                </div>
            </div>

            <div class="form-group">
                <div class="form-label-group">
                    <input type="number" id="txtEntradaPad" class="form-control" placeholder="Valor de entrada" required="required">
                </div>
            </div>

            <!-- Valor Receita padrão-->
            <div class="form-group">
                <div class="form-label-group">
                    <input type="number" id="txtMensalPad" class="form-control" placeholder="Valor mensal" required="required">
                </div>
            </div>

            <!-- Receita padrão -->
            <div class="form-group">
                <div class="form-label-group">
                    <button type="button" class="btn btn-primary" onclick="btnInv(txtInvPad, txtEntradaPad, txtMensalPad, tbInv,tableInv)">
                        Adicionar Investimentos
                    </button>
                </div>
            </div>

            <p>
                Ou você pode adicionar um investimento que ainda não existe:
            </p>

            <!-- Nova Receita-->
            <div class="form-group">
                <div class="form-label-group">
                    <input type="text" id="txtInv" class="form-control" placeholder="Novo investimento" required="required">
                </div>
            </div>

            <div class="form-group">
                <div class="form-label-group">
                    <input type="number" id="txtEntrada" class="form-control" placeholder="Valor de entrada" required="required">
                </div>
            </div>

            <!-- Valor Investimento-->
            <div class="form-group">
                <div class="form-label-group">
                    <input type="number" id="txtMensal" class="form-control" placeholder="Valor mensal" required="required">
                </div>
            </div>

            <!-- Adiciona receita-->
            <button type="button" class="btn btn-primary" onclick="btnInv(txtInv, txtEntrada, txtMensal, tbInv, tableInv)">
                Adicionar novo investimento
            </button>
            <br><br>
            <table class="table">
                <thead>
                <tr class="thead-dark">
                    <th>#</th>
                    <th>Investimento</th>
                    <th>Valor Entrada</th>
                    <th>Valor Mensal</th>
                    <th>Edições</th>
                </tr>
                </thead>

                <tbody>
                </tbody>
            </table>
        </div>

        <!--
            Simulador
         -->
        <div id="cadPage" style="display: none">
            Logo logo teremos atualizações por aqui
        </div>

    </div>
</div>

<script src="js/config.js"></script>

<br>
<br>

