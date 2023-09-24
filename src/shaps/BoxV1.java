package shaps;

public class BoxV1 {
    private double w,h,d;
    public BoxV1(double w,double h,double d){
        detectZero(w);
        this.h=h;
        this.d=d;

    }
    public BoxV1(){
        System.out.println("hello");
    }
    private void detectZero(double w){
        if(w>0.0){
            this.w=w;
        }else{
            throw new ArithmeticException("must more than zero");
        }
    }
    public double surfaceArea(){
        return (2*w*h)+(2*w*d)+(2*h*d);
    }
    public String volume(){
        return w*h*d > 100 ?"Box is big":"Box is small";
    }

    @Override
    public String toString(){
        return String.format(""+w*h*d);
    }
}
