package org.frekele.fiscal.focus.nfe.client.model.entities.empresa;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.frekele.fiscal.focus.nfe.client.core.FocusNFeEntity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Realizar cadastro da empresa.
 *
 * @author mrlmarlon - Marlon Pedro Rheinheimer
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Empresa implements FocusNFeEntity {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("nome")
    private String nome;
    @JsonProperty("nome_fantasia")
    private String nomeFantasia;
    @JsonProperty("inscricao_estadual")
    private String inscricaoEstadual;
    @JsonProperty("inscricao_municipal")
    private String inscricaoMunicipal;
    @JsonProperty("bairro")
    private String bairro;
    @JsonProperty("cargo_responsavel")
    private Object cargoResponsavel;
    @JsonProperty("cep")
    private String cep;
    @JsonProperty("cnpj")
    private String cnpj;
    @JsonProperty("cpf")
    private String cpf;
    @JsonProperty("codigo_municipio")
    private String codigoMunicipio;
    @JsonProperty("codigo_pais")
    private String codigoPais;
    @JsonProperty("codigo_uf")
    private String codigoUf;
    @JsonProperty("complemento")
    private String complemento;
    @JsonProperty("cpf_cnpj_contabilidade")
    private String cpfCnpjContabilidade;
    @JsonProperty("cpf_responsavel")
    private String cpfResponsavel;
    @JsonProperty("discrimina_impostos")
    private Boolean discriminaImpostos;
    @JsonProperty("email")
    private String email;
    @JsonProperty("enviar_email_destinatario")
    private Boolean enviarEmailDestinatario;
    @JsonProperty("enviar_email_homologacao")
    private Boolean enviarEmailHomologacao;
    @JsonProperty("habilita_nfce")
    private Boolean habilitaNfce;
    @JsonProperty("habilita_nfe")
    private Boolean habilitaNfe;
    @JsonProperty("habilita_nfse")
    private Boolean habilitaNfse;
    @JsonProperty("habilita_nfsen_producao")
    private Boolean habilitaNfsenProducao;
    @JsonProperty("habilita_nfsen_homologacao")
    private Boolean habilitaNfsenHomologacao;
    @JsonProperty("habilita_cte")
    private Boolean habilitaCte;
    @JsonProperty("habilita_mdfe")
    private Boolean habilitaMdfe;
    @JsonProperty("habilita_manifestacao")
    private Boolean habilitaManifestacao;
    @JsonProperty("habilita_manifestacao_homologacao")
    private Boolean habilitaManifestacaoHomologacao;
    @JsonProperty("habilita_manifestacao_cte")
    private Boolean habilitaManifestacaoCte;
    @JsonProperty("habilita_manifestacao_cte_homologacao")
    private Boolean habilitaManifestacaoCteHomologacao;
    @JsonProperty("logradouro")
    private String logradouro;
    @JsonProperty("municipio")
    private String municipio;
    @JsonProperty("nome_responsavel")
    private String nomeResponsavel;
    @JsonProperty("login_responsavel")
    private String loginResponsavel;
    @JsonProperty("senha_responsavel")
    private String senhaResponsavel;
    @JsonProperty("numero")
    private String numero;
    @JsonProperty("pais")
    private String pais;
    @JsonProperty("regime_tributario")
    private String regimeTributario;
    @JsonProperty("telefone")
    private String telefone;
    @JsonProperty("uf")
    private String uf;
    @JsonProperty("habilita_contingencia_offline_nfce")
    private Boolean habilitaContingenciaOfflineNfce;
    @JsonProperty("habilita_contingencia_epec_nfce")
    private Boolean habilitaContingenciaEpecNfce;
    @JsonProperty("reaproveita_numero_nfce_contingencia")
    private Boolean reaproveitaNumeroNfceContingencia;
    @JsonProperty("mostrar_danfse_badge")
    private Boolean mostrarDanfseBadge;
    @JsonProperty("csc_nfce_producao")
    private Object cscNfceProducao;
    @JsonProperty("id_token_nfce_producao")
    private Object idTokenNfceProducao;
    @JsonProperty("csc_nfce_homologacao")
    private Object cscNfceHomologacao;
    @JsonProperty("id_token_nfce_homologacao")
    private Object idTokenNfceHomologacao;
    @JsonProperty("proximo_numero_nfe_producao")
    private Object proximoNumeroNfeProducao;
    @JsonProperty("proximo_numero_nfe_homologacao")
    private Object proximoNumeroNfeHomologacao;
    @JsonProperty("serie_nfe_producao")
    private Object serieNfeProducao;
    @JsonProperty("serie_nfe_homologacao")
    private Object serieNfeHomologacao;
    @JsonProperty("proximo_numero_nfse_producao")
    private Object proximoNumeroNfseProducao;
    @JsonProperty("proximo_numero_nfse_homologacao")
    private Object proximoNumeroNfseHomologacao;
    @JsonProperty("proximo_numero_nfsen_producao")
    private Object proximoNumeroNfsenProducao;
    @JsonProperty("proximo_numero_nfsen_homologacao")
    private Object proximoNumeroNfsenHomologacao;
    @JsonProperty("serie_nfse_producao")
    private Object serieNfseProducao;
    @JsonProperty("serie_nfse_homologacao")
    private Object serieNfseHomologacao;
    @JsonProperty("serie_nfsen_producao")
    private Object serieNfsenProducao;
    @JsonProperty("serie_nfsen_homologacao")
    private Object serieNfsenHomologacao;
    @JsonProperty("proximo_numero_nfce_producao")
    private Object proximoNumeroNfceProducao;
    @JsonProperty("proximo_numero_nfce_homologacao")
    private Object proximoNumeroNfceHomologacao;
    @JsonProperty("serie_nfce_producao")
    private Object serieNfceProducao;
    @JsonProperty("serie_nfce_homologacao")
    private Object serieNfceHomologacao;
    @JsonProperty("proximo_numero_cte_producao")
    private Object proximoNumeroCteProducao;
    @JsonProperty("proximo_numero_cte_homologacao")
    private Object proximoNumeroCteHomologacao;
    @JsonProperty("serie_cte_producao")
    private Object serieCteProducao;
    @JsonProperty("serie_cte_homologacao")
    private Object serieCteHomologacao;
    @JsonProperty("proximo_numero_cte_os_producao")
    private Object proximoNumeroCteOsProducao;
    @JsonProperty("proximo_numero_cte_os_homologacao")
    private Object proximoNumeroCteOsHomologacao;
    @JsonProperty("serie_cte_os_producao")
    private Object serieCteOsProducao;
    @JsonProperty("serie_cte_os_homologacao")
    private Object serieCteOsHomologacao;
    @JsonProperty("proximo_numero_mdfe_producao")
    private Object proximoNumeroMdfeProducao;
    @JsonProperty("proximo_numero_mdfe_homologacao")
    private Object proximoNumeroMdfeHomologacao;
    @JsonProperty("serie_mdfe_producao")
    private Object serieMdfeProducao;
    @JsonProperty("serie_mdfe_homologacao")
    private Object serieMdfeHomologacao;
    @JsonProperty("certificado_valido_ate")
    private String certificadoValidoAte;
    @JsonProperty("certificado_valido_de")
    private String certificadoValidoDe;
    @JsonProperty("certificado_cnpj")
    private String certificadoCnpj;
    @JsonProperty("certificado_especifico")
    private Boolean certificadoEspecifico;
    @JsonProperty("data_ultima_emissao")
    private Object dataUltimaEmissao;
    @JsonProperty("caminho_logo")
    private Object caminhoLogo;
    @JsonProperty("senha_responsavel_preenchida")
    private Boolean senhaResponsavelPreenchida;
    @JsonProperty("orientacao_danfe")
    private String orientacaoDanfe;
    @JsonProperty("recibo_danfe")
    private Boolean reciboDanfe;
    @JsonProperty("exibe_sempre_ipi_danfe")
    private Boolean exibeSempreIpiDanfe;
    @JsonProperty("exibe_issqn_danfe")
    private Boolean exibeIssqnDanfe;
    @JsonProperty("exibe_impostos_adicionais_danfe")
    private Boolean exibeImpostosAdicionaisDanfe;
    @JsonProperty("exibe_fatura_danfe")
    private Boolean exibeFaturaDanfe;
    @JsonProperty("exibe_unidade_tributaria_danfe")
    private Boolean exibeUnidadeTributariaDanfe;
    @JsonProperty("exibe_desconto_itens")
    private Boolean exibeDescontoItens;
    @JsonProperty("exibe_sempre_volumes_danfe")
    private Boolean exibeSempreVolumesDanfe;
    @JsonProperty("exibe_composicao_carga_mdfe")
    private Boolean exibeComposicaoCargaMdfe;
    @JsonProperty("data_inicio_recebimento_nfe")
    private Object dataInicioRecebimentoNfe;
    @JsonProperty("data_inicio_recebimento_cte")
    private Object dataInicioRecebimentoCte;
    @JsonProperty("habilita_csrt_nfe")
    private Boolean habilitaCsrtNfe;
    @JsonProperty("nfe_sincrono")
    private Boolean nfeSincrono;
    @JsonProperty("nfe_sincrono_homologacao")
    private Boolean nfeSincronoHomologacao;
    @JsonProperty("mdfe_sincrono")
    private Boolean mdfeSincrono;

    @JsonProperty("mdfe_sincrono_homologacao")
    private Boolean mdfeSincronoHomologacao;


    @JsonProperty("arquivo_certificado_base64")
    private String arquivoCertificadoBase64;


    @JsonProperty("senha_certificado")
    private String senhaCertificado;
    @JsonProperty("arquivo_logo_base64")
    private String arquivoLogoBase64;


    @JsonProperty("delete_logo")
    private Boolean deleteLogo;

    @JsonProperty("smtp_endereco")
    private Object smtpEndereco;
    @JsonProperty("smtp_dominio")
    private Object smtpDominio;
    @JsonProperty("smtp_autenticacao")
    private Object smtpAutenticacao;
    @JsonProperty("smtp_porta")
    private Object smtpPorta;
    @JsonProperty("smtp_login")
    private Object smtpLogin;
    @JsonProperty("smtp_remetente")
    private Object smtpRemetente;
    @JsonProperty("smtp_responder_para")
    private Object smtpResponderPara;
    @JsonProperty("smtp_modo_verificacao_openssl")
    private Object smtpModoVerificacaoOpenssl;
    @JsonProperty("smtp_habilita_starttlls")
    private Boolean smtpHabilitaStarttlls;
    @JsonProperty("smtp_ssl")
    private Boolean smtpSsl;
    @JsonProperty("smtp_tls")
    private Boolean smtpTls;
    @JsonProperty("token_producao")
    private String tokenProducao;
    @JsonProperty("token_homologacao")
    private String tokenHomologacao;
}
