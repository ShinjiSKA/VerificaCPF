public class VerificaCPF {

    int num1;
    int num2;
    int num3;
    int num4;
    int num5;
    int num6;
    int num7;
    int num8;
    int num9;
    int num10;
    int num11;
    int resto1;
    int soma1;
    int resto2;
    int soma2;


    public VerificaCPF(int num1, int num2, int num3, int num4, int num5, int num6, int num7, int num8, int num9, int num10, int num11) {

        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        this.num5 = num5;
        this.num6 = num6;
        this.num7 = num7;
        this.num8 = num8;
        this.num9 = num9;
        this.num10 = num10;
        this.num11 = num11;

    }

    public void validacaoCpfInvalidos() {

            soma1 = (this.num1 * 10) + (this.num2 * 9) + (this.num3 * 8) + (this.num4 * 7) + (this.num5 * 6) + (this.num6 * 5) + (this.num7 * 4) + (this.num8 * 3) + (this.num9 * 2);
            resto1 = (soma1 * 10) % 11;

            if (resto1 == 10) {

                resto1 = 0;
            }


            soma2 = this.num1 * 11 + this.num2 * 10 + this.num3 * 9 + this.num4 * 8 + this.num5 * 7 + this.num6 * 6 + this.num7 * 5 + this.num8 * 4 + this.num9 * 3 + this.num10 * 2;
            resto2 = (soma2 * 10) % 11;

            if (resto2 == 10) {

                resto2 = 0;
            }


        if (resto1 == this.num10 && resto2 == this.num11) {
            System.out.println("CPF valido!");
        } else {
            System.out.println("CPF invalido!");
        }
    }

    }
