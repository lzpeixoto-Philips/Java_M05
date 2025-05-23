package com.mycompany.philips.model;

/**
 * Representa um triângulo definido pelos seus três lados.
 * Fornece métodos para validar se os lados formam um triângulo
 * e para determinar o tipo do triângulo (Equilátero, Isósceles ou Escaleno).
 * 
 * @author anamo
 */
public class Triangulo {

    /**
     * Comprimento do lado A do triângulo.
     */
    private double ladoA;

    /**
     * Comprimento do lado B do triângulo.
     */
    private double ladoB;

    /**
     * Comprimento do lado C do triângulo.
     */
    private double ladoC;

    /**
     * Construtor padrão que inicializa os lados do triângulo com zero.
     */
    public Triangulo() {
        this.ladoA = 0;
        this.ladoB = 0;
        this.ladoC = 0;
    }

    /**
     * Construtor que inicializa o triângulo com os valores fornecidos para cada lado.
     * 
     * @param ladoA comprimento do lado A
     * @param ladoB comprimento do lado B
     * @param ladoC comprimento do lado C
     */
    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    /**
     * Retorna o comprimento do lado A.
     * 
     * @return ladoA comprimento do lado A
     */
    public double getLadoA() {
        return ladoA;
    }

    /**
     * Define o comprimento do lado A.
     * Lança IllegalArgumentException se o valor for menor ou igual a zero.
     * 
     * @param ladoA comprimento do lado A
     * @throws IllegalArgumentException se ladoA <= 0
     */
    public void setLadoA(double ladoA) {
        if (ladoA <= 0) {
            throw new IllegalArgumentException("Campo LADO A inválido");
        }
        this.ladoA = ladoA;
    }

    /**
     * Retorna o comprimento do lado B.
     * 
     * @return ladoB comprimento do lado B
     */
    public double getLadoB() {
        return ladoB;
    }

    /**
     * Define o comprimento do lado B.
     * Lança IllegalArgumentException se o valor for menor ou igual a zero.
     * 
     * @param ladoB comprimento do lado B
     * @throws IllegalArgumentException se ladoB <= 0
     */
    public void setLadoB(double ladoB) {
        if (ladoB <= 0) {
            throw new IllegalArgumentException("Campo LADO B inválido");
        }
        this.ladoB = ladoB;
    }

    /**
     * Retorna o comprimento do lado C.
     * 
     * @return ladoC comprimento do lado C
     */
    public double getLadoC() {
        return ladoC;
    }

    /**
     * Define o comprimento do lado C.
     * Lança IllegalArgumentException se o valor for menor ou igual a zero.
     * 
     * @param ladoC comprimento do lado C
     * @throws IllegalArgumentException se ladoC <= 0
     */
    public void setLadoC(double ladoC) {
        if (ladoC <= 0) {
            throw new IllegalArgumentException("Campo LADO C inválido");
        }
        this.ladoC = ladoC;
    }

    /**
     * Verifica se os valores dos lados formam um triângulo válido.
     * A validação segue a regra: a soma de dois lados deve ser maior que o terceiro.
     * 
     * @return true se os lados formam um triângulo válido, false caso contrário
     */
    public Boolean Validacao() {
        return (ladoA + ladoB > ladoC) &&
               (ladoA + ladoC > ladoB) &&
               (ladoB + ladoC > ladoA);
    }

    /**
     * Determina o tipo do triângulo com base nos seus lados.
     * 
     * @return "Equilatero" se todos os lados são iguais,
     *         "Isóceles" se dois lados são iguais,
     *         "Escaleno" se todos os lados são diferentes
     */
    public String tipoTriangulo() {
        if (ladoA == ladoB && ladoB == ladoC) {
            return "Equilatero";
        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
            return "Isóceles";
        } else {
            return "Escaleno";
        }
    }
}
