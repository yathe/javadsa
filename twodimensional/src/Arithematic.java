 class except {
    void divide(int a,int b){
        int result;
        try{
        result=a/b;
            System.out.println("ARITHEMATIC ERROR");
        }
        catch (ArithmeticException e1){
            System.out.println(e1);
            System.out.println("this is done");
        }
        finally {
            System.out.println("this will always executed");
        }
    }

    public static void main(String[] args) {
        except e=new except();
        e.divide(1,0);
    }
}
