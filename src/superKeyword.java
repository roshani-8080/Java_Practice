public  class superKeyword {
    superKeyword(int a)
    {
        System.out.println("Viewer");
    }
}
   class subclass extends superKeyword {
    subclass(int a){
        super(120);
        System.out.println("Learner");
    }
}

    class main {

        public static void main(String[] args) {
            subclass sb = new subclass(1);


        }
    }

