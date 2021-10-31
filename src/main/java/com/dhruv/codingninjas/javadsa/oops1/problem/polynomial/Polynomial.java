package com.dhruv.codingninjas.javadsa.oops1.problem.polynomial;

public class Polynomial {

    private int[] polynomialArray;
    private int degree;

    Polynomial(){
        polynomialArray = new int[10];
        degree=0;
    }
    Polynomial(int degree) {
        polynomialArray = new int[degree];
        this.degree=degree-1;
    }

    public void setCoefficient(int coefficient, int degree) {
        if(degree >= polynomialArray.length) {
            buildNewArray(degree);
        }
        polynomialArray[degree]=coefficient;
        if(degree>=this.degree){
            this.degree=degree;
        }
    }

    public void buildNewArray(int degree) {
        int[] temp = this.polynomialArray;
        this.polynomialArray= new int[degree+1];
        for(int i = 0;i<temp.length;i++) {
            this.polynomialArray[i] = temp[i];
        }
    }

    public void print() {
        String result = "";
        for (int i=0; i< this.polynomialArray.length;i++) {
            if (this.polynomialArray[i] == 0) {
                continue;
            }
            result += this.polynomialArray[i] + "x" + i + " ";
        }
        System.out.println(result);
    }

    public Polynomial add(Polynomial p) {
        int maxDegree=Math.max(this.degree, p.degree);
        //System.out.println(maxDegree);
        Polynomial polynomial = new Polynomial(maxDegree+1);
        for (int i=0;i<=maxDegree;i++) {
            int sum =0;
            if(i<=this.degree) {
                sum+=this.polynomialArray[i];
            }
            if(i<=p.degree) {
                sum+=p.polynomialArray[i];
            }

            polynomial.setCoefficient(sum,i);
        }
        return polynomial;
    }


    public Polynomial substract(Polynomial p) {
        int maxDegree=Math.max(this.degree, p.degree);
        Polynomial polynomial = new Polynomial(maxDegree+1);
        for (int i=0;i<=maxDegree;i++) {
            int sub =0;
            if(i<=this.degree) {
                sub+=this.polynomialArray[i];
            }
            if(i<=p.degree) {
                sub-=p.polynomialArray[i];
            }

            polynomial.setCoefficient(sub,i);
        }
        return polynomial;
    }

    public Polynomial multiply(Polynomial p) {
        int maxDegree=this.degree+p.degree;
        Polynomial polynomial = new Polynomial(maxDegree+1);
        for(int i = 0; i<=this.degree;i++){
            int mul = 0;
            for(int j = 0; j <= p.degree; j++){
                mul = polynomial.polynomialArray[i+j];
                mul=mul+(this.polynomialArray[i]*p.polynomialArray[j]);
                polynomial.setCoefficient(mul, i+j);
            }
        }
        return polynomial;
    }

}
