enum dataInput{
    // enum constant calling the enum constructor
    Message1("HELLO i am from bridgelabz");
    private final String Message;

    // enum  class constructor
    dataInput(String Message)
    {
        this.Message=Message;
    }
    public String getDatainput(){
        return Message;
    }

}
class Main {
    public static void main(String[] args) {
        dataInput datainput=dataInput.Message1;
        System.out.println(datainput.getDatainput());

    }
}
