<#import "components.ftl" as components/>

<@components.head/>
<@components.page title="CAAAA">

<#macro profile>

    <div class="container">
        <div class="row profile">
            <div class="col-md-3">
                <div class="profile-sidebar">
                    <!-- SIDEBAR USERPIC -->
                    <div class="profile-userpic">
                        <img src="" class="img-responsive" id="ftPerfil" alt="">
                    </div>
                    <!-- END SIDEBAR USERPIC -->
                    <!-- SIDEBAR USER TITLE -->
                    <div class="profile-usertitle">
                        <div class="profile-usertitle-name">
                            ILineML
                        </div>
                        <div class="profile-usertitle-job">
                            Matheus Lemes
                        </div>
                    </div>
                    <!-- END SIDEBAR USER TITLE -->
                    <!-- SIDEBAR BUTTONS -->
                    <div class="profile-userbuttons">
                        <button type="button" class="btn btn-success btn-sm">Follow</button>
                        <button type="button" class="btn btn-danger btn-sm">Message</button>
                    </div>
                    <!-- END SIDEBAR BUTTONS -->
                    <!-- SIDEBAR MENU -->
                    <div class="profile-usermenu">
                        <ul class="nav">
                            <li id="charts">
                                <a href="/charts" id="graficos" onclick="btnTroca(graficos)">
                                    <i class="glyphicon glyphicon-home"></i>
                                    Gráficos
                                </a>
                            </li>

                            <li>
                                <a href="/cadReceita" id="receitas" onclick="btnTroca(receitas)">
                                    <i class="glyphicon glyphicon-edit"></i>
                                    Configuração de receitas
                                </a>
                            </li>
                            <li>
                                <a href="/cadRendas" id="rendas" onclick="btnTroca(rendas)">
                                    <i class="glyphicon glyphicon-edit"></i>
                                    Configuração de rendas
                                </a>
                            </li>
                            <li>
                                <a href="/cadInvestimento" id="investimentos" onclick="btnTroca(investimentos)">
                                    <i class="glyphicon glyphicon-edit"></i>
                                    Configuração de investimentos
                                </a>
                            </li>
                            <li>
                                <a href="/cadUrgencias" id="urgencias" onclick="btnTroca(urgencias)">
                                    <i class="glyphicon glyphicon-edit"></i>
                                    Configuração de urgências
                                </a>
                            </li>
                            <li>
                                <a href="#" target="_blank" id="conta" onclick="btnTroca(conta)">
                                    <i class="glyphicon glyphicon-user"></i>
                                    Configuração de Conta
                                </a>
                            </li>
                            <li>
                                <a href="#" id="ajuda" onclick="btnTroca(ajuda)">
                                    <i class="glyphicon glyphicon-flag"></i>
                                    Ajuda
                                </a>
                            </li>
                        </ul>
                    </div>
                    <!-- END MENU -->
                </div>
            </div>

</#macro>
</@components.page>
