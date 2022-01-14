package estudodecaso1.abordagem2;

import java.math.BigDecimal;

public class ICMS {

    public BigDecimal calculaICMS(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}
