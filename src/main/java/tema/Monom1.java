package tema;

public class Monom1 {
    double grad1;
    double coef1;
    public Monom1(double coef1,double grad1)
    {
        this.grad1=grad1;
        this.coef1=coef1;
    }

    public void afisare1(){
        Monom1 p=this;
        if(p.coef1==0)
            System.out.print(0);
        else if(p.grad1==0)
            System.out.print(p.coef1);
        else
            System.out.print(p.coef1+"*"+"X^"+p.grad1+" ");
    }

    public Monom1 integrare()
    {
        Monom1 p=this;
        Monom1 q=new Monom1(1,0);
            q.coef1 =p.coef1 / (p.grad1 + 1);
            q.grad1 = p.grad1 + 1;
        return q;
    }
}
