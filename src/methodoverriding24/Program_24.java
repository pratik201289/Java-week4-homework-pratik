package methodoverriding24;
/*24. A real example of Java Method Overriding (Create package name
‘methodoverriding24’ and create all below classes in this package)*/
class Bank {
    public int getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    @Override
    public int getRateOfInterest() {
        return 8;
    }
}

class ICICI extends Bank {
    @Override
    public int getRateOfInterest() {
        return 7;
    }
}

class AXIS extends Bank {
    public int getRateOfInterest() {
        return 9;
    }
}
class Test2{
    public static void main(String[] args) {
        SBI s=new SBI();
        ICICI i=new ICICI();
        AXIS a=new AXIS();
        System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
    }
}