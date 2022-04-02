package java_intermediates.oops.abstraction;

class LearnAbstractChild extends LearnAbstraction implements FederalReserve,FederalReserve2,FederalReserve3{

    final public static String name="Siheen";


    public static void main(String[] args) {
        System.out.println(FederalReserve.FedFundsRate);
        System.out.println(FederalReserve2.altFeRate);
        System.out.println(FederalReserve3.altFedRate);

    }

    void doSomething(){
        System.out.println("Doing something");
    }

    boolean isThisTrue(){
        return true;
    }

    @Override
    public void printNameAgain() {

    }

    @Override
    public void printNameOnceMore() {

    }

    public void printName(){

    }
}
