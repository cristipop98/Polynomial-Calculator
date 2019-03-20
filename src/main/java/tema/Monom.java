package tema;

public class Monom {
    int coef;
    int grad;
    public Monom(int coef,int grad) {
        this.grad = grad;
        this.coef = coef;
    }
    public void afisare(){
        Monom p=this;
        if(p.coef==0)
            System.out.print(0);
        else if(p.grad==0)
            System.out.print(p.coef);
        else
            System.out.print(p.coef+"*"+"X^"+p.grad+" ");
    }
    public Monom derivare()
    {
        Monom p=this;
        Monom q=new Monom(1,0);
        if(p.grad!=0) {
            q.coef=p.coef*p.grad;
            q.grad=p.grad-1;
        }
        else {
            q.coef = 0;
            q.grad = 0;
        }
        return q;
    }
    public void sortare(Monom q)
    {
        Monom p=this;
        if(p.grad>q.grad)
        {
            int aux1=p.grad;
            p.grad=q.grad;
            q.grad=aux1;
            int aux2=p.coef;
            p.coef=q.coef;
            q.coef=aux2;
        }
    }
    public Monom adunare(Monom q)
    {
        Monom p=this;
        Monom s=new Monom(0,0);
        if(p.grad==q.grad)
        {
            s.coef=p.coef+q.coef;
            s.grad=p.grad;
            //if(s.coef>0)
            //System.out.print("+");
            //s.afisare();
            return s;
        }
        else if(p.grad>q.grad) {
            //if(p.coef>0)
            // System.out.print("+");
            //p.afisare();
            return p;
        }
        else {
            // if(q.coef>0)
            //   System.out.print("+");
            //q.afisare();
            return q;
        }
    }
    public Monom scadere(Monom q)
    {
        Monom p=this;
        Monom s=new Monom(0,0);
        if(p.grad==q.grad)
        {
            s.coef=p.coef-q.coef;
            s.grad=p.grad;
            return s;
            //if(s.coef>0)
            //  System.out.print("-");
            //if(s.coef==0)
            //  System.out.print("+");
            //s.afisare();
        }
        else if(p.grad>q.grad) {
            s.coef=p.coef;
            s.grad=p.grad;
            // if(s.coef>0)
            //   System.out.print("+");
            //s.afisare();
            return s;
        }
        else {
            s.coef=q.coef;
            s.grad=q.grad;
            if(s.coef<0)
                s.coef=-s.coef;
            return s;
            // if(s.coef>0)
            //   System.out.print("-");
            //else {
            // s.coef = -s.coef;
            //System.out.print("+");
            //}
            //s.afisare();
        }
    }
    public Monom inmultire(Monom q)
    {
        Monom p=this;
        Monom s=new Monom(1,0);
        if(p.grad==0)
        {
            s.coef=p.coef*q.coef;
            s.grad=p.grad+q.grad;
        }
        else if(q.grad==0)
        {
            s.coef=p.coef*q.coef;
            s.grad=p.grad+q.grad;
        }
        else {
            s.coef = p.coef * q.coef;
            s.grad = p.grad + q.grad;
        }
        //if(s.coef>0)
        //  System.out.print("+");
        //s.afisare();
        return s;
    }
    public int compare(Monom q)
    {
        Monom p=this;
        if(p.grad>q.grad)
            return 2;
        else if(q.grad>p.grad)
            return 1;
        else
            return 0;
    }
}
