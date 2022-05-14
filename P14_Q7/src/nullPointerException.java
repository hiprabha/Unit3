class MyClass {
        int numField = 100;
        public static MyClass initT() {     //method returns a null object
        return null;
    }   public void print(String s) {
        System.out.println(s.toLowerCase());
    }
}
class nullPointerException{
    public static void main(String[] args) {
        MyClass t = MyClass.initT();    //create a new object (null object)
        int num = t.numField;       //access MyClass member using null object
    }
}