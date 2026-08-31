class bank{

    private long balance;

    public void setdata(int amt){
        if(amt>0){
            balance=amt;
        }
        else{
            System.out.println("not valid amount");
            System.exit(0);
        }
    }
    public long getbalance(){
        return balance;
    }

}

class bankout{

    public static void main(String [] args){

        bank b1=new bank();
        b1.setdata(9340);
        System.out.println(b1.getbalance());

    }

}