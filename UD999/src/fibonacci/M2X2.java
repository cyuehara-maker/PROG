package fibonacci;

import java.math.BigInteger;

public class M2X2 {

    private BigInteger e00;
    private BigInteger e01;
    private BigInteger e10;
    private BigInteger e11;

    protected M2X2(BigInteger e00, BigInteger e01, BigInteger e10, BigInteger e11) {
        this.e00 = e00;
        this.e01 = e01;
        this.e10 = e10;
        this.e11 = e11;
    }

    protected M2X2 multiply(M2X2 o) {
        return new M2X2(
                e00.multiply(o.e00).add(e01.multiply(o.e10)),
                e00.multiply(o.e01).add(e01.multiply(o.e11)),
                e10.multiply(o.e00).add(e11.multiply(o.e10)),
                e10.multiply(o.e01).add(e11.multiply(o.e11)));
    }

    protected BigInteger getE00() {
        return e00;
    }
}
