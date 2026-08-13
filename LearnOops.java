
        class Dog {
            String name;
            int age;
            String color;

            void walk() {
                System.out.println(name+" is Walking ");
            }

            void bark() {
                System.out.println(name+" is Barking");
            }

            void sleep() {
                System.out.println( "Dog is Sleeping");
            }
            void col(){
                System.out.println( "Dog color is Brown");
            }
        }



        public class LearnOops {

            public static void main(String[] args) {
                Dog d1 = new Dog();
                d1.name= "Tommy";
                d1.walk();
                Dog d2 = new Dog();
                d2.name = "Leo";
                d2.bark();  
                Dog d3 = new Dog();
                d3.sleep();
                Dog d4 = new Dog();
                d4.col();

            }
        }
