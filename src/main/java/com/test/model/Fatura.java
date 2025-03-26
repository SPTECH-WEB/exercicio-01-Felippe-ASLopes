package com.test.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name="Boleto")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class Fatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @NotBlank(message = "Campo Número do Cartão é obrigatório.")
    @Pattern(regexp = "\\d{16}", message = "Número do Cartão deve ter 16 caracteres.")
        private String numeroCartao;

    @NotBlank(message = "Campo Nome do Titular é obrigatório.")
    @Size(min=3, max=100, message = "Nome do Titular deve possuir entre 3 e 100 caracteres.")
    private String nomeTitular;

    @NotNull(message = "Campo Valor é obrigatório.")
    @DecimalMin(value="10.0", message = "Valor mínimo é R$10,00.")
    @DecimalMax(value="5000.0", message = "Valor máximo é R$5.000,00.")
    private Double valor;

    @NotNull(message = "Campo Data de Pagamento é obrigatório.")
    @FutureOrPresent(message = "Data de Pagamento deve ser a data atual ou futura.")
    private LocalDate dataPagamento;

    @NotBlank(message = "Campo Email é obrigatório")
    @Email(message = "Email deve ser válido.")
    private String email;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public @NotBlank(message = "Campo Número do Cartão é obrigatório.") @Pattern(regexp = "\\d{16}", message = "Número do Cartão deve ter 16 caracteres.") String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(@NotBlank(message = "Campo Número do Cartão é obrigatório.") @Pattern(regexp = "\\d{16}", message = "Número do Cartão deve ter 16 caracteres.") String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public @NotBlank(message = "Campo Nome do Titular é obrigatório.") @Size(min = 3, max = 100, message = "Nome do Titular deve possuir entre 3 e 100 caracteres.") String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(@NotBlank(message = "Campo Nome do Titular é obrigatório.") @Size(min = 3, max = 100, message = "Nome do Titular deve possuir entre 3 e 100 caracteres.") String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public @NotNull(message = "Campo Valor é obrigatório.") @DecimalMin(value = "10.0", message = "Valor mínimo é R$10,00.") @DecimalMax(value = "5000.0", message = "Valor máximo é R$5.000,00.") Double getValor() {
        return valor;
    }

    public void setValor(@NotNull(message = "Campo Valor é obrigatório.") @DecimalMin(value = "10.0", message = "Valor mínimo é R$10,00.") @DecimalMax(value = "5000.0", message = "Valor máximo é R$5.000,00.") Double valor) {
        this.valor = valor;
    }

    public @NotNull(message = "Campo Data de Pagamento é obrigatório.") @FutureOrPresent(message = "Data de Pagamento deve ser a data atual ou futura.") LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(@NotNull(message = "Campo Data de Pagamento é obrigatório.") @FutureOrPresent(message = "Data de Pagamento deve ser a data atual ou futura.") LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public @NotBlank(message = "Campo Email é obrigatório") @Email(message = "Email deve ser válido.") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Campo Email é obrigatório") @Email(message = "Email deve ser válido.") String email) {
        this.email = email;
    }
}
