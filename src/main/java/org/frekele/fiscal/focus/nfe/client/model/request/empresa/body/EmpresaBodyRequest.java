package org.frekele.fiscal.focus.nfe.client.model.request.empresa.body;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import org.frekele.fiscal.focus.nfe.client.core.FocusNFeEntity;
import org.frekele.fiscal.focus.nfe.client.model.entities.empresa.Empresa;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Request Body Autorizar NF-e.
 *
 * @author frekele - Leandro Kersting de Freitas
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class EmpresaBodyRequest implements FocusNFeEntity {

    private static final long serialVersionUID = 1L;

    /**
     * Dados nfe da requisicao para autorizacao.
     */
    @JsonUnwrapped
    @NotNull
    private Empresa empresa;

    public EmpresaBodyRequest() {
        super();
    }

    public EmpresaBodyRequest(Empresa empresa) {
        this.empresa = empresa;
    }

    private EmpresaBodyRequest(Builder builder) {
        setEmpresa(builder.empresa);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    /**
     * NFeAutorizarBodyRequest Builder Pattern.
     */
    public static final class Builder {

        private Empresa empresa;

        private Builder() {
        }

        /**
         * Dados nfe da requisicao para autorizacao.
         */
        public Builder withNfe(Empresa val) {
            empresa = val;
            return this;
        }

        public EmpresaBodyRequest build() {
            return new EmpresaBodyRequest(this);
        }
    }
}
