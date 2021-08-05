package pavan;

@FunctionalInterface
 interface LambdaExamples {
    public void bookCab();
}
class Ola implements LambdaExamples{
    public void bookCab(){

    }
}

  class Test{
    public static void main(String[] args) {
        LambdaExamples le = ()-> System.out.println("jdajhf");
        le.bookCab();
    }
}