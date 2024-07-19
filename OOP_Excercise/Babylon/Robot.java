package OOP_Excercise.Babylon;

public abstract class Robot {
    protected int M;
    
    abstract double useEnergy(int S);
    public int getM() {
        return this.M;
    }

    public String getInfo() {
        return "M=" + this.getM();
    }
}

class Pedion extends Robot {
    private int F;

    Pedion(int F) {
        this.M = 20;
        this.F = F;
    }

    public double useEnergy(int S) {
        return M*S + (F+1)*(S/2);
    }

    public int getF() { return this.F; }

    public String getInfo() {
        return super.getInfo() + " F=" + this.getF();
    }
}

class Zattacker extends Robot {
    private int P;

    Zattacker(int P) {
        this.M = 50;
        this.P = P;
    }

    public double useEnergy(int S) {
        return M*S + P*P*S;
    }

    public int getP() { return this.P; }

    public String getInfo() {
        return super.getInfo() + " P=" + this.getP();
    }
}

class Carrier extends Robot {
    private int E;

    Carrier (int E) {
        this.M = 30;
        this.E = E;
    }

    public double useEnergy(int S) {
        return M*S + 4*E*S;
    }

    public int getE() { return this.E; }

    public String getInfo() {
        return super.getInfo() + " F=" + this.getE();
    }
}